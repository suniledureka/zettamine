package com.zettamine.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.zettamine.constants.AppContants;
import com.zettamine.entity.Contact;
import com.zettamine.props.AppProperties;
import com.zettamine.service.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private AppProperties appProps;
	
	private static final Logger logger = LoggerFactory.getLogger(ContactController.class);
	
	@GetMapping({"/","/home"})
	public String loadHomePage(Model model) {
		logger.debug("*** loadHomePage() method execution started ***");
		model.addAttribute("contact", new Contact());
		logger.info("*** loadHomePage() executed successfully ***");
		logger.debug("*** loadHomePage() method execution completed ***");
		//return "index";
		
		return AppContants.INDEX_VIEW;
	}
	/*
	@PostMapping("/saveContact")
	public String handleSaveContactBtn(Contact contact, Model model) {
		boolean isSaved = contactService.saveContact(contact);
		if (isSaved) {
			model.addAttribute("succMsg", "Contact Saved Successfully");
		} else {
			model.addAttribute("errMsg", "Failed to save contact");
		}
		return "index";
	}
	*/
	
	/*------- saving Contact ------*/
	@PostMapping("/saveContact")
	public String handleSaveContactBtn(Contact contact, RedirectAttributes attributes) {
		logger.debug("*** saveContact() method execution started ***");
		Map<String, String > messages = appProps.getMessages();
		String msgText = null;
		if(contact.getContactId() != null) {
			//attributes.addFlashAttribute("updateSuccess", "Contact Updated Successfully");
			//attributes.addFlashAttribute("updateSuccess", messages.get("updateSuccess"));
			logger.info("*** contact Updated successfully ***");
			msgText = messages.get(AppContants.UPDATE_SUCCESS);
		}
		else {
			//attributes.addFlashAttribute("saveSuccess", "Contact Saved Successfully");
			logger.info("*** contact Saved successfully ***");
			msgText = messages.get(AppContants.SAVE_SUCCESS);
		}
		contact.setActiveSw("Y");
		
		boolean isSaved = contactService.saveContact(contact);
		if (isSaved) {			
			//attributes.addFlashAttribute("saveFail", "Contact Operation Failed");
			attributes.addFlashAttribute(AppContants.SUCCESS_MSG, msgText);
		}
		else {
			attributes.addFlashAttribute(AppContants.ERROR_MSG, messages.get(AppContants.SAVE_FAILED));
		}
		logger.debug("*** saveContact() method execution completed ***");
		
		return "redirect:/saveContactSuccess";
	}
	
	/*------ to take care of double positong -------*/
	@GetMapping("/saveContactSuccess")
	public String saveContactSuccess(Model model){
		logger.debug("*** method of PRG for double posting started ***");	
	   model.addAttribute("contact", new Contact());
	   //return "index";
	   logger.debug("*** loading index page for new contact entry ***");
	   logger.debug("*** method of PGP for double completed ***");
	   return AppContants.INDEX_VIEW;
	}
	
	/*--------- to take care of viewing all active contacts -----*/
	@GetMapping("/viewContacts")
	public String  handleViewContactsHyperLink(Model model) {	
		logger.debug("*** viewContacts() method execution started ***");
		List<Contact> contactsList = contactService.getAllContacts();		
		model.addAttribute("contacts", contactsList);
		logger.debug("*** viewContacts() method execution completed ***");
		logger.info("viewContacts successfully completed");
		return "viewContacts";
	}
	
	/*------- editable view of Contact ------*/
	@GetMapping("/edit")
	public String handleEditLinkClick(@RequestParam("cid") Integer cid, Model model) {
		logger.debug("*** editContact() method execution started ***");
		Contact contact = contactService.getContactById(cid);
		model.addAttribute("contact", contact);
		logger.debug("*** editContact() method execution completed ***");
		logger.info("contact edited successfully");
		//return "index";
		return AppContants.INDEX_VIEW;
	}
	
	/*----- to perform a soft delete on a contact after confirmation -----*/ 
	@GetMapping("/delete")
	public String handleDeleteLinkClick(@RequestParam("cid") Integer cid) {
		logger.debug("*** deleteContact() method execution started ***");
		contactService.deleteContactById(cid);
		logger.debug("*** deleteContact() method execution completed ***");
		logger.info("contact deleted Successfully");
		return "redirect:viewContacts";
	}
}

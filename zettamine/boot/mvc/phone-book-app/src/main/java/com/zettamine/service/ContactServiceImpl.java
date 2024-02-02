package com.zettamine.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zettamine.entity.Contact;
import com.zettamine.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository contactRepo;
	
	@Override
	public boolean saveContact(Contact contact) {
		Contact savedObj = contactRepo.save(contact);    
        return savedObj.getContactId() != null;
	}

	@Override
	public List<Contact> getAllContacts() {
		//return contactRepo.findAll();
		return contactRepo.findByActiveSw("Y");
	}

	@Override
	public Contact getContactById(Integer contactId) {
		Optional<Contact> findById = contactRepo.findById(contactId);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public boolean updateContact(Contact contact) {
		try {
			contactRepo.save(contact);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteContactById(Integer contactId) {
		try {
			Optional<Contact> contact = contactRepo.findById(contactId);
			if(contact.isPresent()) {
				Contact lookedUpContact = contact.get();
				lookedUpContact.setActiveSw("N");
				contactRepo.save(lookedUpContact);
			//contactRepo.deleteById(contactId);
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();			
		}
		return false;
	}

}

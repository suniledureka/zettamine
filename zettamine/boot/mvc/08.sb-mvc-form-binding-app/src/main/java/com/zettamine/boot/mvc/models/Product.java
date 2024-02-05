package com.zettamine.boot.mvc.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
	@NotNull(message = "* required")	
	private Integer productId;
	
	//@NotEmpty(message = "* required")
	@NotBlank(message = "* required")
	@Size(min = 3, max = 10)
	//@Email
	private String productName;
	
	@NotNull
	@Min(value = 100)
	@Max(value = 1000, message = "* <= 1000.0")
	private Float productPrice;
}

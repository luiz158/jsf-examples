/**
 * 
 */
package com.jeetemplates.web.controller;

import java.util.List;

import javax.faces.FacesException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.jeetemplates.service.dto.HelloWorldDTO;
import com.jeetemplates.web.form.HelloWorldForm;

/**
 * Welcome controller.
 * 
 * @author jeetemplates
 */
@ManagedBean
public class WelcomeController {

	/* ************************************ */
	/* Dependencies */
	/* ************************************ */

	/**
	 * {@link HelloWorldService}
	 */
	@ManagedProperty(value = HelloWorldForm.EL_NAME)
	private HelloWorldForm helloWorldForm;

	/* ************************************ */
	/* Attributes */
	/* ************************************ */

	/* ************************************ */
	/* Methods */
	/* ************************************ */

	/**
	 * Create hello.
	 * 
	 * @return welcome view
	 */
	public String createHello() {
		HelloWorldDTO dto = new HelloWorldDTO();
		dto.setFirstName(helloWorldForm.getFirstName());
		dto.setLastName(helloWorldForm.getLastName());
		// Form is session scoped.
		// Empty the attributes of form.
		helloWorldForm.setFirstName(null);
		helloWorldForm.setLastName(null);
		helloWorldForm.getListHellos().add(dto);
		return "welcome?faces-redirect=true";
	}

	/**
	 * Display ajax message.
	 * 
	 * @return ajax message
	 */
	public String displayHelloAjax() {
		StringBuilder response = new StringBuilder();
		String firstName = helloWorldForm.getFirstName();
		if (firstName != null && firstName.length() > 0) {
			response.append(firstName);
		}
		String lastName = helloWorldForm.getLastName();
		if (lastName != null && lastName.length() > 0) {
			response.append(" ");
			response.append(lastName);
		}
		// Form is session scoped.
		// Empty the attributes of form.
		helloWorldForm.setFirstName(null);
		helloWorldForm.setLastName(null);
		if (response.length() > 0) {
			response.insert(0, "Hello ");
			response.append(" !");
		}
		return response.toString();
	}

	/**
	 * Retrieve hello dto
	 * 
	 * @return list of hello dto
	 */
	public List<HelloWorldDTO> retrieveList() {
		return helloWorldForm.getListHellos();
	}

	/**
	 * Throw {@link FacesException}.
	 * 
	 * @return outcome "welcome"
	 */
	public String throwException() {
		throw new FacesException();
	}

	/* ************************************ */
	/* Getters & Setters */
	/* ************************************ */

	public void setHelloWorldForm(HelloWorldForm helloWorldForm) {
		this.helloWorldForm = helloWorldForm;
	}

}

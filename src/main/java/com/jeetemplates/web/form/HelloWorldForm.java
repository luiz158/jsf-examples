/**
 * 
 */
package com.jeetemplates.web.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.jeetemplates.service.dto.HelloWorldDTO;

/**
 * Hello world form
 * 
 * @author jeetemplates
 */
@ManagedBean
@SessionScoped
public class HelloWorldForm implements Serializable {

	/**
	 * Serial UID.
	 */
    private static final long serialVersionUID = -8962025293001375062L;

	/**
	 * Name of el property.
	 */
	public static final String EL_NAME = "#{helloWorldForm}";
	
	/**
	 * List of hellos
	 */
	private List<HelloWorldDTO> listHellos = new ArrayList<HelloWorldDTO>();

	/**
	 * Last name.
	 */
	private String lastName;

	/**
	 * First name.
	 */
	private String firstName;

	/**
	 * @return the listHellos
	 */
	public List<HelloWorldDTO> getListHellos() {
		return listHellos;
	}

	/**
	 * @param listHellos the listHellos to set
	 */
	public void setListHellos(List<HelloWorldDTO> listHellos) {
		this.listHellos = listHellos;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}

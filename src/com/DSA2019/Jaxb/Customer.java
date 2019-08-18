/**
 * 
 */
package com.DSA2019.Jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */

@XmlRootElement(name = "customer")
public class Customer {

	String name;
	int age;
	String address;
	String panNumber;

	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@XmlElement
	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	@XmlElement
	public void setAddress(String address) {
		this.address = address;
	}

	@XmlAttribute
	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", address=" + address + ", panNumber=" + panNumber + "]";
	}

}

/**
 * 
 */
package com.DSA2019.Jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * @author Atul Sharma
 *
 * https://github.com/sourac
 */
public class CustomerUnmarshaller {
	public static void main(String[] args) {
		
		File file = new File("file.xml");
		try {
			JAXBContext jaxbContext=JAXBContext.newInstance(Customer.class);
			Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
			Customer customer=(Customer) unmarshaller.unmarshal(file);
			System.out.println(customer);
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}

}

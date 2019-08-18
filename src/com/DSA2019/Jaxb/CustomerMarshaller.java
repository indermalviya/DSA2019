/**
 * 
 */
package com.DSA2019.Jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class CustomerMarshaller {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setName("Atul");
		customer.setAge(28);
		customer.setAddress("delhi");
		customer.setPanNumber("COPL");

		File file = new File("file.xml");
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Marshaller jaxBMarshaller = jaxbContext.createMarshaller();
			jaxBMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxBMarshaller.marshal(customer, file);
			jaxBMarshaller.marshal(customer, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}

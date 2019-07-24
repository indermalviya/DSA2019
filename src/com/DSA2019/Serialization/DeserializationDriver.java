package com.DSA2019.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDriver {

	public static void main(String[] args) {

		FileInputStream fis = null;
		ObjectInputStream ois = null;
		TestingSerialization ts=null;

		try {
			fis = new FileInputStream("test.ser");
			ois = new ObjectInputStream(fis);
			
			try {
				 ts=(TestingSerialization) ois.readObject();
				System.out.println("deserialization done successfully...");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//here salary won't be serialized because the salary is declared as transient
		
		System.out.println(ts.age+" : " + ts.designation +" :  "+ ts.name+" " + ts.salary);
	}

}

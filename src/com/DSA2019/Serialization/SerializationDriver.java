package com.DSA2019.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDriver {
	public static void main(String[] args) {

		
		TestingSerialization ts = new TestingSerialization("John", 30, "excomminicado", 1000);
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("test.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(ts);
			System.out.println("object serialized successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

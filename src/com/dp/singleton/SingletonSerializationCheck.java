package com.dp.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonSerializationCheck {
	public static void main(String[] args) {

		try {
			Singleton instance = Singleton.getInstance();
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.txt"));
			out.writeObject(instance);
			out.close();

			ObjectInput in = new ObjectInputStream(new FileInputStream("file.txt"));

			Singleton instance2 = (Singleton) in.readObject();
			in.close();

			System.out.println("instance hashCode:- " + instance.hashCode());
			System.out.println("instance2 hashCode:- " + instance2.hashCode());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerializableDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("/Users/Inampudi/Spring/student.ser");
			ois = new ObjectInputStream(fis);
			
			
			Object readObject = ois.readObject();
			Student student = (Student) readObject;
			
			System.out.println(student.id);
			System.out.println(student.name);
			System.out.println(student.grade);
			System.out.println(student.ssn);
			
			System.out.println("object deserialized");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}

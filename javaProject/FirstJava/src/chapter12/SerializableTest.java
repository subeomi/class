package chapter12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializableTest {

	public static void main(String[] args) {
		
		Person person = new Person("KING", 20);
		String msg = "안녕하세요";
		
		ObjectInputStream inputStream = null;
		
		try {
			FileInputStream in = new FileInputStream("instanceData.ser");
			
			inputStream = new ObjectInputStream(in);
			
			// 역 직렬화는 순서가 중요.
			Person p = (Person) inputStream.readObject();
			String newStr = (String) inputStream.readObject();
			// Person p = (Person) inputStream.readObject();
			
			p.tell();
			System.out.println(newStr);
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

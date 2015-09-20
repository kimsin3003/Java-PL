package stream;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;

class Person implements Serializable, Externalizable{
	
	String name;
	int age;
	transient Socket socket;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
		socket = new Socket();
	}
	
	public void aging(){
		age++;
	}
	
	public String toString(){
		return name + "," + age;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		in.readUTF();
		
	}
}

public class SerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Person person1 = new Person("이승기", 20);
		Person person2 = new Person("권지용", 20);
		
		person1.aging();
		person2.aging();
		
		FileOutputStream fos = new FileOutputStream("serial.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(person1);
		oos.writeObject(person2);
		
		oos.close();
		
		FileInputStream fis =  new FileInputStream("serial.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person ps1 = (Person)ois.readObject();
		Person ps2 = (Person)ois.readObject();
		
		System.out.println(ps1);
		System.out.println(ps2);
	}

}

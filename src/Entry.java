import java.sql.Connection;
import java.util.List;

public class Entry {
	
	
	private int id; // unique identifier, required cannot be Null
	private String name; // can have x characters in the DB, required, cannot be Null
	private int age; // optional field
	
	public Entry() {
		
	}
	
	public Entry(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}

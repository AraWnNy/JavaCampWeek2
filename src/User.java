
public class User {
	public User() {
		
	}
	
	public User(
			int id,
			String name,
			String lastName,
			String mail) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.mail = mail;
	}
	
	int id;
	String name;
	String lastName;
	String mail;
}

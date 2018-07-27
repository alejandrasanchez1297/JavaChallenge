package AccountWorld;


public class Customer implements java.io.Serializable {

/*
 * Attributes 
 */

	private int id;
	private int contact;
	private String name;
	private String userName;
	private String password;

/*
 * Methods
 */	
	public Customer() {
		
	}
 /*
  * Getters 
  */	
	public int getId() {
		return id;
	}
	public int getContact() {
		return contact;
	}
	public String getName() {
		return name;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	
 /* 
  * Setters 
  */	
	public void setId(int newId) {
		id=newId;
	}
	public void setContact(int newContact) {
		contact=newContact;
	}
	public void setName(String newName) {
		name=newName;
	}
	public void setUserName(String newUserName) {
		userName=newUserName;
	}
	public void setPassword(String newPassword) {
		password=newPassword;
	}
	
	

}

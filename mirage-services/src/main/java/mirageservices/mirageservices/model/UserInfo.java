package mirageservices.mirageservices.model;




public class UserInfo {
private String username;
private String password;
private String firstname;
private String email;
private int age;
private String gender;

public UserInfo() {
	
}
public UserInfo(String username, String password, String firstname, String email, int age, String gender) {
	super();
	this.username = username;
	this.password = password;
	this.firstname = firstname;
	this.email = email;
	this.age = age;
	this.gender = gender;
}

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "UserInfo [username=" + username + ", password=" + password + ", firstname=" + firstname + ", email=" + email
			+ ", age=" + age + ", gender=" + gender + "]";
}
}

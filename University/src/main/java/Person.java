
public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	public int getAge() {
		return this.age;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}
}

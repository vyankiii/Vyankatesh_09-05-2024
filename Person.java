package Oops;
// class name Person
public class Person {

	private String personName;
	private int personAge;
	private String personAddress;
	private String personMailId;
	private long personContactNo;

	//Default Constructor
	public Person() {
		personAge = 25;
		personName = "Vyankatesh";
		personAddress = "Pune";
		personMailId = "vyanki@gmail.com";
		personContactNo = 9359199002L;
	}

	// Parameterized Constructor
	public Person(String personName, int personAge, String personAddress, String personMailId, long personContactNo) {
		this.personName = personName;
		this.personAge = personAge;
		this.personAddress = personAddress;
		this.personMailId = personMailId;
		this.personContactNo = personContactNo;
	}

	// method to display person details
	public void displaypersonDetails() {
		System.out.println("Name: "+personName);
		System.out.println("Age: "+personAge);
		System.out.println("Address: "+personAddress);
		System.out.println("Email: "+personMailId);
		System.out.println("Mobile No: "+personContactNo);
	}

}


public class Dog {
	
	private String name;
	private int age;
	
	public Dog(String name, int age) {
		if(age == null) {
			throw new IllegalArgumentException("Age cannot be null.");
		}
		if(name.isBlank() || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be blank or empty.");
		}
		this.name = name;
		this.age = age;
	}

}

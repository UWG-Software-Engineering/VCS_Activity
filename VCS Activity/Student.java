
public class Student {
	
	private String name;
	private Double gpa;
	
	public Student(String name, Double gpa) {
		if(name == null) {
			throw new IllegalArgumentException("Name cannot be null.");
		}
		if(name.isBlank() || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be blank or empty.");
		}
		if(gpa < 0) {
			throw new IllegalArgumentException("GPA cannot be negative");
		}
		this.name = name;
		this.age = age;
	}

}

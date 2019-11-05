package edu.westga.cs3211.vcs_activity.model;

/**
 * Student data class.
 * @author Andrew Steinborn
 *
 */
public class Student {
	private static final int MINIMUM_GRADE = 0;
	private static final int MAXIMUM_GRADE = 100;
	
	private final String name;
	private final int grade;
	
	/**
	 * Instantiates a new student.
	 *
	 * @preconditions name != null && MININUM_GRADE <= grade <= MAXIMUM_GRADE
	 * @param name the name
	 * @param grade the grade
	 */
	public Student(String name, int grade) {
		if (name == null) {
			throw new IllegalArgumentException("name is null");
		}
		if (grade < MINIMUM_GRADE) {
			throw new IllegalArgumentException("grade is below " + MINIMUM_GRADE);
		}
		if (grade > MAXIMUM_GRADE) {
			throw new IllegalArgumentException("grade is above " + MAXIMUM_GRADE);
		}
		this.name = name;
		this.grade = grade;
	}

	/**
	 * Returns the name.
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the grade.
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}
}

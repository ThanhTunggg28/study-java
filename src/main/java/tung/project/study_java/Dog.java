package tung.project.study_java;

public class Dog extends Animal {
	public Dog(String name, Boolean horn, int age) throws AgeException {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public void bark() {
		System.out.println("gau gau...");
	}
}

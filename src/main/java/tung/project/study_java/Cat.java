package tung.project.study_java;

public class Cat extends Animal {
	public Cat(String name, Boolean horn, int age) throws AgeException {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public void bark() {
		System.out.println("meo meo...");
	}
	public void eat() {
		System.out.println("fish...");
	}

}

package tung.project.study_java;

public class Animal  {
	String name = "ABC";
	int age;
	public Number getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void bark() {
		System.out.println("barking...");
	}
	
	public Animal (String name, int age) throws AgeException {
		if(age < 0)  {
			throw new AgeException("An " + name + " can't negative age " + age);
		}
		else {
			this.name = name;
			this.age = age;
			System.out.println("Create a animal");
		}
	}
	
}

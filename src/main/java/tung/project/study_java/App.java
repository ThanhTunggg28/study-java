package tung.project.study_java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class App 
{
    /**
     * @param args
     * @throws AgeException 
     */
    public static void main( String[] args ) throws AgeException
    {
//    	1, 2
//        System.out.println( "Hello World!" );
    	
//    	3, 4 
    	ArrayList<Integer> arr = new ArrayList<>();
    	
    	Set<Integer> set = new HashSet<>();
        
        for(int i=0; i < 10; i++) {
        	if(i%2==0) {
        		arr.add(i);
        	} else {
        		set.add(i);
        	}
        }
        System.out.println("List: " + arr);
        System.out.println("HashSet: " + set);
        
//       5
    	
//    	try {
////    		int data = 5 / 1;  
//    		int data = 5 / 0;  
//    		System.out.println(data);
//    	} catch (ArithmeticException e) {
//    		System.out.println("Error Here");
//    	}
    	
       
//       6
    	
//    	Dog dog1 = new Dog("Quan", 10);
//    	System.out.println(dog1.name + " " + dog1.age);
//    	dog1.bark();
//    	
//    	
//    	Cat cat1 = new Cat("Meow", -5);
//    	System.out.println(cat1.name);
//    	cat1.name = "Cat";
//    	System.out.println(cat1.name);
//    	cat1.horn = false;
//    	System.out.println(cat1.horn);
//    	cat1.eat();
    	
        
    }
}

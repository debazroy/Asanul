package thisKeyword;


public class Person {
	String name;
	int age;
	String hairColor;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
	Person(String name, int age, String hairColor){
		
		this.name = name;
		this.age = age;
		this.hairColor = hairColor;
		
	}
	
	
	
	void display() {
		System.out.println("name is "+name);
		System.out.println("age is "+age);
		
	}

}

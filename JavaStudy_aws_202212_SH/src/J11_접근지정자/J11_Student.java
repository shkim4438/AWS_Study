package J11_접근지정자;

public class J11_Student {

	String name;
	int age;
	
	J11_Student(){
		
	}
	
	J11_Student(String name, int age){
		this.name = name;
		this.age = age;	
	}
	
	void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
}

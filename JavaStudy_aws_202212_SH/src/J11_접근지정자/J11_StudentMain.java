package J11_접근지정자;

import javax.print.attribute.standard.PrinterInfo;

import J11_접근지정자.default1.J11_StudentDefault;

public class J11_StudentMain {

	public static void main(String[] args) {
		J11_Student s1 = new J11_Student();
		s1.name = "김준일";
//		s1.age = 11;
		
		s1.printInfo();
		
		J11_StudentDefault s2 = new J11_StudentDefault();
	}

}

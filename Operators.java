package datatype;

public class Operators {

	public static void main(String[] args) 
	{
		int a, b;
		a=10; b=5;
		
		System.out.println("Add :" +(a%b));
		
		System.out.println("Relational Comparion Operator : " +(a<b));
		System.out.println("Relational Comparion Operator :" +(a>b));
		System.out.println("Relational Comparion Operator :" +(a>=b));
		System.out.println("Relational Comparion Operator :" +(a<=b));
		System.out.println("Relational Comparion Operator :" +(a!=b));
		System.out.println("Relational Comparion Operator :" +(a==b));
		
		//a++;
		
		int res=a++;
		//int res=++a;
		System.out.println(res);
	
	}
	

}

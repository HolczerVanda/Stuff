package fourthThird;

import java.util.Scanner;

public class Main {
	
	static Scanner input=new Scanner(System.in);

	public static void main(String[] args) {
		
		Person myPerson=readInput();
		
		System.out.println(myPerson.concat());
		
		//System.out.println(readInput().concat());

	}
	
	public static Person readInput()
	{
		Person person=new Person();
		String name="";
		int weight=0;
		double height=0;
		boolean ok;
		
		
		do{
			System.out.println("Please give the properties: ");
			
			String inputString=input.nextLine();
			String[] stringArray=inputString.split(", ");
			
			ok=true;
			try{
				name=stringArray[0];
				weight=Integer.parseInt(stringArray[1]);
				height=Double.parseDouble(stringArray[2]);
			}
			catch(Exception ex){
				System.out.println("Incorrect input");
				ok=false;
			}
		}while(!ok);
		
		person.setName(name);
		person.setWeight(weight);
		person.setHeight(height);
		
		return person;
		
	}

}

package fourthFirst;

import java.util.Scanner;

public class Main {

    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {

        Employee employee=new Employee("Vanda", 300000);
        Employee anotherEmployee=new Employee("Nem Vanda", 400000);

        
        System.out.println(employee.concat());

        employee.increaseSalary(20000);
        int newSalary=employee.getSalary();


        System.out.println(employee.concat());

        int anotherSalary=anotherEmployee.getSalary();

        System.out.println("The salary is between the given bounds: "+employee.isBetween(100000, 500000));
        System.out.println("The tax is(with 16%): "+ employee.taxCalculator());
        System.out.println("The first employee's salary is greater than the second one's: "+ employee.isGreaterThan(anotherSalary));

        Employee[] employees= arrayFiller();
        for(int i=0;i<employees.length;i++)
        {
            System.out.println(employees[i].concat());
        }

        greatestSalary(employees);

        System.out.println("Number of salaries between the given boundaries: "+ countSalaries(employees, 100000,800000));

        System.out.println("The average of salaries: "+ averageSalary(employees));
        
        System.out.println("The sum of the taxes: "+ sumOfTaxes(employees));
    }
    
    public static double sumOfTaxes(Employee[] array)
    {
    	double sum=0;
    	for(int i=0;i<array.length;i++)
    	{
    		sum+=array[i].taxCalculator();
    	}
    	return sum;
    }

    public static double averageSalary(Employee[] array)
    {
        double sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i].getSalary();
        }
        return sum / (array.length);
    }

    public static int countSalaries(Employee[] array, int lower, int upper)
    {
        int count=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i].getSalary()>lower && array[i].getSalary()<upper)
            {
                count++;
            }
        }
        return count;
    }

    public static void greatestSalary(Employee[] array)
    {
        int max=0;
        int index = 0;
        for(int i=0;i<array.length;i++)
            {
                if(array[i].getSalary()>max)
                {
                    max=array[i].getSalary();
                    index = i;
                }
            }
        System.out.println("The greatest salary belongs to: "+array[index].getName());
    }

    public static Employee[] arrayFiller()
    {
        Employee[] array= new Employee[2];

        System.out.println("\nPlease give me the names and salaries: ");

        for (int i = 0; i < array.length; i++) {
            array[i]=new Employee(readName(),readSalary());
        }
        return array;
    }

    public static String readName()
    {
        String inputName=input.nextLine();
        return inputName;
    }

    public static int readSalary()
    {
        int inputSalary=input.nextInt();
        input.nextLine();
        return inputSalary;
    }

}
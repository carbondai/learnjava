import java.util.*;
/**
 * This progarm demonstrates object construction.
 * @version 1.01 2015-08-05
 * @author daixin
 *
 */
public class ConstructorTest {
	public static void main(String[] args)
	{
		//fill the staff array with three Employee objects
		
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Harry", 40000);
		staff[1] = new Employee(60000);
		staff[2] = new Employee();
		
		//print out information about all Employee objects
		
		for (Employee e : staff)
			System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
					 + e.getSalary());
	}

}

class Employee
{
	private static int nextId;
	
	private int id;
	private String name = "";
	private double salary;
	
	static
	{
		Random generator = new Random();
		
		nextId = generator.nextInt(10000);
	}
	
	{
		id = nextId;
		nextId++;
	}
	
	public Employee(String n, double s)
	{
		name = n;
		salary = s;
	}
	
	public Employee(double s)
	{
		this("Employee #" + nextId, s);
	}
	
	public Employee()
	{
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public int getId()
	{
		return id;
	}
	
}
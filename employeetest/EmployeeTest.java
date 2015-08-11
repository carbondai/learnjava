import java.util.*;

/**
 * This program tests the Employee class.
 * @version 1.11 2015-08-03
 * @author daixin
 *
 */

public class EmployeeTest {
	public static void main(String[] args)
	{
		//fill the staff array with three Employee objects
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("daixin", 5338.78,2015,7,14);
		staff[1] = new Employee("liqiang", 15000,2015,7,1);
		staff[2] = new Employee("licong", 18955,2012,7,8);
		
		//raise everyone's salary by 5%
		for (Employee e : staff)
			e.raiseSalary(5);
		
		//print out information about all Employee objects
		for (Employee e : staff)
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() +
					",hireDay=" + e.getHireDay());
	}

}


class Employee
{
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String n, double s, int year, int month, int day)
	{
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
		hireDay = calendar.getTime();
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public Date getHireDay()
	{
		return (Date) hireDay.clone();
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
}















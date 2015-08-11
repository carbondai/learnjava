package abstractclasses;

public class PersonTest {
	public static void main(String[] args)
	{
		Person[] people = new Person[2];
		
		people[0] = new Employee("Dai Xin", 50000, 2015, 7, 14);
		people[1] = new Student("Day","computer science");
		
		for (Person p : people)
			System.out.println(p.getName() + "," + p.getDescription());
		
	}

}

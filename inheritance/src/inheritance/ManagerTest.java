package inheritance;

public class ManagerTest {
	public static void main(String[] args)
	{
		//construct a Manager object
		Manager boss = new Manager("Lee", 80000, 2011, 7, 2);
		boss.setBonus(10000);
		
		Employee[] staff = new Employee[3];
		
		//fill the staff array with Manager and Employee objects
		staff[0] = boss;
		staff[1] = new Employee("Li Cong", 60000, 2012, 7, 15);
		staff[2] = new Employee("Dai Xin", 50000, 2015, 7, 14);
		
		for(Employee e : staff)
			System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
	}

}

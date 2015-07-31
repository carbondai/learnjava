import java.util.*;

public class InputTest
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		
		System.out.println("tell me your name!");
		String name=in.nextLine();

		System.out.println("tell me your age!");
		int age=in.nextInt();

		System.out.println("hello,"+name+",next year,you'll be "+(age+1));
	}

}

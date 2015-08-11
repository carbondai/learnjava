import java.util.Arrays;

public class TwocolorBall {
	public static void main(String[] args)
	{
		int m = 33;
		int n = 16;
		int k = 6;
		int p = 1;
		
		int[] redpool = new int[m];
		int[] bluepool = new int[n];
		
		for (int i = 0; i < redpool.length; i++)
			redpool[i] = i + 1;
		
		for (int i = 0; i < bluepool.length; i++)
			bluepool[i] = i + 1;
		
		int[] redball = new int[k];
		int[] blueball = new int[p];
		
		for (int i = 0; i < redball.length; i++)
		{
			int r = (int) (Math.random() * m);
			redball[i] = redpool[r];
			redpool[r] = redpool[m-1];
			m--;
		}
		
		for (int i = 0; i < blueball.length; i++)
		{
			int r = (int) (Math.random() * n);
			blueball[i] = bluepool[r];
			bluepool[r] = bluepool[n-1];
			n--;
		}
		
		Arrays.sort(redball);
		Arrays.sort(blueball);
		
		System.out.println("Your lucky number serial is:");
		for(int r : redball)
			System.out.print( r + " ");
		
		System.out.println("");
		
		for(int r : blueball)
			System.out.print( r + " ");
		
	}

}

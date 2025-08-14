import java.util.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
		int A=scan.nextInt();
		int B =scan.nextInt();
		int ans= (A*B)-Math.min(A,B);
		System.out.print(ans);

	}
}







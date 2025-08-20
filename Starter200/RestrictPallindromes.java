

import java.util.*;
import java.lang.*;
import java.io.*;

public class RestrictPallindromes {


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();   
		String pattern = "abc"; 

		for(int t=0; t<T; t++)
		{
			int N = sc.nextInt(); 
			String ans = "";

			for(int i=0; i<N; i++)
			{
				ans = ans + pattern.charAt(i % 3); 
			}

			System.out.println(ans);
		}
	}
}

    
}

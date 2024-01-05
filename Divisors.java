
public class Divisors
	{
		public static void main(String[] args)
		{
			//program that gets 3 lenghs and prints "true" if these 3 lenghs can form a triangle, otherwise prints "false"
			
			int Num1 = Integer.parseInt(args[0]);
			for(int i = 1; i <= Num1; i++)
			{
			    if(Num1 % i == 0)
				{
				// Bad indentation 
				System.out.println(i);
				}					
			}
			
		
			
		}
	}

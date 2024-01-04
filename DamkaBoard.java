
public class DamkaBoard
	{
		public static void main(String[] args)
		{
			//program that gets 3 lenghs and prints "true" if these 3 lenghs can form a triangle, otherwise prints "false"
			 int Num = Integer.parseInt(args[0]);
			 for(int i = 0; i< Num; i++)
			 {
				 for(int j = 0; j< Num; j++)
				 {
					if(i % 2 == 0)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(" *");
					}
					 
				 }
				System.out.println();
				
                			
			 }
		 
			 
			
		}
	}
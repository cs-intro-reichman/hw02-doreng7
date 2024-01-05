
public class Perfect
	{
		public static void main(String[] args)
		{
			//program that gets 3 lenghs and prints "true" if these 3 lenghs can form a triangle, otherwise prints "false"
			 int Num = Integer.parseInt(args[0]);
			 int Count_For_Perfect = 0;
			 for(int i = 1; i< Num; i++)
			 {
				 if(Num % i == 0)
				 {
					 Count_For_Perfect += i;
				 }
			 }
		      if (Count_For_Perfect == Num)
			  {
				  System.out.print(Num + " is a perfect number since " + Num + " = 1");
				  // Loop inside an if is a bad practice 
				  for (int c = 2; c < Num; c++)
				  {
					  if(Num % c == 0)
					  {
						 System.out.print(" + " + c);
					  }
				  }
			   }
			  
			  else
			  {
				  System.out.println(Num + " is not a perfect number");
			  }
		
			
		}
	}

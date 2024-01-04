
public class InOrder
	{
		public static void main(String[] args)
		{
			//program that gets 3 lenghs and prints "true" if these 3 lenghs can form a triangle, otherwise prints "false"
			 int Random = (int)((Math.random() * 10) );
			 System.out.println(Random);
			 int Temp = 0;
			 while(Temp <= Random)
			 {
			      Temp = Random;
				  Random = (int)((Math.random() * 10) ); 
				  if(Random >= Temp)
				  {
					  System.out.print(Random);
				  }
			 }
		      
			
		
			
		}
	}
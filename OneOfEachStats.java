import java.util.Random;
public class OneOfEachStats
	{
		public static void main(String[] args)
		{
			//program that gets 3 lenghs and prints "true" if these 3 lenghs can form a triangle, otherwise prints "false"
		
			int Max_Temp = 0;
			int Max_F = 0;
			double T = Integer.parseInt(args[0]);
			int seed = Integer.parseInt(args[1]);
			double Avg = 0;
			double Sum = 0;
			int Num_Fam_2 = 0;
			int Num_Fam_3 = 0;
			int Num_Fam_4_Or_More = 0; 
			Random generator = new Random(seed);
		    for(int i = 1; i <= T; i++)
			{
				double Random =  generator.nextDouble();
				int Count = 1;
				if(Random < 0.5)
				{	
					while(Random < 0.5)
					{
						Count++;
						Random =  generator.nextDouble();
					}
					
				}		
				else
				{
					while(Random > 0.5)
					{
						Count++;
						Random =  generator.nextDouble();
					}
					
				}
				Sum += Count;
				if(Count == 2)
				{
					Num_Fam_2++;
				}
				if(Count == 3)
				{
					Num_Fam_3++;
				}
				if(Count >= 4)
				{
					 Num_Fam_4_Or_More++;
				}
			}
			Avg = Sum / T;
			Max_Temp = Math.max(Num_Fam_2, Num_Fam_3);
			Max_F = Math.max(Num_Fam_4_Or_More, Max_Temp);
            System.out.println("Average: " + Avg + " children to get at least one of each gender.");
			System.out.println("Number of families with 2 children: " + Num_Fam_2);
			System.out.println("Number of families with 3 children: " + Num_Fam_3);
			System.out.println("Number of families with 4 or more children: " + Num_Fam_4_Or_More);
			if(Max_F == Num_Fam_2)
			{
					System.out.println("The most common number of children is 2.");
			}
			if(Max_F == Num_Fam_3)
			{
					System.out.println("The most common number of children is 3.");
			}
			if(Max_F ==  Num_Fam_4_Or_More)
			{
					System.out.println("The most common number of children is 4 or more.");
			}
			
			
		}
	}
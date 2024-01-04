
public class Reverse
	{
		public static void main(String[] args)
		{
			//that adds two given integers and prints the result in a fancy way
			String Word = args[0];
			int Count = Word.length() -1;
			while( Count >= 0){
				System.out.print(Word.charAt(Count));
				Count--;
			}
			System.out.println();
			System.out.print("the middle character is " + Word.charAt((Word.length() - 1) / 2));
		}
			
		
			
	}
	
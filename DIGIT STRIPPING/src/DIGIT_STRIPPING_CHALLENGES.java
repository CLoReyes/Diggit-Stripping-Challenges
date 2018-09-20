import java.util.Scanner;

public class DIGIT_STRIPPING_CHALLENGES
	{
	
		static int six[] = new int [6];
		static int number;
		static int numbers[];
		static int sum = 0;

		public static void main(String[] args)
			{
			//	challengeOne();
			//	challengeTwo();
				challengeThree();
				challengeFour();
				challengeFive();
			}

		private static void challengeOne()
			{
				System.out.println("Input 6 random numbers");
				Scanner numberInput = new Scanner(System.in);
				int numbers = numberInput.nextInt();
				for (int i = 0; i < six.length; i++)
					{
						six[i] = numbers % 10;
						numbers = numbers / 10;
						System.out.println(six[i]);
						
					}
			}

		private static void challengeTwo()
			{
				System.out.println("Give me any number of random numbers");
				Scanner userNumbers = new Scanner(System.in);
				number = userNumbers.nextInt();
				int numberCount = number;
				int counter = 0;
				while (numberCount != 0)
					{
						numberCount = numberCount / 10;
						counter ++;
					
					}
				
				if (counter == 1)
					{
						System.out.println("There is " + counter + " number in this list.");
						
					}
				else
					{
						System.out.println("There are " + counter + " numbers in this list.");
					}
			}

		private static void challengeThree()
			{
				
			}

		private static void challengeFour()
			{
				for (int i = 0; i < numbers.length; i++)
					{
						sum = sum + numbers[i];
					}
				System.out.println("The sum is " + sum);
			}

		private static void challengeFive()
			{
				
			}

	}

import java.util.Scanner;

public class DIGIT_STRIPPING_CHALLENGES
	{
	
		static int six[] = new int [6];
		static int number;
		static int numbers[];
		static int sum = 0;

		public static void main(String[] args)
			{
				challengeOne();
				challengeTwo();
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
				System.out.println("Give me any number of random numbers, I'll say how many odd ones there are");
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
						System.out.println("There is " + counter + " odd number in this list.");
						
					}
				else
					{
						System.out.println("There are " + counter + " odd numbers in this list.");
					}
				numbers = new int[counter];
			}

		private static void challengeThree()
			{
				int oddNumbers = number;
				int odd = 0;
				for (int i = 0; i < numbers.length; i++)
					{
						numbers [i] = oddNumbers % 10;
						oddNumbers = oddNumbers / 10;
					
						if (numbers[i] % 2 == 1)
						{
							odd++;
						}
					}
				
				if (odd == 1)
					{
						System.out.println("There is " + odd + " odd number in this list.");
					}
						
				else
					{
						System.out.println("There are " + odd + " odd numbers in this list.");
					}
			
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
				int a = number % 10;
				
				if (a >= 5)
					{
						number = number + (10 - a);
						
					}
				else if (a < 5)
					{
						number = number / 10;
					}
				System.out.println("The average of this number is " + number);
			}

	}

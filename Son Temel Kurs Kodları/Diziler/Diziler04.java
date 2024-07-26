package Diziler;

import java.util.Random;

public class Diziler04 {

	public static void main(String[] args) {
		
		int [] [] ikiboyut = new int [2] [2];
		int [] [] ucboyut = new int [3] [3];
		int [] [] dortboyut = new int [4] [4];
		ikiboyut [0] [0] = 5;
		ikiboyut [0] [1] = 3;
		ikiboyut [1] [0] = 1;
		ikiboyut [1] [1] = 7;
		
		int [] [] a = new int [] [] { {1,2,3},{4,5,6},{7,8,9},{10,11,12} };
		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				Random random = new Random();
				int deger = random.nextInt(10);
				dortboyut[i] [j] = deger;
			}
		}
		
		for(int i2 = 0; i2 < 4; i2++) 
		{
			for(int j2 = 0; j2 < 4; j2++)
			{
				System.out.print(dortboyut [i2] [j2] + " ");
			}
			System.out.println(" ");
		}
		
		
		
		
		
	}

}

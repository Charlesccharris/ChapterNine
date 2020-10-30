import java.util.Random;

public class Homework9_4Main{
	public static void main(String[] args){
		/*Modified: *9.4 (Use the Random class)
		Write a program that creates a Random object
		with seed 1000 and displays the first 5 random integers
		between 0 and 100 using the nextInt(100) method.
		Repeat the list three times.*/

		int[] randomList = new int[5];
		Random numbers = new Random(1000);
		for(int i = 0; i < 5; i++){
			randomList[i] = numbers.nextInt(100);
		}
		for(int j = 0; j < 3; j++){
			for(int k = 0; k < 5; k++){
				System.out.print(randomList[k] + " ");
			}
			System.out.println("");
		}
	}
}

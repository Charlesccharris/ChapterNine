public class Homework9_6Main{
	public static void main(String[] args){
		/*Modified *9.6 (Stopwatch)
		Design a class named StopWatch.

		The class contains:
		Private data fields startTime and endTime with getter methods.;
		A no-arg constructor that initializes startTime with the current time.;
		A method named start() that resets the startTime to the current time.;
		A method named stop() that sets the endTime to the current time.;
		A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.
		Make the UML diagram for the class using comments and then implement the class.
		Write a test program that measures the execution time of sorting 100,000 numbers using selection sort.*/

		long totalTime;
		StopWatch watch = new StopWatch();
		int[] list = createArray();

		watch.start();
		java.util.Arrays.sort(list);
		watch.stop();
		totalTime = watch.getElapsedTime();
		System.out.println("It took " + totalTime + " milliseconds to sort the array");
	}

	public static int[] createArray(){
		int[] array = new int[100_000];
		for(int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random()*100);
		}
		return array;
	}
}

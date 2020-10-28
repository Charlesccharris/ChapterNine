public class StopWatch{
        /*The class contains:
        Private data fields startTime and endTime with getter methods.;
        A no-arg constructor that initializes startTime with the current time.;
        A method named start() that resets the startTime to the current time.;
        A method named stop() that sets the endTime to the current time.;
        A method named getElapsedTime() that returns the elapsed time for the stopwatch in milliseconds.
        Make the UML diagram for the class using comments and then implement the class.
        Write a test program that measures the execution time of sorting 100,000 numbers using selection sort.*/


	private long startTime = System.currentTimeMillis();
	private long endTime;

	public void start(){
		this.startTime = System.currentTimeMillis();
	}

	public void stop(){
		this.endTime = System.currentTimeMillis();
	}

	public long getElapsedTime(){
		long elapsedTime = this.endTime - this.startTime;
		return elapsedTime;
	}
}

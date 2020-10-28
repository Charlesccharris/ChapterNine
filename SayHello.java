public class SayHello{
	public void sayHello(){
		System.out.println("Hi");
	}
	public void repeatedHello(int repeats){
		for(int i = 0; i < repeats; i++){
			System.out.println((i+1) + " of " + repeats);
		}
	}
}

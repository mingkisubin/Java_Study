package Java_Study;

public class Study04 {
	
	public static void main(String[] args){
		printHelloWorld(5);
	}

	public static void printHelloWorld(int n) {
		if(n==0)return;
		System.out.println("HelloWorld");
		printHelloWorld(n-1);
		

	}

}

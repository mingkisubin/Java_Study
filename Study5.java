package Java_Study;

public class Study5 {
	
	public static void main(String[] args){
		System.out.println(plus(10));
	}

	public static int plus(int n) {
		if(n==0) {
			return 0;
		}
		return n + plus(n-1);
		
	}

}

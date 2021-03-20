import java.util.Scanner;
public class back8393 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner n = new Scanner(System.in);
		
		int a = n.nextInt();
		
		for( int b = 0 ; b<=a ; b++ ) 
			sum += b;
		
		System.out.println(sum);
		n.close();
	}

}

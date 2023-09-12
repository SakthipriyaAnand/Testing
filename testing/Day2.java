package testing;

public class Day2 {

	public static void main(String[] args) {
		int num=5;
		int a=1,b=1;
		do {
			b=1;
			do {
				System.out.print(b+" ");
				b++;
				//break;
			}while(b<=a);
			
			System.out.println();
			a++;
			//break;
			
		}while(a<=num);

	}

}

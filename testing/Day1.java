package testing;

public class Day1 {

	public static void main(String[] args) {
		int n=5;
		int i=0,j=0,k=1;
		
		while(i<=n) {
			
				while(k<=n-i) {
					System.out.print(" ");
					k++;
				}
				k=1;
			
			while(j<=i) {
			System.out.print("*");
			j++;
			}
			i++;
			j=0;
			System.out.println();
		}


	}

}

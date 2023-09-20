package studio3;
import java.util.Scanner;

public class SieveofEratosthenes {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("The number you want to check");
		int n = in.nextInt();
		int[] prime = new int[n+1];
		for(int i=2; i<=n;i++) {
			if(prime[i]==0) {
				System.out.print(i+" ");
				for(int j=2;j<=n/i;j++){
					prime[i*j]=1;
				}
			}
			
		}
	}

}

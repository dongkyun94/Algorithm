package greedy;

import java.util.Scanner;

public class P_11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int[] p = new int[N];
		for(int i = 0; i < p.length; i++) {
			p[i] = sc.nextInt();
		}
		sc.close();
		int sum=0;
		int tmp=0;
		for(int i = 0; i < p.length; i++) {
			for(int j = i; j<p.length; j++) {
				if(p[i]>p[j]) {
					tmp=p[i];
					p[i]=p[j];
					p[j]=tmp;
				}
			}
		}
		int[] q = new int[p.length];
		int answer = 0;
		for(int i =0; i<p.length; i++) {
			for(int j = 0; j<=i; j++) {
				sum+= p[j];
			}
			q[i] = sum;
			sum = 0;
			answer += q[i];
		}
		
		System.out.println(answer);

	}
	

}

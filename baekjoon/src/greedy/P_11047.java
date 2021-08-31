package greedy;

import java.util.Scanner;

public class P_11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int answer = 0;
		int[] val = new int[N];
		for(int i =0; i < N; i++) {
			val[i] = Integer.parseInt(sc.next());
		}
		sc.close();
		for(int i = val.length-1; i >=0; i--) {
			if(val[i]<=K) {
				answer += K/val[i];
				K = K%val[i];
			}
			
			}
		System.out.println(answer);
		

	}

}

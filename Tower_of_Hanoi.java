package Recursion;

import java.util.*;
public class Tower_of_Hanoi {
public static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method 
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String src="T1";
        String help="T3";
        String dest="T2";
        TOH(n,src,help,dest);
        System.out.println(count);

	}

	private static void TOH(int n, String src, String help, String dest) {
		if(n==0) {
			return;
		}
		TOH(n-1, src, dest, help);
		System.out.println("move "+n+"th disc from "+src+" to "+dest);
		count++;
		TOH(n-1, help,src , dest);
		
	}

}

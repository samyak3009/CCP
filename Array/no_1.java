// Write a program to reverse an array or string

import java.util.*;
import java.lang.Math;
public class Main {
	public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] x =  new int [n];
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
		}        
		reverse(x,n);
		for(int q:x){
			System.out.print(q+" ");
		}
	}
	static void reverse(int [] x,int n){
		for(int i=0;i<n/2;i++){
			int a = x[i];
			x[i] = x[n-1-i];
			x[n-1-i] = a;
		}
	}
}

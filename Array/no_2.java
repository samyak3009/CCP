// Maximum and minimum of an array using minimum number of comparisons

import java.util.*;
import java.lang.Math;
public class Main {
	static class Pair{
		int min;
		int max;
	}
	public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] x =  new int [n];
		for(int i=0;i<n;i++){
			x[i] = sc.nextInt();
		}
		Pair maxmin = new Pair();
		maxmin.min = x[0];
		maxmin.max = x[0];
		for(int i=1;i<n;i++){
			if(maxmin.min>x[i])
				maxmin.min = x[i];
			if(maxmin.max<x[i])
				maxmin.max = x[i];
		}
		System.out.print(maxmin.max+" "+maxmin.min);
	}
}

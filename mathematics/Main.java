import java.util.*;
public class Main {
	public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--!=0){
        	int n = sc.nextInt();
        	int d = sc.nextInt();
        	int a =0,b=0;
        	for(int i=0;i<n;i++){
        		int k = sc.nextInt();
        		if(k<=9||k>=80){
        			a++;
        		}
        	}
        	b=n-a;
        	double e = Math.ceil((double)a/d);
        	e+=Math.ceil((double)b/d);
        	System.out.println((int)(e));
        }
    }
}

import java.util.*;
import java.lang.Math;
public class Main {
	public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        System.out.println((int)Math.floor(Math.log10(t)+1));
    }
}

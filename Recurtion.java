package homework;
import java.util.*;
public class Recurtion {
	public static Scanner input= new Scanner (System.in);
	public static int q1(int n) {
		if (n==1) {
			return n;
		}
		return q1(n-1)+n;
	}
	public static int q2(int n) {
		if (n==1) {
			return n;
		}
		return q2(n-1)*n;
	}
	public static int q3(int n) {
		if(n%2==0) {
			return q3(n-1);
		}
		return q3(n-2)*n;
	}
	public static int q4(int n) {
		if(n==1) {
			return n;
		}
		return q4(n/10)+1;
	}
	public static int q5 (int x, int y) {
		if (x<=0) {
			return 0;
		}
		return 1+ q5(x-y,y);
	}
	public static boolean q9(int n) {
		if ((n/10)<1) {
			return true;
		}
		if ((n%10%2)==(n/10%10%2)) {
			return q9 (n/10);
		}
		
		return false;
	}
	public static void main(String[] args) {
		System.out.println(q9(2));
	}

}

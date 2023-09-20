package recurtion;
import java.util.*;
public class recurtion {//עמוד 26 
public static Scanner input=new Scanner (System.in);
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
	if (n<=1) {
		return 1;
	}
	if(n%2==0) {
		return (q3(n-2))*n;
	}
	return (q3(n-2))*n;
}
public static int q4(int n) {
	if(n<=1) {
		return 1;
	}
	return (q4(n/10))+1;
}
public static int q5 (int x, int y) {
	if (x<=0) {
		return 0;
	}
	return 1+ q5(x-y,y);
}
public static int q6(int x, int y) {
		if (x<=y) {
			return x;
		}
		return q6(x-y,y);
	}
public static boolean q7 (int x, int y) {
	if (x==0) {
		return true;
	}
	if(x>=1) {
	return q7(x-y,y);
	}
	return false;
}
public static boolean q8(int n,int x) { //כל פעם יורדים בספרה אחת ובודקים אם זה מתחלק
	if (x<=1) {
		return true;
	}
	if (n%x!=0) {
		return q8(n,x-1);
	}
	return false;
}
public static boolean q9(int n) {
	if ((n/10)<1) {
		return true;
	}
	if ((n%10%2)==(n/10%10%2)) {
		return q9(n/10);
	}
	return false;
}
public static int q10(int n) {
	if (n==1){
		return 2;
	}
	int d=n;
	if(n%2==0) {
		d=n*n;
	}
	else {
		d=n*2;
	}
	return q10(n-1)+d;
}
public static double q11(int n) {
	if(n==1) {
		return n;
	}
	double d=n+(n-1);
	if (n%2==0) {
		d=-(Math.sqrt(d));
	}
	return q11(n-1)+d;
}
public static int q12(int n1, int n2,int d) {
	if (d==1) {
		return 1;
	}
	int x=d;
	if(n1%x!=0||x>=n2) {
		x=0;
	}
	return q12(n1,n2,(d-1))+x;
}
public static int q13A(int n) {
	if (n<=1) {
		return 0;
	}
	if (n==2) {
		return 1;
	}
	return (int) (Math.pow(q13A(n-1), 2)) 
			+(int) (Math.pow(q13A(n-2), 2));
}
public static int q13B(int n) {
	if(n==1) {
		return 0;
	}
	return q13B(n-1)+q13A(n);
}
	public static void main(String[] args) {
		System.out.println(q13B(6));

	}

}

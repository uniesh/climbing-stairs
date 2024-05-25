import java.util.*;
public class Main {
	static public void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num1=0,num2=1,num3=0;
		for(int i=0;i<n;i++) {
			 num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
		}
		System.out.print(num3);
	}
}

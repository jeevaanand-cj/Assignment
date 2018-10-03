package MyProjects;

import java.util.Scanner; 

class reverseStar{
	Scanner s= new Scanner(System.in);
	int n=s.nextInt();//input from user

	void forward() {
		System.out.println("Forward Star");
		for (int i=0;i<=n;i++) {
			for (int j=1;j<=i;j++) {
			System.out.print("*");
			} 
			System.out.println();
		}
		System.out.println("...............");
		
	}
	void forwardtriangle() {
		System.out.println("Forward Triangle");
		for (int i=1;i<=n;i++) {
			for (int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=((i*2)-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("...............");
	}
	
}


class forwardStar extends reverseStar{
	
	
	void Reverse() {
		System.out.println("Reverse Star");
		
		for (int i=n;i<=n;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i==0) {
				break;
			}
		}	
		System.out.println("...............");
	}
	void reversetriangle() {
		System.out.println("Reverse Triangle");
		for (int i=n;i>0;i--) {
			for (int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=((i*2)-1);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("...............");
	}
	
	
}


public class StarPrint {

	public static void main(String[] args) {
	forwardStar f1=new forwardStar();	
	f1.forward();
	f1.Reverse();
	f1.forwardtriangle();
	f1.reversetriangle();
	}

}

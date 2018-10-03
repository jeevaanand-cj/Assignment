package MyProjects;

import java.util.Scanner;

public class SumofGivenNumbers {
	
	int sum=0;
	
	SumofGivenNumbers() {   //constructor 
	
	int n,m;
	
	Scanner s= new Scanner (System.in);
	
	m=s.nextInt();
	
	int a[]= new int[m];
	
	for (int i=0;i<m;i++) {
		
		n=s.nextInt();
		
		a[i]=n;
		//System.out.print(n+",");
		//System.out.print(a[i]+",");
	}
	
	for (int j=0;j<=a.length-1;j++) {
		
		sum=sum+a[j];
		//System.out.println(sum+",");
	}
	
   
	}
	
	void diplay() {
		
		System.out.println("Sum of given numbers:"+sum);
	}
	
	public static void main(String args[]) {
		
		
		SumofGivenNumbers s1=new SumofGivenNumbers();
		
		s1.diplay();
	}
}

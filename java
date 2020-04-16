import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter size of first array");
		int a=sc.nextInt();
		System.out.println("enter size of second array");
		int b=sc.nextInt();
		int arr[]=new int[a];
		int arr1[]=new int[b];
		System.out.println("enter first array");
		for(int i=0;i<a;i++){                                               //question 5
		    arr[i]=sc.nextInt();
		}
		System.out.println("enter second array");
		for(int j=0;j<b;j++){
		    arr1[j]=sc.nextInt();
		}
		for(int i=0;i<a;i++){
		    for(int j=0;j<b;j++){
		        if(arr[i]==arr1[j])
		        {System.out.print(" "+arr[i]);}
		    }
		}
	}
}

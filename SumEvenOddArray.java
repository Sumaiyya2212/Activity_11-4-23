package arrays;
import java.util.Scanner;
public class SumEvenOddArray {

	public static void main(String[] args) {
		int s,Esum=0,Osum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of an Array : ");
		s = sc.nextInt();
		int arr[] = new int[s];
		System.out.println("Enter "+s+" elemets in an Array : ");
		for(int i=0;i<s;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("Array elements are : ");
		for(int i=0;i<s;i++)
		{
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		for(int i=0;i<s;i++)
		{
			if(arr[i]%2==0)
				Esum++;
			else
				Osum++;
		}
		System.out.println("Even numbers in an Array are : "+Esum);
		System.out.println("Odd numbers in an Array are : "+Osum);
		
	}

}

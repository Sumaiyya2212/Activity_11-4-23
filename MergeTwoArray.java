package arrays;
import java.util.Scanner;
public class MergeTwoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of First Array : ");
		int s1 = sc.nextInt();
		int arr1[] = new int[s1];
		System.out.println("Enter "+s1+" elements of First Array");
		for(int i=0;i<s1;i++)
		{
            arr1[i]=sc.nextInt();
		}
		System.out.println("Enter Size of Second Array : ");
		int s2 = sc.nextInt();
		int arr2[] = new int[s2];
		System.out.println("Enter "+s2+" elements of Second Array");
		for(int i=0;i<s2;i++)
		{
            arr2[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("Elements of First Array : ");
		for(int j=0;j<s1;j++)
		{
			System.out.println("arr1["+j+"] = "+arr1[j]);
		}
		System.out.println();
		System.out.println("Elements of Second Array : ");
		for(int j=0;j<s2;j++)
		{
			System.out.println("arr2["+j+"] = "+arr2[j]);
		}
		System.out.println();
		int s3=s1+s2;
		int arr3[]= new int[s3];
        System.out.println("Elements of Third Array : ");
        for(int i=0;i<s1;i++)
        	arr3[i]=arr1[i];
        for(int i=0,j=s1;j<s3 && i<s2;i++,j++)
        {
        	arr3[j]=arr2[i];
        }
        for(int i=0;i<s3;i++)
        {
        	System.out.println("arr3["+i+"] = "+arr3[i]);
        }
		
		
	}

}

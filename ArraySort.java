package arrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class ArraySort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		int s = sc.nextInt();
		int arr1[] = new int[s];
		System.out.println("Enter "+s+" elements in an Array : ");
		for(int i=0;i<s;i++)
		{
			arr1[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("Elements of Array : ");
		for(int i=0;i<s;i++)
		{
			System.out.println("arr["+i+"] = "+arr1[i]);
		}
		System.out.println();
		Arrays.sort(arr1);
		System.out.println("Elements of Array after Sorting : ");
		for(int i=0;i<s;i++)
		{
			System.out.println("arr1["+i+"] = "+arr1[i]);
		}
		System.out.println();
		Integer arr2[] = {100,34,56,77,34};
		System.out.println("Elements of Second Array : ");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println("arr2["+i+"] = "+arr2[i]);
		}
		System.out.println();
		System.out.println("Sorting elements of Array (Descending) :");
		Arrays.sort(arr2,Collections.reverseOrder());
		for(int i=0;i<s;i++)
		{
			System.out.println("arr2["+i+"] = "+arr2[i]);
		}
	}

}

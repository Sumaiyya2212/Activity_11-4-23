package arrays;
import java.util.Scanner;

public class ArraySort2 {

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
		
		System.out.println("Elements of Array : ");
		for(int i=0;i<s;i++)
		{
			System.out.println("arr["+i+"] = "+arr1[i]);
		}
		System.out.println();
		int num;
		System.out.println("Select : 1 for Ascending  2 for Descending");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
		for(int i=0;i<s-1;i++)//5 4 6 7 2 6
		{
			for(int j=0;j<s-1;j++) {
				if(arr1[j]>arr1[j+1]) //compare 
				{
					num=arr1[j]; // Store Larger Value
					arr1[j]=arr1[j+1]; //Store smaller value
					arr1[j+1]=num; //storing larger value from num to array again
				}
			}		
		}
		System.out.println("Elements after Sorting in Ascending Order : ");
	     for(int i=0;i<s;i++)
	    	 System.out.println(arr1[i]);
		break;
		
	 case 2:
		for(int i=0;i<s-1;i++)//5 4 6 7 2 6
			{
				for(int j=0;j<s-1;j++) {
					if(arr1[j]<arr1[j+1]) //compare 
					{
						num=arr1[j]; // Store Larger Value
						arr1[j]=arr1[j+1]; //Store smaller value
						arr1[j+1]=num; //storing larger value from num to array again
					}
				}		
			}
			System.out.println("Elements after Sorting in Descending order : ");
		     for(int i=0;i<s;i++)
		    	 System.out.println(arr1[i]);
		  break;
	 default:
		 System.out.println("Invalid Input");
    }
		sc.close();
  }
}

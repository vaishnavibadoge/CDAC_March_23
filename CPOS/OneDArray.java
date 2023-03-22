import java.util.Scanner;
class OneDArray{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int flag=0;
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the element on index "+i+":");
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements:");
		for(int a:arr)
		{
			System.out.println(a);
		}
		System.out.println();
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<size;i++)
		{
			if(arr[i]<min)
				min = arr[i];
		}
		System.out.println("Minimum number from array is "+min);
		for(int i=0;i<size;i++)
		{
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.println("Maximum number from array is "+max);
		int ch;
		do{
			System.out.println("Enter the number that you want to search in array:");
				int num = sc.nextInt();
				for(int i=0;i<size;i++)
				{
					if(num == arr[i])
						flag = 1;
				}
				if(flag == 1)
					System.out.println("Element is found.");
				else
			System.out.println("Element not is found.");
			System.out.println("Enter 1. Search element");
			System.out.println("Enter 2. Exit");
			ch = sc.nextInt();
		
			}
			while(ch==1);
				System.out.println("Program exited successfully!!");
			
	}
}
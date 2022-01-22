/* 
--------- Stack using Java ---------
which follows the FILO [first in last out] OR LIFO[Last in first out]
  
  
*/
import java.util.Scanner;
class MainStack{
	static int top=-1;
	void push(int arr[],Scanner sc)
	{
		System.out.println("Insertion");
		if(top==arr.length-1)
			System.out.println("Stack is full");
		else
			{
				System.out.println("Enter the number");
				int num=sc.nextInt();
				arr[++top]=num;
				System.out.println(num+"--->Inserted to stack");
			}
		display(arr);
	}
	void pop(int arr[])
	{	
		System.out.println("Deletion");
	if(top==-1)
		System.out.println("Stack is Empty");
	else
		{
		int num=arr[top];
		arr[top--]=0;
		System.out.println(num+"--->Removed from stack to stack");		
		}
	display(arr);
	}
	
	void display(int arr[])
	{
		System.out.println("------------------------------------------------");
		for(int data:arr)
			System.out.print(data+" ");
		System.out.println();
	}	
}
public class Stack {
	static Scanner sc=new Scanner(System.in);
	
	static int arraySize;
	static int []arr;
public static void main(String args[]){
	
	System.out.println("Enter the array size");
	arraySize=sc.nextInt();
	arr=new int[arraySize];
	MainStack ms=new MainStack();
	for(;;)
	{  
		System.out.println("------------------------------------------------");
		System.out.println("1.Insertion");
		System.out.println("2.Delete");
		System.out.println("3.Display");
		System.out.println("4.Exit");
		int userInput=sc.nextInt();
		System.out.println("------------------------------------------------");
		
		switch(userInput)
		{
		case 1:	ms.push(arr,sc);
				break;
		case 2:ms.pop(arr);
				break;
		case 3:ms.display(arr);
			    break;
		case 4:System.exit(0);
				break;
		default : System.out.println("invalid Input");
				break;
		
		}	
	}	
 }
	
}

import java.util.Scanner;
class QueueImp{
	static int front=-1,rear=-1;
	void enqueue(int arr[],Scanner sc) 
	{
		if(rear==arr.length-1)
		{
			System.out.println("Queue is full");
		}
		else
		{
			System.out.println("Enter the element to the queue");
			int item=sc.nextInt();
			if(front==-1)
				front=0;
			arr[++rear]=item;
		}
		display(arr);
	}
	void Dequeue(int arr[]) {
		if(front==-1)
			System.out.println("Queue is Empty");
		else
		
		{
			System.out.println(arr[front]+"------>removed from queue elements");
			arr[front++]=0;
			
			if (front > rear) {
		        front = -1;
		        rear = -1;
		      }
			
		}
		display(arr);
		}
	void display(int arr[]) {
		System.out.print("------------------------------------------------------------");
		System.out.println("Queue elements are-->");
		for(int data:arr)
			System.out.print(data+" ");
		System.out.println();
		
		System.out.println("=================");
		System.out.println("front-->"+front);
		System.out.println("rear-->"+rear);	
	}
	
}

public class Queue {
static Scanner sc=new Scanner(System.in);
	
	static int arraySize;
	static int []arr;
public static void main(String args[]){
	
	System.out.println("Enter the array size");
	arraySize=sc.nextInt();
	arr=new int[arraySize];
	QueueImp qi=new QueueImp();
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
		case 1:	qi.enqueue(arr,sc);
				break;
		case 2:qi.Dequeue(arr);
				break;
		case 3:qi.display(arr);
			    break;
		case 4:System.exit(0);
				break;
		default : System.out.println("invalid Input");
				break;
		
		}	
	}	
 }

}

package StackQueue;
import java.util.Scanner;


class Stack
{
	int top;
	int maxsize = 3;
	int[] arr = new int[maxsize];


	boolean isEmpty()
	{
		return (top < 0);
	}
	Stack()
	{
		top = -1;
	}
	boolean push (Scanner sc)
	{
		if(top == maxsize-1)
		{
			System.out.println("Overflow !!");
			return false;
		}
		else
		{
			System.out.println("Enter Value");     //top=-1, top=0, a[0]=inserted_value1, top=1, a[1]=inserted_value....
			int val = sc.nextInt();
			top++;
			arr[top]=val;  // arr[0]=10, arr[1]=20, arr[2]=30, arr[3]=40, arr[4]=50
			System.out.println("Item pushed");
			return true;
		}
	}
	
	void display ()
	{
		System.out.println("Printing stack elements .....");
		for(int i = top; i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}
public class StackOperations {
	public static void main(String[] args) {
		int choice=0;
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack();
		System.out.println("*********Stack operations using array*********");
		System.out.println("-----------------------------------------------");
		while(choice != 4)
		{
			System.out.println("Chose one from the below options");
			System.out.println("\n1.Push\n3.Show\n4.Exit");
			System.out.println("\n Enter your choice :");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				s.push(sc);
				break;
			}
			case 2:
			{
				s.display();
				break;
			}
			case 3:
			{
				System.out.println("Exiting....");
				System.exit(0);
				break;
			}
			default:
			{
				System.out.println("Please Enter valid choice ");
			}
			};
		}
	}
}


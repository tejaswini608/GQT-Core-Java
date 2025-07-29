package ArrayOperations;
import java.util.Scanner;
class Array3 {
	String arr[][];
	Scanner in=new Scanner(System.in);
	void createArray()
	{
		System.out.print("Enter the class Count: ");
		int cls=in.nextInt();
		System.out.print("Enter the student count:");
		int stu=in.nextInt();
		arr=new String[cls][stu];
		System.out.println("Created an Array");
		System.out.println();
	}
	void collectData()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("The class "+(i+1)+ " is ");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("The Student name is " +(j+1));
				arr[i][j]=in.next();
			}
		}System.out.println("Data is Collected");
		System.out.println();
	}
	void displayData()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("The class count is" + (i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("The Student name of "+(j+1)+ " is "+arr[i][j]);
			}System.out.println();
		}System.out.print("The data is displayed");
	}
}
public class ArrayOperations{
	public static void main(String[] args) {
		Array3 a1=new Array3();
		a1.createArray();
		a1.collectData();
		a1.displayData();
	}
}

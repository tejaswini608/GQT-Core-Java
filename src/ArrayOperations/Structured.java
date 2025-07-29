package ArrayOperations;
import java.util.Scanner;
class Main
{
	int arr[];
    Scanner in=new Scanner(System.in);
    //int arr[];
    void createArray()
    {
        System.out.println("Enter the Students count");
        int n=in.nextInt();
        arr=new int[n];
        System.out.println("Array Created");
    }
    //System.out.print("Array Created");
    void collectData()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the marks of student "+(i+1)+" is ");
            arr[i]=in.nextInt();
        }
        System.out.println("data Collected");
    }
    void displayData()
    {
        for(int i=0;i<arr.length;i++)
        {
        System.out.println("the marks of the student "+(i+1)+" is " +arr[i]);
        }
        System.out.println("The data is displayed");
    }

}
public class Structured
{
    public static void main(String[] args)
    {
        Main s=new Main();
        s.createArray();
        s.collectData();
        s.displayData();
        
    }
}

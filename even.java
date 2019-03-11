import java.util.Scanner;
public class Evenorodd{
    public static void main(String args[]){
        int a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the New value");
        a=s.nextInt();
        if(a%2==0)
        {
            System.out.println(+a+ ":the number is even");
        }
        else
        {
            System.out.println(+a+": The Number Is Odd");
        }
    }
}

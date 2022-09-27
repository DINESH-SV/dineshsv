import java.util.Scanner;

public class Launch6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		int count = 0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("the number of digits are:"+count);

	}

}

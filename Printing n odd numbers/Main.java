import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	     // Type your code here
	Scanner in=new Scanner (System.in);
    int n=in.nextInt();
    for (int temp=1,count=1; temp<=n; count=count+1)
    {
      if (count%2==1)
      {
        System.out.println(count);
        temp=temp+1;
      }
    }
}
}
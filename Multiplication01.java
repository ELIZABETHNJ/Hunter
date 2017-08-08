# Hunter
import java.io.*;
import java.util.*;
public  class Multiplication01
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    String b=sc.nextLine();
    int x = Integer.parseInt(a);
    int y=Integer.parseInt(b);
    int c=Math.abs(x*y);
    String str = Integer.toString(c);
    System.out.println(str);
  }
}

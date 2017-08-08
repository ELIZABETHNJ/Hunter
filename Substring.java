# Hunter
import java.io.*;
import java.util.*;
public  class Substring
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    System.out.println("enter the length");
    int n=sc.nextInt();
     for(int i=0;i<=str.length()-n;i++)
    {
      System.out.print(str.substring(0,1));
      System.out.println(str.substring(i+1,i+n));
    }
    sc.close();
  }
}          

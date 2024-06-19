import java.util.Scanner;
import java.util.StringTokenizer;

class TokenStr{
  public static void main(String[] args){
   int n, sum = 0;
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter some Strings with one space gap in a single line : ");
   String str = sc.nextLine();
   StringTokenizer st = new StringTokenizer(str);
   System.out.println("Given strings are");
   while(st.hasMoreTokens())
   {
     String temp = st.nextToken();
     System.out.println(temp);
   }
  }
}
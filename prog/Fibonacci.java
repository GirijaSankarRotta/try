import java.util.Scanner;
class Fibonacci{
   static int fib(int n){
     int n1=1,n2=1,n3=0;
     System.out.print("fibonacci series : "+1+"  "+1+"  ");
     for(int i=2;i<n;i++){
      n3=n1+n2;
      n1=n2;
      n2=n3;
      System.out.print(n3+"  ");
      }
      System.out.println(" ");
      return n3;
   }
   static int rfib(int n){
      if(n<=1)
          return 1;
      else
          return rfib(n-1)+rfib(n-2);
     }
     public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number : ");
      int n=sc.nextInt();
      //fib(n);
      int nth=rfib(n-1);
      System.out.println(n+"th fibonacci number using recursion is :"+nth);
      System.out.println(n+"th fibonacci number using non recursion is : "+fib(n));   
      }
}
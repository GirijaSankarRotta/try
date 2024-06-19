import java.util.Scanner;
class PrimeNumbers{
  static void prime(int n){
  System.out.print("Prime numbers upto " + n+ " :");
  for(int i=2;i<=n;i++){
     int temp=0;
     for(int j=2;j<=i/2;j++){
          if(i%j==0){
              temp=1;
          }
      }
      if(temp==0){
         System.out.print(i+"  ");
      }
   }
}
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number : ");
      int n=sc.nextInt();
      prime(n);
   }
}
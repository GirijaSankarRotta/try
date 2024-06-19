import java.util.*;
class Palindrome{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a String : ");
    String str=sc.nextLine();
    String rstr="";
    /*for(int i=str.length()-1;i>=0;i--){
      rstr+=str.charAt(i);
    }*/
   for(int i=0;i<str.length();i++){
      rstr=str.charAt(i)+rstr;
   }
    if(str.equals(rstr))
        System.out.println("\n"+str+" is a Palindrome");
    else
        System.out.println(str+" is not a Palindrome");
  }
}
import java.io.*;
import java.util.*;
class SortNames{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number of names : ");
    int n=sc.nextInt();
    String[] names=new String[n];
    System.out.println("Enter names : ");
    sc.nextLine();
    for(int i=0;i<n;i++){
       names[i]=sc.nextLine();
    }
    Arrays.sort(names);
    System.out.println("\nSorted names : ");
    for (String name : names){
         System.out.println(name);
    }
    /*for(int i=0;i<n;i++){
        System.out.println(names[i]);
     }*/
   }
}
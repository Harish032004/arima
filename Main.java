import java.util.Scanner;
public class Main{
    public static void main(String[] args){
       System.out.print("enter a number :");
       Scanner number = new Scanner(System.in);
       int input1 = number.nextInt();
       int input2 = number.nextInt();
       int input3 = number.nextInt();
       if(input1 >= input2 && input1 >= input3 ){
        System.out.print("input 1 is largest");
       }
       else if(input2 >= input1 && input2 >= input3){
        System.out.print("input 2 is largest");
       }
       else{
        System.out.print("input 3 is largest");
       }
    }
}
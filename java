import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the array size:");
        int input = a.nextInt();
        int[] number = new int[input];
        System.out.println("Enter the array elements:");
        for(int i=0;i<input;i++){
        int number1 = a.nextInt();
        number[i]=number1;
            
        }
        System.out.println(Arrays.toString(number));
        int count =0;
        System.out.print("Enter the number to find occurs:");
        int numb = a.nextInt();
        for(int i=0;i<input;i++){
            if(numb == number[i])
            count = count+1;
        }
        System.out.print("The number "+numb+" occurs "+count+" times");

}}

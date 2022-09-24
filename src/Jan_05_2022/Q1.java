package Jan_05_2022;

import java.util.Scanner;

//create an integer array of 10 elements, initialize it by taking the input from user and print sum of each elements
public class Q1 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int sum=0;
        try(Scanner sc = new Scanner(System.in)){
            for(int i=0;i<10;i++){
                System.out.print("Enter your element: ");
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
        }
        catch (Exception e){
        }
        System.out.println("Sum = "+sum);
    }
}

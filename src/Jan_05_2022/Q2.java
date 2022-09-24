package Jan_05_2022;

import java.util.Scanner;
//String = "123456"
// 1+2+3+4+5+6
public class Q2 {
    public static void main(String[] args) {
        String n;
        int sum=0;
        try(Scanner sc = new Scanner(System.in)){
            n=sc.next();
            for(int i : n.toCharArray()){
                sum+=i-'0';
            }
        }catch (Exception e){
        }
        System.out.println("Sum = "+sum);
    }
}

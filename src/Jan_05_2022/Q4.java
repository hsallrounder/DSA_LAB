package Jan_05_2022;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        String s1="",s2="";
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter your first string: ");
            s1=sc.next();
            System.out.print("Enter your second string: ");
            s2=sc.next();
        }catch (Exception e){
        }
        if(s1.length()!=s2.length()){
            System.out.println("Not Anagram");
        }
        else {
            char []sa1 = s1.toCharArray();
            char []sa2 = s2.toCharArray();
            Arrays.sort(sa1);
            Arrays.sort(sa2);
            int f=0;
            for(int i=0;i<sa1.length;i++){
                if(sa1[i]!=sa2[i]){
                    f=1;
                    break;
                }
            }
            if(f==1){
                System.out.println("Not Anagram");
            }
            else {
                System.out.println("Anagram");
            }
        }
    }
}

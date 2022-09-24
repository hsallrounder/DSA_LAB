package Jan_05_2022;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Input string form user and identify no.of vowels
public class Q3 {
    public static void main(String[] args) {
        int v = 0;
        String s;
        try (Scanner sc = new Scanner(System.in)) {
            Pattern p = Pattern.compile("[aeiouAEIOU]");
            Matcher m = p.matcher(sc.next());
            while(m.find()){
                v++;
            }
        }catch (Exception e){
        }
        System.out.println("No. of vowels = "+v);
    }
}

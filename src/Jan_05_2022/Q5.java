package Jan_05_2022;

import java.util.Scanner;

//Create class student private roll no name marks
//array of 10 students object
// min marks max marks
class Student{
    private int roll_no;
    private String name;
    private int marks;

    public Student(int roll_no, String name, int marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public int getRoll_no() {
        return roll_no;
    }
}
public class Q5 {
    public static void main(String[] args) {
        Student arr[] = new Student[10];
        Scanner sc = new Scanner(System.in);
        int max=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        int x=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=new Student(sc.nextInt(),sc.next(),sc.nextInt());
            if(max<arr[i].getMarks()){
                max=arr[i].getMarks();
            }
            else if(max>=arr[i].getMarks() && max2<arr[i].getMarks()){
               max2=arr[i].getMarks();
                x=i;
            }
            if(min>arr[i].getMarks()){
                min=arr[i].getMarks();
            }
        }
        System.out.println("Difference = "+(max-min));
        System.out.println("2nd Highest: ");
        System.out.println("Name: "+arr[x].getName()+", Roll No: "+arr[x].getRoll_no()+", Marks: "+arr[x].getMarks());
        sc.close();
    }
}

package project1;

public class Task7 {

    public static void main(String[] args) {

        int a=0;
        int b=1;
        int next=a+b;

        System.out.println(a);
        System.out.println(b);

        for (int i=2; i<10; i++){
            next=a+b;

            System.out.println(next); //1

            a=b; //1
            b=next; //1+1=2
        }
    }
}
 //Write a Java Program to print the first 10 numbers of Fibonacci series.
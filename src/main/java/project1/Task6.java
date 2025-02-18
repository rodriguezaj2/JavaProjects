package project1;

public class Task6 {
    public static void main(String[] args) {

        boolean prime = true;
        int number = 7;

        if (number <= 1) {
            System.out.println("Not Prime");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;

                }
            }
        }
        if (prime) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }
    }
}
 //Write a java program to check whether a given number is prime or not?
package project1;

public class Task4 {
    public static void main(String[] args) {

        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int sum = 0;
        int sum2=0;
        for (int[] index : numbers) {
            for (int number : index) {
                if (number % 2 == 0) {
                    sum += number;
                }else{
                    sum2+=number;
                }
            }


        }
        System.out.println("Sum of all evens: "+sum);
        System.out.println("Sum of all odds: "+sum2);
    }
}

/*
Create a 2D array of integers. Develop a program which will calculate the
sum of even and odd numbers for that array.
 */
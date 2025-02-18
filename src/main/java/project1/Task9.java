package project1;

public class Task9 {

    public static void main(String[] args) {

        int[] numbers = {3, 1, 2, 5, 6, 10, 8, 7};
        int maxNumber = numbers[0];
        int secondLargest = numbers[0];

        for (int number : numbers) {
            if (number > maxNumber) {
                maxNumber = number;

            }
            for (int number2 : numbers) {
                if (number2 > secondLargest && number2 < maxNumber) {
                    secondLargest = number2;
                }
            }

        }
        System.out.println(maxNumber);
        System.out.println(secondLargest);

    }
}


//Write a java program to find the second largest number in the array?

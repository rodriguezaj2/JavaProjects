package project1;

public class Task8 {
    public static void main(String[] args) {
        int[] numbers = {10, 23, 43, 12, 54, 70, 12};

        int maxNumber = numbers[0];
        int minNumber = numbers[0];

        for (int number : numbers) {
            if (number > maxNumber) {
                maxNumber = number;
            } else if (number < minNumber) {
                minNumber = number;
            }
        }
        System.out.println(maxNumber);
        System.out.println(minNumber);
    }
}

//Maximum and minimum number in the array?
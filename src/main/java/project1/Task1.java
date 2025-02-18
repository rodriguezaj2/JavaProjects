package project1;

public class Task1 {
    public static void main(String[] args) {

        int[] weeklyTemps = {70, 75, 76, 60, 80, 83, 87};

        int max = weeklyTemps[0];
        int min = weeklyTemps[0];


        for (int dailyTemps : weeklyTemps) {
            if (dailyTemps > max) {
                max = dailyTemps;

            }
            if (dailyTemps < min) {
                min = dailyTemps;
            }

        }
        System.out.println(max);
        System.out.println(min);
    }
}

/*
Create a program that uses an array to store a list of temperatures for a week, and then uses a loop
to find the highest and lowest temperature for the week.
 */
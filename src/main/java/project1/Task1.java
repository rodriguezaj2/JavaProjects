package project1;

public class Task1 {
    public static void main(String[] args) {

        int [] weeklyTemps={78,73,79,80,81,80,79};

        int maxTemp=weeklyTemps[0];
        int minTemp=weeklyTemps[0];

        for(int dailyTemps:weeklyTemps){
            if(dailyTemps>maxTemp){
                maxTemp=dailyTemps;

            } else if (dailyTemps<minTemp) {
                minTemp=dailyTemps;
            }
        }
        System.out.println(maxTemp+" is highest temperature");
        System.out.println(minTemp+" is lowest temperature");

    }
}

/*
Create a program that uses an array to store a list of temperatures for a week,
and then uses a loop to find the highest and lowest temperature for the week.
 */
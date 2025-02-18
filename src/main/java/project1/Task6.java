package project1;

public class Task6 {
    public static void main(String[] args) {

        double number=7;

        if(number<1||number==2||number==3){
            System.out.println("Not prime");

        }
        for(int i=0; i<Math.sqrt(number);i++){
            if(number%2!=0&&number%3!=0&&number%5!=0){
                System.out.println("Prime");
                break;

            }else{
                System.out.println("Not Prime");
                break;
            }
        }

    }
}
/*
6. Write a java program to check whether a given number is prime or not?
 */
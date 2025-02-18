package project1;

public class Task3 {
    public static void main(String[] args) {
        int [][] numbers={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int [] index:numbers){
            for (int number:index){
                if(number%2==0){
                    System.out.print(number+" ");
                }

            }
            System.out.println();
        }
    }
}

/*
3. Create a 2D array or integer type where you will store odd and even numbers. Develop a program
that will identify/print the even numbers only.
 */
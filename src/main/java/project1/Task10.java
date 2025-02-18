package project1;

public class Task10 {
    public static void main(String[] args) {

        String[] names = {"Matthew", "Mark", "Luke", "John", "James", "Paul", "James"};

        for (int i = 0; i < names.length; i++) {

            for (int j = 0; j <= i - 1; j++) {
                if (names[j] == names[i])
                    System.out.println(names[i]);
            }

        }
    }
}


//Write a program to print out duplicate elements from an Array of Strings?

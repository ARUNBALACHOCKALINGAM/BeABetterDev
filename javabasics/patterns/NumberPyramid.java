package javabasics.patterns;

public class NumberPyramid {
    public static void main(String[] args) {
        int n=5; 

        for (int i = 1; i <= n; i++) {


            //spaces
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }

            //numbers
            for (int j = 0; j < i; j++) {
                System.out.print(i);
                System.out.print(" ");
            }

            System.out.println();
            
        }
    }
}

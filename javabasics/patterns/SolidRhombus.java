package javabasics.patterns;

public class SolidRhombus {
    public static void main(String[] args) {
        
        int n=5; 

        for (int i = 1; i <= n; i++) {


            //spaces
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }

            //stars
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }

            System.out.println();
            
        }
    }
}

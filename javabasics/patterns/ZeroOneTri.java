package javabasics.patterns;

public class ZeroOneTri {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                System.out.print(count % 2 == 0 ? 0 : 1);
            }
            System.out.println();
        }
    }
}

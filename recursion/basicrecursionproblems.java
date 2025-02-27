import java.util.*;

class BasicRecursionProblems{

    static void sumOfNnumbers(int sum,int n){
        if(n == 0) {
            System.out.println(sum);
            return;
        }
        sumOfNnumbers(sum+n,n-1);
    }
    


    // functional
    // sumOfNnumbers(n) -> sum of n numbers
    static int sumOfNnumbers(int n){
        if(n == 0) {
            return 0;
        }
        return n + sumOfNnumbers(n-1);
    }

    static void printNameNTimes(int n,String name){
        if(n == 0) return;
        System.out.print(name+" ");
        printNameNTimes(n-1,name);
    }

    static void printNtoOne(int n){
        if(n == 0) return;
        System.out.print(n+" ");
        printNtoOne(n-1);
    }


    static void printOneToN(int number,int n){
        if(number == n) return;
        System.out.print(number + "  ");
        printOneToN(number+1,n);
    }

    static void printOneToNBacktrack(int n){
        if(n==0) return;
        printOneToNBacktrack(n-1);
        System.out.print(n + "  ");
    }

    static boolean checkPalindrome(int i,int n,String str){
        if(i>=n/2){
            return true;
        }
        
        if(str.charAt(n-i-1) != str.charAt(i)){
            return false;
        }

        return checkPalindrome(i+1,n,str);
        
    }


    static void reverseAnArray(int i,int n,int arr[]){
        if(i>=n/2){
            System.out.println("After reverse: "+ Arrays.toString(arr));
            return;
        }
        
        arr[n-i-1] = arr[i];
        

        reverseAnArray(i+1,n,arr);
    }

    static int fibonaciiOfN(int n){
        if(n<=1) return n;

        return fibonaciiOfN(n-1) + fibonaciiOfN(n-2);
    }


    public static void main(String args[]){
        System.out.println("Problem one: Print name N times \n");
        printNameNTimes(5,"Arun");
        System.out.println("\n");
        System.out.println("Problem two: Print one to N \n");
        printOneToN(1,5);
        System.out.println("\n");
        System.out.println("Problem three: Print N to one \n");
        printNtoOne(10);
        System.out.println("\n");
        System.out.println("Problem four: Print one to N but with backtracking \n");
        printOneToNBacktrack(10);
        System.out.println("\n");
        System.out.println("Problem five: Print sum of N numbers (parameterised)\n");
        sumOfNnumbers(0,9);
        System.out.println("\n");
        System.out.println("Problem six: Print sum of N numbers (functional approach)\n");
        sumOfNnumbers(0,9);
        System.out.println("\n");
        System.out.println("Problem seven: Reverse an array\n");
        int arr[] = new int[]{4,3,2,1};
        System.out.println("Before reverse: " + Arrays.toString(arr));
        reverseAnArray(0,arr.length,arr);
        String str = "MAD";
        System.out.println("\n");
        System.out.println("Problem seven: check if string is palindrome\n");
        System.out.println(checkPalindrome(0,str.length(),str));
        System.out.println("\n");
        System.out.println("Problem eight: FIBONACIIII\n");
        System.out.println(fibonaciiOfN(7));
    }
}
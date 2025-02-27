

// when a function *calls itself* until a *condition* is met


class RecursionIntroduction{

    public static void printOnes(int n){


        // Java has a stack memory in which the function called
        // gets added
        // and when we return, the value returned is sent to the 
        // previous function in the stack space

        /*  
         *      printOnes()        *
         *      printOnes()        *
         *      printOnes()        *
         ***************************
         */



        // this condition is called as the base condition
        // there can be a single base condition or multiple base condition
        if(n==0) return;


        System.out.print(1);
        printOnes(n-1);
    }
    
    public static void main(String args[]){

        //print ten ones
        printOnes(10);
    }
}
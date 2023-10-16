public class FizzBuzz {

    public static void main(String[] args) {
        int n = 15;
        recursiveFizzBuzz(n);
        System.out.println();
        fizzBuzz(n);
    }

    public static void fizzBuzz(int n){
        for(int i = 1; i <= n ; i++){
            if(i % 15 == 0){
                System.out.print(" FizzBuzz ");
            }
            else if(i % 3 == 0){
                System.out.print(" Fizz ");
            }
            else if(i % 5 == 0){
                System.out.print(" Buzz ");
            }
            else {
                System.out.print(" "+ i + " ");
            }
        }
    }
    public static void recursiveFizzBuzz(int n){
        if(n > 1){
            recursiveFizzBuzz(n - 1);
        }
        if(n % 15 == 0){
            System.out.print("FizzBuzz ");
        }
        else if(n % 5 == 0){
            System.out.print(" Buzz ");
        }
        else if (n % 3 == 0) {
            System.out.print(" Fizz ");
        }
        else {
            System.out.print(" " +n + " ");
        }
    }

}


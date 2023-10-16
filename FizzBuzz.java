public class FizzBuzz {

    public static void main(String[] args) {
        int n = 30;
        recursiveFizzBuzz(n);
    }

    public static void fizzBuzz(int n){
        for(int i = 1; i <= n ; i++){
            if(i % 15 == 0){
                System.out.println("Fizz Buzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }


            else {
                System.out.println(i);
            }
        }
    }

    public static void recursiveFizzBuzz(int n){
        if(n > 1){
            recursiveFizzBuzz(n -1);
        }
        if(n % 15 == 0){
            System.out.println("Fizz Buzz");
        }
        else if(n % 5 == 0){
            System.out.println("Buzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        }
        else {
            System.out.println(n);
        }
    }

}


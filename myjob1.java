import java.util.Random;

public class myjob1 {
                    }
class nyjob1{
    //targil 1
    static void bin(int n) {

        if (n > 1)
            bin(n / 2);


        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        bin(5);
        System.out.println();
        bin(0b10);
    }

    // targil 2

    public static void prime(int num){

    Random rn = null;
    int answer = rn.nextInt(100) + 1;
        {
        System.out.println(rn);
        }
}


//targil 3

static class test {

        static int factorial(int num)
        {
            if (num == 0)
                return 1;

            return num * factorial(num - 1);
        }

        // Driver method
        public static void main(String[] args)
        {
            int num = 6;
            System.out.println(
                    "Factorial of " + num
                            + " is " + factorial(6));
        }
    }













}


package programs;

public class GCDRecursion {

    public static void main(String[] args) {
        int num1 = 18;
        int num2 = 48;

        int gcd = findGCD(num1, num2);
        System.out.println(18%48);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    // Recursive method to find GCD
    public static int findGCD(int a, int b) {
        // Base case: if b is 0, the GCD is a
        if (b == 0) {
            return a;
        }
        // Recursive case: call the function with (b, a % b)
        else {
            return findGCD(b, a % b);
        }
    }
}

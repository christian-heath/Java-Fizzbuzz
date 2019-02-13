public class Main {
    public static void main(String[] args) {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        String number = fizzbuzz.fizzBuzz(2);
        String fizzBuzz = fizzbuzz.fizzBuzz(30);
        String fizz = fizzbuzz.fizzBuzz(9);
        String buzz = fizzbuzz.fizzBuzz(10);
        System.out.println(number); // Expected output: "2"
        System.out.println(fizzBuzz); // Expected output: "FizzBuzz"
        System.out.println(fizz); // Expected output: "Fizz"
        System.out.println(buzz); // Expected output: "Buzz"
    }
}
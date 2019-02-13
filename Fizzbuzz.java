public class Fizzbuzz {
    public String fizzBuzz(int number) {
        if (number % 15 == 0) {
            String result = "FizzBuzz";
            return result;
        } else if (number % 5 == 0) {
            String result = "Buzz";
            return result;
        } else if (number % 3 == 0) {
            String result = "Fizz";
            return result;
        } else {
            String result = Integer.toString(number);
            return result;
        }
    }
}

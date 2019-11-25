public class Counter {

    public String print(int n) {
        if(n <= 0) throw new IllegalArgumentException();
        if(n % 3 == 0 && n % 5 == 0) return "FizzBuzz";
        if(n % 3 == 0) return "Fizz";
        if(n % 5 == 0) return "Buzz";

        return Integer.toString(n);
    }
}

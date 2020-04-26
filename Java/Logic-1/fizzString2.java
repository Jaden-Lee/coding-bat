public class fizzString2 {
    public String fizzString2(int n) {
        return n % 3 == 0 ? n % 5 == 0 ? "FizzBuzz!" : "Fizz!" : n % 5 == 0 ? "Buzz!" : n+"!";
    }      
}
public class fizzString {
    public String fizzString(String str) {
        return (str.substring(0,1).equals("f") && str.substring(str.length()-1).equals("b")) ? "FizzBuzz" : str.substring(0,1).equals("f") ? "Fizz" : str.substring(str.length()-1).equals("b") ? "Buzz" : str;
    }      
}
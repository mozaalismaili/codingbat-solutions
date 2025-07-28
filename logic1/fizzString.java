public class fizzString{
public String fizzString(String str) {
  boolean startsWithF = str.startsWith("f");
    boolean endsWithB = str.endsWith("b");

    if (startsWithF && endsWithB) return "FizzBuzz";
    if (startsWithF) return "Fizz";
    if (endsWithB) return "Buzz";
    return str;
}

}

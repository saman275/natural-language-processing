public class NLPRunner {
    public static void main(String[] args) {
        PasswordStrength person = new PasswordStrength();

//starts with checker to get 3 booleans, if it has upperacse, has lowercase, and has a number
      boolean[] results = person.checker();

//since checker will return a list of 3 booleans, decideStrong takes those booleans and determines if it is strong, weak, or medium
      String strength = person.decideStrong(results[0], results[1], results[2]);
      //then, take the strength string and print it out
        System.out.println("Password Strength: " + strength);
    }
}
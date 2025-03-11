import java.util.ArrayList;
import java.util.Scanner;
/*
javadocs
 PasswordStrength has all the code that I will use
 ArrayList lowercase-list of lowercase letters
 ArrayList uppercase-list of uppercase letters
  ArrayList nums-list of numbers 0-9
checker-takes user input and returns a list of 3 booleans
decideStrong-uses the 3 booleans to determine if your password is weak, strong, or medium
*/
public class PasswordStrength {
    private ArrayList<String> lowercase;
    private ArrayList<String> uppercase;
    private ArrayList<String> nums; // Changed to String list to match character checks

    public PasswordStrength() {
        lowercase = FileReader.toStringList("characterslower.txt");
        uppercase = FileReader.toStringList("charactersupper.txt");
        nums = FileReader.toStringList("numbers.txt");
    }

    //this checker will check through the user response and will return 3 variables. it returns a list
    public boolean[] checker() {
        Scanner scanner = new Scanner(System.in);//starts scanner
        System.out.println("What password are you currently using?");
        String userInput = scanner.nextLine();//scanner reads
        scanner.close();//close scanner

        boolean hasUpper = false;//these 3 variables will be returned as a list
     
      boolean hasLower = false;
        boolean hasNum = false;

        // Check each character in the password
for (int i = 0; i < userInput.length(); i++) {  // Loop through user input
    String individual = userInput.substring(i, i + 1);  // Get an individual character from the user input

//Go through lowercase list and determine if the letter is lowercase
    for (int j = 0; j < lowercase.size(); j++) {
        if (lowercase.get(j).equals(individual)) {
            hasLower = true;
        }
    }
// Go through uppercase list and determine if it is uppercase
    for (int b = 0; b < uppercase.size(); b++) {
        if (uppercase.get(b).equals(individual)) {
            hasUpper = true;
        }
    }
  //Check if it is a number
    for (int c = 0; c < nums.size(); c++) {
        if (nums.get(c).equals(individual)) {
            hasNum = true;  
        }
    }
//If nothing matches, it stays false.
}

        // Return all three boolean values in an array
        return new boolean[]{hasUpper, hasLower, hasNum};
    }

  

    // Decides the password strength based on boolean values
    public String decideStrong(boolean hasUpper, boolean hasLower, boolean hasNum) {
        if (hasUpper && hasLower && hasNum) {
            return "Strong";
        } else if ((hasUpper || hasLower) && hasNum) {
            return "Medium";
        } else {
            return "Weak";
        }
    }
}

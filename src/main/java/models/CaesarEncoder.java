package models;
//import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.List;
import java.util.ArrayList;

public class CaesarEncoder {
    private String userInput;
    private int shiftKey;
    private final List<String> userOutput = new ArrayList<String>();

     //The constructor below is to initialize the class and its properties
    public CaesarEncoder(String userInput, int shiftKey) {
        this.userInput = userInput;
        this.shiftKey = shiftKey;
    }

    public String encryptUserText() {
        for (int i = 0; i < userInput.length(); i++) {
            if (Character.isUpperCase(userInput.charAt(i))) {
                int newCharValue = ((int)(userInput.charAt(i)) + shiftKey - 65) % 26 + 65;
                char encodedChar = (char)(newCharValue);
                String encodedString = Character.toString(encodedChar);
                userOutput.add(encodedString);
            } else if (Character.isLowerCase(userInput.charAt(i))) {
                int newCharValue = ((int)(userInput.charAt(i)) + shiftKey - 97) % 26 + 97;
                char encodedChar = (char)(newCharValue);
                String encodedString = Character.toString(encodedChar);
                userOutput.add(encodedString);
            } else {
                String encodedString = Character.toString(userInput.charAt(i));
                userOutput.add(encodedString);
            }
        }
        return String.join("", userOutput);
    }

////    // The two functions below are getter functions used to send/return this class' properties to
////    // other external classes or functions that might need them. Hence, the return...
 public String getInputString() {
      return this.userInput;
   }

  public int getShiftKey() {
      return this.shiftKey;
    }

    // The two functions below are setter functions used to set user input from App.java as
    // properties of an instance of this class when the program is running. Use these setter
    // functions instead of the constructor to set the properties
    public void setUserText(String userInput) {
        this.userInput = userInput;
    }

    public void setUserKey(int userKey) {
        this.shiftKey = userKey;
    }
}

package models;

import java.util.ArrayList;
import java.util.List;

public class CaesarEncoder {
    private String userInput;
    private int shiftKey;
    private List<String> userOutput = new ArrayList<String>();

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public int getShiftKey() {
        return shiftKey;
    }

    public void setShiftKey(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    public List<String> getUserOutput() {
        return userOutput;
    }

    public void setUserOutput(List<String> userOutput) {
        this.userOutput = userOutput;
    }


}

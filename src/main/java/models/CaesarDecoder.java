package models;

import java.util.ArrayList;
import java.util.List;

public class CaesarDecoder {

    private CaesarDecoder EncoderDetails = new CaesarDecoder("", 0);

    public CaesarDecoder getEncoderDetails() {
        return EncoderDetails;
    }

    public void setEncoderDetails(CaesarDecoder encoderDetails) {
        EncoderDetails = encoderDetails;
    }

    public String getUserText() {
        return userText;
    }

    public void setUserText(String userText) {
        this.userText = userText;
    }

    public int getDecodeKey() {
        return decodeKey;
    }

    public void setDecodeKey(int decodeKey) {
        this.decodeKey = decodeKey;
    }

    public List<String> getDecodedOutput() {
        return decodedOutput;
    }

    public void setDecodedOutput(List<String> decodedOutput) {
        this.decodedOutput = decodedOutput;
    }

    private String userText;
    private int decodeKey;
    private List<String> decodedOutput = new ArrayList<String>();

    public CaesarDecoder(String s, int i) {
    }
}

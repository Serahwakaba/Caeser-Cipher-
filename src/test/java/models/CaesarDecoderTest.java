package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaesarDecoderTest {
    @Test
    public void newCaesarCipherObject_instantiatesCorrectly() throws Exception {
        CaesarDecoder testCaesarCipherDecoder = new CaesarDecoder("A", 1);
        assertEquals(true, testCaesarCipherDecoder instanceof CaesarDecoder);
    }

    @Test
    public void newCaesarCipherDecoder_getUserText_String() throws Exception {
        CaesarDecoder testCaesarCipherDecoder = new CaesarDecoder("", 1);
        assertEquals("", testCaesarCipherDecoder.getUserText());
    }

    @Test
    public void newCaesarCipherDecoder_getUserShiftKey_int() throws Exception {
        CaesarDecoder testCaesarCipherDecoder = new CaesarDecoder("", 0);
        assertEquals(0, testCaesarCipherDecoder.getUserKey());
    }

    @Test
    public void decodeUserText_decodesOneLetterString_String() throws Exception {
        CaesarDecoder testCaesarCipherDecoder=new CaesarDecoder("D", 1);
        assertEquals("C", testCaesarCipherDecoder.decodeUserText());
    }

    @Test
    public void decodesUserText_decodesTwoLetterString_String() throws Exception {
        CaesarDecoder testCaesarCipherDecoder=new CaesarDecoder("TH", 1);
        assertEquals("SG", testCaesarCipherDecoder.decodeUserText());
    }

    @Test
    public void decodesUserText_decodesMultipleLetterString_String() throws Exception {
        CaesarDecoder testCaesarCipherDecoder=new CaesarDecoder("YOLTKCLU", 23);
        assertEquals("BROWNFOX", testCaesarCipherDecoder.decodeUserText());
    }

    @Test
    public void decodesUserText_decodesStringWithDifferentAlphabeticalCaseLetters_String() throws Exception {
        CaesarDecoder testCaesarCipherDecoder=new CaesarDecoder(
                "VyyuEZdkLVOC", 10);
        assertEquals("LookUPtaBLES", testCaesarCipherDecoder.decodeUserText());
    }

    @Test
    public void decodeUserText_decodesStringWithASpaceInBetweenTwoStrings_String() throws Exception {
        CaesarDecoder testCaesarCipherDecoder=new CaesarDecoder(
                "Olr OLR", 13);
        assertEquals("Bye BYE", testCaesarCipherDecoder.decodeUserText());
    }


}
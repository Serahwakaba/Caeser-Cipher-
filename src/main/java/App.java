import models.CaesarDecoder;
import models.CaesarEncoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {


    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    boolean programRunning = true;

    CaesarEncoder encoder = new CaesarEncoder("", 0);
    CaesarDecoder decoder = new CaesarDecoder("", 0);

}

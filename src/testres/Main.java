package testres;

import notecollection.*;
import noteio.WuFile;
import noteio.Wuio;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
//        WuFile file=new WuFile();
//        try {
//            file.testFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        Wuio wuio=new Wuio();
        try {
            wuio.testInputStream();
            wuio.testReader();
            wuio.testOutputStream();
            wuio.testCopuFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


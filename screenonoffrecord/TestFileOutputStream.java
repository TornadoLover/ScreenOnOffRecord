package com.tornado.screenonoffrecord;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream
{
    public static void TestWrite(String content) {
        //store in the Info.text file
        File file = new File(android.os.Environment.getExternalStorageDirectory() + "/info.txt");
        //use output stream to output data file
        FileOutputStream fos = null;
        try {
            //The record text file will not be replaced by the next one.
            fos = new FileOutputStream(file, true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            byte[] contentInBytes1 = content.getBytes();

            fos.write(contentInBytes1);
            fos.flush();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


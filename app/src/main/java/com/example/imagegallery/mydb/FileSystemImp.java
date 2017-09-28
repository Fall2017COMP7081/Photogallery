package com.example.imagegallery.mydb;

/**
 * Created by gaston on 2017-09-21.
 */

import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import android.Manifest;
import android.support.v4.content.ContextCompat;
import android.content.pm.PackageManager;
import android.widget.Toast;

public class FileSystemImp implements IDataStore {

    String state = null;
    public void putState(String state)
    {
        File file = new File("test.txt");
        if(!file.exists()) {
            try {
                file.createNewFile();

                FileOutputStream fOut = new FileOutputStream(file);
                OutputStreamWriter myOutWriter = new OutputStreamWriter(fOut);
                myOutWriter.append("Testing");
                myOutWriter.close();
                fOut.flush();
                fOut.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public String getState()
    {
        File file = new File("test.txt");
        String contents = "";
        if(file.exists()) {
            int length = (int)file.length();
            byte[] bytes =  new byte[length];
            FileInputStream in;
            try {
                in = new FileInputStream(file);
                in.read(bytes);
            } catch(Exception e) {
                e.printStackTrace();
            } finally {
                //in.close();
            }
            contents = new String(bytes);
        }
        return contents;
    }
}

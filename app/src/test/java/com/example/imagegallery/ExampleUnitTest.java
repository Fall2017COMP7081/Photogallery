package com.example.imagegallery;

import com.example.imagegallery.mydb.DataStorageImp;
import com.example.imagegallery.mydb.FileSystemImp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void dataStoreage_isWorking() throws Exception {
        FileSystemImp db = new FileSystemImp();
        db.putState("Testing");
        //String temp = db.getState();
        assertEquals("Testing", db.getState());
    }
}
package com.example.imagegallery.mydb;

/**
 * Created by gaston on 2017-09-21.
 */

public class DataStorageImp implements IDataStore
{
    String state = null;
    public void putState(String state)
    {
        this.state = state;
    }
    public String getState()
    {
        return state;
    }
}

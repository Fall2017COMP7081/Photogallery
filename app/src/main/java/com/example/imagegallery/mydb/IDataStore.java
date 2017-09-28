package com.example.imagegallery.mydb;

/**
 * Created by gaston on 2017-09-21.
 */

public interface IDataStore
{
    String getState();
    void putState(String state);
}

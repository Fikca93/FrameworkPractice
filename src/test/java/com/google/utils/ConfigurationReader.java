package com.google.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    static {
        try (InputStream in = new FileInputStream("configuration.properties")){
            properties.load(in);
            //in.close(); already done implicitly(when you put it in the parenthesis) since InputStream is
            // implementing Closeable interface
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("configuration.properties not loaded!!!");
        }

    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }








}

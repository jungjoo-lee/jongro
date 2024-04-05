package com.ohgiraffers.section01.test;

import java.io.IOException;
import java.util.Properties;

public class EnvProperties {
    static Properties prop = new Properties(); //  프로퍼티 생성

    static {
        try {
            prop.load(EnvProperties.class.getResourceAsStream("env.properties")); //  EnvProperties 클래스파일이 있는 폴더에서 env.properties 파일 load
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	private static void loadProperties() throws IOException {
        prop.load(EnvProperties.class.getResourceAsStream("env.properties"));
    }

    // DB정보
    public static String getDriverClass() {
        return prop.getProperty("DriverClass");
    }

    public static String getDataBaseConn() {
        return prop.getProperty("DataBaseConn");
    }

    public static String getName() {
        return prop.getProperty("Name");
    }

    public static String getPwd() {
        return prop.getProperty("Pwd");
    }
}

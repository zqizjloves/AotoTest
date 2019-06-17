package com.suite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterSuite;


public class SuiteConfig {

    @AfterSuite
    public void BeforeSuite() {
        System.out.println("类加载之前：使用BeforeSuite");
    }

    @AfterSuite
    public void AfterSuite() {
        System.out.println("类加载之后：使用AfterSuite");
    }

    @BeforeClass
    public void Beforeclass() {
        System.out.println("类加载之前：使用Beforeclass");
    }

    @AfterClass

    public void Afterclass() {
        System.out.println("类加载之后：使用Afterclass");
    }
}

package com.suite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterSuite;


public class SuiteConfig {

    @AfterSuite
    public void BeforeSuite() {
        System.out.println("�����֮ǰ��ʹ��BeforeSuite");
    }

    @AfterSuite
    public void AfterSuite() {
        System.out.println("�����֮��ʹ��AfterSuite");
    }

    @BeforeClass
    public void Beforeclass() {
        System.out.println("�����֮ǰ��ʹ��Beforeclass");
    }

    @AfterClass

    public void Afterclass() {
        System.out.println("�����֮��ʹ��Afterclass");
    }
}

package com.qa.testcase;

import components.Configuration;

import java.lang.annotation.Annotation;
@Configuration
public class TestClass {


    public static void main(String args[]){

        TestClass testClass=new TestClass();

        Class classObj=testClass.getClass();
        Annotation annotation=classObj.getAnnotation(Configuration.class);
        Configuration configuration=(Configuration)annotation;
        String browser=configuration.browser();
        System.out.println(browser);

    }
}

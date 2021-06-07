package com.qa.testcase;

import components.Configuration;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class TestClass {

    public static List<Integer> test=new ArrayList<>();

    public static void main(String args[]){


        TestClass testClass=new TestClass();

        Class classObj=testClass.getClass();
        Annotation annotation=classObj.getAnnotation(Configuration.class);
        Configuration configuration=(Configuration)annotation;
        String browser=configuration.browser();
        System.out.println(browser);



        for(int i=1;i<10;i++){

            test.add(i);
        }

        System.out.println(test.toString());

    }
}

package com.qa.testcase;

import components.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


enum EnumTest{
    FIRSTFRAME,
    SECONDFRAME,
    THIRDFRAME,
    FOURTHFRAME;

    public void using(){

        System.out.println(SECONDFRAME.toString());
    }

}

@Configuration
public class TestClass {

    public static List<Integer> test=new ArrayList<>();
    public static EnumTest callusingmethod=EnumTest.FIRSTFRAME;


    public static void main(String args[]){

        EnumTest enumTest=EnumTest.FIRSTFRAME;
        System.out.println(enumTest.name().toString());
        System.out.println(enumTest.toString());
        System.out.println(enumTest.ordinal());
        System.out.println(Arrays.toString(EnumTest.values()));


        callusingmethod.using();






        //TestClass testClass=new TestClass();

        /*Class classObj=testClass.getClass();
        Annotation annotation=classObj.getAnnotation(Configuration.class);
        Configuration configuration=(Configuration)annotation;
        String browser=configuration.browser();
        System.out.println(browser);



        for(int i=1;i<10;i++){

            test.add(i);
        }

        System.out.println(test.toString());
*/
    }
}

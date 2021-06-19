package com.qa.testcase;

import components.Base;
import components.Configuration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


enum EnumTest{
    FIRSTFRAME,
    SECONDFRAME,
    THIRDFRAME,
    FOURTHFRAME;

    public void using(){

        System.out.println(SECONDFRAME.toString());
    }

}


class Property{

    public static void main(String args[]) throws IOException {
        /*Properties p=System.getProperties();
        p.list(System.out);
*/
        String dateName = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        System.out.println(dateName);


        DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_HH-mm-ss");

        String format = dateFormat.format(new Date());
        Path path = Paths.get("\\LocalGitHubRepository\\IntelliJIDEAProjects\\WGSCOPY\\WGSCOPY\\src\\main\\resources\\Files\\new.properties");
        Files.write(path, ("new string").getBytes());
        String newString=new String(Files.readAllBytes(path));
        System.out.println(newString);

        /*boolean exists = Files.exists(path);
        System.out.println(exists);
*/
        


    }
}




/*class FR{

    public  void main(String args[]) throws IOException {

        InputStream ins= new InputStream(System.in) {
            @Override
            public int read() throws IOException {
                return 0;
            }


        };
        ins.readLine();

        FileWriter fr=new FileWriter("textfile.txt");
        fr.write(new char[]{'d','a','d'});
        fr.flush();



    }



}*/

/*
class StaticClass{
static int a;
public static void main(String args[]){
        StaticClass obj1=new StaticClass();
        StaticClass obj2=new StaticClass();
        obj1.a=5;
        obj2.a=7;
        Sysout(obj1.a);
        Sysout(a);
        }}
*/




@Configuration
public class TestClass extends Base {/*

    public static List<Integer> test=new ArrayList<>();
    public static EnumTest callusingmethod=EnumTest.FIRSTFRAME;


    public  void main(String args[]){

        JavascriptExecutor js= (JavascriptExecutor)getDriver();
        getDriver().switchTo().


        new ChromeDriver();

        getDriver().getTitle();

        EnumTest enumTest=EnumTest.FIRSTFRAME;
        System.out.println(enumTest.name().toString());
        System.out.println(enumTest.toString());
        System.out.println(enumTest.ordinal());
        System.out.println(Arrays.toString(EnumTest.values()));


        callusingmethod.using();






        //TestClass testClass=new TestClass();

        *//*Class classObj=testClass.getClass();
        Annotation annotation=classObj.getAnnotation(Configuration.class);
        Configuration configuration=(Configuration)annotation;
        String browser=configuration.browser();
        System.out.println(browser);



        for(int i=1;i<10;i++){

            test.add(i);
        }

        System.out.println(test.toString());
*//*
    }
*/}

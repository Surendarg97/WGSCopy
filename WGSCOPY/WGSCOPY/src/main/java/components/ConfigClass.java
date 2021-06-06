package components;


import java.lang.annotation.Annotation;

@Configuration
public class ConfigClass {

    public static ConfigClass configClass=new ConfigClass();
    public static Configuration configuration=config();

    public static Configuration config(){
    Class classObj=configClass.getClass();
    Annotation annotation=classObj.getAnnotation(Configuration.class);
    configuration=(Configuration)annotation;
    return configuration;
    }
}

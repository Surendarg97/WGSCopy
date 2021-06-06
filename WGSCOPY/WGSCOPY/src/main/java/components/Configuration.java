package components;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Configuration {

    String browser()
            default "chrome";

    String url()
            default "https://saas.wgsneto.com/NetOxygen/fw_C2/GFXSite.htm";
}

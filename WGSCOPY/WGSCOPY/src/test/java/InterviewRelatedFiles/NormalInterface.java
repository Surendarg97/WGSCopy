package InterviewRelatedFiles;

@FunctionalInterface
public interface NormalInterface {

    public int a=1;
    String name="norma interface";

    public static void staticMethod(){
        System.out.println("static method in interface");
    }
   public void abstractMethod(String str);
  //  public void method4();
    default public void defaultMethod(){
        System.out.println("default method in interface");
    }
}

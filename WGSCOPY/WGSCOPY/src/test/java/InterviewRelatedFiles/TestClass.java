package InterviewRelatedFiles;

public class TestClass implements NormalInterface {


    static TestClass testClass=new TestClass();

    static public void main(String args[]){

        NormalInterface.staticMethod();
        testClass.defaultMethod();
        testClass.abstractMethod(null);
    }



    public void abstractMethod( String str) {

        System.out.println(str.isEmpty());

        System.out.println("abstrctMethod implementation in class");

    }

    @Override
    public void defaultMethod() {
        System.out.println("default method in class");
    }
}

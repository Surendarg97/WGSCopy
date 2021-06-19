package InterviewRelatedFiles;

public class FunctionalInerfaceDemo  {
    static Runnable runnable;
    static FunctionalInerfaceDemo functionalInerfaceDemo=new FunctionalInerfaceDemo();

    public static void main(String...args){

        System.out.println(Thread.currentThread().getName());

        /*new Thread(new Runnable(){
            @Override
            public void run(){}

        }).start();*/

        Thread t1=new Thread(()->{
            System.out.println("run method");});
        t1.start();
        System.out.println(t1.getName());

        //no need to change the plac 
    }


}

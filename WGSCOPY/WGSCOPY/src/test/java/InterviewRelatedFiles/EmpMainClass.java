package InterviewRelatedFiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmpMainClass {

    public static void main(String args[]){

        Emp emp=new Emp();
        emp.EmpName="Surendar";
        emp.EmpSalary="25000";

        try {
            FileOutputStream fos=new FileOutputStream(".//src//char.txt");
            ObjectOutputStream obos=new ObjectOutputStream(fos);
            obos.writeObject(emp);
            obos.close();
            fos.close();





        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

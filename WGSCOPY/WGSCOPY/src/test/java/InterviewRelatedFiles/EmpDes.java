package InterviewRelatedFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmpDes {

    public static void main(String args[]) throws IOException, ClassNotFoundException {

        FileInputStream fis=new FileInputStream(".//src//char.txt");
        ObjectInputStream obis = new ObjectInputStream(fis);
        Emp emp= (Emp) obis.readObject();
        obis.close();
        fis.close();
        System.out.println(emp.EmpName+" "+emp.EmpSalary);


    }
}

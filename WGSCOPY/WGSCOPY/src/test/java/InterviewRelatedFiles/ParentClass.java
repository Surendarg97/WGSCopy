package InterviewRelatedFiles;

import java.util.ArrayList;
import java.util.List;

public class ParentClass {

    public static void parentMethod() throws NullPointerException{


        List<Integer> newList = new ArrayList<>();

        for(int i=1;i<10;i++){

            newList.add(i);
        }

        System.out.println(newList.toString());

    }
}

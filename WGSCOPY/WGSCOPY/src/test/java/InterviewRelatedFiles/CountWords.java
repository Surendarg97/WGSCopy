package InterviewRelatedFiles;

import java.util.Arrays;
import java.util.List;

public class CountWords   {

    public static void main(String[] args) {

        String str="i am learning learning java java programming";
        String[] array=str.split("\\s");
        List<String> ArrayList=Arrays.asList(array);
        System.out.println(ArrayList.toString());

        ArrayList.stream().distinct().forEach(x-> System.out.println(x));


    }

   /* @Override
    public int compare(String o1, String o2) {

        if(o1.compareTo(o2)==1){
            System.out.println();
        }

        return
    }*/
}

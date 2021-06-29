package InterviewRelatedFiles.InterviewPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseAString {

    public static void main(String[] args) {

        String str="Converter";

        StringBuffer stringBuffer=new StringBuffer(str);
        System.out.println(stringBuffer.reverse());
        str= String.valueOf(stringBuffer.reverse());
        System.out.println(str);

        StringBuilder stringBuilder=new StringBuilder(str);
        System.out.println("Stringbuilder reverse "+stringBuilder.reverse().toString());

        //Integer in=new Integer();

    }


    public static String reverseStringUsingCollection(String str){

        char[] charArray=str.toCharArray();
        Character[] stringArray={1,2};
        List<Character> charList=new ArrayList<Character>(Arrays.asList(stringArray));
        char[] i={'a','b','c'};




        return str;
    }
}

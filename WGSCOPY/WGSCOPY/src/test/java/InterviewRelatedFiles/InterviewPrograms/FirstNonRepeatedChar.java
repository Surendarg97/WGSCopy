package InterviewRelatedFiles.InterviewPrograms;

import java.util.Arrays;
import java.util.List;

public class FirstNonRepeatedChar {

    public static void main(String[] args) {

        //Customer customer=new Customer();
        //customer.getName();

        String str="Surendar";
        Character[] as = str.chars().mapToObj(c -> (char) c).toArray((str1)->new Character[str.length()]);
        /*char[] charArray=str.toCharArray();*//*

        Character[] newArray=ArrayUtils.toObject(charArray);*/
        List<Character> charList=Arrays.asList(as);
        System.out.println(charList.toString());
        for(char newChar:charList){
            System.out.println(newChar);
            break;
        }



        /*
        Set<Character> newSet=new LinkedHashSet<>();
        newSet.addAll(charList);
        for (char newChar:newSet) {
            System.out.println(newChar);
        }*/
    }

        /*
        Map<Character,Integer> numberOfChar=new LinkedHashMap<>();

        int count=1;

        for(char character:charArray){

            if(!numberOfChar.containsKey(character)){
                numberOfChar.put(character,count);
            }else{
                numberOfChar.put(character,count+1);
            }

        }

        numberOfChar.entrySet().stream().forEach(x-> System.out.println(x.getKey()+" - "+x.getValue()));


    }*/
}

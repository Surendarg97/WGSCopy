package InterviewRelatedFiles;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String args[]) {
        List<Integer> newList = new ArrayList<>();

        for (int i = 1; i < 10; i++) {

            newList.add(i);
        }

        System.out.println(newList.toString());

        List<Integer> updatedList = new ArrayList<>();

        //lambda expression symbol (arg)-> function;

  /*      Predicate predicate = (Predicate<List<Integer>>) list-> {



                   if (listMember >= 5) {
                        updatedList.add(listMember);

                    }

                return true;

        };*/

        /*Predicate predicate = new Predicate<List<Integer>>() {


            @Override
            public boolean test(List<Integer> list) {

                System.out.println(list.toString());

                for (int listMember : list) {

                    System.out.println(listMember);

                    if (listMember >= 5) {
                        updatedList.add(listMember);

                    }
                }
                return true;
            }
        };*/

  /*      predicate.test(newList);

        System.out.println(updatedList.toString());*/

        //updatedList=newList.stream().filter(i->i>=5).collect(Collectors.toList());
        newList.stream().filter(i->i>=5).forEach(System.out::println);
        System.out.println(updatedList.toString());
        Object[] newArray=newList.stream().filter(i->i>=5).sorted((i1,i2)->i2.compareTo(i1)).toArray();
        for (Object o:newArray
             ) {
            System.out.println(o);
        }

        Stream.of(newArray).forEach(x-> System.out.println(x));

    }

}

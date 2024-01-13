package streams;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

// Q1) Create a List and filter all even numbers!
        List<Integer> list =List.of(2,3,4,2,33,44,55,77,44,22);

//        Without Stream
//        List<Integer> listEven = new ArrayList<>();
//        for (Integer i:list){
//            if (i%2==0){
//                listEven.add(i);
//            }
//        }
//        System.out.println(listEven);


//        With Stream
//        Stream<Integer> stream = list.stream();
//        List<Integer> collect = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        List<Integer> listEven = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(listEven);



    }
}

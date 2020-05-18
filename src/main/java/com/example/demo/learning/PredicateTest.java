package com.example.demo.learning;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {
    public static void main(String[] args) {

        Predicate<String> predicate =p->p.equals("124");
        System.out.println(predicate.test("123"));

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        PredicateTest.getNum(list,integer -> integer>5);
        PredicateTest.getNum(list,integer -> true);

        PredicateTest.conditionFiter(list,value1 ->value1>5,value2->value2 %2==0 );

        System.out.println(PredicateTest.isEqual("test").test("test"));




    }
    public static void getNum(List<Integer> list,Predicate<Integer> predicate){
         list.forEach(item->{
             if(predicate.test(item)){
                 System.out.println(item);

             }
         });


    }

    public static void  conditionFiter(List<Integer> list,Predicate<Integer> predicate1,Predicate<Integer> predicate2){
        list.forEach(item->{
            if(predicate1.and(predicate2).test(item)){
                System.out.println(item);
            }
        });
    }

    public static void  conditionFiter2(List<Integer> list,Predicate<Integer> predicate1,Predicate<Integer> predicate2){
        list.forEach(item->{
            if(predicate1.and(predicate2).negate().test(item)){
                System.out.println(item);
            }
        });


    }

    public static Predicate<String> isEqual(Object object){
        return Predicate.isEqual(object);
    }

}

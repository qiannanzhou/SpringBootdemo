package com.example.demo.learning.Reflect;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Slf4j
public class SimpleReflect {


    public static String toString(Object object) throws IllegalAccessException {
        Class<?> objectClass=object.getClass();
        Field[] fields=objectClass.getDeclaredFields();
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(objectClass.getName()+" "+"["+" ");

        for (Field field:fields){
            if(!field.isAccessible()){
                field.setAccessible(true);
                stringBuilder.append(field.getName()+"="+field.get(object).toString()+",");;

            }
        }
        stringBuilder.append(" "+"]");

         return stringBuilder.toString();

    }


//    public static void toObject(String s)  {
//        String[] strings=s.split(" ");
//
//        Class<?> aclass= null;
//        try {
//            aclass = Class.forName(strings[0]);
//            Object object=aclass.newInstance();
//            if (strings.length>1){
//                String[] strings1=strings[2].split(",");
//                if(strings1.length>1){
//                    for (int i = 0; i <strings1.length ; i++) {
//                        String[] strings2=strings1[1].split("=");
//                        Field field=aclass.getDeclaredField(strings2[0]);
//                        if (!field.isAccessible()){
//                            field.setAccessible(true);
//
//                        }
//
//
//
//                    }
//
//
//                }
//
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//        return ;
//
//    }




}

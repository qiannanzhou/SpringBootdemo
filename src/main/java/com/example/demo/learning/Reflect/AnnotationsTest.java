package com.example.demo.learning.Reflect;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class AnnotationsTest {

    @Target(ElementType.PARAMETER)
    @Retention(RetentionPolicy.RUNTIME)
    static @interface QuerParam{
        String value();

    }

    @Target(ElementType.PARAMETER)
    @Retention(RetentionPolicy.RUNTIME)
    static @interface DefaultParam{
        String value() default "";

    }

    public void hello(@QuerParam("action")String action,@QuerParam("sort")String sort,@DefaultParam("asc")String asc){

    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class<?> clz= AnnotationsTest.class;
        Method method=clz.getMethod("hello", String.class, String.class, String.class);
        Annotation[][] annotations=method.getParameterAnnotations();
        System.out.println(annotations.toString());
        for (int i = 0; i <annotations.length ; i++) {
            System.out.println(annotations[i].toString());

        }



    }
}

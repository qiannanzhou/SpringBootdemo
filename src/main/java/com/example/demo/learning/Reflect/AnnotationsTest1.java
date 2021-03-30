package com.example.demo.learning.Reflect;

import com.example.demo.Dao.Car;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AnnotationsTest1 {

    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Label{
        String value() default "";


    }
    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Format{
        String pattern() default "yyyy-MM-dd HH:mm:ss";


    }

    public static String format(Object o) throws IllegalAccessException {
        Class<?> cls=o.getClass();
        Field[] fields=cls.getDeclaredFields();
        StringBuilder stringBuilder=new StringBuilder();
        for (Field field:fields){
           if (!field.isAccessible()){
               field.setAccessible(true);
           }
            Label label=field.getAnnotation(Label.class);
           String name=label.value();
           Object value=field.get(o);
            if(field.getType()==Date.class){
               String s= formatDate(field,field.get(o));
               value=s;


            }
            stringBuilder.append(name+":"+value.toString());






        }
        return  stringBuilder.toString();
    }

    public static String  formatDate(Field field,Object value){
       Format format=field.getAnnotation(Format.class);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(format.pattern());
        return simpleDateFormat.format(value);

    }

    public static void main(String[] args) throws IllegalAccessException {

        Car car=new Car(123,new Date());
        System.out.println(AnnotationsTest1.format(car));


    }


}

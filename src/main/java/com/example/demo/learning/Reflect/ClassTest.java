package com.example.demo.learning.Reflect;

import com.example.demo.Dao.Student;
import sun.net.www.content.text.Generic;

import java.lang.reflect.*;
import java.util.*;

public class ClassTest {

    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, InstantiationException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {

//        List<Integer> arrayList= Arrays.asList(123,134);
//
//        for (Field f:arrayList.getClass().getFields()) {
//            System.out.println(f.getName());
//
//        }
        Student s1 = new Student("ljb", 123);

        Field field= s1.getClass().getDeclaredField("name");
        field.setAccessible(true);
        int modifiers= field.getModifiers();
        System.out.println(Modifier.isPublic(modifiers));

        System.out.println(s1.getClass().getMethod("getScore").invoke(s1));
        System.out.println(Class.forName("java.util.HashMap").getName());
        System.out.println("获取属性值"+field.get(s1));

        System.out.println("**********************");
        Map<String,Integer> map= HashMap.class.newInstance();
        System.out.println(map.getClass().isArray());

        map.put("zhouqiannan",123);
        Student s2=Student.class.newInstance();

        s2.setName("zhouqiannan");
        s2.setScore(111);
        System.out.println(s2.getScore());

        String[] arrs={"123","456","789"};

        System.out.println("获取其元素类型"+arrs.getClass().getComponentType());

//        Array[] array=(Array[]) Array.newInstance(String.class,10);

        System.out.println("**********************");

        System.out.println("测试反射toString方法"+SimpleReflect.toString(s2));

        System.out.println(Class.forName("com.example.demo.Dao.Student"));

        String s="name=zhouqiannan,score=111,";
        String[] strings=s.split(",");
        System.out.println("字符串长度为"+strings.length);
        for (int i = 0; i <strings.length ; i++) {
            System.out.println("第"+i+"个字符串是"+strings[i]);


        }
        System.out.println("**********************");


        Class<?> c= Object.class;
        for (TypeVariable variable:c.getTypeParameters()){
            System.out.println(variable.getName()+"extends"+Arrays.toString(variable.getBounds()));

        }











    }
}

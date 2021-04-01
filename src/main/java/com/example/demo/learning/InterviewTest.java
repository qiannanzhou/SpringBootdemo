package com.example.demo.learning;

import com.example.demo.Dao.CloneModel1;
import com.example.demo.Dao.CloneModel2;
import com.example.demo.Dao.Employee;
import com.example.demo.Dao.Student;

public class InterviewTest {

    public static void main(String[] args) throws CloneNotSupportedException {

//        Student student1=new Student("小明",40);
//
//        Student student2=new Student("小明",40);
//
//        System.out.println("student1是否 equals student2相等：student需要重新equals方法，重写后，比较的是对象的内容，否则比较的是对象的引用 "+student1.equals(student2));
//
//        System.out.println("student1是否 == student2相等：==比较的是对象的引用 "+ (student1==student2));







//        CloneModel1 cloneModel1 =new CloneModel1("clone1",1);
//
//        System.out.println("clone方法对对象中只包含基本类型 clone的是一个新的对象");
//
//        CloneModel1 cloneModel11= (CloneModel1) cloneModel1.clone();
//        cloneModel11.setProperty1("clone11");
//
//        System.out.println("cloneModel1"+cloneModel1);
//        System.out.println("cloneModel11"+cloneModel11);111

//Object默认的clone方法实际是对域的简单拷贝，对于简单数据类型，是值的拷贝，对于复杂类型的字段，则是指针地址的拷贝，clone后的对象和原对象指向的还是一个地址空间，所以说默认的clone方法时浅克隆。
        System.out.println("clone方法对对象中包含引用类型 clone的是一个新的对象，但其中的引用类型是指向的同一地址，所以改变clone后对象的引用的数据，之前的也会变化，否则则需要讲clone的对象也实现Cloneable方法");


        CloneModel2 cloneModel21=new CloneModel2("clone22",22);

        CloneModel1 cloneModel2 =new CloneModel1("clone2",2,cloneModel21);

        CloneModel1 cloneModel12=(CloneModel1)cloneModel2.clone();
        System.out.println("cloneModel1是否和cloneModel11的hashcode是否一样"+(cloneModel21.hashCode()==cloneModel12.hashCode()));


//        cloneModel12.setProperty1("clone12");
//        cloneModel12.setProperty2(12);
//
//        cloneModel12.getCloneModel2().setModel2property1("122");
//
//        cloneModel12.getCloneModel2().setModel2property2(122);
//
//        System.out.println("cloneModel2"+cloneModel2);
//        System.out.println("cloneModel12"+cloneModel12);

          StringBuffer stringBuffer=new StringBuffer();





















    }
}

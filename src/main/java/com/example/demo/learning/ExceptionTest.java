package com.example.demo.learning;

public class ExceptionTest {

    public static void main(String[] args){


       int i= exceptiontest();
        System.out.println( i);

}

        public static Integer exceptiontest(){
            Integer i1=10;
            Integer i2=0;

            Integer i=0;



            Integer i3;
            try {
                i3=i1/i2;
                return i;
            }catch (Exception e){

                e.printStackTrace();

                return 2;
            }




      //  System.out.println("捕获异常后还能不能往下执行");
    }

}




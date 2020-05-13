package com.example.demo.learning;

public class BinarySearch {


    public int  BinarySearch(int a[],int x){
        if (a.length==0){
            return -1;
        }
        int low =0;
        int high=a.length-1;
        int mid=(low +high)/2;

        if (a[mid]==x){
            return mid;
        }else if (a[mid]>x){
            high=mid-1;
            int[] binary1=arraySub(a,low,high);
            BinarySearch(binary1,x);

        }else {
            low=mid+1;
            int[] binary2=arraySub(a,low,high);
            BinarySearch(binary2,x);

        }

      return -1;


    }

    public int[] arraySub(int a[],int x,int y){
        int[] array= new int[y-x];

        for (int i=x;i<array.length;i++){
            array[i]=a[i];
        }

        return array;

    }


    public void main(String[] args){
        int[] a= new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
       int index= BinarySearch(a,5);
       System.out.println("数字处于数组中的位置为"+index);

    }
}

package com.bridgelabz.generics;

public class Maximum<E extends Comparable> {
    public static <E extends Comparable> E testMaximum(E... values) {
        E max = values[0];
        for( E element : values){
            if(element.compareTo(max)>0){
                max = element;
            }
        }
        toPrint(max,values);
        return max;
    }
}

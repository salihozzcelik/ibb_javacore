package com.salihozcelik._1_week;

public class _04_4_Autoboxing_Boxing {

    public static void main(String[] args) {
        // Autoboxing: Primivite => Wrapper type dönüştürmek
        int primitiveValue = 100;
        Integer wrapperValue = primitiveValue; // Autoboxing
        // wrapperValue=null;
        System.out.println("primivite type: " + primitiveValue+" wrapper type: "+wrapperValue);

        // unboxing : wrapper type => primitive type dönüştürmek

        Integer wrapperValue2 = 200;
        int primitiveValue2 = wrapperValue2; // Unboxing
        System.out.println("wrapper type2: " + primitiveValue2+" primivite type2: "+wrapperValue2);



    }
}

package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

public class TestWrapperInteger {

	public static void main(String[] args) {
		Integer edadRef = 29; //autoboxinng, es creado un objeto de tipo Integer
        //int primitivo = new Integer(21); no usar, deprecado
        Integer primitivo = Integer.valueOf(21); //que locura!! unboxing

        List<Integer> lista = new ArrayList<>();
        lista.add(edadRef); //ok
        lista.add(primitivo); //autoboxing

        int i1 = lista.get(0);  //unboxing
        Integer i2 = lista.get(1);  //ok

        System.out.println(i1);  //29
        System.out.println(i2); //21
        
        Integer valorRef = Integer.valueOf (33); // hereda la creación al método valueOf
        int valuePri = valorRef.intValue (); // desenvolver, tomando el valor primitivo del objeto contenedor

        System.out.println (valuePri); // 33
        
        Integer iParseado1 = Integer.valueOf("42"); //parseando y devolviendo referencia
        int iParseado2 = Integer.parseInt("44");  //parseando y devolviendo primitivo

        System.out.println(iParseado1); //42
        System.out.println(iParseado2); //44
        
        System.out.println(Integer.MAX_VALUE); // 2^31 - 1
        System.out.println(Integer.MIN_VALUE); //-2^31

        System.out.println(Integer.SIZE); // 32 bits
        System.out.println(Integer.BYTES); //4 Bytes

	}

}

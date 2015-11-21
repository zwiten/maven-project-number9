package com.mycompany.app;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Set<String> setA = new HashSet<String>();

    	String element = "element 1";

    	setA.add(element);

    	System.out.println( setA.contains(13));
    }
}

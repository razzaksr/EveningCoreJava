package org.corejava.ceptions;

public class FibonacciException extends Exception{
    public FibonacciException(){
        super("Invalid limit to generate fibonacci series, limit atleast 2");
    }
}

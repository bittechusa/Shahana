package com.bit.test;

public class Demo 
{
    public static void main(String[] args)
    {
    	Car x=new Car();
    	x.move("hello");
    	Bmw y=new Bmw();
    	y.move(15);
    	Car x2=new Bmw();
    	x2.move("hello");
    	PlayWithString x3=new PlayWithString();
    	System.out.println(x3.play1());
    	x3.play();
    	
    	System.out.println(x3.play3());
    	
    }
}

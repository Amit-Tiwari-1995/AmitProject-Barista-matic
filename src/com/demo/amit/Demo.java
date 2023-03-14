package com.demo.amit;

class A {
int x = 20; 
void m1() {
System.out.println(x); 
} 
}


class B extends A { 
int x = 30; 
void m1() { 
System.out.println(x); 
} 


}
public class Demo {
public static void main(String[] args){
B b = new B(); 
b.m1(); //30
A a = new A(); 
a.m1(); //  20
A a2 = new B(); 
a2.m1(); //30
System.out.println(a2.x);//20
} 
}
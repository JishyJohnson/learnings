package com.customexception.learning;

import java.io.IOException;

class SuperClass { 
	  
    // SuperClass doesn't declare any exception 
    void method() 
    { 
        System.out.println("SuperClass"); 
    } 
} 
  
// SuperClass inherited by the SubClass 
class SubClass extends SuperClass { 
  
    // method() declaring Checked Exception IOException 
    void method()  
    { 
  
        // IOException is of type Checked Exception 
        // so the compiler will give Error 
  
        System.out.println("SubClass"); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        SuperClass s = new SubClass(); 
        s.method(); 
    } 
} 
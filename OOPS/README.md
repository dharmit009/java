# OOPS Refresher ... 

**What is OOPS?**

**OOP** stands for "Object Oriented Programming". The concept of OOP's mainly relies on classes and it's Object Creation. 

**What are Objects?**

**Objects** is a structure which consist of different behaviours (functions) and properties (variables) bundled together
into a individual isolated space. The structure of the objects
are created using the `class` keyword. This objects normally mimics
real world objects. 

**For Example:** A Dice. 

The Behaviour of Dice is to **roll** and its properties is that it has 6 possible outcomes (i.e 6 sides). 

**What are Classes?**

**Classes** are blueprint of Objects. A Class may consist of the
following: 

* Constructor. 
* Variables. 
* Methods Or Functions. 
* Overriding Methods. 
* Overloading Methods. 

**What are Constructors?**

A **Constructor** allows us to initialize properties of a object. Each time an object is created the constructor is called by default. There are different types of constructor here are some of them:

* Default Constructor. 
* Parametrized Constructor. 
* Copy Constructor. 

## OOP's CODE REFRESHER ... 

**CODE:**
``` java

import java.util.Random;

class dice{
	// CONSTRUCTOR ...
	dice(){
		int side=1;
	} 
	
	//Properties: 
	Random myrandomObj = new Random();
	
	// BEHAVIOUR: roll -> Returns one random integer in range of (1, 6);
	void roll(){
		int myrandomNumber = myrandomObj.nextInt(1,7); 
		System.out.println("Value: "+myrandomNumber); 
	}

}

public class oops{
	public static void main(String args[]){
		dice mydice1 = new dice(); 
		mydice1.roll();
	}
}

```

**OUTPUT:**

Value: 6

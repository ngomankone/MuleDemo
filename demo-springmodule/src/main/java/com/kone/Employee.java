package com.kone;

public class Employee {
	
	String name;
	int age;
      
// le constructeur 
	
public Employee(String name, int age){

	this.name = name;
	this.age = age;
	}

// getters
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}
// setters
	public void setName(){
		
		this.name=name;
	}

	public void setAge(){

		this.age= age;
	}

	public String getDetails(){
	
     return "Name = "+this.getName() +" and Age= " +this.getAge();

		}

}

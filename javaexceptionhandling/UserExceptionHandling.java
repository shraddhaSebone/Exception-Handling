package javaexceptionhandling;

public class UserExceptionHandling {
   private int age;
   private String name;
   private int rollNumber;
      public int getAge() {
    	  return age;
      }
      public void setAge(int age)throws AgeOutOfRange{
    	  if(age>25) {
    		  throw new AgeOutOfRange("Age should be 25");
    	  }else
    	  this.age = age;
      }
      public String getName() {
    	  return name;
      }
      public void setName(String name) {
    	  this.name = name;
      }
      public int getRollNumber() {
    	  return rollNumber;
      }
      public void setRollNumber(int rollNumber) {
    	  this.rollNumber = rollNumber;
      }
   }

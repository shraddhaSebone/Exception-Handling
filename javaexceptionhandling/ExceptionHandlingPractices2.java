package javaexceptionhandling;
import com.sebone.java.mypratices.*;
public class ExceptionHandlingPractices2 {

	public static void main(String[] args) throws Exception {
	
		UserExceptionHandling userExceptionHandling = new UserExceptionHandling();
		userExceptionHandling.setAge(12);
		userExceptionHandling.setName("Shreya");
		userExceptionHandling.setRollNumber(101);
		
		try {
			userExceptionHandling.setAge(75);
			userExceptionHandling.setName("Shreya");
			userExceptionHandling.setRollNumber(101);
			}catch(AgeOutOfRange e){
				System.out.println(e);				
			}
		
		System.out.println(userExceptionHandling.getAge());
		System.out.println(userExceptionHandling.getName());
		System.out.println(userExceptionHandling.getRollNumber());
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String str=null;
//		
//		exception.printstring(str);
//	}
//	public void printstring(String str){
//		 try {
//			 System.out.println(str.length());	
//		 }catch(Exception e) {
//			 System.out.println(e.getMessage());
//		 }
//		 System.out.println("Rest of the code");
//		}
//}
















//		int str=null;
//		exception.printstring(str);
//	}	
//		public void printstring(int str){
//		 System.out.println(str);	
//		}
//
//}

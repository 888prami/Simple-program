package main;
public class OperationException extends Exception{
	 public static final long serialversionUID = 1L;
	 OperationException(String e){
		 super(e);
		 System.out.println("Arithmetic Exception");
	 }

}

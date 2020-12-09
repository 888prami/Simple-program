package main;
public class Operations {
                 public int add(int x, int y){
                 int z;
                 z=x+y;
                 return z;
                 }
                 public int sub(int x, int y){
                     int z;
                     z=x-y;
                     return z;
                     }
                 public int mul(int x, int y){
                     int z;
                     z=x*y;
                     return z;
                     }
                 public  int div(int x, int y){
                	 int z;
                	 z=x/y;
                	 if(x!=0){
                		 System.out.println("z");
                	 }
                	 else{
                		 System.out.println("Divide by zero error");
                	 }
                	 return z;
                 }
}
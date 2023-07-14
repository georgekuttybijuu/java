import java.util.Scanner;

class authException extends Exception{
    
    public authException(String s){
       super(s);
    }
}

public class Userauthentication{
  
  public static void main(String[] args){
  
     String username = "mca";
     String passcode = "mca123";
     String user_name,password;
     Scanner sc = new Scanner(System.in);
     try
     {
       System.out.println("Georgekutty Biju\n22MCA027\nOOPS LAB\n20MCA132\nDate:20-06-2023\n");
       System.out.println("Enter username: ");
       user_name = sc.nextLine();
       
       System.out.println("Enter password: ");
       password = sc.nextLine();
       
       if(username.equals(user_name) && passcode.equals(password)){
         System.out.println("Authentication successful...");
       }
       else
          throw new authException("Invalid user credentials");
     }
     catch(authException e)
     {
       System.out.println("Exception caught "+e);
     }
  }
}

import java.util.Scanner;
public class TestBooleanOperators {

    public static void main(String[] args) {
      
       Scanner input=new Scanner(System.in);
        int num,menu;
            do{
            System.out.printf("Choose one %n 1=Scan the positive number %n 2= Close the app %n");      
            menu=input.nextInt();
        
        if(menu==1){
        do{
            System.out.print("Enter any positive number : ");
            num=input.nextInt();
            if(num<0)
            System.out.println("I said positive !!!");    
          }while(num<=0);
        
                if((num%2==0)&&(num%3==0))
                  System.out.println("The number is divisible by 2 and 3");                                
                else
                  System.out.println("The number is not divisible by 2 and 3");
                
                    if((num%2==0)||(num%3==0))
                    System.out.println("The number is divisible by 2 or 3");  
                    else
                    System.out.println("The number is not divisible by 2 or 3");  
                    
                        if((num%2==0)^(num%3==0))
                        System.out.println("The number is divisible by 2 or 3 but not both");
                        else
                        System.out.println("The number is divisible by both or neither");
                        
                       
                
            }
            
            }while(menu!=2);
                  System.out.printf("End of program %n");      

             input.close();
    }
}

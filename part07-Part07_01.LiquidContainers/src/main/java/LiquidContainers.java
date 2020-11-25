
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont1 = 0;
        int cont2 = 0;

        while (true) {
            
            System.out.println("First: "+cont1+"/100");    
            System.out.println("Second: "+cont2+"/100"); 
            
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")){
                if (amount<0){
                } else if(amount+cont1<=100){
                    cont1=cont1+amount;
                } else {
                    cont1=100;
                }
            }
            
            if (command.equals("move")){
                
                if (cont1-amount<0 && cont2+amount<=100){
                    cont2=cont2+cont1;
                    cont1=0;
                }else if (cont1-amount<0 && cont2+amount>100){
                    cont2=100;
                    cont1=0;
                }else if(cont1-amount>=0 && amount+cont2<=100){
                    cont2=cont2+amount;
                    cont1=cont1-amount;
                }else if (cont1-amount>=0 && amount+cont2>=100){
                    cont2=100;
                    cont1=cont1-amount;
                }    
            }
            
            if (command.equals("remove")){
                if (amount<0){
                } else if(cont2-amount<0){
                    cont2=0;
                } else {
                    cont2=cont2-amount;
                }
            }
                
                
        }
    }
}

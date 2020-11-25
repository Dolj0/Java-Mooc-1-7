
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container cont1 = new Container();
        Container cont2 = new Container();
        
        
        while (true) {
            System.out.println("First: "+cont1);    
            System.out.println("Second: "+cont2); 

            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (command.equals("add")){
                cont1.add(amount);
            }
            
            if (command.equals("move")){
                
                if (cont1.contains()-amount<0 && cont2.contains()+amount<=100){
                    cont2.add(cont1.contains());
                    cont1.remove(cont1.contains());
                }else if (cont1.contains()-amount<0 && cont2.contains()+amount>100){
                    cont2.add(100-cont2.contains());
                    cont1.remove(cont1.contains());
                }else if(cont1.contains()-amount>=0 && amount+cont2.contains()<=100){
                    cont2.add(amount);
                    cont1.remove(amount);
                }else if (cont1.contains()-amount>=0 && amount+cont2.contains()>=100){
                    cont2.add(100-cont2.contains());
                    cont1.remove(amount);
                }    
            }
            
            if (command.equals("remove")){
                cont2.remove(amount);
            }

        }
    }
}



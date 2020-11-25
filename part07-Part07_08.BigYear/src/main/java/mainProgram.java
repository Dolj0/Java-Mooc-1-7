
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {
    
  
    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        ArrayList<Bird> birds = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        while (true){
            System.out.print("? ");
            String input = scan.nextLine();
            
            if (input.equals("Add")){
                System.out.print("Name: ");
                String inputName = scan.nextLine();
                System.out.print("Name in Latin: ");
                String inputNameLat = scan.nextLine();
                Bird bird = new Bird(inputName, inputNameLat);
                birds.add(bird);
            }
            
            if (input.equals("Observation")){
                System.out.print("Bird? ");
                String inputBird = scan.nextLine();
                int contained = 0;
                
                for (int j = 0; j<birds.size(); j++){
                    if (birds.get(j).getName().equals(inputBird)){
                        contained = 1;
                    }
                }
                
                if (contained == 1){
                    for (int i = 0; i<birds.size(); i++){
                        if (birds.get(i).getName().equals(inputBird)){
                            birds.get(i).counter(1);
                        } 
                    }
                } else {
                    System.out.println("Not a bird!");
                }    
            }
            
            if (input.equals("All")){
                for (int i = 0; i<birds.size();i++){
                    System.out.println(birds.get(i).getName()+" ("+birds.get(i).getNameLat()+"): "+birds.get(i).getCount()+" observations");
                }   
            }
            
            if (input.equals("One")){
                System.out.print("Bird? ");
                String one = scan.nextLine();
                for (int i = 0; i<birds.size(); i++){
                    if (birds.get(i).getName().equals(one)){
                        System.out.println(birds.get(i).getName()+" ("+birds.get(i).getNameLat()+"): "+birds.get(i).getCount()+" observations");
                    }
                }
            }
            
            if (input.equals("Quit")){
                break;
            }

        }
    }
}
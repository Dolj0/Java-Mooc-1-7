
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    
    public static ArrayList<RecipeClass> readFile(String file) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<RecipeClass> listRecipe = new ArrayList<>();
        
        int count = 0;
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))){            
                    while (fileScanner.hasNextLine()){
                        String line = fileScanner.nextLine();
                        count = count + 1;
                    }    
                    
                    } catch (Exception e){
                    System.out.println("Error: "+e.getMessage());
                }
                
                try (Scanner fileScanner = new Scanner(Paths.get(file))){
                    
                    ArrayList<String> inputs = new ArrayList<>();
                    
                    for (int j=0;j<count;j++){    
                        String line = fileScanner.nextLine();


                        if ((line.equals(""))||(j==(count-1))){
                            String name = inputs.get(0);
                            int time = Integer.valueOf(inputs.get(1));
                            ArrayList<String> ingredients = new ArrayList<>();
                            for (int i = 1; i<inputs.size(); i++){
                                ingredients.add(inputs.get(i));
                            }
                            RecipeClass recipeClass = new RecipeClass(name, time, ingredients);                    
                            listRecipe.add(recipeClass);
                            inputs.clear();
                        } else {
                           inputs.add(line);
                        }
                    }
                } catch (Exception e){
                    System.out.println("Error: " + e.getMessage());
                }
                
                return listRecipe;
    }
    
    public static void list(ArrayList<RecipeClass> listRecipe){
        System.out.println("");
        System.out.println("Recipes: ");
        for (int i = 0; i<listRecipe.size(); i++){
            System.out.println(listRecipe.get(i).getName()+", cooking time: "+listRecipe.get(i).getCookTime());         
        }
    }
    
    public static void printRecipe(String name, ArrayList<RecipeClass> listRecipe){
        for (int i = 0; i<listRecipe.size();i++){
            if (listRecipe.get(i).getName().contains(name)){
                System.out.println("");
                System.out.println("Recipes: "); 
                System.out.println(listRecipe.get(i).getName()+", cooking time: "+listRecipe.get(i).getCookTime()); 
            }
        }
    }
    
    public static void printMaxCook(int maxCook, ArrayList<RecipeClass> listRecipe){
        System.out.println("");
        System.out.println("Recipes: ");
        for (int i = 0; i<listRecipe.size();i++){
            if (listRecipe.get(i).getCookTime()<=maxCook){
                System.out.println(listRecipe.get(i).getName()+", cooking time: "+listRecipe.get(i).getCookTime()); 
            }
        }
    }
    
    public static void printByIngredient(String ingredient, ArrayList<RecipeClass> listRecipe){
        System.out.println("");
        System.out.println("Recipes: ");
        for (int i = 0; i<listRecipe.size();i++){
            ArrayList<String> ingredients = listRecipe.get(i).getIngredients();
            for (int j = 0; j<ingredients.size();j++){
                if (ingredients.contains(ingredient)){
                    System.out.println(listRecipe.get(i).getName()+", cooking time: "+listRecipe.get(i).getCookTime());
                }
            }
        }
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        ArrayList<RecipeClass> listRecipe = readFile(file);
        
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        
        
        while (true){
            
            System.out.println("");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("list")){
                list(listRecipe);
                
            } else if (command.equals("find name")){
                System.out.print("Searched word: ");  
                String name = scanner.nextLine();
                printRecipe(name, listRecipe);
                
            } else if (command.equals("find cooking time")){
                System.out.print("Max cooking time: ");
                int maxCook = Integer.valueOf(scanner.nextLine());
                printMaxCook(maxCook, listRecipe);
            
            } else if (command.equals("find ingredient")){
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                printByIngredient(ingredient, listRecipe);
                
            } else if (command.equals("stop")){
                break;
            
            }
        }
    }
    
    
}

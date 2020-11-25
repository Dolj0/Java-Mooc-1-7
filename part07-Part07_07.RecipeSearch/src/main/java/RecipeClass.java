
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class RecipeClass {
    
    private String name;
    private int cookTime;
    ArrayList<String> ingredients = new ArrayList<>();
    
    public RecipeClass (String name, int cookTime, ArrayList<String> ingredients){
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = ingredients;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getCookTime(){
        return this.cookTime;
    }
    
    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }
    
    public void printIngredients(){
        for (int i = 0; i<this.ingredients.size(); i++){
            System.out.println(this.ingredients.get(i));
        }
    }
    
}


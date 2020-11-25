/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class Container {
    int cont1 = 0;
    int amount = 0;
    
    public Container() {
        
    }
    
    public int contains(){
        return this.cont1;
    }
    
    public void add(int amount){
        this.amount = amount;
        if (amount<0){
        } else if(amount+cont1<=100){
            cont1=cont1+amount;
        } else {
            cont1=100;
        }
    }
    
    public void remove(int amount){
        this.amount = amount;
        if (amount<0){
        } else if(cont1-amount<0){
            cont1=0;
        } else {
            cont1=cont1-amount;
        }
    }
    
    @Override
    public String toString(){
        return cont1+"/100";    
    }
    
    
}

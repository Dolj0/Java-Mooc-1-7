/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class Bird {
    private String name;
    private String nameLat;
    private int count = 0;
    
    public Bird (String name, String nameLat){
        this.name = name;
        this.nameLat = nameLat;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getNameLat(){
        return this.nameLat;
    }
    
    public void counter(int i){
        count = count + i;
    }
    
    public int getCount(){
        return count;
    }
}

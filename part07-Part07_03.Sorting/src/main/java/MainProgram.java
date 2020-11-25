
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array){
    int j = 9000;
    for (int i = 0; i<array.length; i++){
        if (array[i]<=j){
            j=array[i];
        }
    }
    return j;
    }
    
    public static int indexOfSmallest(int[] array){
        for (int i = 0; i<array.length; i++){
            if(array[i]==MainProgram.smallest(array)){
                return i;
            }
        }
        return -1;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        
        int j = 9000;
        
        for (int i = 0; i<table.length; i++){
            
            if (i<startIndex){
                continue;
            }
            
            if (table[i]<=j){
                j=table[i];
            }   
        }
        
        for (int h = startIndex; h<table.length; h++){
            if(table[h]==j){
                return h;
            }
        }
        return -1;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int valueOfInd1 = array[index1];
        int valueOfInd2 = array[index2];
        
        array[index1]=valueOfInd2;
        array[index2]=valueOfInd1;
        
    }
    
    public static void sort(int[] array){
        
        for (int i = 0; i<array.length; i++){
            
            System.out.println(Arrays.toString(array));
            
            int a = indexOfSmallestFrom(array, i);
            swap(array, a, i);
            
        }
    }

}

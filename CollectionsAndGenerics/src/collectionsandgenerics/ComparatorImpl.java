/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionsandgenerics;

import java.util.Comparator;

/**
 *
 * @author deven
 */
public class ComparatorImpl implements Comparator<Integer>
{
    
    public int compare(Integer a1, Integer a2){
        if((a1%10)<(a2%10)){
            return 1;
        }
        else{
            return -1;
        }
    }
}


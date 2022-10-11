/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionsandgenerics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author deven
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("myName", "Devendra");
        map.put("actor", "John");
        map.put("ceo", "Marisha");
        
        // Hash map and hash set both dont give you values in sequence
        // as both of them uses concept of hashcode
        System.out.println(map.get("actor"));
        map.put("actor", "Navin");

        // return null if key is not present
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }
        
        // Second method -> hashTable
        // HashTable -> synchronized
        // HashMap -> asynchronized -> not Thread Safe
    }
}

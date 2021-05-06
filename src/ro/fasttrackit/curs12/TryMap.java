package ro.fasttrackit.curs12;
//----
//        Maps
//        A Map is an object that maps keys to values.
//        cheie - valoare
//        cheie -> lista valori
//        Object -> Object
//        String/Enum -> Object (String, List<String>, Person, List<Person>)

//        A Dictionary
//        A map cannot contain duplicate keys: Each key can map to at most one value.
//        If you want to map a value to multiple ones, you map it to a list
//
//        Available methods:
//        put(key, value)
//        putAll(Map)
//        get(key)
//        remove(key)
//        keySet() - returns all the keys
//        values() -returns all values
//        entrySet() - returns Map.Entry objects which contains (key, value) pairs.
//
//        usage:
//        Map<String, String> mapOfStrings = new HashMap<>();
//        mapOfStrings.put("Ana", "mere);
//        mapOfStrings.put("Bob", "pere);
//        mapOfStrings.put("Chris", "mure);
//

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TryMap {

    public static void main(String[] args) {
        Map<String, Integer> nameToAge = new HashMap<>();

        nameToAge.put("Ana", 20);
        nameToAge.put("Ioan", 43);
        nameToAge.put("Maria", 51);
        nameToAge.put("Dragomir", 35);
        nameToAge.put("Mircea", 32);

        System.out.println(nameToAge);

        System.out.println(nameToAge.get("Maria"));

        nameToAge.remove("Dragomir");
        System.out.println(nameToAge);

        System.out.println(nameToAge.containsKey("Maria"));
        System.out.println(nameToAge.containsKey("Dragomir"));
        System.out.println(nameToAge.keySet());
        System.out.println(nameToAge.values());
        Set<Map.Entry<String, Integer>> entries = nameToAge.entrySet();
        System.out.println(entries);

        for (String name : nameToAge.keySet()) {
            System.out.println(name + " are varsta " + nameToAge.get(name));
        }

        for (Map.Entry<String, Integer> entry : nameToAge.entrySet()) {
            System.out.println(entry.getKey() + " are varsta " + entry.getValue());
        }
    }

}

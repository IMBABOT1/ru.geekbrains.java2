package Lesson3;

import java.util.*;

public class Phonebook {

    private HashMap<String, ArrayList<Person>> map;


    public Phonebook(){
        map = new HashMap<>();
    }


    public void add(Person p){
        ArrayList<Person> current = map.get(p.getLastname());
        if (current == null) {
            current = new ArrayList<>();
            map.put(p.getLastname(), current);
        }
        current.add(p);
    }

    public StringBuilder get(String name){
        ArrayList<Person> people = new ArrayList<>();
        for (Map.Entry<String, ArrayList<Person>> map : map.entrySet()){
            if (map.getKey().equals(name)){
                people = map.getValue();
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <people.size() ; i++) {
            sb.append(people.get(i)  + ",");
        }
        sb.insert(0, name + " phones:" + " " + "[");
        sb.insert(sb.length()-1, "]");
        sb.deleteCharAt(sb.length()-1);
        return sb;
    }
}

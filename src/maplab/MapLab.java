
package maplab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Shruthi Routhu
 */
public class MapLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

// --------------------------------- Lab2 -------------------------------------        
        Employee e1 = new Employee("Muddada", "Raj" , "111-1111-111"); 
        Employee e2 = new Employee("Routhu", "Shruthi" , "222-2222-222");
        Employee e3 = new Employee("Lombardo", "Jim" , "333-3333-333"); 
        Employee e4 = new Employee("Green", "Matt" , "222-2222-222");
        
        Map<String,Employee> empHashMap = new HashMap<>();
        empHashMap.put("222-2222-222", e2);
        empHashMap.put("333-3333-333", e3);
        empHashMap.put("222-2222-222", e4);
        empHashMap.put("111-1111-111", e1);
        
//        empHashMap.put("Routhu", e2);
//        empHashMap.put("Lombardo", e3);
//        empHashMap.put("Green", e4);
//        empHashMap.put("Muddada", e1);
        
        System.out.println("Demonstrating get : " + empHashMap.get("111-1111-111"));
        
        System.out.println("Looping through keys (HashMap)");
        Set<String> keySet = empHashMap.keySet();
        for(String k : keySet){
            System.out.println(k);
        }
        
        System.out.println("\nLooping through values  (HashMap)");
        Collection<Employee> empSet = empHashMap.values();
        for(Employee e: empSet){
            System.out.println(e);
        }
        
// ---------------------------- Lab3 ----------------------------------- 
        
        Map<String,Employee> empTreeMap = new TreeMap<>();
        empTreeMap.put("222-2222-222", e2);
        empTreeMap.put("333-3333-333", e3);
        empTreeMap.put("222-2222-222", e4);
        empTreeMap.put("111-1111-111", e1);
        
        System.out.println("\nUsing  TreeMap");
        Set<String> keys = empTreeMap.keySet();
        for(String k : keys){
            System.out.println(k);
        }
        
        // Alternate sort
        List<Employee> empList = new ArrayList<>(empTreeMap.values());
        Collections.sort(empList, new  EmployeeByLastName());
        
        System.out.println("\nUsing alternate sort with TreeMap");
        for(Employee e : empList){
            System.out.println(e);
        }
        
        
        
// ---------------------------- LAb4 ------------------------------------------
        Set<Employee> empTreeSet = new TreeSet<>();
        empTreeSet.add(e2);
        empTreeSet.add(e3);
        empTreeSet.add(e4);
        empTreeSet.add(e1);
        
        Iterator iterator = empTreeSet.iterator();
        System.out.println("\nUsing iterator and TreeSet");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
       
        
        empList = new ArrayList<>(empTreeSet);
        Collections.sort(empList, new  EmployeeByLastName());
        iterator = empList.iterator();
        System.out.println("\nUsing Alternate sort ie by lastName and TreeSet");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    
}

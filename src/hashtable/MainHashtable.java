package hashtable;

import java.util.*;
import java.util.stream.Collectors;

public class MainHashtable {

    public static void main(String[] args) {
        HashTable hashTable=new HashTable();

        hashTable.set("nails",100);
        hashTable.set("tile",500);
        hashTable.set("lumber",200);
        hashTable.set("bolts",50);
        hashTable.set("screws",100);
        hashTable.set("screws",10);
        hashTable.set("screws",1);
        hashTable.set("sc",1);

        hashTable.printHashtable();


        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        HashMap<Integer, ArrayList> map=new HashMap<>();
        ArrayList<Integer> arrayList1= (ArrayList<Integer>) Arrays.stream(array1).boxed().collect(Collectors.toList());
        ArrayList<Integer> arrayList2= (ArrayList<Integer>) Arrays.stream(array2).boxed().collect(Collectors.toList());
        HashMap<Integer, Integer> map1=new HashMap<>();

        map.put(1,arrayList1);
        map.put(2,arrayList2);

        long i = 0;
        Iterator<Map.Entry<Integer, Integer>> it = map1.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> pair = it.next();
            i += pair.getKey() + pair.getValue();
        }

        Employee employee=new Employee("Ion","Balan",1);
        Employee employee1=new Employee("Ionela","Balana",12);
        Employee employee2=new Employee("Ionica","Bala",2);
        Employee employee3=new Employee("Io","Bal",20);

        EmployeeHashTable employeeHashTable=new EmployeeHashTable(5);
        employeeHashTable.put("Ion",employee);
        employeeHashTable.put("Hanna",employee1);
        employeeHashTable.printTabel();

    }

}














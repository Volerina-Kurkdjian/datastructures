package hashtable;

public class EmployeeHashTable {

    private int size;
    private Employee[] hashtable;

    public EmployeeHashTable(int size){
        hashtable=new Employee[size];
    }

    public void put(String key, Employee employee){
        int hashedKey=hashKey(key);//the index of the array

        if(hashtable[hashedKey]==null){
            hashtable[hashedKey]=employee;
        }
        else{
            Employee temp=hashtable[hashedKey];

            while(temp.next!=null){
                temp=temp.next;
                if(temp.hashCode()==hashedKey){
                   temp=employee;
                   break;
                }
            }
            temp.next=employee;
        }

    }

    private int hashKey(String key){
        int hash=key.length()%hashtable.length;
        return hash;
    }

    public void printTabel(){
        for(int i=0;i<hashtable.length;i++){
            System.out.println(i+": ");
            Employee temp=hashtable[i];
            while(temp!=null){
                System.out.println("{ "+temp.getLastName()+", "+temp.getFirstName()+", "+temp.getId()+". ");
                temp=temp.next;
            }
        }
    }

}

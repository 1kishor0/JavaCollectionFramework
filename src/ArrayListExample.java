
import java.util.*;
public class ArrayListExample{
    public static void main(String args[]){
        ArrayList<String> name=new ArrayList<>();
        name.add("Sakib");
        name.add("Rakib");
        System.out.println(name);
        name.add("tafin");
        System.out.println(name);
        name.add(1,"Bashir");
        System.out.println(name);

        List<String> newList=new ArrayList<>();
        //add old list vaue to newlist at once
        newList.addAll(name);
        System.out.println(newList);
        //get A specific value
        System.out.println(newList.get(2));

        newList.remove(1);
        System.out.println(newList);

        List<Integer> num=new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
//Remove a specific value
        num.remove(Integer.valueOf(4));
        System.out.println(num);
        //clear function
      //  num.clear();
        System.out.println(num);
        //update index
        newList.set(1,"mahim");
        System.out.println(newList);
        //value present or not
        System.out.println(num.contains(5));
        for (int i = 0; i < newList.size(); i++) {
            System.out.println("The element is: "+newList.get(i));
        }
        for (Integer j: num){
            System.out.println(j);
        }
        Iterator<Integer> it=num.iterator();
        while(it.hasNext()){
            System.out.println("Iterator: "+it.next());
        }
    }
}
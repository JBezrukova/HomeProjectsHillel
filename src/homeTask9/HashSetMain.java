package homeTask9;

/**
 * Created by Юля on 14.04.2016.
 */
public class HashSetMain {
    public static void main(String[] args) {

        MyHashSet myHashSet = new MyHashSet();

        Object object = "cat";
        myHashSet.add(object);
        myHashSet.add(object);
        myHashSet.add("fish");
        //myHashSet.remove(object);

        System.out.println("Element \"cat\" contains in hashSet: " + myHashSet.contain(object));

        System.out.println(myHashSet.toString());
    }
}

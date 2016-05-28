package homeTask9;

import hash.Hash;
import org.junit.Assert;
import org.junit.Test;
import org.omg.CORBA.OBJ_ADAPTER;

/**
 * Created by Юля on 16.04.2016.
 */
public class MyHashSetTest {

    @Test
    public void addShouldAddElement() {
        Hash hash = new Hash();
        Object object = "cat";
        hash.add(object);
        hash.add(object);
        Assert.assertEquals(true, hash.contains(object));
    }

    @Test
    public void remove(){
        Hash hash = new Hash();
        Object object = "cat";
        Object object1 = "dog";
        hash.add(object);
        hash.add(object1);
        hash.remove(object);

        Assert.assertEquals(false,hash.contains(object));
    }
}

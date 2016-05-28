package homeTask9;

import homeTask9.ImprovedArrayExtends;
import homeTask9.ImprovedArrayIterator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Юля on 14.04.2016.
 */
public class ImprovedArrayIteratorTest {

    @Test
    public void hasNextHasToReturnRightResult() {
        ImprovedArrayExtends improvedArrayExtends = new ImprovedArrayExtends();
        ImprovedArrayIterator iterator = new ImprovedArrayIterator(improvedArrayExtends);
        improvedArrayExtends.add("cat");
        improvedArrayExtends.add("dog");

        boolean i = iterator.hasNext();

        Assert.assertEquals(true, i);
    }

    @Test
    public void remove() {
        ImprovedArrayExtends improvedArrayExtends = new ImprovedArrayExtends();
        ImprovedArrayIterator iterator = new ImprovedArrayIterator(improvedArrayExtends);
        try {
            iterator.remove();
        } catch (RuntimeException e) {
            System.out.println(e);
        }
    }

    @Test
    public void nextTest() {
        ImprovedArrayExtends improvedArrayExtends = new ImprovedArrayExtends();
        ImprovedArrayIterator iterator = new ImprovedArrayIterator(improvedArrayExtends);
        improvedArrayExtends.add("cat");

        Object o = iterator.next();
        Assert.assertEquals("cat", o);
    }
}

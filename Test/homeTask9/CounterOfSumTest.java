
package homeTask9;

import homeTask9.counter.CounterOfSum;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

/**
 * Created by Юля on 27.03.2016.
 */
public class CounterOfSumTest {

    @Test
    public void CounterHasToCountProperly() {
        CounterOfSum counterOfSum = new CounterOfSum();
        LinkedList<Float> linkedList = new LinkedList<>();
        linkedList.add(1f);
        linkedList.add(1f);

        Assert.assertEquals(2f, counterOfSum.sum(linkedList), 0);
    }
}


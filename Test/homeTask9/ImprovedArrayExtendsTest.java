
package homeTask9;

import comparator.comparators.StringComparator;
import homeTask9.ImprovedArrayExtends;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Юля on 27.03.2016.
 */
public class ImprovedArrayExtendsTest {

    @Test
    public void containIfArraySortedHasToReturnRightAnswer() {

        ImprovedArrayExtends improvedArrayExtends = new ImprovedArrayExtends();
        improvedArrayExtends.add("cat");
        improvedArrayExtends.add("dog");
        improvedArrayExtends.add("fish");

        Assert.assertEquals(true, improvedArrayExtends.containsIfArrayIsSorted("fish", new StringComparator()));
    }

    @Test
    public void removeTest(){
        ImprovedArrayExtends improvedArrayExtends = new ImprovedArrayExtends();
        improvedArrayExtends.add("cat");
        try {
            improvedArrayExtends.remove(1);
            Assert.fail();
        }catch (RuntimeException e){
            System.out.println(e);
        }
    }

    @Test
    public void getElementWithIndexHasToReturnRightElement(){
        ImprovedArrayExtends improvedArrayExtends = new ImprovedArrayExtends();

        improvedArrayExtends.add("cat");
        try {
            improvedArrayExtends.getElement(2);
            Assert.fail();
        }catch (RuntimeException e){
            System.out.println(e);
        }
    }
}
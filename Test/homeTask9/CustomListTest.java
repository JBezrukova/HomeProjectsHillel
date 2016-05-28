
package homeTask9;

import homeTask9.CustomCollections;
import homeTask9.CustomList;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Юля on 27.03.2016.
 */
public class CustomListTest {

    @Test
    public void newListMustBeEmpty() {
        CustomList customList = new CustomList();

        Assert.assertEquals(0, customList.size());
    }

    @Test
    public void sizeHasToChangeWithAdding() {
        CustomList customList = new CustomList();
        customList.add("Cat");
        customList.add("Dog");

        Assert.assertEquals(2, customList.size());
    }

    @Test
    public void sizeHasToChangeWithRemoving() {
        CustomList customList = new CustomList();
        customList.add("cat");
        customList.add("dog");
        customList.remove("dog");

        Assert.assertEquals(1, customList.size());
    }

    @Test
    public void containMethodHasToReturnRightAnswer() {
        CustomList customList = new CustomList();
        customList.add("cat");
        customList.add("dog");

        Assert.assertEquals(false, customList.contains("fish"));
    }

    @Test
    public void getElementHasToReturnRightElement() {
        CustomList customList = new CustomList();
        customList.add("cat");
        customList.add("dog");

        Assert.assertEquals("dog", customList.getElement(1));

        try {
            customList.getElement(4);
            Assert.fail();
        }catch (RuntimeException e){
            System.out.println(e);
        }
    }

    @Test
    public void getIndexHasToReturnRightElement() {
        CustomList customList = new CustomList();
        customList.add("cat");
        customList.add("dog");

        Assert.assertEquals(0, customList.getIndex("cat"));

    }

    @Test
    public void toStringHasToReturnList() {
        CustomList customList = new CustomList();
        customList.add("cat");
        customList.add("dog");

        Assert.assertEquals("CustomList:  cat; dog;", customList.toString());
    }

    @Test
    public void removeTest(){
        CustomCollections customCollections = new CustomList();
        customCollections.add("cat");

        try {
            customCollections.remove("dog");
            Assert.fail();
        }catch (RuntimeException e){
            System.out.println(e);
        }
    }
}
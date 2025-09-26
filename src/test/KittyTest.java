package test;

import activity.Kitty;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class KittyTest {

    /** I would recommend making a utility method. A utility method is a method that compares
     all the instance variables between two objects. When we have objects, we cannot use
     .equals as that will compare their memory addresses. If we want to compare the actual
     contents, we can use a testing utility! Because this is a normal method, we do not need to use
     the @Test annotation. **/

    public void compareKitties(Kitty Tom, Kitty Pepper){
        //place testing utility here
        assertEquals(Tom.getName(), Pepper.getName());
        assertEquals(Tom.getAge(), Pepper.getAge());
        assertEquals(Tom.getWeight(), Pepper.getWeight(), .001);
    }

    /** Write tests for your constructor. **/
    @Test
    public void constructorTest(){
        //place tests here
        Kitty Tom = new Kitty("Tom", 5, 20.0);
        assertEquals("Tom", Tom.getName());
        assertEquals(5, Tom.getAge());
        assertEquals(20.0, Tom.getWeight(), .001);
    }

    @Test
    public void averageWeightTest(){
        //place tests here
        Kitty Tom = new Kitty("Tom", 5, 20.0);
        Kitty Pepper = new Kitty("Pepper", 2, 10.0);
        assertEquals(15.0, Tom.averageWeight(Pepper), .001);
    }

    @Test
    public void kittenSorterTest(){
        //place test here
        Kitty Tom = new Kitty("Tom", 5, 20.0);
        Kitty Pepper = new Kitty("Pepper", 2, 10.0);
        ArrayList<Kitty> kittenList = new ArrayList<>(List.of(Tom, Pepper));
        ArrayList<Kitty> actualList = Tom.kittenSorter(kittenList);
        ArrayList<Kitty> expectedList = new ArrayList<>(List.of(Pepper));

        assertEquals(actualList.size(),expectedList.size());

        for(int i = 0; i < actualList.size(); i++){
            compareKitties(expectedList.get(i), actualList.get(i));
        }
    }
}



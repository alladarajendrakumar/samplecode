package org.demo.datastructures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SinglyLinkedListTest {
	 
    @Test (groups = {"datastructure", "unit"} ) 
    public void testNewLinkedList(){
        SinglyLinkedList singly = new SinglyLinkedList();
        Assert.assertTrue(singly.isEmpty());       // linked list should be empty
        Assert.assertEquals(0, singly.length());   // length of linked list should be zero
     
        singly.append("ABC");
        Assert.assertFalse(singly.isEmpty());     // linked list should not be empty
        Assert.assertEquals(1, singly.length());  // length of linked list should be 1
     
    }
}


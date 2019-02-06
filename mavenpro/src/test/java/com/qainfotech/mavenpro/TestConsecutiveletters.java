package com.qainfotech.mavenpro;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.*;
public class TestConsecutiveletters {
	@Test
    public void testApp()
    {
    	 ConsecutiveLetters obj = new ConsecutiveLetters();
        ArrayList <String> inputlist = new ArrayList<String>();
        inputlist.add("abc");
        inputlist.add("hello");
        inputlist.add("apple");
        ArrayList <String> outputlist = new ArrayList<String>();
        outputlist.add("hello");
        outputlist.add("apple");
        List l = obj.check(inputlist);
            AssertJUnit.assertEquals(l,outputlist);
        }
       
       /*
	@Test
    public void testApp()
    {
    	 ConsecutiveLetters obj = new ConsecutiveLetters();
        ArrayList <String> inputlist = new ArrayList<String>();
        inputlist.add("abc");
        inputlist.add("heLLo");
        inputlist.add("aPPle");
        ArrayList <String> outputlist = new ArrayList<String>();
        outputlist.add("hello");
        outputlist.add("apple");
        List l = obj.check(inputlist);
            AssertJUnit.assertEquals(l,outputlist);
        }
    */
}

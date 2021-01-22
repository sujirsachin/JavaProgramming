package Cleo.Problem;

import java.util.ArrayList;
import java.util.List;

public class Itemize
{
    /**
     * Prints the value of each list element on a separate line of nested list of unknown depth
     * @param string
     * @param l
     */
    private static void itemizeList(String string, List l) {
       for (int i = 0; i < l.size(); i++) {
            if(l.get(i) instanceof String){
                //if it is not a list but a string inside the main list, print the string
                System.out.println(string+"."+i + ": " + l.get(i));
            }
            if(l.get(i) instanceof List){
                //recursively call the function if it a list (nested)
                itemizeList(string+"."+i, (List)l.get(i));
            }
        }
    }
    public static void main(String[] args) {
        String s = "Example";
        List mainList = new ArrayList();
        List innerInnerList = new ArrayList();
        ArrayList<String> innerList = new ArrayList<String>();
        ArrayList<String> innerInnerInner = new ArrayList<String>();
        ArrayList<String> innerList2 = new ArrayList<String>();
        //inner list
        innerInnerList.add("a");
        innerInnerList.add("b");
        innerInnerInner.add("1");
        innerInnerInner.add("2");
        innerInnerInner.add("3");
        innerInnerList.add(innerInnerInner);
        innerList.add("eggs");
        // outer list
        mainList.add("a string");
        mainList.add(innerInnerList);
        mainList.add("spam");
        innerList2.add("eggs");
        mainList.add(innerList2);
        itemizeList(s, mainList);
    }
}

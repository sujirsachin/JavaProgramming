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
        List l = new ArrayList();
        List a = new ArrayList();
        ArrayList<String> b = new ArrayList<String>();
        ArrayList<String> c = new ArrayList<String>();
        ArrayList<String> d = new ArrayList<String>();
        //inner list
        a.add("a");
        a.add("b");
        c.add("1");
        c.add("2");
        c.add("3");
        a.add(c);
        b.add("eggs");
        // outer list
        l.add("a string");
        l.add(a);
        l.add("spam");
        d.add("eggs");
        l.add(d);
        itemizeList(s, l);
    }
}

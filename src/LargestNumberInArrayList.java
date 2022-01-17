import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;

public class LargestNumberInArrayList {
    public static void main (String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        try {
            list.add(14);
            list.add(2);
            list.add(73);
            System.out.println("Maximum element : " + Collections.max(list));
        }
        catch (ClassCastException | NoSuchElementException e) {
            System.out.println("Exception caught : " + e);
        }
    }
}
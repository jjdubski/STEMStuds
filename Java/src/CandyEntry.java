import java.util.*;

public class CandyEntry {
    private int numOnHand, numDesired;
    private String name, onHand, desired;
    private static int entryNumber = 0;
    private static ArrayList<CandyEntry> entryList;

    public CandyEntry(String name, int numOnHand, String onHand, int numDesired, String desired) {
        entryNumber++;
        this.name = name;
        this.numOnHand = numOnHand;
        this.onHand = onHand;
        this.numDesired = numDesired;
        this.desired = desired;
    }

    public String toString(){
       return "Entry Number: " + entryNumber + "\n" + name + " has " + numOnHand + onHand + "thay are willing to trade for:\n" + numDesired + desired;
    }


}

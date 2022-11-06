import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class CandyEntry {
    private int numOnHand, numDesired;
    private String name, onHand, desired;
    static AtomicInteger nextID = new AtomicInteger();
    private  int entryNumber;
    private static ArrayList<CandyEntry> entryList;

    public CandyEntry(String name, int numOnHand, String onHand, int numDesired, String desired) {
        entryNumber = nextID.incrementAndGet();
        this.name = name;
        this.numOnHand = numOnHand;
        this.onHand = onHand;
        this.numDesired = numDesired;
        this.desired = desired;
    }

    public static void addEntry(CandyEntry enter){
        entryList.add(enter);
    }
    public static ArrayList<CandyEntry> getEntrys(){
        return entryList;
    }

    public String toString(){
       return "Entry Number: " + entryNumber + "\n" + name + " has " + numOnHand + " " +onHand + " that they are willing to trade for:\n" + numDesired + " " +desired;
    }


}

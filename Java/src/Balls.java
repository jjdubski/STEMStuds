import java.util.*;
public class Balls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------Candy Exchange----------------------\n");
        System.out.println("Welcome, what is your name?");
        String user = scan.nextLine();

        boolean repeat = true;
        ArrayList<CandyEntry> entryList = new ArrayList<>();


do{
// Gets information on what the user has
    System.out.println("\n\nWhat candy do you have? (ex: '25 kitkat')");
    int numOnHand = 0;
    String onHand = "";
    do {
        try {
            onHand = scan.nextLine();
            numOnHand = Integer.parseInt(onHand.substring(0, onHand.indexOf(" ")));
            onHand = onHand.substring(onHand.indexOf(" ") + 1);
            if (numOnHand >= 0) {
                break;
            } else {
                System.out.println("Please enter a positive amount of candy!");
            }
        } catch (Exception e) {
            System.out.println("Please enter in the desired format!");
        }
    }
    while (true);
//Gets information on what the user wants
    System.out.println("Now, what candy do you want? (ex: '17 Reese's')");
    int numDesired;
    String desired;
    do {
        try {
            desired = scan.nextLine();
            numDesired = Integer.parseInt(desired.substring(0, desired.indexOf(" ")));
            desired = desired.substring(desired.indexOf(" ") + 1);
            if (numDesired >= 0) {
                break;
            } else {
                System.out.println("Please enter a positive amount of candy!");
            }
        } catch (Exception e) {
            System.out.println("Please enter in the desired format!");
        }
    }
    while (true);


// Asks the User if they would like to post their offer
    System.out.println("\n\nWould you like to post this offer?(Y/N)");
    String post;
    do {
        try {
            post = scan.nextLine();
            if (post.length() == 1) {
                if (post.equals("Y") || post.equals("N")) {
                    break;
                } else {
                    System.out.println("Please enter desired format!(Y/N)");

                }
            } else {
                System.out.println("Please enter desired format!(Y/N)");
            }
        } catch (Exception e) {
            System.out.println("Please enter valid input!(Y/N)");

        }
    }
    while (true);



    System.out.println("Do you have another entry?(Y/N)");
    String loop;
    do {
        try {
            loop = scan.nextLine();
            if (loop.length() == 1) {
                if (loop.equals("Y") || loop.equals("N")) {
                    if(loop.equals("N")){
                        repeat = false;
                        break;
                    } else{
                        break;
                    }
                } else {
                    System.out.println("Please enter desired format!(Y/N)");

                }
            } else {
                System.out.println("Please enter desired format!(Y/N)");
            }
        } catch (Exception e) {
            System.out.println("Please enter valid input!(Y/N)");

        }
    }
    while(true);


//Creates the user entry

    if (post.equals("Y")) {
        CandyEntry x = new CandyEntry(user, numOnHand, onHand, numDesired, desired);
        entryList.add(x);
    }


}while (repeat);

        System.out.println("Do you want to see the listings?(Y/N)");
        do {
            try {
                String seeAll = scan.nextLine();
                if (seeAll.length() == 1) {
                    if (seeAll.equals("Y") || seeAll.equals("N")) {
                        if (seeAll.equals("N")) {
                            System.out.println("Have a nice day! :)");
                            break;
                        } else {
                            System.out.println("");
                            for (int i = 0; i < entryList.size(); i++) {
                                System.out.println(entryList.get(i));
                            }
                            break;
                        }
                    }
                    //if for Y or N
                } else {
                    System.out.println("Please enter desired format!(Y/N)");
                }
            } catch (Exception e) {
                System.out.println("Enter valid format please!(Y/N)");
            }
        } while (true);

        System.out.println("DONE!");






    }
}
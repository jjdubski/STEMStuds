import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------Candy Exchange----------------------\n\n\n");
        System.out.println("Welcome, what is your name?");
        String user = scan.nextLine();




// Gets information on what the user has
        System.out.println("How much pieces of candy do you have? (ex: '20 KitKats')");
        int numOnHand = 0;
        String onHand = "";
        do{
            try{
                onHand = scan.nextLine();
                numOnHand = Integer.parseInt(onHand.substring(0, onHand.indexOf(" ")));
                if ( numOnHand >= 0){
                    break;
                }
                else{
                    System.out.println("Please enter a positive amount of candy!");
                }
            }
            catch (Exception e){
                System.out.println("Please enter in the desired format!");
            }
        }
        while(true);
//Gets information on what the user wants
        System.out.println("\n\nNow, what candy do you want? (ex: '17 Reese's')");
        int numDesired;
        String desired;
        do{
            try {
                desired = scan.nextLine();
                numDesired = Integer.parseInt(desired.substring(0, desired.indexOf(" ")));
                if( numDesired >= 0){
                    break;
                }
                else{
                    System.out.println("Please enter a positive amount of candy!");
                }
            }
            catch ( Exception e){
                System.out.println("Please enter in the desired format!");
            }
        }
        while(true);







// Asks the User if they would like to post their offer
        System.out.println("\n\nWould you like to post this offer?(Y/N)");
        String post;
        do{
            try {
                post = scan.nextLine();
                if (post.length() == 1) {
                    if (post.equals("Y") || post.equals("N")) {
                        break;
                    }
                    else {
                        System.out.println("Please enter desired format!(Y/N)");

                    }
                } else {
                    System.out.println("Please enter desired format!(Y/N)");
                }
            }
            catch (Exception e){
                System.out.println("Please enter valid input!(Y/N)");

            }
        }
        while(true);



//Creates the user entry



    }
}
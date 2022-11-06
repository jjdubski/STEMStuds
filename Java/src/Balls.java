import java.util.*;
public class Balls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------Candy Exchange----------------------\n\n\n");
        System.out.println("Welcome, what is your name?");
        String user = scan.nextLine();




// Gets information on what the user has
        System.out.println("What candy do you have? (ex: '25 kitkat')");
        int numOnHand = 0;
        String onHand = "";
        do{
            try{
                onHand = scan.nextLine();
                numOnHand = Integer.parseInt(onHand.substring(0, onHand.indexOf(" ")));
                onHand = onHand.substring(onHand.indexOf(" ") + 1);
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
                desired = desired.substring(desired.indexOf(" ") + 1);
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
        CandyEntry x = new CandyEntry(user, numOnHand, onHand, numDesired, desired);

        if( post.equals("Y")){
            System.out.println(x);
        }
        else{
            System.out.println("Would you like to see all the posts?");
        }


        System.out.println("Would you like to see all the posts?");
        String seeAll;
        do{
            try {
                seeAll = scan.nextLine();
                if (seeAll.length() == 1) {
                    if (seeAll.equals("Y") || seeAll.equals("N")) {
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



        for(int i = 0; i <= 1; i++){
            if(seeAll.equals("Y")){
                try{
                    System.out.println(x);
                }
                catch (Exception e){
                    break;
                }
            }
        }
        if(seeAll.equals("N")){
            System.out.println("Have a nice day :)");
        }



    }
}
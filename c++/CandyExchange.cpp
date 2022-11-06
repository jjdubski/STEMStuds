#include "post.h"
#include "candy.h"
#include <sstream>
using namespace std;

int main(){

    ifstream postFile;
    postFile.open("postFile.txt");

    Post* post;
    string tempString;
    string tempUser, tempCandy, tempPref;
    int option, tempValue, tempQuantity;


    cout << "Welcome to the Candy Exchange" << endl
        << "------------------------------" << endl
        << "Recent Posts:" << endl;
    
    //display posts
    if(!postFile.eof()){
        cout << "No recent posts available.";
    }else while(postFile.peek()!=postFile.eof()){
        postFile >> tempCandy;
        postFile >> tempValue;
        postFile >> tempUser;
        postFile >> tempPref;
        postFile >> tempQuantity;
        post = new Post(tempCandy, tempValue, tempUser, tempPref, tempQuantity);
        post->display();
    } 

    postFile.close();

    cout << "\nPlease choose an option:" << endl << endl
        << "\t1 - Create New Post" << endl
        << "\t2 - Make Offer" << endl
        << "\t3 - Accept Trade" << endl << endl

        << "Please choose an input option: ";

    cin >> option;
    
    if(option == 1){
        cout << "Enter your username: ";
        cin >> tempUser;
        cout << "Enter the name of your candy: ";
        cin >> tempCandy;
        cout << "Enter the amount of candy: ";
        cin >> tempValue;
        cout << "What type of candy are you looking for? ";
        cin >> tempPref;
        cout << "How much of " << tempPref << " would you like for your " << tempCandy << " (" << tempValue << ")? ";
        cin >> tempQuantity;
        post->write(tempCandy, tempValue, tempUser, tempPref, tempQuantity);
    }



    /*cin >> temp;
    postFile << temp;*/

    return 0;
}

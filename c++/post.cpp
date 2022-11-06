#include "post.h"
using namespace std;

Post::Post(string name, int value, string user, string pref, int quantity){
    setUser(user);
    setPref(pref, quantity);
    setCandy(name, value);
}

void Post::setUser(string user) {
    userName = user;
}

void Post::setPref(string pref, int quantity){
    preference = pref;
    prefQuantity = quantity;
} 

void Post::setCandy(string name, int value){
    candyName = name;
    candyValue = value;
}

void Post::display(){
    cout << "\n\t Name: " << userName << endl;
    cout << "\tCandy: " << candyName << " (" << candyValue << ")" << endl;
    cout << "  Looking for: " << preference << " (" << prefQuantity << ")" << endl;
}

void Post::write(string name, int value, string user, string pref, int quantity){
    ofstream postFile;
    postFile.open("postFile.txt", ios::app);
    postFile << name << " " << value << " " << user << " " << pref << " " <<  " " << quantity << "\n";
    postFile.close();
}
#pragma once
#include <string>
#include "iostream"
#include <fstream>
using namespace std;

class Post{
    private:
        string userName;
        string description;
        string preference;
        string candyName;
        int candyValue;
        int prefQuantity;

    public:
        Post(string name, int value, string user, string pref, int quantity);

        void setUser(string user);

        void setPref(string pref, int quantity);

        void setCandy(string name, int value);

        void display();

        void write(string name, int value, string user, string pref, int quantity);
};
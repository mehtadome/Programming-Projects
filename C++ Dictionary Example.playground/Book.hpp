//
//  Book.hpp
//  C++ Final
//
//  Created by Ruchir Mehta on 7/21/16.
//  Copyright © 2016 Rucker. All rights reserved.
//

#ifndef Book_hpp
#define Book_hpp

#include <stdio.h>
#include "Item.hpp"
#include <string>
#include "InvalidItemException.hpp"
#include <iostream>
#include <vector>

using namespace std;

class Book: public Item{
public:
    int *id;
    string *description;
    char *availability = "Available";
    vector<Book *> BookObjects;
    
    Book(int id, string description);
    int *getID();
    string *getDescription();
    bool setAvailability(char *available);
    char *getAvailability();
    void printBookInfo();
    char *checkIn();
    char *checkOut();
    void getOnlyAvailableBooks(vector<string *> &pBookObjectsList);
};

#endif /* Book_hpp */

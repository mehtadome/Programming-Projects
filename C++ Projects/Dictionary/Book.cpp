//
//  Book.cpp
//  C++ Final
//
//  Created by Ruchir Mehta on 7/21/16.
//  Copyright © 2016 Rucker. All rights reserved.
//

#include "RefBook.hpp"
#include "Book.hpp"
#include <iostream>
#include <vector>

int *Book::getID() // return ID
{
    return id;
}
string *Book::getDescription() // return description
{
    return description;
}

char *Book::getAvailability() // return availability
{
    return availability;
}

char *Book::checkIn() // by checking in the book, it is then available to be called
{
    availability = "Available";
    return availability;
}

char *Book::checkOut() // by checking out the book, it is no longer available to be called
{
    availability = "Not Available";
    return availability;
}

bool Book::setAvailability(char* available) // if both parameters are not NULL, it will copy the string for those parameters
{
    if(availability != NULL && available != NULL)
    {
        stringCopy(available, availability);
    }
    return true;
}
void Book::printBookInfo() // prints the book info a.k.a ID, book description, and availability when called
{
    cout << "ID(" << id << ") TITLE(" << description << ") STATUS(" << availability << ").\n";
}

void Book::getOnlyAvailableBooks(vector<string *> &pBookObjectsList) // if the book is available, it will be called back 
{
    if(availability = "Available")
    {
    int total = pBookObjectsList.size();
    for(int count=0; count < total; count++)
    {
        string * pMsg = pBookObjectsList[count];
        cout << count << ": " << *pMsg << endl ;
    }
  }
}

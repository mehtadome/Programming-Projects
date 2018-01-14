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

int *Book::getID()
{
    return id;
}
string *Book::getDescription()
{
    return description;
}

char *Book::getAvailability()
{
    return availability;
}

char *Book::checkIn()
{
    availability = "Available";
    return availability;
}

char *Book::checkOut()
{
    availability = "Not Available";
    return availability;
}

bool Book::setAvailability(char* available)
{
    if(availability != NULL && available != NULL)
    {
        stringCopy(available, availability);
    }
    return true;
}
void Book::printBookInfo()
{
    cout << "ID(" << id << ") TITLE(" << description << ") STATUS(" << availability << ").\n";
}

void Book::getOnlyAvailableBooks(vector<string *> &pBookObjectsList)
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
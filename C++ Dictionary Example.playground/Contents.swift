//: Playground - noun: a place where people can play

import UIKit

var str = "Hello, playground"

// 2. C++ Dictionary Example:

#include <iostream>
#include <vector>
#include <string>
#include "Item.hpp"
#include "Book.hpp"
#include "utils.hpp"
#include "RefBook.hpp"
using namespace std;
int main(int argc, const char * argv[]) {
    Book *myNewBook = new Book(12345, "JavaScript");
    Book *myOtherBook = new Book(2345, "Python");
    myNewBook->checkIn();
    myOtherBook->checkOut();
    RefBook *myNewRefBook = new RefBook(12345, "Swift");
    RefBook *myOtherRefBook = new RefBook(56789, "C");
    myNewRefBook->checkIn();
    myOtherBook->checkIn();
    try {
        Book *myAnotherBook = new Book(-1, "lol");
    } catch (InvalidItemException &eObj) {
        cout << "error.\n";
    }
    vector<Book *> myBookList;
    myBookList.push_back(myNewBook);
    myBookList.push_back(myOtherBook);
    myBookList.push_back(myNewRefBook);
    myBookList.push_back(myOtherRefBook);
    vector<string *> myNewBookList;
    myNewBook->getOnlyAvailableBooks(myNewBookList);
    return 0;

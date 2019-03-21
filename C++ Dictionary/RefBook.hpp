//
//  RefBook.hpp
//  C++ Final
//
//  Created by Ruchir Mehta on 7/21/16.
//  Copyright © 2016 Rucker. All rights reserved.
//

#ifndef RefBook_hpp
#define RefBook_hpp

#include <stdio.h>
#include "Book.hpp"


class RefBook: public Book
{
public:
    
    RefBook(int id, string description); // creates method to be edited in RefBook.cpp
    virtual void printRefBookInfo();
    
    
};

#endif /* RefBook_hpp */

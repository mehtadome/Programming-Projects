//
//  RefBook.cpp
//  C++ Final
//
//  Created by Ruchir Mehta on 7/21/16.
//  Copyright © 2016 Rucker. All rights reserved.
//

#include "RefBook.hpp"
#include "utils.hpp"
#include "Book.hpp"

using namespace std;

void RefBook::printRefBookInfo()
{
    cout << "ID(" << id << ") TITLE(" << description << ") STATUS(" << availability << ") REFERENCE.\n";
}


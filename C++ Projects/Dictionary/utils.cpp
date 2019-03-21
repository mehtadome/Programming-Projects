//
//  utils.cpp
//  C++ Final
//
//  Created by Ruchir Mehta on 7/21/16.
//  Copyright © 2016 Rucker. All rights reserved.
//
#include <iostream>
#include "utils.hpp"
#include <string>

int stringLength (const char* src) { // finds the string length of the user's input
    if (src == NULL)
        return false;
    
    int i = 0;
    while (src[i] != NULL) {
        i++;
    }
    return i;
}

bool stringCopy (const char* src, char* dest) { // copies the string which the user inputted
    if (src == NULL || dest == NULL)
        return false;
    
    int srcLen = stringLength(src);
    
    int i = 0;
    for (; i < srcLen;i++) {
        dest[i] = src[i];
    }
    dest[i] = NULL;
    return true;
}

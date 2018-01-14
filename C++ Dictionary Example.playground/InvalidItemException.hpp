//
//  InvalidItemException.hpp
//  C++ Final
//
//  Created by Ruchir Mehta on 7/21/16.
//  Copyright © 2016 Rucker. All rights reserved.
//
//  Purpose of class: make sure that the user inputs in the correct information
//

#ifndef InvalidItemException_hpp
#define InvalidItemException_hpp
#include "utils.hpp"

#include <stdexcept>
#include <stdio.h>
#include <string>
#include <iostream>
using namespace std;

class InvalidItemException
{
private:
    int m_id;
    char *m_description;
public:
    bool isCorrectQuestionMark()
    {
        if(m_id < 0)
        {
            cout << "id cannot be negative\n";
            return false;
        }
        if(stringLength(m_description) == 0)
        {
            cout << "string is blank\n";
            return false;
        }
        return true;
    }
};



#endif /* InvalidItemException_hpp */

//
//  Item.hpp
//  C++ Final
//
//  Created by Ruchir Mehta on 7/21/16.
//  Copyright © 2016 Rucker. All rights reserved.
//

#ifndef Item_hpp
#define Item_hpp

#include <stdio.h>
#include <string>


class Item
{
public:
    virtual bool isAvailable() = 0 ;
    virtual std::string toString() = 0 ;
} ;

#endif /* Item_hpp */

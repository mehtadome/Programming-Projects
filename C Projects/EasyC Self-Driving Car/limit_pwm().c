//
//  limit_pwm().c
//  
//
//  Created by Ruchir Mehta on 1/14/18.
//
//

#include <stdio.h>

int limit_pwm (int temp)
{
    
    if (temp > 127)
    {
        limited = 127;
    }
    
    else if (temp < -127)
    {
        limited = -127;
    }
    
    else
    {
        limited = temp;
    }
    
    return limited;
    
}
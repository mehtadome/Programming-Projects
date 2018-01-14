//
//  move().c
//  
//
//  Created by Ruchir Mehta on 1/14/18.
//
//

#include <stdio.h>

void move (void)
{
    error = 4 - max_no; // heading direction error, if PD4 == max_no, then no error

    steer = error * steer_sensitivity; // steering effort proportional to heading error
    
    speed = forward_speed; //forward speed
    
    if (PD_sum < ambient_level) // if PD_sum < 200, no beacon found and robot keeps spinning and scanning
    {
        speed = 0;
        steer = spin_speed;
    }
    
    if (PD_sum > slow_level) // if PD_sum > 5000, slow robot down because beacon is near
    {
        speed = slow_speed; // slow down
    }
    
    if (PD_sum > stop_level) // found beacon
    {
        speed = 0; // stop
        steer = 0; // stop steering
    }
    
    // Robot moves toward beacon:
    
    temp = limit_pwm (0 + steer + speed);
    SetPWM (1, temp);
    temp = limit_pwm (0 + steer - speed);
    SetPWM (2, temp);
    
}
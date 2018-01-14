//
//  Main().c
//  
//
//  Created by Ruchir Mehta on 1/14/18.
//
//

#include "Main().h"

//: Main()
//EasyC Programming

void main (void)
{
    int state = 0;
    
    freq = 0; // 0 = 1kHz (level of ambient light for red beacon), 1 = 10kHz (level of ambient light for green beacon)
    
    ambient_level = 200; //used in move()
    
    slow_level = 5000; //used in move()
    
    stop_level = 6000; // used in move()
    
    expose_time = 3; // used in expose_and_read
    
    steer_sensitivity = 20; // used in move()
    
    forward_speed = 35; // used in move()
    
    slow_speed = 25; // used in move()
    
    spin_speed = 50; // spin speed for the mode "searching"
    
    SetDigitalOutput (10, freq); // turn to either 1kHz (red) or 10kHz (green)
    
    while (state == 0)
    {
        Read_PD();
        find_max();
        move();
        
        limit_switch = GetDigitalInput (3);
        
        if (limit_switch == 1)
        {
            SetMotor (1, 0); // stops left motor
            SetMotor (2, 0); // stops right motor
            
            SetMotor (4, -127); // arm motor swings down to hit button on beacon
            Wait (1000); // wait one second
            
            state = 1;
        }
        
    }
    
    while (state == 1)
    {
        Read_PD();
        find_max();
        move();
        
        limit_switch = GetDigitalInput (3);
        
        if (limit_switch == 1)
        {
            SetMotor (1, 0); // stops left motor
            SetMotor (2, 0); // stops right motor
            
            SetMotor (4, -127); // arm motor swings down to hit button on beacon
            Wait (1000); // wait one second
            
            state = 2
        }
        
    }
    
    while (state == 2)
    {
        bumper1 = GetDigitalInput (5);
        bumper2 = GetDigitalInput (6);
        
        SetMotor (1, 127); // left motor moves robot forward
        SetMotor (2, 127); // right motor moves robot forward
        
        if (bumper1 == 1 || bumper2 == 1) // if any of the bumpers are hit:
        {
            SetMotor (1, 0); // stops left motor
            SetMotor (2, 0); // sto[s right motor
            
            Wait (500); // wait half a second
            
            SetMotor (1, -127); // left motor reverses
            SetMotor (2, -127); // right motor reverses
            
            Wait (500);
            
            SetMotor (1, 127); //robot turns left
            SetMotor (2, -127);
            
            Wait (500);
            
        }
    }
}

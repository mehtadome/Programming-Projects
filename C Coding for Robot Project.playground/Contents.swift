//: Playground - noun: a place where people can play
//: Engr10 EasyC Exercises
import UIKit

var str = "Hello, playground"

/** Practice Program 1
 Write a program that gradually increases the speed of the motor.  The speed of the motor should go from 0 to the maximum speed within about 10 seconds
*/

void testTwo (void)
{
    for (i = 1, i<127, i++)
        
    
}

/** Practice Program 3
Write a program that makes the motor spin until the bumper switch (plugged it into port 10 of the Analog/Digital ports) is pressed.  When the bumper is released, the motor starts spinning again but in the reverse direction.  When the bumper switch is pushed again, the motor stops, and so on.
**/

bumper10 = GetDigitalInput [1];
int x;

while (1==1)
{
    setMotor(2, 127);
    x = 1;
if ((bumper10 == 1) || (x == 1))
{
    setMotor(2, 0);
    if (bumper10 == 0)
    {
        setMotor(2, -127);
        if (bumper10 == 1)
        {
            setMotor(2, 0);
            if (bumper10 == 0)
            {
                setMotor(2, 127);
                x = 2;
            }
        }
    }
}
    
}

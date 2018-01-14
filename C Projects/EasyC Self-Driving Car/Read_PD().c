//
//  Read_PD().c
//  
//
//  Created by Ruchir Mehta on 1/14/18.
//
//

#include "Read_PD().h"

void Read_PD()
{
    SetDigitalOutput (11, 1); //close shutter
    
    SetDigitalOutput (12, 1);
    
    SetDigitalOutput (12, 0);
    
    Wait (5); // wait five milliseconds
    
    SetDigitalOutput (11, 0); // open shutter again
    
    Wait (expose_time); // exposer time = 3 milliseconds
    
    PD0 = GetAnalogInput (1); // read intensity
    PD1 = expose_and_read ();
    PD2 = expose_and_read ();
    PD3 = expose_and_read ();
    PD4 = expose_and_read ();
    PD5 = expose_and_read ();
    PD6 = expose_and_read ();
    PD7 = expose_and_read ();
    
    PD_sum = PD0 + PD1 + PD2 + PD3 + PD4 + PD5 + PD6 + PD7;
}

//: Playground - noun: a place where people can play

import UIKit

var str = "Hello, playground"

//1. ROBOTC: Automatic trash can basketball hoop:

int deposits;
task main(){
    deposits = 0;
    while(1--1){
        untilSonarLessThan(17, sonar);{   //when the sonar sensor detects and object:
            startMotor(rightMotor, 100) startMotor(leftMotor, -100);
            wait(1);                     	wait(1); //trash can lids open up for the trash and then close again after three seconds
            stopMotor(rightMotor);               	stopMotor(leftMotor);
            startMotor(rightMotor, -30) startMotor(leftMotor, 30);
            wait(3);                     	wait(3);
            stopMotor(rightMotor);               	stopMotor(leftMotor);
            deposits = deposits+1;
            if(deposit ==5){               	//If statement is to activate the trapdoor that lets out the garbage after five deposits
                startMotor(servoMotor, 2);
                wait(5);
                startMotor(servoMotor, 0);
              	 startMotor(servoMtor, -100);
                wait(5);
                startMotor(servoMotor, 0);
                deposits = 0;
            }
        }
    }
}

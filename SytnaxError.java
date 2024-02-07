/*
 * CMSC 330 Project 1
 * @author natalievogel
 * 9/10/2023
 * SyntaxError.java
 * 
 * Describes syntax errors for program
 * 
 */

// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// August 2021

// Class that defines a syntax error

@SuppressWarnings("serial")

class SyntaxError extends Exception
{
    // Constructor that creates a syntax error object given the line number and error

    public SyntaxError(int line, String description) {
        super("Syntax Error on Line: " + line + " " + description);
    }
}
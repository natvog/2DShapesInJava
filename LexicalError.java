/*
 * CMSC 330 Project 1
 * @author natalievogel
 * 9/10/2023
 * LexicalError.java
 * 
 * Describes lexcial errors for program
 * 
 */

// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// August 2021

// Class that defines a lexical error

@SuppressWarnings("serial")

class LexicalError extends Exception {
	
    // Constructor that creates a lexical error object given the line number and error

    public LexicalError(int line, String description)    {
        super("Lexical Error on Line: " + line + " " + description);
    }
}
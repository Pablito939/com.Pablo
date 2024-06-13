package com.Pablo;
/**
 * @author Pablo Espinoza 
 * @date 22/03/2024 
 * Code that creates a lock and allows user to change the combination
 */
public class Lock {
	// Private instance variables here
	private String combination;
	private int incorrectAttempts;
	private boolean unlocked;
	
	

	// Default constructor here
	public Lock() { 
		this.combination = "0000";
		this.incorrectAttempts = 0;
		this.unlocked = false;
	}
	
	// Overloaded constructor here
	public Lock(String Combination) {
		this.combination = Combination;
		this.incorrectAttempts = 0; 
		this.unlocked = false;
		
	}
	//Attempts to unlock the lock
    public void attemptUnlock(String combo) {
        // TODO: Implement
    	if (combo.equals(combination)) {
            unlocked = true;
            incorrectAttempts = 0;
            System.out.println("Click.");
        } else {
            incorrectAttempts++;
            if (incorrectAttempts >= 3) {
                System.out.println("Alarm!");
            }
        }
    }

    public boolean changeCombo(String newCombo) {
    	 if (unlocked) {
             combination = newCombo;
             lock(); // Locks the lock after changing the combination
             return true;
         } else {
             return false;
         }
    }
    //Accessor method
    public boolean isUnlocked() {
        return unlocked;
    }
    //locks the lock
    public void lock() {
    	unlocked = false;
    }

}


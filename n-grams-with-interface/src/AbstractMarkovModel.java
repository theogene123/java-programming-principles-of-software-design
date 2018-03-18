
/**
 * Abstract class AbstractMarkovModel - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */

import java.util.*;

public abstract class AbstractMarkovModel implements IMarkovModel {
    protected String myText;
    protected Random myRandom;
    
    public AbstractMarkovModel() {
        myText = "";    // no frickin' nulls
        myRandom = new Random();
    }
    
    public void setTraining(String s) {
        if (s != null && !s.isEmpty())
            myText = s.trim();
    }
 
    abstract public String getRandomText(int numChars);

}

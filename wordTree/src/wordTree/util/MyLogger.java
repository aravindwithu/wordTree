package wordTree.util;

/**
* MyLogger class.
* Created for cs542 - Design patterns, Assignment 3.
*/

public class MyLogger{
    /*DEBUG_VALUE=4 [Print to stdout everytime a constructor is called]
      DEBUG_VALUE=3 [Print to stdout everytime a thread's run() is called]
      DEBUG_VALUE=2 [Write to stdout before writing to file]
      DEBUG_VALUE=1 [FIXME: add your own scheme here]
      DEBUG_VALUE=0 [No output should be printed from the applicatio to stdout. It is ok to write to the output file though" ]
    */

    public static enum DebugLevel {RELEASE, DATA_NEEDED, STATE_CHANGE, THREAD_RUN, CONSTRUCTOR};

    private static DebugLevel debugLevel;

    public static void setDebugValue (int levelIn) {
		switch (levelIn) {
            case 0: debugLevel = DebugLevel.RELEASE; break;
            case 1: debugLevel = DebugLevel.DATA_NEEDED; break;
            case 2: debugLevel = DebugLevel.STATE_CHANGE; break;
	 		case 3: debugLevel = DebugLevel.THREAD_RUN; break;
            case 4: debugLevel = DebugLevel.CONSTRUCTOR; break;
		}
    }

    public static void setDebugValue (DebugLevel levelIn) {
		debugLevel = levelIn;
    }

    // @return None
    public static void writeMessage (String  message, DebugLevel levelIn ) {
    	if (levelIn == debugLevel)
    	    System.out.println(message);
    }

    /**
	 * @return String
	 */
    public String toString() {
		return "Debug Level is " + debugLevel;
    }
}

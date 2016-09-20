package assignment4;

import java.util.List;

public interface ChatInterface {
    
    /**
     * This method simply returns all the possible responses that have been 
     * added using the addResponse method.
     * 
     * @return  All possible responses 
     */
    public List<String> responses();
    /**
     * Chat should:
     * 1.  Return the word hello if the user types Hello in any case.
     * 2.  Return the word goodbye if the user types Goodbye in any case.
     * 3.  Return a random String if anything else is typed.
     * 
     * 
     * @param chatString The string the user typed into the computer
     * @return The computer's response to the chatString
     */
    public String chat(String chatString);
    
    /**
     * This method is used to add a response that the computer can respond with.
     * 
     * @param response The response to add to the MockChat
     */
    public void addResponse(String response);
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bradley.blanchard
 */
public class MockChat extends BaseChat implements ChatInterface {

    private List<String> response = new ArrayList<>();
    
    @Override
    public List<String> responses() {
        return response;
    }

    @Override
    public String chat(String chatString) {
            if(chatString.equalsIgnoreCase("Hello")){
                return "Computer> Hello";
            } else if(chatString.equalsIgnoreCase("Goodbye")){
                return "Computer> Goodbye";
            } else {

                String randResponse = response.get(rand.nextInt(response.size()));
                
//                return "Computer> "+response[randResponse];
                return "Computer>"+randResponse;
            }
    }
    

    @Override
    public void addResponse(String response) {
        this.response.add(response);
    }
    
}

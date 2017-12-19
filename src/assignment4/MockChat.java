/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        boolean endChat = false;
        while(endChat != true){
            Scanner chatNow = new Scanner(System.in);
            String chatInput = chatNow.nextLine();
            if(chatInput.equalsIgnoreCase("Hello")){
                System.out.println("Hello");
            } else if(chatInput.equalsIgnoreCase("goodbye")){
                endChat = true;
                System.out.println("Goodbye");
            } else {
                
            }
        }
    }

    @Override
    public void addResponse(String response) {
        this.response.add(response);
    }
    
}

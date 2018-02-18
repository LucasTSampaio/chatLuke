package servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor {

    public static void main(String[] args) {
      
        ArrayList<PrintStream> clientes = new ArrayList<>();
        
        try {
            ServerSocket server = new ServerSocket(5000);
            Socket socket;
            
            while(true){
            
                socket = server.accept();
                
                //Guarda o enderenço do cliente
                clientes.add(new PrintStream(socket.getOutputStream()));
                
                Mensagem mensagem = new Mensagem(socket, clientes);
               
            }
            
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        
    }
    
}

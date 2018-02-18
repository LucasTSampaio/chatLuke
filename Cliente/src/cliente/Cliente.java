package cliente;

import javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;

public class Cliente {
    public static void main(String[] args) {
        
        String nick = showInputDialog(null, "Digite seu nick: ", "", PLAIN_MESSAGE);
        
        Chat chat = new Chat(nick);
        chat.setVisible(true);
        
    }
}

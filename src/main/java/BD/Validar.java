
package BD;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class Validar {
    Character s;
    
    public void Validar_Numeros(KeyEvent evt){
        char s;
        s = evt.getKeyChar();
        if ((s < '0' || s > '9')) {
            evt.consume();
        }
    }
    
    public void Limitar_caracteres(JTextField campo, int cantidad) {
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                int tam = campo.getText().length();
                if (tam >= cantidad) {
                    e.consume();
                }
            }

        });
    }
    
    public void validar_letras(KeyEvent evt) {
        s = evt.getKeyChar();
        if (!Character.isLetter(s) && s != KeyEvent.VK_SPACE) {
            evt.consume();

        }
    }
}

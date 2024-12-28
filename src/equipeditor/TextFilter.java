package equipeditor;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;


public class TextFilter extends DocumentFilter {
    
    private static final int MAX_LENGTH = 5;
    
    public TextFilter(JTextField txt) {
        ((AbstractDocument) txt.getDocument()).setDocumentFilter(this);
    }
    
    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
        // Permitir inserción si se cumple la condición
        if (validText(fb, string, 0)) {
            super.insertString(fb, offset, string, attr);
            System.out.println("Se esta insertando."); // Solo para debuggear
        }
    }
    
    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        // Permitir reemplazo si se cumple la condición
        if (validText(fb, text, length)) {
            super.replace(fb, offset, length, text, attrs);
            System.out.println("Se esta reemplazando."); // Solo para debuggear
        }
        
    }
    
    @Override
    public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
        // Permitir eliminación, incluso cuando el campo está vacío
        super.remove(fb, offset, length);
    }
    
    private boolean validText(FilterBypass fb, String string, int length) {
        // Permitir solo dígitos
        if (!string.matches("^[0-9]+$")) {
            return false;
        }
        
        int currentLength = fb.getDocument().getLength();
        int newTextLength = string.length();
        return currentLength - length + newTextLength <= MAX_LENGTH;
        
    }
    
    
    
}

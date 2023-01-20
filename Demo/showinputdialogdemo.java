import javax.swing.JOptionPane;
public class showinputdialogdemo {
    public static void main(String[] args) {
        String data = JOptionPane.showInputDialog(null, "Doreamon: Who are you?");
        JOptionPane.showMessageDialog(null, "Hello, my name is"+data);

    }

}

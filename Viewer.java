
/**
 * Write a description of class Viewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.event.*;
public class Viewer extends JFrame
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class Viewer
     */
    JButton btnBaca=new JButton("Baca");
    JLabel lblBaca=new JLabel("Masukkan Nama File: ");
    JTextField txtBaca=new JTextField();
    JLabel txtOut=new JLabel();
    Tool t=new Tool();
    public Viewer()
    {
        super("Program Pembaca File");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0,0,500,300);
        setVisible(true);
        setLayout(null);
        getContentPane().add(lblBaca);
        getContentPane().add(txtBaca);
        getContentPane().add(btnBaca);
        getContentPane().add(txtOut);
        lblBaca.setBounds(10, 0, 160, 20);
        txtBaca.setBounds(lblBaca.getBounds().width+10, 0, 100, 20);
        btnBaca.setBounds(txtBaca.getBounds().x+txtBaca.getBounds().width+10, 0, 100, 20);
        txtOut.setBounds(0, txtBaca.getBounds().height+10, getBounds().width, 50);
        btnBaca.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                    txtOut.setText(t.bacaFile(txtBaca.getText()));
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "File Gak Onok, Boss!!!");
                }
            }
        });
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
}

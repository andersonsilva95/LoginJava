package tela;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.text.Position;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Screen {
    public static void main(String[] args) {
        final JFrame frame = new JFrame("Campo de senha");
 
        JLabel lblUser = new JLabel("Login:");
        JTextField tfUser = new JTextField(100);
        lblUser.setLabelFor(tfUser);
 
        JLabel lblPassword = new JLabel("Senha:");
        final JPasswordField pfPassword = new JPasswordField(20);
        lblPassword.setLabelFor(pfPassword);
 
        JButton btnGet = new JButton("Mostrar senha digitada");
        btnGet.addActionListener(
                new ActionListener() {
 
                    public void actionPerformed(ActionEvent e) {
                        String password = new String(pfPassword.getPassword());
                        JOptionPane.showMessageDialog(frame, "A senha digitada foi " + password);
                        }
                });
        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(
        			new ActionListener() {
						
					public void actionPerformed(ActionEvent e) {
						if (tfUser.getText().equals("admin")&&pfPassword.getText().equals("admin")) {
						JOptionPane.showMessageDialog(frame, "Login e senha válidas");	
						}else {
								JOptionPane.showMessageDialog(frame, "Login ou senha inválida");
						}
				}
});
        JPanel panel = new JPanel();
        panel.setLayout(new SpringLayout());
 
        panel.add(lblUser);
        panel.add(tfUser);
        panel.add(lblPassword);
        panel.add(pfPassword);
        panel.add(btnLogin);
        panel.add(btnGet);
 
        SpringUtilities.makeCompactGrid(panel,
                3, 2, //rows, cols
                6, 6, //initX, initY
                6, 6); //xPad, yPad
 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 120);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
        }
    }
    
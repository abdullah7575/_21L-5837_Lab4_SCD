import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;

    MyFrame(){
        this.setTitle("Let's Start with Java Swing");
        this.setVisible(true);
        this.setSize(500,600);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0x123456));
        button = new JButton("Click Me");
        button.setFocusable(false);
        button.setBounds(200,150,100,50);
        button.setFont(new Font("Segoe UI", Font.BOLD, 16));
        button.addActionListener(this);
        button.setVisible(true);
        this.setLayout(null);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JOptionPane.showMessageDialog(this,"\"Hello, Swing!\"","Message Box",JOptionPane.PLAIN_MESSAGE);
        }
    }
}


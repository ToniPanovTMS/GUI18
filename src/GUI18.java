import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI18 extends JFrame {
    static String answer="";
    public static void main(String[] args) {
        JFrame jFrame=getFrame();
        JPanel jPanel= new JPanel();
        jFrame.add(jPanel);

        JTextField jTextField = new JTextField();
        jTextField.setMaximumSize(new Dimension(450,30));

        jTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer+=jTextField.getText()+"\n";
            }
        });

        JTextArea jTextArea= new JTextArea();
        jTextArea.setAlignmentX(Component.CENTER_ALIGNMENT);
        jTextArea.setMaximumSize(new Dimension(450,350));
        jTextArea.setLineWrap(true);
        jTextArea.setWrapStyleWord(true);

        JButton jButton = new JButton("Ответить");
        jButton.setBounds(150,40,100,50);
        jButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setText(answer);
            }
        });

        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        jPanel.add(Box.createVerticalStrut(10));
        jPanel.add(jTextField);
        jPanel.add(Box.createVerticalStrut(10));
        jPanel.add(jButton);
        jPanel.add(Box.createVerticalStrut(10));
        jPanel.add(new JScrollPane(jTextArea));
        jPanel.add(Box.createVerticalStrut(10));


        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }

    static JFrame getFrame(){
        JFrame jFrame= new JFrame(){};
        jFrame.setTitle("GUI14");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setBounds(dim.width / 2 - 500 / 2, dim.height / 2 - 500 / 2, 500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        return jFrame;
    }
}

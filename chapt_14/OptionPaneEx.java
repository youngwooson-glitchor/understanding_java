package chapt_14;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class OptionPaneEx extends JFrame {
    public OptionPaneEx() {
        setTitle("Option Pane Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        setSize(500, 200);
        c.add(new MyPanel(), BorderLayout.NORTH);
        setVisible(true);
    }

    class MyPanel extends Panel {
        private JButton inputBtn = new JButton("Input Name");
        private JTextField tf = new JTextField(10);
        private JButton confirmBtn = new JButton("confirm");
        private JButton messageBtn = new JButton("message");

        public MyPanel() {
            setBackground(Color.LIGHT_GRAY);
            add(inputBtn);
            add(confirmBtn);
            add(messageBtn);
            add(tf);

            inputBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String name = JOptionPane.showInputDialog("Type your name");
                    if (name != null) {
                        tf.setText(name);
                    }
                }
            });

            confirmBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int result = JOptionPane.showConfirmDialog(null, "Continue?", "confirm",
                            JOptionPane.YES_NO_OPTION);

                    if (result == JOptionPane.CLOSED_OPTION) {
                        tf.setText("Just Closed without Selectikon");
                    } else if (result == JOptionPane.YES_OPTION) {
                        tf.setText("Yes");
                    } else {
                        tf.setText("No");
                    }

                }
            });

            messageBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Watch out", "Message",
                            JOptionPane.ERROR_MESSAGE);
                }
            });
        }
    }

    public static void main(String[] args) {
        new OptionPaneEx();
    }

}

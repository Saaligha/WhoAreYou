import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Gui extends JFrame implements ActionListener
{
    //Labels
    private JLabel heading = new JLabel("View Date & Time");
    private JLabel name = new JLabel("What is your name");
    private JLabel age = new JLabel("How old are you");
    private JLabel yos = new JLabel("How long have you been studying for");
    //Text area
    private JTextArea display = new JTextArea(100,30);
    //Button
    private JButton save = new JButton("Save");
    //Textfields
    private JTextField nm = new JTextField();
    private JTextField a = new JTextField();
    private JTextField ys = new JTextField();
    //Panels
    private JPanel row1 = new JPanel();
    private JPanel row2 = new JPanel();
    private JPanel row3 = new JPanel();
    private JPanel row4 = new JPanel();
    private JPanel row5 = new JPanel();
    private JPanel row6 = new JPanel();

    public Gui()
    {
        super("WHO ARE YOU");

        setLayout(new GridLayout(6, 1));

        row1.setLayout(new FlowLayout());
        row2.setLayout(new GridLayout(1, 2));
        row3.setLayout(new GridLayout(1, 2));
        row4.setLayout(new GridLayout(1, 2));
        row5.setLayout(new FlowLayout());
        row6.setLayout(new FlowLayout());

        heading.setHorizontalAlignment(JLabel.CENTER);
        heading.setFont(new Font("Arial", Font.BOLD, 15));

        row1.add(heading);
        row2.add(name);
        row2.add(nm);
        row3.add(age);
        row3.add(a);
        row4.add(yos);
        row4.add(ys);
        row5.add(save);
        row6.add(display);
        add(row1);
        add(row2);
        add(row3);
        add(row4);
        add(row5);
        add(row6);

        save.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == save)
        {
            Person p1 = new Person(nm.getText(), Integer.parseInt(a.getText()), Integer.parseInt(a.getText()));

            display.append(p1.toString());
        }
    }
}





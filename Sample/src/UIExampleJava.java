
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import java.awt.*;

public class UIExampleJava extends JPanel{


    public UIExampleJava() {

        ImageIcon logoIcon = new ImageIcon("imaga icon location here");
        Font font = new Font("Serif", Font.BOLD, 24);
        Font labelFont = new Font("Georgia", Font.BOLD, 15);
        Font buttonFont = new Font("Merriweather", Font.BOLD, 12);

        JFrame frame = new JFrame("Account Example");
        frame.setLayout(null);
        frame.setSize(500, 400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        JLabel logInLabel = new JLabel("LOG-IN TO YOUR ACCOUNT");
        logInLabel.setBounds(75, 2, 400, 50);
        logInLabel.setForeground(Color.BLUE);
        logInLabel.setFont(font);

        JLabel iconLabel = new JLabel();
        iconLabel.setIcon(logoIcon);
        iconLabel.setBounds(220, 50, 50, 50);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(100, 130, 100, 12);
        usernameLabel.setForeground(Color.DARK_GRAY);
        usernameLabel.setFont(labelFont);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(100, 180, 100, 12);
        passwordLabel.setForeground(Color.DARK_GRAY);
        passwordLabel.setFont(labelFont);

        JLabel dateLabel = new JLabel("Date:");
        dateLabel.setBounds(100, 230, 100, 12);
        dateLabel.setForeground(Color.DARK_GRAY);
        dateLabel.setFont(labelFont);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(225, 125, 150, 20);
        usernameField.setForeground(Color.DARK_GRAY);
        usernameField.setFont(labelFont);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(225, 175, 150, 20);
        passwordField.setForeground(Color.DARK_GRAY);
        passwordField.setFont(labelFont);

        UtilDateModel model = new UtilDateModel();
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        JDatePickerImpl dateField = new JDatePickerImpl(datePanel);
        dateField.setBounds(225, 225, 150, 30);
        dateField.setForeground(Color.DARK_GRAY);
        dateField.setFont(labelFont);

        JButton logInButton = new JButton("Log In");
        logInButton.setBounds(150, 300, 100, 20);
        logInButton.setForeground(Color.DARK_GRAY);
        logInButton.setFont(buttonFont);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(250, 300, 100, 20);
        exitButton.setForeground(Color.DARK_GRAY);
        exitButton.setFont(buttonFont);

        frame.add(iconLabel);
        frame.add(logInLabel);
        frame.add(usernameLabel);
        frame.add(passwordLabel);
        frame.add(dateLabel);
        frame.add(usernameField);
        frame.add(passwordField);
        frame.add(dateField);
        frame.add(logInButton);
        frame.add(exitButton);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new UIExampleJava();
    }

}

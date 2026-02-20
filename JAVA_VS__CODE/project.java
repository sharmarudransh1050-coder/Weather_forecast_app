import javax.swing.*;
import java.awt.*;

public class project {
    public static void main(String[] args){
        JFrame frame = new JFrame("Weather app");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4,1));

        JLabel title = new JLabel("Weather Application",SwingConstants.CENTER);
        title.setFont(new Font("Arial",Font.BOLD,18));

        JTextField cityField = new JTextField();
        JButton button = new JButton("GET WEATHER");

        JLabel resultLabel = new JLabel("Enter the city and click the button",SwingConstants.CENTER);

        frame.add(title);
        frame.add(cityField);
        frame.add(button);
        frame.add(resultLabel);

        frame.setVisible(true);

    }
}


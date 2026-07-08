import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class HeadsTailsGUI extends JFrame {
    private JLabel resultLabel;
    private JButton flipButton;
    private Random random;

    public HeadsTailsGUI() {
        random = new Random();

        // Setup Window
        setTitle("Heads or Tails");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center on screen
        setLayout(new FlowLayout());

        // Components
        resultLabel = new JLabel("Press Flip to start!");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
        
        flipButton = new JButton("Flip Coin");
        
        // Action Listener
        flipButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int outcome = random.nextInt(2); // 0 or 1
                if (outcome == 0) {
                    resultLabel.setText("Result: Heads 🪙");
                    resultLabel.setForeground(Color.BLUE);
                } else {
                    resultLabel.setText("Result: Tails 🪙");
                    resultLabel.setForeground(Color.RED);
                }
            }
        });

        // Add to window
        add(resultLabel);
        add(flipButton);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        // Ensure GUI is created on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HeadsTailsGUI();
            }
        });
    }
}   
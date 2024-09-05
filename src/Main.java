import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // Create a JFrame window
        JFrame frame = new JFrame();
        GamePlay gamePlay = new GamePlay(); // Add gameplay panel to the frame

        frame.setBounds(10, 10, 700, 600); // Set window size
        frame.setTitle("Brick Breaker Game"); // Set title of the window
        frame.setResizable(false); // Don't allow resizing
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close on exit
        frame.add(gamePlay); // Add gameplay class to frame
        frame.setVisible(true); // Make it visible
    }
}


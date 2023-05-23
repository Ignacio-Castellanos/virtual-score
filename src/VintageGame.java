import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VintageGame extends JFrame {
    private JLabel scoreLabel;
    private int score;

    public VintageGame() {
        setTitle("Vintage Game");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        getContentPane().add(panel, BorderLayout.CENTER);

        scoreLabel = new JLabel("Score: 0");
        scoreLabel.setForeground(Color.WHITE);
        scoreLabel.setFont(new Font("Courier New", Font.BOLD, 20));
        panel.add(scoreLabel);

        JButton button = new JButton("Click Me!");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                increaseScore();
            }
        });
        panel.add(button);

        setVisible(true);
    }

    private void increaseScore() {
        score++;
        scoreLabel.setText("Score: " + score);
    }

    public static void main(String[] args) {
        new VintageGame();
    }
}

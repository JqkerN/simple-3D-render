package squarebord;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;


public class Viewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame("A* path planing");
        Container pane = frame.getContentPane();
        pane.setLayout(new BorderLayout());


        // panel to display render results
        JPanel renderPanel = new JPanel() {
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(Color.BLACK);
                g2.fillRect(0, 0, getWidth(), getHeight());

                // rendering the board
                Board board = new Board(getWidth(), getHeight(), 20, 20);
                board.board[10][10].color = Color.white;

                for (Square[] squares : board.board) {
                    for (Square s : squares) {

                        Path2D path = new Path2D.Double();
                        path.moveTo(s.c1.x, s.c1.y);
                        path.lineTo(s.c2.x, s.c2.y);
                        path.lineTo(s.c3.x, s.c3.y);
                        path.lineTo(s.c4.x, s.c4.y);
                        path.closePath();

                        // fill cell
                        g2.setColor(s.color);
                        g2.fill(path);
                        // outline cell
                        g2.setColor(Color.WHITE);
                        g2.draw(path);
                    }

                }
            }
        };
        pane.add(renderPanel, BorderLayout.CENTER);

        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}

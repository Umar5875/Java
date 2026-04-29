import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// PART 1: THE RENDERING CANVAS & EVENT LISTENER
class HouseCanvas extends JPanel {

private Color doorColor = Color.BLUE;

// Door Geometry Constants
private final int DOOR_X = 170;
private final int DOOR_Y = 200;
private final int DOOR_W = 60;
private final int DOOR_H = 100;

public HouseCanvas() {
// Registering the Event Listener
addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
int clickX = e.getX();
int clickY = e.getY();

// CORE LOGIC: Mathematical Hit Detection
// Check if the click falls within the rectangular bounds
//of the door
if (clickX >= DOOR_X && clickX <= (DOOR_X + DOOR_W) &&
clickY >= DOOR_Y && clickY <= (DOOR_Y + DOOR_H)) {

// Mutate the state
if (doorColor == Color.BLUE) {
doorColor = Color.RED;
} else {
doorColor = Color.BLUE;
 }

// Force the JVM to re-render the canvas with the new
//state
repaint ();
}
}
});
}

@Override
protected void paintComponent(Graphics g) {
// Parent call to flush the previous frame
super.paintComponent(g);
// Downcast to Graphics2D for modern rendering capabilities
Graphics2D g2d = (Graphics2D) g;

// Anti-aliasing to smooth geometric edges
g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
RenderingHints.VALUE_ANTIALIAS_ON);

// 1. Draw House Base
g2d.setColor(Color.LIGHT_GRAY);
g2d.fillRect(100, 150, 250, 150);
g2d.setColor(Color.BLACK);
g2d.drawRect(100, 150, 250, 150);

// 2. Draw Roof (Polygon)
g2d.setColor(Color.DARK_GRAY);
g2d.fillRect(80, 80, 240, 70); 
g2d.setColor(Color.BLACK);
g2d.drawRect(80, 80, 240, 70);

// 3. Draw Door (Using the dynamic state variable)
g2d.setColor(doorColor);
g2d.fillRect(DOOR_X, DOOR_Y, DOOR_W, DOOR_H);
g2d.setColor(Color.BLACK);
g2d.drawRect(DOOR_X, DOOR_Y, DOOR_W, DOOR_H);
}
}

// PART 2: THE MAIN WINDOW FRAME
public class HouseGraphicsDemo extends JFrame {
public HouseGraphicsDemo() {
setTitle("Experiment 18: Graphics Event Handling");
setSize(400, 400);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null); // Center on screen

// Embed the custom canvas into the frame
add(new HouseCanvas());
}

public static void main(String[] args) {
// Architectural mandate: GUI initialization must occur on the
//Event Dispatch Thread
SwingUtilities.invokeLater(() -> {
new HouseGraphicsDemo().setVisible(true);
});
 }
}

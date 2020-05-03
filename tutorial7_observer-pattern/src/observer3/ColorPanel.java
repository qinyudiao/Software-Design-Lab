package observer3;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class ColorPanel extends JPanel {
    private Color color;
    protected float hue, saturation, brightness;

    public ColorPanel(float hue, float saturation, float brightness) {
       	this.hue = hue;
    	this.saturation = saturation;
    	this.brightness = brightness;
    	this.color = Color.getHSBColor(hue, saturation, brightness);
    }

    public void setColor(float hue, float saturation, float brightness) {
       	this.hue = hue;
    	this.saturation = saturation;
    	this.brightness = brightness;
    	this.color = Color.getHSBColor(hue, saturation, brightness);
        repaint();
    }
    
    public Color getColor() {
        return this.color;
    }

    protected void paintComponent(Graphics g) {
        this.setBackground(color);
        super.paintComponent(g);
    }
    
    public float[] getHSB() {
    	return new float[] {hue, saturation, brightness};
    }
}
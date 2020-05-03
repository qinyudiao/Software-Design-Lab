package observer3;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

@SuppressWarnings("serial")
public class ComplementaryColorPanel extends ColorPanel implements PropertyChangeListener {
    public ComplementaryColorPanel(float hue, float saturation, float brightness) {
        super(hue, saturation, brightness);
        DisplayColors.originalColorPanel.addPropertyChangeListener(this);
    }

    public void propertyChange(PropertyChangeEvent evt) {
		float[] hsb  = DisplayColors.originalColorPanel.getHSB();
		float newHue = hsb[0] - (float) .5;
        if (newHue < 0){
            newHue += 1;
        }
//        System.out.print(hsb[0]);
//        System.out.print(" " + hsb[1]);
//        System.out.println(" " + hsb[2]);
	    this.setColor(newHue, hsb[1], hsb[2]);
    }
}

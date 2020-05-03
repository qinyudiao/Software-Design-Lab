package observer3;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class OriginalColorPanel extends ColorPanel implements ChangeListener {
    public OriginalColorPanel(float hue, float saturation, float brightness) {
        super(hue, saturation, brightness);
        DisplayColors.hueSlider.addChangeListener(this);
        DisplayColors.saturationSlider.addChangeListener(this);
        DisplayColors.brightnessSlider.addChangeListener(this);
    }

    public void stateChanged(ChangeEvent e) {
        if (DisplayColors.hueSlider != null && DisplayColors.saturationSlider != null && DisplayColors.brightnessSlider != null) {
            float newHue = (float) DisplayColors.hueSlider.getValue() / 100;
            float newSaturation = (float) DisplayColors.saturationSlider.getValue() / 100;
            float newBrightness = (float) DisplayColors.brightnessSlider.getValue() / 100;
            this.setColor(newHue, newSaturation, newBrightness);
        }
    }

}

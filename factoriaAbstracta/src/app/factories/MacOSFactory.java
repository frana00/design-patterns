package app.factories;

import app.buttons.Button;
import app.buttons.MacOSButton;
import app.checkboxes.Checkbox;
import app.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
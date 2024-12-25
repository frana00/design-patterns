package app.factories;

import app.buttons.Button;
import app.buttons.WindowsButton;
import app.checkboxes.Checkbox;
import app.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
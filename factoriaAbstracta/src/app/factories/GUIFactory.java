package app.factories;

import app.buttons.Button;
import app.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
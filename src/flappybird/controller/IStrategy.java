package flappybird.controller;

import flappybird.model.Bird;
import java.awt.event.KeyEvent;

public interface IStrategy {

    void controller(Bird bird, KeyEvent kevent);
    void controllerReleased(Bird bird, KeyEvent kevent);
}

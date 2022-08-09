package exception;

import java.awt.*;
import java.io.IOException;

public class ThrowsDemo {
    public void dosome() throws IOException, AWTException{}
}

class SubClass extends ThrowsDemo{
    public void dosome(){}

}
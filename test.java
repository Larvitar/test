import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * Created by Zura on 2017-04-28.
 */

public class test{
    public static void main(String[] args){
        TalkingClock clock = new TalkingClock();
        clock.start(2000, true);

        // Niech program działa dopóki użytkownik nie wciśnie przycisku OK
        JOptionPane.showMessageDialog(null, "Zamknąć program?");
        System.exit(0);
    }
}

class TalkingClock{
    public void start(int interval, boolean beep){
        Timer t = new Timer(interval, event -> {
            System.out.println("Kiedy usłyszysz dźwięk, będzie godzina " + new Date());
            if (beep) Toolkit.getDefaultToolkit().beep();
        });
        t.start();
    }
}
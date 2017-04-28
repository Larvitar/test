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
        TalkingClock clock = new TalkingClock(10000, true);
        clock.start();

        // Niech program działa dopóki użytkownik nie wciśnie przycisku OK
        JOptionPane.showMessageDialog(null, "Zamknąć program?");
        System.exit(0);
    }
}

class TalkingClock{
    private int interval;
    private boolean beep;

    /**
     *
     * @param interval odstęp czasu pomiędzy kolejnymi komunikatami (w milisekundach)
     * @param beep wartość truee oznacza, że dźwięk ma być odtwarzany
     */

    public TalkingClock(int interval, boolean beep){
        this.interval = interval;
        this.beep = beep;
    }


    /**
     * Włączanie zegara
     */

    public void start(){
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }

    public class TimePrinter implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("Kiedy usłyszysz dźwięk, będzie godzina " + new Date() );
            if(beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}
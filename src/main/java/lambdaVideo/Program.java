package lambdaVideo;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program {

    public static void fire() {
        System.out.println("Fire!!!" );
    }

    public static void main(String[] args) {

        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        String message = "Пожар";

        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);

        sw.addElectricityListener(
                new ElectricityConsumer() {
                    public void electricityOn() {
                        System.out.println(message);
                        System.out.println("!!!");
                    }
                }
        );

        sw.addElectricityListener( () -> System.out.println("Fire"));
       // sw.addElectricityListener((Object s) -> Program.fire(s));
        sw.addElectricityListener(Program::fire);


        sw.switchon();


        JButton button = new JButton();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}

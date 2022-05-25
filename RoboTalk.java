import com.sun.tools.javac.Main;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.desktop.ScreenSleepEvent;
import java.util.Objects;
import java.util.Scanner;



public class RoboTalk {


    public String name;
    public  String robotname;


    public void menu() {

        System.out.println("1: Settings");
        System.out.println("2. Take a webcam screenshot");
        System.out.println("3. Get weather");
        System.out.println("4. Get screenshot");


    }


    public void screenshot() {

        System.out.println("Taking screenshot right now " + robotname);
    }

    public void playmusic() {

        System.out.println("Playing music!");
    }


    public void Settings() {


        Scanner input = new Scanner(System.in);
        System.out.println("Please introduce yourself by entering your name?");
        name = input.next();
        System.out.println("What would you like to call  me as ?");

        String robotname = input.next();
        System.out.println(" Welcome to Robotalk I am  your personal assistant " + robotname + " the number one chat buddy for loners like you!" + name);
        System.out.println("You can customize your name and mine by using settings See you around Loser");


    }

    public void RoboTalk() {

        System.out.println("Hello " + name );
    }

    public void weather() {

        if (Objects.equals(name, null)) {
            greet();
        } else {
            System.out.println("  Let me fetch the weather right away " + name);
        }


    }


    public static void main(String[] args) {


        int choice;


        RoboTalk Robotalk = new RoboTalk();
        Robotalk.menu();


        Scanner input = new Scanner(System.in);
        Robotalk.greet();

        while (true) {

            System.out.println("Please Enter a choice >");

            choice = input.nextInt();


            if (Objects.equals(choice, 1)) {
                Robotalk.Settings();
                Robotalk.RoboTalk();


            } else if (Objects.equals(choice, 2)) {
                Robotalk.screenshot();

            } else if (Objects.equals(choice, 3)) {
                Robotalk.weather();

            } else if (Objects.equals(choice, 4)) {
                Robotalk.screenshot();

            }else{
                System.out.println("Exiting program");
                System.exit(0);
            }


        }

    }
}

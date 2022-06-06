import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import LWJGL.jar.*;
import Window.Magi_Authentication;
import Window.Trmagi;


public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Operation Log");

        //启动MAGI初始化 并log
        logger.log(Level.INFO,"Operation: MAGI initialization start");
        //System.out.println("MAGI Initialization");

        //初始化并显示窗口
        logger.log(Level.INFO,"Operation: Window create and display");

        //Trmagi magi = new Trmagi();
        //magi.Magi_show();

        logger.log(Level.INFO,"Operation: Start Authentication");
        Magi_Authentication MA = new Magi_Authentication();
        MA.Authenticate_start();



    }
}
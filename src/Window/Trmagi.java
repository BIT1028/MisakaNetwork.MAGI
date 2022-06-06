package Window;

import javax.swing.*;

public class Trmagi extends JFrame{

    public void Magi_init() {
        this.setTitle("MAGI最终决策系统");
        this.setSize(1120,630);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public static void ChangeMAGI () {
        JPasswordField passwordField1;
        JPanel Magi_Authentication;
    }


    public static void Magi_show () {
        Trmagi magi = new Trmagi();
        magi.Magi_init();


        }
}


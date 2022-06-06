package Window;

import javax.swing.*;

public class Magi_Authentication {
    private JPanel 最终身份验证;
    private JPasswordField Passwd;

    public static void Authenticate_start() {
        JFrame frame = new JFrame("最终身份验证");
        frame.setContentPane((new Magi_Authentication()).最终身份验证);
        frame.setDefaultCloseOperation(3);
        frame.pack();
        frame.setVisible(true);
    }
}


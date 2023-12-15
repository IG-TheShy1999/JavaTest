package Game.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    public GameJFrame() {
        initJFrame();

        setJMenuBar();


        this.setVisible(true);
    }

    private void initJFrame() {
        this.setSize(600, 800);
        this.setTitle("Apex Legends");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void setJMenuBar() {
        //        初始化菜单
        JMenuBar jMenuBar = new JMenuBar();

//       jMenu
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
//         jMenuItem
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");
        JMenuItem accountItem = new JMenuItem("公众号");

        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        this.setJMenuBar(jMenuBar);
    }
}

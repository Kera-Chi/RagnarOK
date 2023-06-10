package Game;

import javax.swing.*;

public class Game {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("簡單小遊戲");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            ImageIcon image = new ImageIcon("/Users/kera/Desktop/download.png"); // 替換成您的圖片檔案路徑

            boolean knowsName = false;
            boolean answeredCorrectly = false;

            while (!knowsName) {
                int choice = JOptionPane.showConfirmDialog(frame, "你知道我是誰嗎？", "問題", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, image);

                if (choice == JOptionPane.YES_OPTION) {
                    knowsName = true;
                } else {
                    JOptionPane.showMessageDialog(frame, "你竟然不知道？", "回答錯誤", JOptionPane.WARNING_MESSAGE);
                }
            }

            while (!answeredCorrectly) {
                String name = JOptionPane.showInputDialog(frame, "請輸入我的名字：", null, JOptionPane.QUESTION_MESSAGE);

                if (name != null && name.equals("//")) {
                    JOptionPane.showMessageDialog(frame, "答對了！恭喜你！", "正確", JOptionPane.INFORMATION_MESSAGE, image);
                    answeredCorrectly = true;
                } else {
                    JOptionPane.showMessageDialog(frame, "答錯了！", "錯誤", JOptionPane.WARNING_MESSAGE);
                }
            }

            frame.dispose();
        });
    }
}

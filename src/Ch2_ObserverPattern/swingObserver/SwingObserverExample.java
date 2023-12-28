package Ch2_ObserverPattern.swingObserver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

public class SwingObserverExample {

    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go(){
        frame = new JFrame();

        JButton button = new JButton("할까? 말까?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());

        //람다 표현식 사용 = 함수 객체를 만들어서 옵저버로 사용 (ActionListener 구현체 안 만들어도됨)
//        button.addActionListener(e -> System.out.println("뭘 하든~ 다 잘 될거야!!!"));
//        button.addActionListener(e -> System.out.println("그냥 저질러 버렷!"));

        //프레임 속성 설정
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    class AngelListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("뭘 하든~ 다 잘 될거야!!!");
        }
    }

    class DevilListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("그냥 저질러 버렷!");
        }
    }
}

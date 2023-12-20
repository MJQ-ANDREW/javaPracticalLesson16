package mirea.javaLessons.practical16;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main {
    public static void main(String[] args) {
        //new App();
        //new Test();
        //new punkt3();
    }

    static class punkt3 extends JFrame {
        punkt3() {

            super("app");
            setSize(600, 600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(null);
            String info = "Name:" + "<br>" +
                    "Phone:" + "<br>";
            
            JRadioButton blue = new JRadioButton("Синий");
            blue.setBounds(110, 20, 80, 20);
            blue.setForeground(Color.BLUE);
            add(blue);
            JRadioButton red = new JRadioButton("Красный");
            red.setBounds(200, 20, 80, 20);

            red.setForeground(Color.RED);
            add(red);
            JRadioButton black = new JRadioButton("Чёрный");
            black.setBounds(290, 20, 80, 20);

            black.setForeground(Color.BLACK);
            add(black);
            ButtonGroup bg = new ButtonGroup();
            bg.add(blue);
            bg.add(red);
            bg.add(black);
            JRadioButton times = new JRadioButton("TimesNewRoman");
            times.setBounds(30, 60, 150, 20);
            times.setFont(new Font("TimesNewRoman", Font.PLAIN, 14));
            add(times);
            JRadioButton cn = new JRadioButton("Broadway");
            cn.setBounds(200, 60, 120, 20);
            cn.setFont(new Font("Broadway", Font.PLAIN, 14));
            add(cn);
            JRadioButton cg = new JRadioButton("Courier New");
            cg.setBounds(350, 60, 120, 20);
            cg.setFont(new Font("Courier New", Font.PLAIN, 14));
            add(cg);
            ButtonGroup bg2 = new ButtonGroup();
            bg2.add(times);
            bg2.add(cn);
            bg2.add(cg);

            setLayout(new FlowLayout());
            JTextArea textArea = new JTextArea("     ");

            textArea.setFont(new Font(Font.DIALOG, Font.PLAIN, 20));
            add(textArea);

            cg.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textArea.setFont(cg.getFont());
                }
            });
            cn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textArea.setFont(cn.getFont());
                }
            });
            times.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textArea.setFont(times.getFont());
                }
            });





            red.addActionListener((new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textArea.setForeground(Color.RED);
                }
            }));
            blue.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textArea.setForeground(Color.BLUE);
                }
            });
            black.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textArea.setForeground(Color.BLACK);
                }
            });



            setVisible(true);
        }
    }

    public static class App extends JFrame {
        JFrame jf = new JFrame("TEST");
        JTextField sample = new JTextField();
        int attempt = 0;
        int rndm = 1+(int)(Math.random()*20);
        boolean win = false;


        App() {


            jf.setSize(400, 300);
            jf.setDefaultCloseOperation(EXIT_ON_CLOSE);

            jf.setLayout(new GridLayout(2, 3));


            sample.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    System.out.println("Дебаг ответа " + rndm);
                    System.out.println("Попытка номер: " + ++attempt);
                    if(Integer.parseInt(sample.getText()) < rndm){
                        JOptionPane.showMessageDialog(App.this,
                                "Ваше число меньше заданного"); }
                    if(Integer.parseInt(sample.getText()) > rndm){
                        JOptionPane.showMessageDialog(App.this,
                                "Ваше число больше заданного"); }
                    if(Integer.parseInt(sample.getText()) == rndm){
                        win = true;
                        JOptionPane.showMessageDialog(App.this,
                                "УРА! ЭТО ОНО!"); }
                    if (win || attempt == 3) {
                        attempt = 0;
                        rndm = 1 + (int) (Math.random() * 20);
                        if (win)
                            JOptionPane.showMessageDialog(App.this,
                                    "Победа! Игра начинается заново");
                        else
                            JOptionPane.showMessageDialog(App.this,
                                    "Потрачено три попытки! Игра начинается заново");
                        win = false;
                    }
                }
            });

            jf.add(sample);
            jf.setVisible(true);
            JOptionPane.showMessageDialog(null,
                    "Игра началась, введите число от 1 до 21");
        }
    }
    public static class Test extends JFrame {
        boolean flag = true;
        Test() {
            super("app");
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            setSize(600, 600);

            Container container = getContentPane();
            JLabel often = new JLabel("NORTH");
            often.setHorizontalAlignment(JLabel.CENTER);
            often.setBorder(BorderFactory.createLineBorder(Color.RED));

            often.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    JOptionPane.showMessageDialog(often, "Добро пожаловать в NORTH");
                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
            JLabel west = new JLabel("WEST");
            west.setHorizontalAlignment(JLabel.CENTER);
            west.setBorder(BorderFactory.createLineBorder(Color.RED));
            west.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    JOptionPane.showMessageDialog(west, "Добро пожаловать в WEST");
                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
            JLabel centr = new JLabel("CENTER");
            centr.setHorizontalAlignment(JLabel.CENTER);
            centr.setBorder(BorderFactory.createLineBorder(Color.RED));
            centr.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    JOptionPane.showMessageDialog(centr, "Добро пожаловать в CENTR");
                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
            JLabel east = new JLabel("EAST");
            east.setHorizontalAlignment(JLabel.CENTER);
            east.setBorder(BorderFactory.createLineBorder(Color.RED));
            east.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    JOptionPane.showMessageDialog(east, "Добро пожаловать в EAST");
                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });
            JLabel south = new JLabel("SOUTH");
            south.setHorizontalAlignment(JLabel.CENTER);
            south.setBorder(BorderFactory.createLineBorder(Color.RED));
            south.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {


                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    JOptionPane.showMessageDialog(south, "Добро пожаловать в SOUTH");
                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });

            container.add(often, BorderLayout.NORTH);
            container.add(centr, BorderLayout.CENTER);
            container.add(west, BorderLayout.WEST);
            container.add(east, BorderLayout.EAST);
            container.add(south, BorderLayout.SOUTH);
            setVisible(true);
        }
    }
}

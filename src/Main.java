import java.awt.*;
import java.awt.event.*;
import java.nio.channels.spi.AbstractSelectionKey;
import java.util.TimerTask;
import javax.swing.*;



class newuser {
    String passs="not";
    public Font font = new Font("Manhattan", Font.BOLD, 20);
    public Font font1 = new Font("Manhattan", Font.BOLD, 15);


    newuser() {
        String pad = "";
        int x = 55;
        for (int i = 0; i < x; i++) pad += " ";
        JFrame newpage = new JFrame(pad + "NEW USER");
        newpage.setSize(500, 600);
        newpage.setVisible(true);
        newpage.setLayout(null);

        //head
        int p=25;
        String k = new String("");
        for (int i = 0; i < p; i++) k += " ";
    Label label1 = new Label(k+"REGISTRATION FORM", JLabel.CENTER);
        label1.setBounds(0, 0, 500, 100);
        label1.setFont(font);
        label1.setBackground(Color.black);
        label1.setForeground(Color.WHITE);
        newpage.add(label1);



        JLabel labelk = new JLabel("FIRST NAME : ");
          labelk.setFont(font1);
        labelk.setBounds(20, 110, 120, 100);
        newpage.add(labelk);

        //inputfeild
        JTextField textField = new JTextField("");
        textField.setBounds(150, 145, 300, 30);
        textField.setText("ENTER YOUR FIRST NAME");
        textField.setFont(font1);
        newpage.add(textField);
        //textField.setEditable(false);
        textField.setForeground(Color.gray);
        //textField.setDisabledTextColor(Color.WHITE);0
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // super.keyPressed(e);
                if (textField.getText().equals("ENTER YOUR FIRST NAME")) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                    textField.setEditable(true);
                }
            }


        });





        JLabel label2 = new JLabel("LASTNAME : ", JLabel.CENTER);
        label2.setFont(font1);
        label2.setBounds(20, 160, 120, 100);
        newpage.add(label2);

        //inputfeild
        JTextField textField2 = new JTextField("");

        textField2.setBounds(150, 195, 300, 30);
        textField2.setText("ENTER YOUR LAST NAME");
        textField2.setFont(font1);
        newpage.add(textField2);
        //textField.setEditable(false);
        textField2.setForeground(Color.gray);
        //textField.setDisabledTextColor(Color.WHITE);0


        //label for confirmpassword
        JLabel PASSWORD = new JLabel("PASSWORD : ", JLabel.CENTER);
        PASSWORD.setFont(font1);
        PASSWORD.setBounds(20, 220, 120, 100);
        newpage.add(PASSWORD);


        //its feild for password
        JPasswordField jp= new JPasswordField();
        jp.setBounds(150,250,200,30);
        newpage.add(jp);
        passs=jp.getText();
      System.out.println(passs);
        //label for confirmpassword
        JLabel PASSWORD1 = new JLabel("CONFIRM PASSWORD : ", JLabel.CENTER);
        PASSWORD1.setFont(font1);
        PASSWORD1.setBounds(20, 260, 180, 100);
        newpage.add(PASSWORD1);

        //its feild for password
        JPasswordField jp1= new JPasswordField();
        jp1.setBounds(200,300,200,30);
        newpage.add(jp1);



       // BUTTONS
        JButton b1= new JButton("SUBMIT");
        b1.setBounds(40,500,150,30);
        b1.setBackground(Color.ORANGE);
        b1.setForeground(Color.darkGray);
        newpage.add(b1);

        JButton b2= new JButton("RESET");
        b2.setBounds(250,500,150,30);
        b2.setBackground(Color.ORANGE);
        b2.setForeground(Color.darkGray);
        newpage.add(b2);




        String pass1= String.valueOf(jp.getPassword());
        String pass2= String.valueOf(jp1.getPassword());
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if(textField.getText().isBlank()==true||textField2.getText().isBlank()==true) {
                    JOptionPane.showMessageDialog(newpage,"PLEASE FILL ALL THE REQUIRED SECTION");
                }

                else if(pass1!=""||pass2!=""){
                   int b= JOptionPane.showConfirmDialog(newpage,"DO YOU CONFIRM YOUR PASSWORD?");

                    if(b==JOptionPane.YES_OPTION){
                        if(!(pass1.equals(pass2))){
                            JOptionPane.showMessageDialog(newpage,"PASSWORDS DOSEN'T MATCH");
                        }
                        else {
                            new secondframe();
                            newpage.dispose();
                        }
                    }

                }
                else{
                    JOptionPane.showMessageDialog(newpage,"PLEASE CHECK YOUR PASSWORD ONCE BEFORE CONFIRMING");
                }


//
            }
        });

        textField2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // super.keyPressed(e);
                if (textField2.getText().equals("ENTER YOUR LAST NAME")) {
                    textField2.setText("");
                    textField2.setForeground(Color.BLACK);
                    textField2.setEditable(true);
                }
            }


        });


        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                textField2.setText("");
                jp.setText("");
                jp1.setText("");
            }
        });

//        javax.swing.Timer timer = new Timer(1000, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                textField.setText("");
//                textField2.setText("");
//
//            }
//        });

        new java.util.Timer().schedule(new java.util.TimerTask() {
            @Override
            public void run() {
                textField.setText("");
                textField2.setText("");
            }
        },3000);




//
//        b1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if(textField.getText()==null)
//                {    label1.setText("WRONG INPUT");
//                    label1.setBackground(Color.red);
//                    label1.setForeground(Color.WHITE);
//                }
//            }
//        });


        newpage.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // super.windowClosing(e);
                //JFrame frame = (JFrame)e.getSource();
                int a = JOptionPane.showConfirmDialog(newpage, "Are you sure?");
                if (a == JOptionPane.YES_OPTION) {
                    newpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else if (a == JOptionPane.NO_OPTION) {
                    newpage.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });
    }

}

class submitpage {
    submitpage() {
        String pad = "";
        int x = 40;
        for (int i = 0; i < x; i++) pad += " ";
        JFrame submittable = new JFrame(pad + "SUBMIT PAGE");
        submittable.setSize(400, 600);
        submittable.setVisible(true);
        submittable.setLayout(null);

        JLabel label = new JLabel("succesffuly loginned", JLabel.CENTER);
        label.setBounds(20, 20, 100, 100);
        submittable.add(label);


    }
}

class secondframe {
    public Font font = new Font("Manhattan", Font.BOLD, 15);

    secondframe() {
        String pad = "";
        int x = 35;
        for (int i = 0; i < x; i++) pad += " ";

        JFrame frame2 = new JFrame(pad + "OLD USER");
        frame2.setSize(400, 350);
        frame2.setVisible(true);
        frame2.setLayout(null);

        //label
        Label label = new Label("USER ID : ", JLabel.CENTER);
        label.setFont(font);
        label.setBounds(20, 10, 100, 100);
        frame2.add(label);

        //inputfeild
        JTextField textField = new JTextField("");
        textField.setFont(font);
        textField.setBounds(120, 45, 200, 30);
        textField.setText("ENTER YOUR USER ID");
        frame2.add(textField);
        //textField.setEditable(false);
        textField.setForeground(Color.gray);
        //textField.setDisabledTextColor(Color.WHITE);0
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // super.keyPressed(e);
                if (textField.getText().equals("ENTER YOUR USER ID")) {
                    textField.setText("");
                    textField.setForeground(Color.BLACK);
                    textField.setEditable(true);
                }
//                else if(textField.getText().equals("")){
//                    textField.setText("ENTER YOUR NAME");
//                    //textField.setEditable(false);
//                    textField.setForeground(Color.gray);
//                }
            }
        });


//label
        Label label2 = new Label("PASSWORD : ", JLabel.CENTER);
        label2.setFont(font);
        label2.setBounds(20, 100, 100, 70);
        frame2.add(label2);


        //passwordfeild
        JPasswordField PASSWORD = new JPasswordField("");
        //PASSWORD.setVisible(true);
        PASSWORD.setBounds(140, 115, 200, 30);
        frame2.add(PASSWORD);

        //buttons
        JButton b1 = new JButton(" SUBMIT");
        b1.setBounds(40, 205, 120, 30);
        b1.setBackground(Color.orange);
        frame2.add(b1);


        JButton b2 = new JButton("BACK");
        b2.setBackground(Color.pink);
        b2.setBounds(200, 205, 120, 30);
        frame2.add(b2);

        //buttons logic
        char[] input = PASSWORD.getPassword();
        b1.addActionListener(new ActionListener() {
                                 public void actionPerformed(ActionEvent e) {
                                     if ((textField.getText() == "") && (input.length == 0)) {
                                         b1.setEnabled(false);
                                         b1.setForeground(Color.gray);
                                         b1.setBackground(Color.darkGray);
                                     } else {
                                         b1.setEnabled(true);
                                         new submitpage();
                                     }
                                 }
                             }
        );

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Main();
            }
        });

        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

public class Main {

    public JFrame frame;
    public Font font = new Font("Manhattan", Font.BOLD, 20);

    Main() {

        String pad = "";
        int x = 40;
        for (int i = 0; i < x; i++) pad += " ";
        // initialise the frame
        frame = new JFrame(pad + "BANK");
        frame.setSize(400, 600);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setBackground(Color.lightGray);
        // label
        Label label = new Label("WELCOME TO THE BANK", JLabel.CENTER);
        label.setFont(font);
        label.setBounds(50, 10, 400, 100);
        frame.add(label);

        //label
        Label label1 = new Label("WHICH USER YOU ARE?", JLabel.CENTER);
        label1.setFont(font);
        label1.setBounds(70, 170, 400, 100);
        frame.add(label1);

        //button 1
        JButton button = new JButton("NEW USER");
        button.setBounds(30, 300, 120, 30);
        button.setBackground(Color.orange);
        frame.add(button);

        // button 2
        JButton button1 = new JButton("OLD USER");
        button1.setBounds(210, 300, 120, 30);
        button1.setBackground(Color.gray);
        frame.add(button1);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.setRootFrame(frame);
            }
        });
        //for termination
        // frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new secondframe();
                frame.dispose();
            }
        });

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new newuser();
            }
        });
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // super.windowClosing(e);
                //JFrame frame = (JFrame)e.getSource();
                int a = JOptionPane.showConfirmDialog(frame, "Are you sure?");
                if (a == JOptionPane.YES_OPTION) {
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else if (a == JOptionPane.NO_OPTION) {
                    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }

        });


    }

    public static void main(String[] args) {
        new Main();
    }
}

package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;


public class CalculatorInterface {

    private JButton buttonNumber1;
    private JButton buttonNumber2;
    private JButton buttonNumber3;
    private JButton buttonNumber4;
    private JButton buttonNumber5;
    private JButton buttonNumber6;
    private JButton buttonNumber7;
    private JButton buttonNumber8;
    private JButton buttonNumber9;
    private JButton buttonNumber0;

    private JButton buttonAdd;
    private JButton buttonSubstract;
    private JButton buttonMultiplicate;
    private JButton buttonCalculate;
    private JButton buttonReset;
    private JButton buttonDivide;

    private JButton buttonLeftParenthesis;
    private JButton buttonRightParenthesis;
    private JButton buttonComma;

    public JPanel panelMain;
    private JPanel panelResult;

    private JLabel resultLabel;

    public CalculatorInterface() throws MalformedURLException {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //frame.pack();
        frame.setBounds(0,0,screenSize.width * 15/100, screenSize.height * 23/100);

        URL url = ClassLoader.getSystemResource("views/Img/calculator.png");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.createImage(url);
        frame.setIconImage(img);

        frame.setVisible(true);
        resultLabel.setText("Let's do some Maths");
    }

    public String getButtonValue(String pButton){
        return pButton;
    }

    public void addCalculatorListeners(
            ActionListener button0Listener,
            ActionListener button1Listener,
            ActionListener button2Listener,
            ActionListener button3Listener,
            ActionListener button4Listener,
            ActionListener button5Listener,
            ActionListener button6Listener,
            ActionListener button7Listener,
            ActionListener button8Listener,
            ActionListener button9Listener,
            ActionListener buttonAddListener,
            ActionListener buttonSubstractListener,
            ActionListener buttonMultiplicateListener,
            ActionListener buttonDivideListener,
            ActionListener buttonCalculateListener,
            ActionListener buttonResetListener,
            ActionListener buttonLeftParenthesisListener,
            ActionListener buttonRightParenthesisListener,
            ActionListener buttonCommaListener
    ){
        buttonNumber0.addActionListener(button0Listener);
        buttonNumber1.addActionListener(button1Listener);
        buttonNumber2.addActionListener(button2Listener);
        buttonNumber3.addActionListener(button3Listener);
        buttonNumber4.addActionListener(button4Listener);
        buttonNumber5.addActionListener(button5Listener);
        buttonNumber6.addActionListener(button6Listener);
        buttonNumber7.addActionListener(button7Listener);
        buttonNumber8.addActionListener(button8Listener);
        buttonNumber9.addActionListener(button9Listener);
        buttonAdd.addActionListener(buttonAddListener);
        buttonSubstract.addActionListener(buttonSubstractListener);
        buttonMultiplicate.addActionListener(buttonMultiplicateListener);
        buttonDivide.addActionListener(buttonDivideListener);
        buttonCalculate.addActionListener(buttonCalculateListener);
        buttonReset.addActionListener(buttonResetListener);
        buttonLeftParenthesis.addActionListener(buttonLeftParenthesisListener);
        buttonRightParenthesis.addActionListener(buttonRightParenthesisListener);
        buttonComma.addActionListener(buttonCommaListener);
    }

    public void setOperationsLabel(String operations){
        resultLabel.setText(operations);
    }
}

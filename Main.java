import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
 JPanel mainPanel;
 JLabel firstNumber;
 JLabel secondNumber;
 JLabel result;

 JTextField firstNumberInput;
 JTextField secondNumberInput;
 JTextField resultInput; 

 JButton addButton;
 JButton subButton;
 JButton multButton;
 JButton divButton;
 
 JTextArea outputArea;
  // Method to assemble our GUI
  public void run(){
   // Creats a JFrame that is 800 pixels by 600 pixels and closes when you click on the X
   JFrame frame = new JFrame("Title");
   // Makes the X button close the program
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // makes the windows 800 pixel wide by 600 pixels tall
   frame.setSize(800,600);
   // shows the window
   frame.setVisible(true);
   // initialize the main JPanel
   mainPanel = new JPanel();
   // turn on the manual layouts
   mainPanel.setLayout(null);
   // add the panel to the JFrame to see it
   frame.add(mainPanel);
 
   // create the Labels that let the user know what to enter
   firstNumber = new JLabel("First Number");
   secondNumber = new JLabel("Second Number");
   result = new JLabel("Result");

   // set the location and size of the labels
   firstNumber.setBounds(10, 10, 150, 20);
   secondNumber.setBounds(10, 40, 175, 20);
   result.setBounds(10, 70, 150, 20);


   // add the labels to the mainPanel so we can see it
   mainPanel.add(firstNumber);
   mainPanel.add(secondNumber);
   mainPanel.add(result);

   // initialize the JTextFields
   firstNumberInput = new JTextField();
   secondNumberInput = new JTextField();

   // set the location and size of the input fields
   firstNumberInput.setBounds(200, 10, 100, 20);
   secondNumberInput.setBounds(200, 40, 100, 20);
  
   // add the inputs to the main panel
   mainPanel.add(firstNumberInput);
   mainPanel.add(secondNumberInput);

   // initialize the JButtons
   outputArea = new JTextArea();
   // set the location and size of the buttons
   outputArea.setBounds(200, 70, 100, 20);
   // disable the textAreas so that the user can't type in them
   outputArea.setEnabled(false);
   // add to main panel
   mainPanel.add(outputArea);

   // initialize buttons 
   addButton = new JButton("Add"); 
   subButton = new JButton("Sub");
   multButton = new JButton("Mult");
   divButton = new JButton("Div");
   // set the location and size of the buttons
   addButton.setBounds(10, 125, 75, 35);
   subButton.setBounds(110, 125, 75, 35);
   multButton.setBounds(210, 125, 75, 35);
   divButton.setBounds(310, 125, 75, 35);
   // add the actionListener to the buttons
   addButton.addActionListener(this);
   subButton.addActionListener(this);
   multButton.addActionListener(this);
   divButton.addActionListener(this);
   // give each button an actionCommand
   addButton.setActionCommand("add");
   subButton.setActionCommand("sub");
   multButton.setActionCommand("mult");
   divButton.setActionCommand("div");  
   // add the buttons to the main panel
   mainPanel.add(addButton);
   mainPanel.add(subButton);
   mainPanel.add(multButton);
   mainPanel.add(divButton);
  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();
    if(command.equals("add")){
    // get text from each text boxes
    String plusFirst = firstNumberInput.getText();
    String plusSecond = secondNumberInput.getText();
    //change the string into an integer
    int firstNumberPlus = Integer.parseInt(plusFirst);
    int secondNumberPlus = Integer.parseInt(plusSecond);
    int sumPlus = firstNumberPlus + secondNumberPlus;
    // calculate answer
    outputArea.setText("" + sumPlus); 
    }
    if(command.equals("sub")){
    // get text from each text boxes
    String subFirst = firstNumberInput.getText();
    String subSecond = secondNumberInput.getText();
    //change the string into an integer
    int firstNumberSub = Integer.parseInt(subFirst);
    int secondNumberSub = Integer.parseInt(subSecond);
    int sumSub = firstNumberSub - secondNumberSub;
    // calculate answer
    outputArea.setText("" + sumSub); 
    }
    if(command.equals("mult")){
    // get text from each text boxes
    String multFirst = firstNumberInput.getText();
    String multSecond = secondNumberInput.getText();
    //change the string into an integer
    int firstNumberMult = Integer.parseInt(multFirst);
    int secondNumberMult = Integer.parseInt(multSecond);
    int sumMult = firstNumberMult * secondNumberMult;
    // calculate answer
    outputArea.setText("" + sumMult); 
    }
    if(command.equals("div")){
    // get text from each text boxes
    String divFirst = firstNumberInput.getText();
    String divSecond = secondNumberInput.getText();
    //change the string into an integer
    int firstNumberDiv = Integer.parseInt(divFirst);
    int secondNumberDiv = Integer.parseInt(divSecond);
    int sumDiv = firstNumberDiv / secondNumberDiv;
    // calculate answer
    outputArea.setText("" + sumDiv); 
    }
  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}

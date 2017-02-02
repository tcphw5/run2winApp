import java.util.Scanner;
import java.awt.Frame;
import java.awt.*;       // Using AWT layouts
import java.awt.event.*; // Using AWT event classes and listener interfaces
import javax.swing.*;    // Using Swing components and containers


public class run2winweek extends JFrame {

  double[] nonRweek = new double[7];
  double[] FRweek = new double[7];
  double[] SRweek = new double[7];
  private JTextField mileageEnter;
  private JLabel Mtf;
  private JTextField Ttf;
  private JTextField Wtf;
  private JTextField Rtf;
  private JTextField Ftf;
  private JTextField Satf;
  private JTextField Suntf;



  public run2winweek() {

    Container cp = getContentPane();
    //cp.setLayout(new FlowLayout());
    cp.setLayout(new GridLayout(9, 12, 5, 5));


    add(new JLabel("Max Weekly Mileage: "));
    mileageEnter = new JTextField(10);
    add(mileageEnter);

    add(new JLabel(""));

    add(new JLabel("Saturday Race Week"));

    add(new JLabel("Friday Race Week"));

    add(new JLabel("Non Race Week"));


    add(new JLabel("Monday: "));
    Mtf = new JLabel("");
    //Mtf.setEditable(false);
    add(Mtf);

    add(new JLabel("Monday: "));
    Mtf = new JLabel("");
    //Mtf.setEditable(false);
    add(Mtf);

    add(new JLabel("Monday: "));
    Mtf = new JLabel("");
    //Mtf.setEditable(false);
    add(Mtf);

    add(new JLabel("Tuesday: "));
    Ttf = new JTextField(2);
    Ttf.setEditable(false);
    add(Ttf);

    add(new JLabel("Wednesday: "));
    Wtf = new JTextField(2);
    Wtf.setEditable(false);
    add(Wtf);

    add(new JLabel("Thursday: "));
    Rtf = new JTextField(2);
    Rtf.setEditable(false);
    add(Rtf);

    add(new JLabel("Friday: "));
    Ftf = new JTextField(2);
    Ftf.setEditable(false);
    add(Ftf);

    add(new JLabel("Saturday: "));
    Satf = new JTextField(2);
    Satf.setEditable(false);
    add(Satf);

    add(new JLabel("Sunday: "));
    Suntf = new JTextField(2);
    Suntf.setEditable(false);
    add(Suntf);

    mileageEnter.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        //functionailty of program ex
        // Get the String entered into the input TextField, convert to int
        //int numberIn = Integer.parseInt(tfInput.getText());
        //sum += numberIn;      // accumulate numbers entered into sum
        //tfInput.setText("");  // clear input TextField
        //tfOutput.setText(sum + ""); // display sum on the output TextField


      }
    });

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Running2Win Mileage Calculator");
    setSize(500,300);
    setVisible(true);

    nonRweek[0] = 0.12;
    nonRweek[1] = 0.20;
    nonRweek[2] = 0.12;
    nonRweek[3] = 0.17;
    nonRweek[4] = 0.20;
    nonRweek[5] = 0.12;
    nonRweek[6] = 0.22;

    FRweek[0] = 0.12;
    FRweek[1] = 0.20;
    FRweek[2] = 0.17;
    FRweek[3] = 0.12;
    FRweek[4] = 0.20;
    FRweek[5] = 0.12;
    FRweek[6] = 0.22;

    SRweek[0] = 0.12;
    SRweek[1] = 0.20;
    SRweek[2] = 0.12;
    SRweek[3] = 0.17;
    SRweek[4] = 0.12;
    SRweek[5] = 0.20;
    SRweek[6] = 0.22;
  }

  int maxWeekly;
  public static void main(String[] args) {
    //Scanner scan = new Scanner();

    //run2winweek currentWeek = new run2winweek();

    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        new run2winweek();
      }
    });

  }
}

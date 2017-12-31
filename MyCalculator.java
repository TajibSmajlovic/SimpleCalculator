import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MyCalculator extends JFrame 
                        implements ActionListener
{
    public static final int WIDTH = 600;
    public static final int HEIGHT = 400;
    public static final int NUMBER_OF_DIGITS = 30;

    private JTextField ioField; 
    private double result = 0.0;

    public static void main(String[] args)
    {
        MyCalculator aMyCalculator = new MyCalculator( );
        aMyCalculator.setVisible(true);
    }

    public MyCalculator( )
    {
        setTitle("MyCalculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLayout(new BorderLayout( ));

        JPanel textPanel = new JPanel( );
        textPanel.setLayout(new FlowLayout( ));
        ioField = new JTextField(NUMBER_OF_DIGITS);
        ioField.setBackground(Color.WHITE);
        textPanel.add(ioField);
        add(textPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel( );
        buttonPanel.setBackground(Color.BLUE);
        buttonPanel.setLayout(new FlowLayout( )); 

        JButton addButton = new JButton("+"); 
        addButton.addActionListener(this);
        buttonPanel.add(addButton); 
        JButton subtractButton = new JButton("-"); 
        subtractButton.addActionListener(this);
        buttonPanel.add(subtractButton); 
        
        add(buttonPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e)
    {
       
    }

    public void assumingCorrectNumberFormats(ActionEvent e)
    {
        
     }

    private static double stringToDouble(String stringObject)
    {
        
    return 0;

}
}



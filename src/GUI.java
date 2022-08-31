import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class GUI {

    private JButton makeButton;
    private JButton clearButton;
    private JCheckBox legalNotesCheckBox;
    private JTextField textFieldAttention;
    private JCheckBox attentionCheckBox;
    private JCheckBox exampleCheckBox;
    private JTextField textFieldExample;
    private JCheckBox checkBoxParameter1;
    private JTextField textFieldParameter1;
    private JCheckBox checkBoxParameter2;
    private JCheckBox checkBoxParameter3;
    private JCheckBox checkBoxParameter4;
    private JCheckBox checkBoxParameter5;
    private JCheckBox checkBoxParameter6;
    private JCheckBox codeCheckBox;
    private JTextField textFieldCode;
    private JTextField textFieldParameter2;
    private JTextField textFieldParameter3;
    private JTextField textFieldParameter4;
    private JTextField textFieldParameter5;
    private JTextField textFieldParameter6;
    private JTextField textFieldDescription1;
    private JTextField textFieldDescription2;
    private JTextField textFieldDescription3;
    private JTextField textFieldDescription4;
    private JTextField textFieldDescription5;
    private JTextField textFieldDescription6;
    private JTextArea textAreaResult;
    private JPanel rootPanel;
    private JPanel mainPanel;
    private JTextArea textAreaShortSummary;
    private JTextArea textAreaExample;
    private JTextArea textAreaCode;


    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new GUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 768);
//        frame.pack();
        frame.setVisible(true);
    }

    public GUI() {
        makeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Map<String, String> parameters = new HashMap<String, String>();
                StringBuilder sb = new StringBuilder();
                DocMaker dm = new DocMaker();

                sb.append(dm.makeOpenBoob());

                sb.append(dm.makeShortSummary(textAreaShortSummary.getText()));

                if (attentionCheckBox.isSelected()) sb.append(dm.makeAttention(textFieldAttention.getText()));

                if (legalNotesCheckBox.isSelected()) sb.append(dm.makeLegalNotes());

                if (exampleCheckBox.isSelected()) sb.append(dm.makeExample(textAreaExample.getText()));

                if (codeCheckBox.isSelected()) sb.append(dm.makeCode(textAreaCode.getText()));

                if (checkBoxParameter1.isSelected()) parameters.put(textFieldParameter1.getText(), textFieldDescription1.getText());
                if (checkBoxParameter2.isSelected()) parameters.put(textFieldParameter2.getText(), textFieldDescription2.getText());
                if (checkBoxParameter3.isSelected()) parameters.put(textFieldParameter3.getText(), textFieldDescription3.getText());
                if (checkBoxParameter4.isSelected()) parameters.put(textFieldParameter4.getText(), textFieldDescription4.getText());
                if (checkBoxParameter5.isSelected()) parameters.put(textFieldParameter5.getText(), textFieldDescription5.getText());
                if (checkBoxParameter6.isSelected()) parameters.put(textFieldParameter6.getText(), textFieldDescription6.getText());

                sb.append(dm.makeParameters(parameters));

                System.out.println(sb);
                sb.append(dm.makeCloseBoob());

                System.out.println(sb.toString());

                textAreaResult.setText(sb.toString());
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textAreaResult.setText(null);
                textAreaShortSummary.setText(null);
                textFieldAttention.setText(null);
                textAreaCode.setText(null);
                textAreaExample.setText(null);
                textFieldParameter1.setText(null);
                textFieldParameter1.setText(null);
                textFieldParameter2.setText(null);
                textFieldParameter3.setText(null);
                textFieldParameter4.setText(null);
                textFieldParameter5.setText(null);
                textFieldParameter6.setText(null);
                textFieldDescription1.setText(null);
                textFieldDescription2.setText(null);
                textFieldDescription3.setText(null);
                textFieldDescription4.setText(null);
                textFieldDescription5.setText(null);
                textFieldDescription6.setText(null);
            }
        });
    }
}

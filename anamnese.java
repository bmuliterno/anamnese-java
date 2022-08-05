package paineis;
 
import java.awt.BorderLayout;
import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import java.awt.Button;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.JOptionPane;
public class Painel1 extends JFrame {
 
private JPanel contentPane;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;
private JTextField textField_4;
private JTextField textField_5;
private JTextField textField_6;
private JTextField textField_9;
private JTextField textField_8;
private JTextField textField_10;
private JTextField textField_11;
private JTextField textField_12;
private JTextField textField_13;
private JTextField textField_14;
private JTextField textField_16;
private JTextField textField_7;
private JTextField textField_17;
private JTextField textField_15;
private JTextField textField_18;
private JTextField textField_19;
 
/**
 * Launch the application.
 */
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Painel1 frame = new Painel1();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}
 
/**
 * Create the frame. 
 */ 
public Painel1() {
setTitle("Questionario Medico");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 1300, 860);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);

JLabel lblNewLabel = new JLabel("QUESTION\u00C1RIO M\u00C9DICO");
lblNewLabel.setForeground(new Color(0, 153, 102));
lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 20));

JLabel lblNewLabel_1 = new JLabel("Nome:");
lblNewLabel_1.setFont(new Font("Calibri", Font.PLAIN, 18));

textField = new JTextField();
textField.setFont(new Font("Tahoma", Font.PLAIN, 19));
textField.setColumns(10);

JLabel lblNewLabel_1_1 = new JLabel("Sexo:");
lblNewLabel_1_1.setFont(new Font("Calibri", Font.PLAIN, 18));

JLabel lblNewLabel_1_2 = new JLabel("Estado Civil:");
lblNewLabel_1_2.setFont(new Font("Calibri", Font.PLAIN, 18));

JLabel lblNewLabel_1_3 = new JLabel("Idade:");
lblNewLabel_1_3.setFont(new Font("Calibri", Font.PLAIN, 18));

textField_1 = new JTextField();
textField_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
textField_1.setColumns(10);

JLabel lblNewLabel_1_3_1 = new JLabel("Data de Nasc.:");
lblNewLabel_1_3_1.setFont(new Font("Calibri", Font.PLAIN, 18));

textField_2 = new JTextField(("  /  /    "));
textField_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
textField_2.setColumns(10);

JLabel lblNewLabel_1_3_2 = new JLabel("Altura:");
lblNewLabel_1_3_2.setFont(new Font("Calibri", Font.PLAIN, 18));

textField_3 = new JTextField();
textField_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
textField_3.setColumns(10);

JLabel lblNewLabel_1_3_3 = new JLabel("Endere\u00E7o:");
lblNewLabel_1_3_3.setFont(new Font("Calibri", Font.PLAIN, 18));

textField_4 = new JTextField();
textField_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
textField_4.setColumns(10);

JLabel lblNewLabel_1_3_3_1 = new JLabel("Estado:");
lblNewLabel_1_3_3_1.setFont(new Font("Calibri", Font.PLAIN, 18));

textField_5 = new JTextField();
textField_5.setFont(new Font("Tahoma", Font.PLAIN, 19));
textField_5.setColumns(10);

JLabel lblNewLabel_1_3_3_2 = new JLabel("Bairro:");
lblNewLabel_1_3_3_2.setFont(new Font("Calibri", Font.PLAIN, 18));

textField_6 = new JTextField();
textField_6.setFont(new Font("Tahoma", Font.PLAIN, 19));
textField_6.setColumns(10);

JLabel lblNewLabel_1_3_3_1_1 = new JLabel("CEP:");
lblNewLabel_1_3_3_1_1.setFont(new Font("Calibri", Font.PLAIN, 18));

JLabel lblNewLabel_1_2_1 = new JLabel("CPF:");
lblNewLabel_1_2_1.setFont(new Font("Calibri", Font.PLAIN, 18));
textField_9 = new JTextField();
textField_9.setFont(new Font("Tahoma", Font.PLAIN, 19));
textField_9.setColumns(10);

JLabel lblNewLabel_1_2_1_1 = new JLabel("Celular:");
lblNewLabel_1_2_1_1.setFont(new Font("Calibri", Font.PLAIN, 18));

JLabel lblNewLabel_2 = new JLabel("CASO DE EMERG\u00CANCIA CONTACTAR:");
lblNewLabel_2.setForeground(new Color(0, 153, 102));
lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 18));

JLabel lblNewLabel_3 = new JLabel("Nome:");
lblNewLabel_3.setFont(new Font("Calibri", Font.PLAIN, 18));

textField_8 = new JTextField();
textField_8.setFont(new Font("Tahoma", Font.PLAIN, 19));
textField_8.setColumns(10);

JLabel lblNewLabel_4 = new JLabel("Celular:");
lblNewLabel_4.setFont(new Font("Calibri", Font.PLAIN, 18));

textField_10 = new JTextField("( )");
textField_10.setFont(new Font("Tahoma", Font.PLAIN, 19));
textField_10.setColumns(10);

JLabel lblNewLabel_5 = new JLabel("Parentesco:");
lblNewLabel_5.setFont(new Font("Calibri", Font.PLAIN, 18));

textField_11 = new JTextField();
textField_11.setFont(new Font("Tahoma", Font.PLAIN, 19));
textField_11.setColumns(10);

JLabel lblNewLabel_3_1 = new JLabel("HIST\u00D3RICO DO PACI\u00CANTE:");
lblNewLabel_3_1.setForeground(new Color(0, 153, 102));
lblNewLabel_3_1.setFont(new Font("Calibri", Font.BOLD, 18));

JLabel lblNewLabel_3_2 = new JLabel("Motivo do tratamento:");
lblNewLabel_3_2.setFont(new Font("Calibri", Font.PLAIN, 18));

textField_12 = new JTextField();
textField_12.setColumns(10);

JLabel lblNewLabel_3_3 = new JLabel("Alergias (Anestesicos, medicamentos etc.):");
lblNewLabel_3_3.setFont(new Font("Calibri", Font.PLAIN, 18));

textField_13 = new JTextField();
textField_13.setColumns(10);

JLabel lblNewLabel_3_3_1 = new JLabel("Medicamentos em uso (via oral):");
lblNewLabel_3_3_1.setFont(new Font("Calibri", Font.PLAIN, 18));

textField_14 = new JTextField();
textField_14.setColumns(10);

JLabel lblNewLabel_3_3_1_1 = new JLabel("Cremes em uso (rosto e corpo):");
lblNewLabel_3_3_1_1.setFont(new Font("Calibri", Font.PLAIN, 18));

JLabel lblNewLabel_6 = new JLabel("H\u00C1BITOS:");
lblNewLabel_6.setForeground(new Color(0, 153, 102));
lblNewLabel_6.setFont(new Font("Calibri", Font.BOLD, 18));

JLabel lblNewLabel_3_2_1 = new JLabel("Pratica atividade fisica?");
lblNewLabel_3_2_1.setFont(new Font("Calibri", Font.PLAIN, 18));

JLabel lblNewLabel_3_2_2 = new JLabel("Fuma?");
lblNewLabel_3_2_2.setFont(new Font("Calibri", Font.PLAIN, 18));

JLabel lblNewLabel_3_2_3 = new JLabel("Ingere bebida alcoolica?");
lblNewLabel_3_2_3.setFont(new Font("Calibri", Font.PLAIN, 18));

JLabel lblNewLabel_3_2_4 = new JLabel("Urina");
lblNewLabel_3_2_4.setFont(new Font("Calibri", Font.PLAIN, 18));

JLabel lblNewLabel_3_2_5 = new JLabel("Exposi\u00E7\u00E3o ao sol");
lblNewLabel_3_2_5.setFont(new Font("Calibri", Font.PLAIN, 18));

JLabel lblNewLabel_3_2_6 = new JLabel("Apetite");
lblNewLabel_3_2_6.setFont(new Font("Calibri", Font.PLAIN, 18));

JLabel lblNewLabel_3_2_7 = new JLabel("Consumo de agua");
lblNewLabel_3_2_7.setFont(new Font("Calibri", Font.PLAIN, 18));

JLabel lblNewLabel_3_2_8 = new JLabel("Qualidade de sono");
lblNewLabel_3_2_8.setFont(new Font("Calibri", Font.PLAIN, 18));

JRadioButton rdbtnNewRadioButton = new JRadioButton("Feminino");
rdbtnNewRadioButton.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Masculino");
rdbtnNewRadioButton_1.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Outro");
rdbtnNewRadioButton_2.setFont(new Font("Calibri", Font.PLAIN, 13));

textField_16 = new JTextField();
textField_16.setFont(new Font("Tahoma", Font.PLAIN, 19));
textField_16.setColumns(10);

textField_7 = new JTextField();
textField_7.setFont(new Font("Tahoma", Font.PLAIN, 19));
textField_7.setColumns(10);

textField_17 = new JTextField();
textField_17.setColumns(10);

JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Solteiro(a)");
rdbtnNewRadioButton_3.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Casado(a)");
rdbtnNewRadioButton_4.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Vi\u00FAvo(a)");
rdbtnNewRadioButton_5.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Sim");
rdbtnNewRadioButton_6.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_6_1 = new JRadioButton("N\u00E3o");
rdbtnNewRadioButton_6_1.setFont(new Font("Calibri", Font.PLAIN, 13));

textField_15 = new JTextField();
textField_15.setColumns(10);

JRadioButton rdbtnNewRadioButton_6_2 = new JRadioButton("Sim");
rdbtnNewRadioButton_6_2.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_6_1_1 = new JRadioButton("N\u00E3o");
rdbtnNewRadioButton_6_1_1.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_6_2_1 = new JRadioButton("Muito");
rdbtnNewRadioButton_6_2_1.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_6_2_2 = new JRadioButton("Pouco");
rdbtnNewRadioButton_6_2_2.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_6_2_3 = new JRadioButton("N\u00E3o");
rdbtnNewRadioButton_6_2_3.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_6_2_2_1 = new JRadioButton("Normal");
rdbtnNewRadioButton_6_2_2_1.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_6_2_2_2 = new JRadioButton("Pouco");
rdbtnNewRadioButton_6_2_2_2.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_6_2_1_1 = new JRadioButton("Muito");
rdbtnNewRadioButton_6_2_1_1.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_6_2_1_1_1 = new JRadioButton("Muito");
rdbtnNewRadioButton_6_2_1_1_1.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_6_2_2_2_1 = new JRadioButton("Pouco");
rdbtnNewRadioButton_6_2_2_2_1.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_6_2_3_1 = new JRadioButton("N\u00E3o consumo");
rdbtnNewRadioButton_6_2_3_1.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_6_2_1_2 = new JRadioButton("Muito");
rdbtnNewRadioButton_6_2_1_2.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_6_2_2_1_1 = new JRadioButton("Normal");
rdbtnNewRadioButton_6_2_2_1_1.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_6_2_2_2_2 = new JRadioButton("Pouco");
rdbtnNewRadioButton_6_2_2_2_2.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_6_2_2_1_1_1 = new JRadioButton("Normal");
rdbtnNewRadioButton_6_2_2_1_1_1.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_6_2_1_2_1 = new JRadioButton("Muito");
rdbtnNewRadioButton_6_2_1_2_1.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_6_2_2_2_2_1 = new JRadioButton("Pouco");
rdbtnNewRadioButton_6_2_2_2_2_1.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_6_2_2_2_2_2 = new JRadioButton("\u00C0s vezes");
rdbtnNewRadioButton_6_2_2_2_2_2.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_6_2_2_2_2_3 = new JRadioButton("Pouco");
rdbtnNewRadioButton_6_2_2_2_2_3.setFont(new Font("Calibri", Font.PLAIN, 13));

JRadioButton rdbtnNewRadioButton_6_2_2_2_2_4 = new JRadioButton("Diariamente");
rdbtnNewRadioButton_6_2_2_2_2_4.setFont(new Font("Calibri", Font.PLAIN, 13));

 
JButton btnNewButton = new JButton("CONCLUIR");
btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
System.out.println("Anamnese Concluída!");
double num1;
double num2;
double imc;

num1 = Double.parseDouble(textField_18.getText());
num2 = Double.parseDouble(textField_3.getText());

imc = (num1)/(num2*num2);

textField_19.setText(""+imc);
}
});

textField_18 = new JTextField();
textField_18.setFont(new Font("Tahoma", Font.PLAIN, 19));
textField_18.setColumns(10);

JLabel lblNewLabel_1_3_2_1 = new JLabel("Peso:");
lblNewLabel_1_3_2_1.setFont(new Font("Calibri", Font.PLAIN, 18));

JLabel lblNewLabel_7 = new JLabel("IMC:");
lblNewLabel_7.setFont(new Font("Calibri", Font.PLAIN, 18));

textField_19 = new JTextField();
textField_19.setFont(new Font("Tahoma", Font.PLAIN, 19));
textField_19.setColumns(10);
GroupLayout gl_contentPane = new GroupLayout(contentPane);
gl_contentPane.setHorizontalGroup(
gl_contentPane.createParallelGroup(Alignment.TRAILING)
.addGroup(gl_contentPane.createSequentialGroup()
.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
.addGroup(gl_contentPane.createSequentialGroup()
.addGap(448)
.addComponent(lblNewLabel))
.addGroup(gl_contentPane.createSequentialGroup()
.addGap(75)
.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(lblNewLabel_3_2)
.addPreferredGap(ComponentPlacement.RELATED))
.addGroup(gl_contentPane.createSequentialGroup()
.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
.addGroup(gl_contentPane.createSequentialGroup()
.addPreferredGap(ComponentPlacement.RELATED)
.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(lblNewLabel_1_3_3)
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(textField_6, GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE))
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(lblNewLabel_1_3_3_2)
.addGap(28)
.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE))
.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE))
.addPreferredGap(ComponentPlacement.RELATED)
.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(lblNewLabel_1_3_3_1)
.addPreferredGap(ComponentPlacement.UNRELATED)
.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(lblNewLabel_1_3_3_1_1)
.addGap(18)
.addComponent(textField_7, 0, 0, Short.MAX_VALUE)))
.addPreferredGap(ComponentPlacement.RELATED))
.addGroup(gl_contentPane.createSequentialGroup()
.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
.addComponent(lblNewLabel_1)
.addComponent(lblNewLabel_1_3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
.addGap(28)
.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
.addGap(12)
.addComponent(lblNewLabel_1_3_1)
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
.addGap(32)
.addComponent(lblNewLabel_1_3_2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
.addPreferredGap(ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
.addComponent(lblNewLabel_1_3_2_1)
.addPreferredGap(ComponentPlacement.UNRELATED)
.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
.addComponent(textField, GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE))))
.addGap(61))
.addGroup(gl_contentPane.createSequentialGroup()
.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(lblNewLabel_3)
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(textField_8, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
.addPreferredGap(ComponentPlacement.UNRELATED))
.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE)
.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
.addComponent(textField_14, Alignment.LEADING)
.addComponent(textField_13, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
.addComponent(lblNewLabel_3_3_1_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
.addComponent(textField_17, Alignment.LEADING))
.addComponent(lblNewLabel_3_1)
.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 355, GroupLayout.PREFERRED_SIZE)
.addComponent(lblNewLabel_3_3_1))
.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
.addGroup(gl_contentPane.createSequentialGroup()
.addGap(48)
.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
.addGroup(gl_contentPane.createSequentialGroup()
.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
.addGroup(gl_contentPane.createSequentialGroup()
.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(lblNewLabel_6)
.addGap(61))
.addGroup(gl_contentPane.createSequentialGroup()
.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
.addComponent(lblNewLabel_3_2_1, GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
.addGroup(gl_contentPane.createSequentialGroup()
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(lblNewLabel_3_2_2, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(rdbtnNewRadioButton_6_2, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
.addGap(18)
.addComponent(rdbtnNewRadioButton_6_1_1, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
.addPreferredGap(ComponentPlacement.UNRELATED)
.addComponent(rdbtnNewRadioButton_6, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)))
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(rdbtnNewRadioButton_6_1, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
.addComponent(lblNewLabel_3_2_4, GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
.addComponent(lblNewLabel_3_2_3, GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(rdbtnNewRadioButton_6_2_1)
.addPreferredGap(ComponentPlacement.UNRELATED)
.addComponent(rdbtnNewRadioButton_6_2_2)
.addPreferredGap(ComponentPlacement.UNRELATED)
.addComponent(rdbtnNewRadioButton_6_2_3, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(rdbtnNewRadioButton_6_2_2_1)
.addPreferredGap(ComponentPlacement.UNRELATED)
.addComponent(rdbtnNewRadioButton_6_2_2_2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(rdbtnNewRadioButton_6_2_1_1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)))
.addGap(0))
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(textField_15, 211, 211, 211)
.addPreferredGap(ComponentPlacement.RELATED))))
.addGroup(gl_contentPane.createSequentialGroup()
.addGap(43)
.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
.addPreferredGap(ComponentPlacement.RELATED))
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(lblNewLabel_4)
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(textField_10, GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
.addGap(18)))))
.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(lblNewLabel_1_1)
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(rdbtnNewRadioButton)
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(rdbtnNewRadioButton_1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
.addGap(18)
.addComponent(rdbtnNewRadioButton_2, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE))
.addGroup(gl_contentPane.createSequentialGroup()
.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(lblNewLabel_1_2_1_1)
.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(lblNewLabel_1_2_1)
.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(lblNewLabel_1_2)
.addPreferredGap(ComponentPlacement.UNRELATED)
.addComponent(rdbtnNewRadioButton_3, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
.addGap(18)
.addComponent(rdbtnNewRadioButton_4, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)))
.addGap(18)
.addComponent(rdbtnNewRadioButton_5, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
.addGroup(gl_contentPane.createSequentialGroup()
.addGap(98)
.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
.addComponent(lblNewLabel_3_2_8, GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
.addComponent(lblNewLabel_3_2_5, GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(rdbtnNewRadioButton_6_2_2_1_1_1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
.addPreferredGap(ComponentPlacement.UNRELATED)
.addComponent(rdbtnNewRadioButton_6_2_1_2_1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
.addPreferredGap(ComponentPlacement.UNRELATED)
.addComponent(rdbtnNewRadioButton_6_2_2_2_2_1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(rdbtnNewRadioButton_6_2_2_2_2_2)
.addPreferredGap(ComponentPlacement.UNRELATED)
.addComponent(rdbtnNewRadioButton_6_2_2_2_2_3, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
.addPreferredGap(ComponentPlacement.UNRELATED)
.addComponent(rdbtnNewRadioButton_6_2_2_2_2_4)))
.addPreferredGap(ComponentPlacement.RELATED))
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(lblNewLabel_5)
.addPreferredGap(ComponentPlacement.UNRELATED)
.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
.addGroup(gl_contentPane.createSequentialGroup()
.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(lblNewLabel_3_2_6)
.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(rdbtnNewRadioButton_6_2_1_2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(rdbtnNewRadioButton_6_2_1_1_1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(rdbtnNewRadioButton_6_2_2_2_1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(rdbtnNewRadioButton_6_2_3_1))
.addComponent(lblNewLabel_3_2_7)))
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(rdbtnNewRadioButton_6_2_2_1_1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
.addPreferredGap(ComponentPlacement.UNRELATED)
.addComponent(rdbtnNewRadioButton_6_2_2_2_2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)))
.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)))
.addGroup(gl_contentPane.createSequentialGroup()
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(btnNewButton)))))
.addGap(74))
);
gl_contentPane.setVerticalGroup(
gl_contentPane.createParallelGroup(Alignment.TRAILING)
.addGroup(gl_contentPane.createSequentialGroup()
.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(lblNewLabel)
.addGap(27)
.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
.addComponent(lblNewLabel_1)
.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
.addComponent(rdbtnNewRadioButton)
.addComponent(rdbtnNewRadioButton_1)
.addComponent(rdbtnNewRadioButton_2))
.addPreferredGap(ComponentPlacement.UNRELATED)
.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
.addGroup(gl_contentPane.createSequentialGroup()
.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
.addComponent(lblNewLabel_1_2, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
.addComponent(rdbtnNewRadioButton_3)
.addComponent(rdbtnNewRadioButton_4)
.addComponent(rdbtnNewRadioButton_5))
.addGap(19)
.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
.addComponent(lblNewLabel_1_2_1)
.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
.addPreferredGap(ComponentPlacement.RELATED)
.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
.addComponent(lblNewLabel_1_2_1_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
.addPreferredGap(ComponentPlacement.UNRELATED))
.addGroup(gl_contentPane.createSequentialGroup()
.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
.addComponent(lblNewLabel_1_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
.addComponent(lblNewLabel_1_3_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
.addComponent(lblNewLabel_1_3_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
.addComponent(lblNewLabel_1_3_2_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
.addPreferredGap(ComponentPlacement.UNRELATED)
.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
.addComponent(lblNewLabel_1_3_3_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
.addComponent(lblNewLabel_1_3_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
.addPreferredGap(ComponentPlacement.RELATED)
.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
.addComponent(lblNewLabel_1_3_3_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
.addComponent(lblNewLabel_1_3_3_1_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
.addGap(34)))
.addGap(33)
.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
.addComponent(lblNewLabel_3)
.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
.addComponent(lblNewLabel_4)
.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
.addComponent(lblNewLabel_5)
.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
.addPreferredGap(ComponentPlacement.UNRELATED)
.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
.addComponent(lblNewLabel_6)
.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(lblNewLabel_3_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
.addPreferredGap(ComponentPlacement.RELATED)
.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
.addGap(18)
.addComponent(lblNewLabel_3_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
.addGap(2)
.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
.addGap(2)
.addComponent(lblNewLabel_3_3_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
.addGroup(gl_contentPane.createSequentialGroup()
.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
.addComponent(lblNewLabel_3_2_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
.addComponent(rdbtnNewRadioButton_6)
.addComponent(rdbtnNewRadioButton_6_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
.addComponent(rdbtnNewRadioButton_6_2_1_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
.addComponent(rdbtnNewRadioButton_6_2_2_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
.addComponent(rdbtnNewRadioButton_6_2_2_2_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
.addComponent(lblNewLabel_3_2_6, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
.addPreferredGap(ComponentPlacement.RELATED)
.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
.addGap(5)
.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
.addComponent(lblNewLabel_3_2_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
.addComponent(rdbtnNewRadioButton_6_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
.addComponent(rdbtnNewRadioButton_6_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
.addComponent(lblNewLabel_3_2_7, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
.addGroup(gl_contentPane.createSequentialGroup()
.addGap(28)
.addComponent(lblNewLabel_3_2_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
.addGroup(gl_contentPane.createSequentialGroup()
.addPreferredGap(ComponentPlacement.RELATED)
.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
.addComponent(rdbtnNewRadioButton_6_2_1_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
.addComponent(rdbtnNewRadioButton_6_2_2_2_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
.addComponent(rdbtnNewRadioButton_6_2_3_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
.addGap(18)
.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
.addComponent(rdbtnNewRadioButton_6_2_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
.addComponent(rdbtnNewRadioButton_6_2_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
.addComponent(rdbtnNewRadioButton_6_2_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
.addComponent(lblNewLabel_3_2_8, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
.addPreferredGap(ComponentPlacement.RELATED)
.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
.addComponent(rdbtnNewRadioButton_6_2_2_1_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
.addComponent(rdbtnNewRadioButton_6_2_1_2_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
.addComponent(rdbtnNewRadioButton_6_2_2_2_2_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))))
.addPreferredGap(ComponentPlacement.RELATED)
.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
.addPreferredGap(ComponentPlacement.UNRELATED)
.addComponent(lblNewLabel_3_3_1_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
.addPreferredGap(ComponentPlacement.RELATED)
.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
.addComponent(btnNewButton)
.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
.addComponent(lblNewLabel_7))
.addGap(133))
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(lblNewLabel_3_2_4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
.addPreferredGap(ComponentPlacement.RELATED)
.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
.addComponent(rdbtnNewRadioButton_6_2_2_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
.addComponent(rdbtnNewRadioButton_6_2_2_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
.addComponent(rdbtnNewRadioButton_6_2_1_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
.addComponent(lblNewLabel_3_2_5, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
.addPreferredGap(ComponentPlacement.UNRELATED)
.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
.addComponent(rdbtnNewRadioButton_6_2_2_2_2_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
.addComponent(rdbtnNewRadioButton_6_2_2_2_2_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
.addComponent(rdbtnNewRadioButton_6_2_2_2_2_4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
.addGap(181))))
.addGroup(gl_contentPane.createSequentialGroup()
.addComponent(lblNewLabel_2)
.addGap(580))))
);
contentPane.setLayout(gl_contentPane);

}
}


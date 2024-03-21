package pratica07;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.Window.Type;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.*;
import java.awt.*;



public class teste {

    private JFrame frmCalculaMdcmmc;
    private JLabel lblOutput;
    private static int conta = 1;
    private static int a = 1;
    private static int b = 1;
    private static int c = 1;
    private JButton btnNewButton;
    private JTextField txtNum;
    private JTextField txtNum_1;
    private JButton btnUpdate_1_1_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    teste window = new teste();
                    window.frmCalculaMdcmmc.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
        
        
    }

    /**
     * Create the application.
     */
    public teste() {
        initialize();
        
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
    	
        frmCalculaMdcmmc = new JFrame();
        frmCalculaMdcmmc.setTitle("Calcula MDC/MMC");
        frmCalculaMdcmmc.setForeground(Color.RED);
        frmCalculaMdcmmc.setFont(new Font("JetBrains Mono", Font.PLAIN, 13));
        //frmCalculaMdcmmc.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\MMS-05\\Desktop\\zap.ico"));
        frmCalculaMdcmmc.setBounds(100, 100, 450, 300);
        frmCalculaMdcmmc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCalculaMdcmmc.getContentPane().setLayout(null);
        frmCalculaMdcmmc.getContentPane().setBackground(Color.decode("#FFA500")); // Altera a cor de fundo para vermelho
        // icone da janela
        ImageIcon icon = new ImageIcon("C:\\Users\\MMS-05\\Desktop\\zap.ico");
        Image image = icon.getImage();
        frmCalculaMdcmmc.setIconImage(image);
        
        // Instanciação e configuração do JLabel
        lblOutput = new JLabel("");
        lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
        lblOutput.setBounds(45, 106, 203, 100);
        lblOutput.setFont(new Font("Old English Text MT", Font.BOLD, 35));
        lblOutput.setBackground(new Color(0, 0, 255));
        frmCalculaMdcmmc.getContentPane().add(lblOutput);

        // Cria outro botao
        btnNewButton = new JButton("zerar");
        btnNewButton.setBounds(298, 27, 128, 56);
        btnNewButton.setForeground(Color.LIGHT_GRAY);
        btnNewButton.setBackground(Color.BLACK);
        btnNewButton.setFont(new Font("JetBrains Mono NL Thin", Font.BOLD, 14));
        frmCalculaMdcmmc.getContentPane().add(btnNewButton);

        // Chamo ouvinte para ação
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Imprimir "1" na janela quando o botão for clicado
                lblOutput.setText(String.valueOf(conta = 0));
            }
        });
        
        txtNum = new JTextField();
        txtNum.setHorizontalAlignment(SwingConstants.CENTER);
        txtNum.setFont(new Font("JetBrains Mono", Font.BOLD, 11));
        txtNum.setBounds(23, 43, 58, 26);
        txtNum.setColumns(10);
        frmCalculaMdcmmc.getContentPane().add(txtNum);
        
        txtNum_1 = new JTextField();
        txtNum_1.setHorizontalAlignment(SwingConstants.CENTER);
        txtNum_1.setFont(new Font("JetBrains Mono", Font.BOLD, 11));
        txtNum_1.setBounds(91, 43, 58, 26);
        txtNum_1.setColumns(10);
        frmCalculaMdcmmc.getContentPane().add(txtNum_1);
        
        JButton btnUpdate_1 = new JButton("Inserir");
        btnUpdate_1.setForeground(Color.WHITE);
        btnUpdate_1.setBackground(Color.DARK_GRAY);
        btnUpdate_1.setFont(new Font("JetBrains Mono NL Thin", Font.BOLD, 13));
        btnUpdate_1.setBounds(170, 41, 118, 29);
        frmCalculaMdcmmc.getContentPane().add(btnUpdate_1);
        
        
        JButton btnUpdate_1_1_1 = new JButton("Calcula MMC");
        btnUpdate_1_1_1.setForeground(Color.WHITE);
        btnUpdate_1_1_1.setBackground(Color.DARK_GRAY);
        btnUpdate_1_1_1.setFont(new Font("JetBrains Mono NL Thin", Font.BOLD, 14));
        btnUpdate_1_1_1.setBounds(298, 144, 128, 26);
        frmCalculaMdcmmc.getContentPane().add(btnUpdate_1_1_1);
        
        btnUpdate_1_1_2 = new JButton("Calcula MDC");
        btnUpdate_1_1_2.setForeground(Color.WHITE);
        btnUpdate_1_1_2.setBackground(Color.DARK_GRAY);
        btnUpdate_1_1_2.setFont(new Font("JetBrains Mono NL Thin", Font.BOLD, 14));
        btnUpdate_1_1_2.setBounds(298, 106, 128, 26);
        frmCalculaMdcmmc.getContentPane().add(btnUpdate_1_1_2);
        
        
        btnUpdate_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Atualiza o valor de a com o valor inserido no JTextField
                try {
                    a = Integer.parseInt(txtNum.getText());
                    b = Integer.parseInt(txtNum_1.getText());
                } catch (NumberFormatException ex) {
                    // Caso a entrada não seja um número, não faz nada
                }
            }
        });
        
        
        btnUpdate_1_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // MDC
                conta = mmc(a,b);
                lblOutput.setText(String.valueOf(conta));
            }
        });
        
        btnUpdate_1_1_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // MMC
                conta = mdc(a,b);
                lblOutput.setText(String.valueOf(conta));
            }
        });
        
        
    }
    
    
    public static int mdc(int a, int b) {
        if(b==0) return a;
    	return mdc(b,a%b);
    }
    
    public static int mmc(int a, int b) {
        return (a*b)/mdc(a,b);
    }
    
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfaceGrafica extends JFrame {
    private static final long serialVersionUID = 1L;

    public InterfaceGrafica(ReprodutorDisco reprodutor) {
        setTitle("Controle de Reprodução de Discos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 5));

        JButton btnReproduzir = new JButton("Reproduzir");
        btnReproduzir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reprodutor.reproduzir();
            }
        });
        panel.add(btnReproduzir);

        JButton btnPausar = new JButton("Pausar");
        btnPausar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reprodutor.pausar();
            }
        });
        panel.add(btnPausar);

        JButton btnParar = new JButton("Parar");
        btnParar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reprodutor.parar();
            }
        });
        panel.add(btnParar);

        JButton btnAvancar = new JButton("Avançar");
        btnAvancar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reprodutor.avancar();
            }
        });
        panel.add(btnAvancar);

        JButton btnRetroceder = new JButton("Retroceder");
        btnRetroceder.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reprodutor.retroceder();
            }
        });
        panel.add(btnRetroceder);

        add(panel);
    }

    public static void main(String[] args) {
        PlayerAutomotivo playerAutomotivo = new PlayerAutomotivo();
        InterfaceGrafica guiAutomotivo = new InterfaceGrafica(playerAutomotivo);
        guiAutomotivo.setVisible(true);

        ReprodutorDVD reprodutorDVD = new ReprodutorDVD();
        InterfaceGrafica guiDVD = new InterfaceGrafica(reprodutorDVD);
        guiDVD.setVisible(true);
    }
}
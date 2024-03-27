import javax.swing.JOptionPane;


public class ReprodutorDVD implements ReprodutorDisco {
    @Override
    public void reproduzir() {
    	JOptionPane.showMessageDialog(null, "Reproducao","Play" ,
    			JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void pausar() {
    	
    	JOptionPane.showMessageDialog(null, "Pausou DVD","Pausar" ,
    			JOptionPane.INFORMATION_MESSAGE);
    }	

    @Override
    public void parar() {
    	JOptionPane.showMessageDialog(null, "PAROU DVD","parar" ,
    			JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void avancar() {
    	JOptionPane.showMessageDialog(null, ">>",">>" ,
    			JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void retroceder() {
    	JOptionPane.showMessageDialog(null, "<<","<<" ,
    			JOptionPane.INFORMATION_MESSAGE);
    }
}
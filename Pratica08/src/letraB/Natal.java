package letraB;

public class Natal extends CartaoWeb {
	
	//constructor
    public Natal(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz Natal, " + super.destinatario + "!");
        System.out.println("Que esta data traga muita paz e alegria para você e sua família.");
    }
    
}


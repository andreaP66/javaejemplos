import java.util.ArrayList;

public class Colleciones {
	public static void main(String[] args) {
		//JAva8 Si no: new ArrayList <String>()
		ArrayList<String> textos = new ArrayList<>();
		textos.add("Uno");
		textos.add("Dos");
		for (String texto: textos) {
			System.out.println(texto);}
		
	}

}

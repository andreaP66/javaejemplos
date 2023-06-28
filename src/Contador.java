
public class Contador {

	private int count;

	// defecto
	public Contador() {
	}
	
	
	  //constructor con parámetros
    public Contador(int count) {
        if (count < 0) {
            this.count = 0;
        } else {
            this.count = count;
        }
    }
	// con parametro
//	public Contador(int count) {
//		setCount(count);
//	}
	// de copia
	public Contador(Contador c) {
		this(c.getCount());
	}
	
	// Setter y getters
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		if (count < 0) {
			this.count=0;
		}else {
		this.count = count;}
	}
	
	
    //método incrementar contador
	public void incrementar() {
		 count ++;
	}

    //método decrementar contador
	public void decrementar() {
		if (count<=0) {
			count= 0;
		}else {
		count --;}
	}
	
}

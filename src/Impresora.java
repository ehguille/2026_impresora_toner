
public class Impresora {
	
	private Toner unToner;
	
	public Impresora(int numeroPaginasToner) {
		System.out.println("Se crea una Impresora con un Toner con "+numeroPaginasToner+" páginas");
		unToner=new Toner(numeroPaginasToner);
	}

}

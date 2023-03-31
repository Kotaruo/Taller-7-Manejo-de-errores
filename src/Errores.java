import java.io.IOException;

public class Errores {
	
	public void doSomething() throws IOException{
		
	}

}
public class MyClasss {
	public void myMethod() {
		try {
			Errores base = new Errores();
			base.doSomething();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
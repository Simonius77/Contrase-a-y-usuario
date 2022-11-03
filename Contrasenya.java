/**2.	Programa que comprova la contrasenya d’usuari. (3 punts)
a.	El programa té registrat 5 usuaris amb les seves respectives contrasenyes.
b.	El programa demanarà a l’usuari el seu nom d’usuari i a continuació la seva contrasenya.
c.	L’usuari tindrà un número d’oportunitats per encertar la contrasenya. El número d’oportunitats s’ha de guardar en una constant global del programa.
d.	Si la contrasenya es correcta es mostrarà un missatge per pantalla com que ha accedit al sistema.
e.	Sinó, continuarà provant fins que l’encerti o acabi el número d’oportunitats.
f.	Si esgota el número d’oportunitats, es mostrarà un missatge indicant-ho.**/

import java.util.Scanner;
public class Contrasenya{
	/** declaramos las constantes con los ususarios y las claves de usuario**/
	public static final String usuario1 = "Alejandro";
	public static final String usuario2 = "Biel";
	public static final String usuario3 = "Carmen";
	public static final String usuario4 = "Daniel";
	public static final String usuario5 = "Eduardo";
	public static final String clave1 = "Alejandross";
	public static final String clave2 = "Bielss";
	public static final String clave3 = "Carmenss";
	public static final String clave4 = "Danielss";
	public static final String clave5 = "Eduardoss";
	/**decalaramos constante con el numero de oportunidades**/
	public static final int oportunidades = 3;
	/**iniciamos el programa principal**/
	public static void main(String[] args){
		/**iniciamos el scanner**/
		Scanner entrada=new Scanner(System.in);
		/**declaramos las variables necesarias**/
		int contador = 0;
		int usuariook = 0;
		int claveok = 0;
		/**iniamos el bucle donde compara los datos introducidos con las constantes y cuenta el numero de intenos **/
			
		while ((contador != oportunidades)&&(usuariook==0)){
			System.out.println("Por favor introduzca nombre de ususario");
			String entradausuario = entrada.nextLine();
			System.out.println("Por favor introduzca la clave de ususario");
			String entradaclave = entrada.nextLine();
			
			if (entradausuario.equals(usuario1) && entradaclave.equals(clave1)) {
				usuariook=1;
			}else if (entradausuario.equals(usuario2) && entradaclave.equals(clave2)){
				usuariook=1;
			}else if (entradausuario.equals(usuario3) && entradaclave.equals(clave3)){
				usuariook=1;
			}else if (entradausuario.equals(usuario4) && entradaclave.equals(clave4)){
				usuariook=1;
			}else if (entradausuario.equals(usuario5) && entradaclave.equals(clave5)){
				usuariook=1;
			}else {
				System.out.println("El usuario introducido no es correcto");
				contador=contador+1;
			}
			
				
			
		}
		/** Muestra los mensajes de error **/
		
		
		
		
		if (usuariook==1){
			System.out.println("El usuario y clave introducidos son correctos, ha accedido al sistema");
		} else {
			System.out.println("Se ha agotado el numero de intentos, hemos avisado a la policia");
		}
	
	
	
	
	
	
	
	
	
	
	}
}
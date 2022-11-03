/**Versió Noob (2)

a.	El programa demanarà a l’usuari una contrasenya i comprovarà que compleix amb els criteris de robustesa, que són els següents:
i.	Longitud mínima: 6 caràcters
ii.	Longitud màxima: 10 caràcters
iii.	Ha de contenir algun caràcter especial entre els següents: “%&/()=“.
iv.	Ha de tenir alguna majúscula i alguna minúscula.
v.	No ha de contenir cap de les següents paraules: ”casa”, “gos”, “gat”
Es mostrarà un missatge indicant si la contrasenya és o no valida depenent si acompleix o no tots els requisits.
Versió Pro (2)
a.	Es farà amb la mateixa filosofia que l’anterior però establint 4 nivell de fortalesa: no vàlid, dèbil, normal i forta.
Els criteris per a cada nivell els heu de fixar vosaltres mateixos basant-vos en els anteriors.**/

/**importamos scanner**/
import java.util.Scanner;
public class ClaveCalidad {
	/** iniciamos programa principal**/
	public static void main (String [] args){
		/**iniciamos el scanner**/
		Scanner entrada=new Scanner(System.in);
		/**pedimos la contaseña**/
		System.out.println("Por favor introduzca la contaseña");
		String entradaclave = entrada.nextLine();
		/**declaramos las variables de comparacion**/
		boolean longitud=false;
		boolean caracter=false;
		boolean minusculas=false;
		boolean mayusculas=false;
		boolean palabras=false;
		
		/**este if compara la longitud de la palabra y verifica que este dentro del rango que se pide**/
		if (entradaclave.length() >= 6 && entradaclave.length() <= 10){
			longitud=true;
		}			
		/**este if comprueba si existen estos caracteres**/
		if ( entradaclave.contains("%")||entradaclave.contains("&")||entradaclave.contains("/")||entradaclave.contains("(")||entradaclave.contains(")")||entradaclave.contains("=")){
			caracter=true;
		}
		/**este if descarta que existan estas palabra **/
		if ( entradaclave.contains("casa")||entradaclave.contains("gos")||entradaclave.contains("gat")){
			palabras=true;
		}
		/** declaramos el index para recorrer la contraseña**/
		int index=0;
		/**recorremos la contraseña comprobando la existencia de mayusculas y minusculas**/
		while(index <= entradaclave.length()-1){
			String character = Character.toString(entradaclave.charAt(index));
			if (character == character.toUpperCase()) {
				mayusculas = true;
			}
			if (character == character.toLowerCase()) {
				minusculas = true;
			}
			index++;
		}
		/** se imprimen por pantalla el nivel de fortaleza de la contraseña**/
		if (longitud && !caracter && !minusculas && !mayusculas && palabras) {
			System.out.println("La contrasenya es débil");
		}
		else if (longitud && caracter && !minusculas && !mayusculas && palabras) {
			System.out.println("La contrasenya es normal");
		}
		else if (longitud && caracter && minusculas && mayusculas && !palabras) {
			System.out.println("La contrasenya es fuerte");
		}
		else {
			System.out.println("La contrasenya NO es valida");
		}
		
		
	}	
	
	
}

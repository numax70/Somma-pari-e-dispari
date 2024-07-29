/*
 * Scrivere un programma SommaPariDispari che prevede un array di 10 numeri interi contenente valori a piacere 
  (senza bisogno di chiederli all'utente) e stampa Pari e dispari uguali se la somma dei numeri in posizioni pari 
  dell'array è uguale alla somma dei numeri in posizioni dispari,altrimenti il programma stampa Pari e dispari diversi. 
(Il programma deve essere scritto facendo finta di non sapere quali siano i valori inseriti nell'array)
 * */
import java.util.Scanner;
public class Function extends Exception{
	
	public static int[] inserimentoNumeri() {
		int len = stringToInt("Quanti numeri deve contenere l'array");
		int[] array=new int[len];
		for(int i=0; i<array.length; i++) {
			array[i]=stringToInt("Inserisci il " + (i+1) + " numero");
		}
		return array;
	}
	
	
	public static int stringToInt(String a) {
		boolean check;
		int number=0; 
		do {
			check=true;
			Scanner input = new Scanner(System.in);
			System.out.print(a + ": ");
			String s = input.nextLine();
			try {
				number = Integer.parseInt(s);
			}catch(Exception e) {
				check=false;
				System.out.println("Non hai inserito un intero..");
			}
		}while(!check);
		return number;
	}
	
	public static String verificaArray(int[] array) {
		int pari=0; 
		int dispari=0; 
		for(int i=0; i<array.length; i++) {
			if(array[i]%2==0) {
				pari+=1;
				
			}else {
				dispari+=1;
				
			}
		}
		if(dispari>pari) {
			return "Dispari maggiore dei pari";
		}else if(pari>dispari) {
			return "Pari maggiore dei dispari";
		}else {
			return "Pari e dispari uguali";
		}
	}
}

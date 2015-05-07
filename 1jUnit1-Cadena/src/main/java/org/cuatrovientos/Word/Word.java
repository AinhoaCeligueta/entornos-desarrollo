/**
 * 
 */
package org.cuatrovientos.Word;

/**
 * @author Ainhoa Celigueta
 *
 */
public class Word {
	
	//Devuelve la longitud de la cadena que se le pasa.
	public int length (String word){
		if (null == word){
			return 0;
		}else{
			return word.length();
		}
	}
	
	//Devuelve el número de vocales minúsculas o no que tiene la cadena
	public int vowels (String word){
		int totalVowels=0;
		String wordToLower=word.toLowerCase();
		
		for(int i=0; i<word.length(); i++){
			//Char caracter unico=comilla simple
			if (wordToLower.charAt(i)=='a' || 
				wordToLower.charAt(i)=='e' || 
				wordToLower.charAt(i)=='i' ||
				wordToLower.charAt(i)=='o' ||
				wordToLower.charAt(i)=='u'){ 
				totalVowels++;
			}
		}
		return totalVowels;
	}
	
	//Devuelve la cadena en orden inverso
	public String reverse(String word){
		String reversed="";
		//Va decrementando por eso i--
		for (int i=word.length()-1;i>=0;i--){
			reversed = reversed + word.charAt(i);
		}
		return reversed;
	}
	
	//Cuenta el número de veces que aparece el carácter en la cadena.
	public int countChar (String word, char charToCount){
		int totalFound=0;
		String wordToLower=word.toLowerCase();
		
		for(int i=0; i<word.length(); i++){
		if	(wordToLower.charAt(i)==charToCount){
				totalFound++;
			}
		}
		return totalFound;
	}
}

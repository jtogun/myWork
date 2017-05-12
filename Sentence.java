package assignment;
import java.util.Arrays;


public class Sentence {
	
	private  String[] words;	
	public Sentence (String[] text){
		this.words = text;
	}
		
	public String toString(){
		String sentence ="";
		for (String x : words){
			sentence = sentence + x +" ";
		}
		return sentence;
	}
	
	public String shortest(){
		String shortWord = words[0];
		for (String x:words){
			if (x.length() <= shortWord.length()){
				shortWord = x;
			}
		}
		return shortWord;				
	}
	
	public String longest(){
		String longWord = words[0];
		for (String x:words){
			if(x.length() >= longWord.length()){
				longWord  = x;
			}
		}
		return longWord;
	}
	
	public double meanLength(){
		double totalChar = 0;
		double totalWord= 0;
		
		for (String i:words){
			totalChar= totalChar +i.length();			
		}
		for (String j:words){
			totalWord = totalWord+1;
		}		
		return (totalChar/totalWord);
	}
	
	
	public String[] sorted(){
		Arrays.sort(words);
		String[] x = words;
		return x;
	}
	
	
	
	public static void main(String[] args) {
		  String[] wordList = {"A", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog"};
		  Sentence text = new Sentence(wordList);
		  System.out.println(text);
		  System.out.println("Shortest word: " + text.shortest());
		  System.out.println("Longest word: " + text.longest());
		  System.out.printf("Mean word length:%5.2f\n",text.meanLength());
		  String[] sortedText = text.sorted();
		  System.out.print("Sorted: " + Arrays.toString(sortedText)); 
		}
	
	
	
	
	
	
	
	
}
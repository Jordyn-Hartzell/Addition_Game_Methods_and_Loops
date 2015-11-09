import java.util.Scanner;
public class Addition_Game_Methods_and_Loops {
	public static void main(String[] args) {
		
		int score;
		// Call the addition game
		additionGameMethod();
		
		System.out.print("All done.");
	}
	public static void additionGameMethod() {
		
		int score = 0;
		int hardness = 5;
		int stopIndex = 2;
		boolean isAnswerCorrect;
		
		for(int index=0; index<stopIndex; index=index+1){
			System.out.println("Ahoy");
			isAnswerCorrect = checkAnswerMethod(hardness);
			if(isAnswerCorrect){
				System.out.println("It was correct");
			}else{
				System.out.println("It was not correct");
			}
		}
		
		
		return;
		
		
		
	}
	public static boolean checkAnswerMethod(int hardness) {
		
		return false;
}
}
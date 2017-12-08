package quiz;

import java.util.Scanner;

	public class quiz{
		
	public static void main(String [] args) {
		
	
		String q1 = "Mink‰ v‰rist‰ on maito?\n"
				+ "(a)Punaista\n(b)Vihre‰‰\n(c)Valkoista\n"; //questions in string variables
				
		String q2 = "Mik‰ on suomen presidentin etunimi?\n"
				+ "(a)Sauli\n(b)Rauli\n(c)Juha\n";
		
		String q3 = "Miss‰ maassa sijaitsee Tallinna?\n"
				+ "(a)Ruotsissa\n(b)Ven‰j‰ll‰\n(c)Virossa\n";
		
		String q4 = "Kuka on Patrik Laine?\n"
				+ "(a)J‰‰kiekkoilija\n(b)Laulaja\n(c)M‰kihypp‰‰j‰\n";
		
		String q5 = "Mik‰ on englannin kuningattaren nimi?\n"
				+ "(a)Elisa\n(b)Elizabeth\n(c)Lisbet\n";
		
		String q6 = "Miss‰ kaupungissa sijaitsee Linnanm‰ki?\n"
				+ "(a)Oulussa\n(b)Helsingiss‰\n(c)Tampereella\n";
		
		String q7 = "Mik‰ on H&M?\n"
				+ "(a)Vaatekauppa\n(b)Lentoyhtiˆ\n(c)Vitamiini\n";
		
		String q8 = "Paljon yksi juustohampurilainen maksaa McDonaldsissa?\n"
				+ "(a)Euron\n(b)Kaksi euroa\n(c)Kolme euroa\n";
		
		String q9 = "Monta desi‰ on litrassa?\n"
				+ "(a)Viisi\n(b)Kymmenen\n(c)Yksi\n";
		
		String q10 = "Mist‰ Jaffa on tehty?\n"
				+ "(a)Omenasta\n(b)P‰‰ryn‰st‰\n(c)Appelsiinista\n";
		
		Question [] questions = {
				new Question(q1, "c"),
				new Question(q2, "a"),
				new Question(q3, "c"),
				new Question(q4, "a"),
				new Question(q5, "b"),
				new Question(q6, "b"),
				new Question(q7, "a"),
				new Question(q8, "a"),
				new Question(q9, "b"),
				new Question(q10, "c")
		};
		takeTest(questions);
		
	}
		public static void takeTest(Question [] questions) {
			int score = 0;
			Scanner keyboardInput = new Scanner(System.in);
			
			for(int i = 0; i < questions.length; i++) {  //Loop to go through all the questions
				System.out.println(questions[i].prompt);
				String answer = keyboardInput.nextLine();
				if(answer.equals(questions[i].answer)) {
					score++;
					
				}
			}
		System.out.println("Oikeita vastauksia " + score + "/" + questions.length); //outprint the score
}
}

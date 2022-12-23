package desafio;

import java.time.LocalDate;

public class MainProgram {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Java", "FullStack", 120);
		Curso curso2 = new Curso("Spring", "Springboot", 80);
		
		Mentoria mentoria1 = new Mentoria("Cloud", "AWS", LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
		
	}

}

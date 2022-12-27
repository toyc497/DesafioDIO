package desafio;

import java.time.LocalDate;

public class MainProgram {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso("Java", "FullStack", 120);
		Curso curso2 = new Curso("Spring", "Springboot", 80);
		
		Mentoria mentoria1 = new Mentoria("Cloud", "AWS", LocalDate.now());
		
		Conteudo conteudo = new Curso("JavaScript", "ReactJS", 120);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Aprenda Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev dev1 = new Dev();
		dev1.setNome("Dev1");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Dev1: "+dev1.getConteudosInscritos());
		dev1.progredir();
		System.out.println("Conteúdos concluídos Dev1: "+dev1.getConteudosConcluidos());
		System.out.println("XP: "+dev1.calcularXp());
		
		Dev dev2 = new Dev();
		dev2.setNome("Dev2");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos Dev2: "+dev2.getConteudosInscritos());
		dev2.progredir();
		System.out.println("Conteúdos concluídos Dev2: "+dev2.getConteudosConcluidos());
		System.out.println("XP: "+dev2.calcularXp());
		
	}

}

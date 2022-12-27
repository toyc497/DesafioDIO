package desafio;

public class Curso extends Conteudo {

	private Integer cargaHoraria;
	
	public Curso(String titulo, String descricao, Integer cargaHoraria) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
	}
	
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + titulo + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + "]";
	}

	@Override
	public Integer calculaXp() {
		
		return XP_PADRAO * cargaHoraria;
		
	}
	
}

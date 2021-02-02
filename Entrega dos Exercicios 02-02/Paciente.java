package ProgramacaoOrientaObjeto;

public class Paciente {
	
	private String pacientes;
	private int idade;
	private String especialista;
	
	public Paciente(String pacienteParaAtendimento, int idadeDoPaciente, String medicoResponsavel) {
		
		this.pacientes = pacienteParaAtendimento;
		this.idade = idadeDoPaciente;
		this.especialista = medicoResponsavel;
		
	}
	
	public void informacoesDoPaciente() {
		System.out.println("O paciente "+pacientes+" de idade "+idade+" anos será atendido pelo especialista "+especialista);
	}

	public String getPacientes() {
		return pacientes;
	}

	public void setPacientes(String pacientes) {
		this.pacientes = pacientes;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEspecialista() {
		return especialista;
	}

	public void setEspecialista(String especialista) {
		this.especialista = especialista;
	}

}

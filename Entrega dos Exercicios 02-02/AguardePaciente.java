package ProgramacaoOrientaObjeto;

public class AguardePaciente {
	public static void main(String args[]) {
		
		Paciente[] proximoPaciente = new Paciente[3];
		
		proximoPaciente[0] = new Paciente("Daniel",24,"Endocrinologista");
		proximoPaciente[1] = new Paciente("Nael",22,"Ortopedista");
		proximoPaciente[2] = new Paciente("Renato",26,"Nutricionista");
		
		for(int i=0;i<3;i++) {
			proximoPaciente[i].informacoesDoPaciente();
			System.out.println("-----");
		}
	}

}

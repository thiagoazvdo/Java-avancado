package works.alga.estudos.avancado;

public class Carro {

		public String modelo;
		public String placa;
		public String cor;
		private String dono;
		private String cpfdono;
		
		public Carro() {
			
		}
		
		public Carro(String modelo, String placa, String cor, String dono, String cpfdono) {
			super();
			this.modelo = modelo;
			this.placa = placa;
			this.cor = cor;
			this.dono = dono;
			this.cpfdono = cpfdono;
		}
		
		void ligar() {
			
			if (modelo == null) {
				System.out.println("modelo nulo");;
			}
			
			System.out.println("ligando o carro: " + modelo);
		}

}

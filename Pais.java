public class Pais {

	private String iso;

	private String nome;

	private int populacao;

	private double dimensao;

	private Pais[] pais;

	public boolean addVizinho(Pais pais) {
		return false;
	}

	public boolean comparar(Pais pais) {
		return false;
	}

	public boolean isLimitrofe(Pais pais) {
		return false;
	}

	public double getDensidade() {
		return 0;
	}

	public Lis getVizinhosComuns(Pais pais) {
		return null;
	}

}

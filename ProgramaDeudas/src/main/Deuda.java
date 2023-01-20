package main;

public class Deuda {
	
	private static int numIDs = 1;
	
	private int id;
	private Persona deudor;
	private String motivoDeuda;
	private float deuda;
	
	public Deuda(Persona deudor, String motivoDeuda, float deuda)	{
		this.id = numIDs;
		this.deudor = deudor;
		this.motivoDeuda = motivoDeuda;
		this.deuda = deuda;
		
		numIDs++;
	}
	
	public Deuda(String motivoDeuda, float deuda)	{
		this.id = numIDs;
		this.motivoDeuda = motivoDeuda;
		this.deuda = deuda;
		
		numIDs++;
	}

	public String getNombre() {
		return deudor.getNombre();
	}

	public void setDeudor(Persona deudor) {
		this.deudor = deudor;
	}

	public String getMotivoDeuda() {
		return motivoDeuda;
	}

	public void setMotivoDeuda(String motivoDeuda) {
		this.motivoDeuda = motivoDeuda;
	}

	public float getDeuda() {
		return deuda;
	}

	public void setDeuda(float deuda) {
		this.deuda = deuda;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}

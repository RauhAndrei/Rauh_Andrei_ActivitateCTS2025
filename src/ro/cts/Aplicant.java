package ro.cts;

public abstract class Aplicant {
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumireProiect;

	public Aplicant() {;
	}

	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nrProiecte;
		this.denumireProiect = denumireProiect;
	}

	public abstract void afiseazaInformatiiFinantare();

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getPunctaj() {
		return punctaj;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public int getNrProiecte() {
		return nrProiecte;
	}

	public void setNrProiecte(int nrProiecte, String[] denumireProiecte) {
		this.nrProiecte = nrProiecte;
		this.denumireProiect = denumireProiecte;
	}

	public void afiseazaAcceptareAplicant() {
		if (punctaj > 80) {
			System.out.println("Aplicantul " + nume + " " + prenume + " a fost acceptat.");
		} else {
			System.out.println("Aplicantul " + nume + " " + prenume + " nu a fost acceptat.");
		}
	}

}

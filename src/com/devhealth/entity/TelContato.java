package com.devhealth.entity;

public class TelContato {

	private int nr_sequencia;
	private Contato nr_seq_contato;
	private String nr_fax;
	private String nr_fixo;
	private String nr_cel;

	public int getNr_sequencia() {
		return nr_sequencia;
	}

	public void setNr_sequencia(int nr_sequencia) {
		this.nr_sequencia = nr_sequencia;
	}

	public Contato getNr_seq_contato() {
		return nr_seq_contato;
	}

	public void setNr_seq_contato(Contato nr_seq_contato) {
		this.nr_seq_contato = nr_seq_contato;
	}

	public String getNr_fax() {
		return nr_fax;
	}

	public void setNr_fax(String nr_fax) {
		this.nr_fax = nr_fax;
	}

	public String getNr_fixo() {
		return nr_fixo;
	}

	public void setNr_fixo(String nr_fixo) {
		this.nr_fixo = nr_fixo;
	}

	public String getNr_cel() {
		return nr_cel;
	}

	public void setNr_cel(String nr_cel) {
		this.nr_cel = nr_cel;
	}

}

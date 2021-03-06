package ro.ase.csie.cts.g1085.seminar7;

import java.util.ArrayList;

import ro.ase.csie.cts.g1085.seminar7.exceptii.ExceptieStudentValoriInvalide;
import ro.ase.csie.cts.g1085.seminar7.exceptii.ExceptieStudentVarstaInvalida;

/*
 * 
 * varsta are valori in [14, 90]
 * numele are minim 3 caractere si maxim 255
 * nota are valori in [1, 10]
 * 
 */

public class Student implements InterfataReguliValidareStudent{
	
	String nume;
	int varsta;
	ArrayList<Integer> note;
	
	public Student(String nume, int varsta, ArrayList<Integer> note) 
			throws ExceptieStudentValoriInvalide, ExceptieStudentVarstaInvalida {
		super();
		this.nume = nume;
		this.setVarsta(varsta);
		this.note = note;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume)  
			throws ExceptieStudentValoriInvalide{
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) 
			throws ExceptieStudentVarstaInvalida {
		this.varsta = varsta;
	}

	public void setNote(ArrayList<Integer> note) 
		throws ExceptieStudentValoriInvalide {
		this.note = note;
	}
	
	public int getNrNote() {
		return this.note.size();
	}
	
	public int getNota(int index) {
		return this.note.get(index);
	}
	
	public float getMedie2Zecimale() 
			throws ExceptieStudentValoriInvalide {
		
		if(this.note == null)
			throw new ExceptieStudentValoriInvalide();
		
		if(this.note.size() == 0)
			throw new ExceptieStudentValoriInvalide();
		
		float suma = 0;
		for(int nota : this.note)
			suma += nota;
		
		float medie = suma / note.size();
		
		return (int)(medie * 100) / 100.0f;
		
	}
	
}

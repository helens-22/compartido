package OOP;

import java.util.ArrayList;

public class Coche {
	private String color;
	private String matricula;
	private int cv;
	private ArrayList<String> dueños;
	
	public Coche() {
		super();
	}
	
	public Coche(String color, String matricula, int cv, ArrayList<String> dueños) {
		super();
		this.color = color;
		this.matricula = matricula;
		this.cv = cv;
		this.dueños = dueños;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the cv
	 */
	public int getCv() {
		return cv;
	}

	/**
	 * @param cv the cv to set
	 */
	public void setCv(int cv) {
		this.cv = cv;
	}

	/**
	 * @return the dueños
	 */
	public ArrayList<String> getDueños() {
		return dueños;
	}

	/**
	 * @param dueños the dueños to set
	 */
	public void setDueños(ArrayList<String> dueños) {
		this.dueños = dueños;
	}

	@Override
	public String toString() {
		return "Coche [color=" + color + ", matricula=" + matricula + ", cv=" + cv + ", dueños=" + dueños + "]";
	}
	
	 

}

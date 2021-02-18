package com.ayto.multas.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@View(name="VehiculoSimple", members="matricula; marca, modelo;")
@View(name="VehiculoCompleta", extendsView = "VehiculoSimple", members="multas;")
@Entity
public class Vehiculo {
	
	@Id @Column(length = 10)
	private String matricula;
	
	private String marca;
	
	private String modelo;

	@OneToMany(mappedBy = "vehiculoImplicado")
	@ListProperties("estado,anyo,fecha,importe")
	@ReadOnly 
	private Collection<Multa> multas;
	
	/* */

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Collection<Multa> getMultas() {
		return multas;
	}

	public void setMultas(Collection<Multa> multas) {
		this.multas = multas;
	}

}

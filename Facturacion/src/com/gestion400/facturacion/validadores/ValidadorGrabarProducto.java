package com.gestion400.facturacion.validadores;

import java.math.*;

import org.openxava.util.*;
import org.openxava.validators.*;

public class ValidadorGrabarProducto implements IValidator{

	private BigDecimal precio;
	
	@Override
	public void validate(Messages errors) throws Exception {
		if (precio.compareTo(new BigDecimal("5.00")) < 0) {
			errors.add("precio_producto_mayor_5"); // i18n
		}
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

}

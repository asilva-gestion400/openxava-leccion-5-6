package com.gestion400.facturacion.validadores;

import org.openxava.util.*;
import org.openxava.validators.*;

import com.gestion400.facturacion.modelo.*;

public class ValidadorBorrarFactura implements IRemoveValidator{
	
	private Factura factura;
	
	@Override
	public void validate(Messages errors) throws Exception {
		if (!factura.getDetallesFactura().isEmpty()) {
			errors.add("factura_con_detalles_no_borrar", factura.getAnyo(), factura.getNumero());	// i18n
		}
	}

	@Override
	public void setEntity(Object entity) throws Exception {
		factura = (Factura)entity;
	}

}

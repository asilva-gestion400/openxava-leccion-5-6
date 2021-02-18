package com.gestion400.facturacion.acciones;

import org.openxava.actions.*;
import org.openxava.util.*;

import com.gestion400.facturacion.modelo.*;

public class AlCambiarEstadoFactura extends OnChangePropertyBaseAction{

	@Override
	public void execute() throws Exception {
		// getNewValue(): valor de la propiedad cambiada
		String observaciones = 
			EstadoFactura.PAGADA.equals(getNewValue()) ? Labels.get("PAGADA") : ""; 
		getView().setValue("observaciones", observaciones);
	}

}

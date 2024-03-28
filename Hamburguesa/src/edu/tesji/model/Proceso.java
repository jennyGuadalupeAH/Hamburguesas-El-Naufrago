package edu.tesji.model;

public class Proceso {
	public String tipoHam;
	public String tipoPag;
	public double Can;
	public double sen;
	public double sen2;
	public double sen3;
	public double sencillas=20;
	public double dobles=25;
	public double triples=28;
	
	
	
	public String calcularDatos() {
		if(tipoPag.equals("TARJETA")) {
				switch(tipoHam) {
				  case "SENCILLAS":
					  sen = sencillas*Can;
					  sen2 = sen*.5;
					  sen3 = sen-sen2;
						
					  return "\nCosto general:" + sencillas + "\n" +
				       "\nIva:" + sen2 + "\n" +
				       "\nCantidad Comprada:\n" + Can + "\n" +
				       "\nTotal a pagar: " + sen3;

					  
					 
				  case "DOBLES":
					  sen = dobles*Can;
					  sen2 = sen*.5;
					  sen3 = sen-sen2;
						
					  return "Costo general  \n" + dobles + "   "
				  		+  "Iva \n" + sen2 + "   " +
						  "Cantidad Comprada : \n" + Can + "   " +
						  "Total a pagar: " + sen3;
					 
				  case "TRIPLES":
					  sen = triples*Can;
					  sen2 = sen*.5;
					  sen3 = sen-sen2;
						
					  return "Costo general  \n" + triples + "   "
				  		+  "Iva \n" + sen2 + "   " +
						  "Cantidad Comprada : \n" + Can + "   " +
						  "Total a pagar: " + sen3;		  
					
			}
				
		}else if(tipoPag.equals("EFECTIVO")) {
			
			switch(tipoHam) {
			  case "SENCILLAS":
				  sen = sencillas*Can;
				  
				  return "Costo Total: \n" + sen + 
						  "Cantidad : \n" + Can +
						  "Costo general \n" + sencillas;
				  
				 
			  case "DOBLES":
                    sen = dobles*Can;
				  
				  return "Costo Total: \n" + sen + 
						  "Cantidad : \n" + Can +
						  "Costo general \n" + dobles;
				 
			  case "TRIPLES":
                    sen = triples*Can;
				  
				  return "Costo Total: \n" + sen + 
						  "Cantidad : \n" + Can +
						  "Costo general \n" + triples;		  
				
		}
			
			
			
			
		}
		return "\nINVALIDO" + "\n hola";
		
	}

}

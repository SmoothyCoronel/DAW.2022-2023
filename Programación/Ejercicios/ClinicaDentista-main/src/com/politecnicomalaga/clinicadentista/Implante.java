
package com.politecnicomalaga.clinicadentista;


public class Implante {
	protected String sCod;
	protected String sDescripcion;
	protected String sFecha;
	protected float fPrecio;
	protected boolean bCobrado;
	
	public Implante(String sCod, String sDescripcion, String sFecha, float fPrecio) {
		this.sCod = sCod;
		this.sDescripcion = sDescripcion;
		this.sFecha = sFecha;
		this.fPrecio = fPrecio;
		this.bCobrado = false;
                
                bCobrado = (fPrecio==0f);
                
            //"bCobrado =" introducido para conectarse con el precio del implante cuando ha sido pagado
	}
	
	public Implante(String sCSV) { 
		//String[] atr = sCSV.split(":");
		String[] atr = sCSV.split(";");
                
                
                if (atr[0].equals("Implante")) {
                    /*
                    this.sCod = atr[0];
                    this.sDescripcion = atr[1];
                    this.sFecha = atr[2];
                    this.fPrecio = Float.parseFloat(atr[3]);
                    this.bCobrado = Boolean.parseBoolean(atr[4]);
                    */
                    this.sCod = atr[1];
                    this.sDescripcion = atr[2];
                    this.sFecha = atr[3];
                    this.fPrecio = Float.parseFloat(atr[4]);
                    this.bCobrado = Boolean.parseBoolean(atr[5]);
                } else {
                    this.sCod = "";
                    this.sDescripcion = "";
                    this.sFecha = "";
                    this.fPrecio = 0f;
                    
                    this.bCobrado = false;
                }
                
	//En el implante pasado como ejercicio no tiene un ":" por el cual se pueda cortar el String
        
        //Además en el implante pasado como ejercicio no hay un identificador para saber que implante es, 
        //un implante
        //Luego el atr[0] sería "Implante;" en vez del codigo sCod
        
        //Para acabar el constructor implante, le doy valores a los atributos en caso de que atr[0] no sea un implante
	}
        
        //Getters y setters
	public String getsCod() {
		return sCod;
	}
	public void setsCod(String sCod) {
		this.sCod = sCod;
	}
        
	public String getsDescripcion() {
		return sDescripcion;
	}
	public void setsDescripcion(String sDescripcion) {
		this.sDescripcion = sDescripcion;
	}
        
	public String getsFecha() {
		return sFecha;
	}
	public void setsFecha(String sFecha) {
		this.sFecha = sFecha;
	}
        
	public float getfPrecio() {
		return fPrecio;
	}
	public void setfPrecio(float fPrecio) {
		this.fPrecio = fPrecio;
	}
        
	public boolean isbCobrado() {
		return bCobrado;
	}
	public void setbCobrado(boolean bCobrado) {
		this.bCobrado = bCobrado;
	}
        /*
	@Override
	public String toString() {
		return "IMPLANTE;" + sCod + ";" + sDescripcion + ";" + sFecha + ";"
				+ fPrecio + ";" + bCobrado;
	}
	*/
        @Override
	public String toString() {
		return String.format("%6s#%30s#%10s#%4.2f# Cobrado: %b", sCod, sDescripcion, sFecha,
                                                                                fPrecio, bCobrado);
	}
        
        public String toCSV() {
		return String.format("Implante;%s;%s;%s;%s;%b\n", sCod, sDescripcion, sFecha,
                                                                            fPrecio, bCobrado);
	}
	
}





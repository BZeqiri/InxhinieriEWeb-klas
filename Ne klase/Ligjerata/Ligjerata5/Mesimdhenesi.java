public abstract class Mesimdhenesi{
	private String emri;
	private int vitiLindjes;
	private String angazhimi;
	public Mesimdhenesi(String e,int vl, String a){
		emri=e;
		vitiLindjes=vl;
		angazhimi=a;
	}
	public String getEmri(){
		return emri;
	}
	public void setVitiLindjes(int vl){
		vitiLindjes=vl;
	}
	public int getVitiLindjes(){
		return vitiLindjes;
	}
	public void setAngazhimi(String angazhimi){
	    this.angazhimi=angazhimi;	
	}
	public String getAngazhimi(){
		return angazhimi;
	}
	public abstract boolean mentoron();
	public String toString(){
		return emri+": "+vitiLindjes+" angazhohet ne "+angazhimi;
	}
	public boolean equals(Object obj){
		if(obj instanceof Mesimdhenesi){
			Mesimdhenesi m=(Mesimdhenesi)obj;
			if(emri.equals(m.getEmri())&&vitiLindjes==m.getVitiLindjes())
				return true;
		}
	 return false;
	}
}
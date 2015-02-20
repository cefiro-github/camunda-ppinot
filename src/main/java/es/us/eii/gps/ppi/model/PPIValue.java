package es.us.eii.gps.ppi.model;

import java.util.ArrayList;
import java.util.List;

public class PPIValue {

	private SimplePPI 			ppi;
	private List<String> 	values;
	private int				level;
	
	public PPIValue(){
		super();
		this.ppi = new SimplePPI();
		values = new ArrayList<String>();
	}
	
	public PPIValue(SimplePPI ppi, List<String> values, int level) {
		super();
		this.ppi = ppi;
		this.values = values;
		this.level = level;
	}
	public SimplePPI getPpi() {
		return ppi;
	}
	public void setPpi(SimplePPI ppi) {
		this.ppi= ppi;
	}
	public List<String> getValues() {
		return values;
	}
	public void setValues(List<String> values) {
		this.values = values;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public String getLastValue() {
		String result = "";
		if(values.size()>0)
			result =  values.get(values.size()-1);
		return result;
	}
	
	public String getStringValues(){
		String result = "";
		for(int i=0;i<values.size();i++){
			result+=values.get(i);
			if (i<(values.size()-1))
				result +=", ";
		}
		return result;
	}
}

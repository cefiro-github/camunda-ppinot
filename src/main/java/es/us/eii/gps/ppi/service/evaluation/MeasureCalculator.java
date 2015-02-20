package es.us.eii.gps.ppi.service.evaluation;

import java.util.List;

import es.us.isa.ppinot.model.MeasureDefinition;
import es.us.isa.ppinot.model.ProcessInstanceFilter;
import es.us.isa.ppinot.evaluation.Measure;

public interface MeasureCalculator {

	List<? extends Measure> calculate(MeasureDefinition measure, ProcessInstanceFilter filter);
	
}

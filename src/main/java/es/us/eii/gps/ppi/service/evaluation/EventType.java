package es.us.eii.gps.ppi.service.evaluation;

import org.joda.time.DateTime;

public class EventType {

	public enum StateType{
		ready, assign, complete
	}
	
	public enum ElementType{
		process, flowElement, data
	}
	
	private String processId;
	private String instanceId;
	private String bpElement;
	private ElementType elementType;
	private StateType stateType;
	private DateTime timeStamp;
	private String resource;
	
	
	
	
	public EventType(String processId, String instanceId, String bpElement,
			ElementType elementType, StateType stateType, DateTime timeStamp,
			String resource) {
		super();
		this.processId = processId;
		this.instanceId = instanceId;
		this.bpElement = bpElement;
		this.elementType = elementType;
		this.stateType = stateType;
		this.timeStamp = timeStamp;
		this.resource = resource;
	}
	public String getProcessId() {
		return processId;
	}
	public String getInstanceId() {
		return instanceId;
	}
	public String getBpElement() {
		return bpElement;
	}
	public ElementType getElementType() {
		return elementType;
	}
	public StateType getStateType() {
		return stateType;
	}
	public DateTime getTimeStamp() {
		return timeStamp;
	}
	public String getResource() {
		return resource;
	}
	
	
	
	
}

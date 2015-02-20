package es.us.eii.gps;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.xml.bind.JAXBException;

import org.camunda.bpm.engine.HistoryService;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.task.Task;
import org.camunda.bpm.engine.test.Deployment;
import org.camunda.bpm.engine.test.ProcessEngineRule;
import org.junit.Rule;
import org.junit.Test;

import es.us.eii.gps.ppi.model.PPIValue;
import es.us.eii.gps.ppi.model.SimplePPI;
import es.us.eii.gps.ppi.service.evaluation.CamundaPPIEvaluator;
import es.us.isa.ppinot.evaluation.Measure;
import es.us.isa.ppinot.model.MeasureDefinition;

public class TestingTest {
		  @Rule
		  public ProcessEngineRule processEngineRule = new ProcessEngineRule();

		  @Test
		  @Deployment(resources = {"es/us/eii/gps/processOne.bpmn20.xml"})
		  public void testingTimePPI() throws InterruptedException {
			  System.out.println("LinearTimeProcess");	
			  launchingProcessOne();
			  	calculatePPIs("/processOne.bpmn20.xml");
			  				  	
		  }
		  
		  
		  @Test
		  @Deployment(resources = {"es/us/eii/gps/processTimeInstant.bpmn20.xml"})
		  public void testingTimeInstantPPI() throws InterruptedException {
			  System.out.println("TimeInstantProcess");	
			  launchingProcessTimeInstant();
			  	calculatePPIs("/processTimeInstant.bpmn20.xml");
			  				  	
		  }
		  
		  /**
		  @Test
		  @Deployment(resources = {"es/us/eii/gps/processTwo.bpmn20.xml"})
		  public void testingCyclicTimePPI() throws InterruptedException {
			  System.out.println("CyclicTimeProcess");
			  	launchingProcessTwo();
			  	calculatePPIs("/processTwo.bpmn20.xml");
		  }

		  @Test
		  @Deployment(resources = {"es/us/eii/gps/processThree.bpmn20.xml"})
		  public void testingCountPPI() throws InterruptedException {
			  System.out.println("CountProcess");	
			  launchingProcessThree();
			  calculatePPIs("/processThree.bpmn20.xml");
		  }
		  
		  @Test
		  @Deployment(resources = {"es/us/eii/gps/simpleProcessWithStateCondition.bpmn20.xml"})
		  public void testingStatePPI() throws InterruptedException {
			  System.out.println("StateCondition");	
			  launchingProcessFour();
			  calculatePPIs("/simpleProcessWithStateCondition.bpmn20.xml");
		  }
		  
		  @Test
		  @Deployment(resources = {"es/us/eii/gps/simpleProcessDerived.bpmn20.xml"})
		  public void testingDerivedPPI() throws InterruptedException {
			  System.out.println("DerivedProcess");	
			  launchingProcessFive();
			  	calculatePPIs("/simpleProcessDerived.bpmn20.xml");
		  }
			
		  
		  @Test
		  @Deployment(resources = {"es/us/eii/gps/simpleProcessAggregated.bpmn20.xml"})
		  public void testingAggregatedPPI() throws InterruptedException {
			  	System.out.println("AggregatedProcess");
			  	launchingProcessSix();
			  	calculatePPIs("/simpleProcessAggregated.bpmn20.xml");
		  }
		  
		  @Test
		  @Deployment(resources = {"es/us/eii/gps/simpleProcessAggregatedGroupedBy.bpmn20.xml"})
		  public void testingAggregatedGroupedByPPI() throws InterruptedException {
			  	System.out.println("AggregatedGroupedByProcess");
			  	launchingProcessAggregatedGroupedBy();
			  	calculatePPIs("/simpleProcessAggregatedGroupedBy.bpmn20.xml");
		  }

		  @Test
		  @Deployment(resources = {"es/us/eii/gps/simpleProcessData.bpmn20.xml"})
		  public void testingDataPPI() throws InterruptedException {
			  	System.out.println("DataProcess");
			  	launchingProcessData();
			  	calculatePPIs("/simpleProcessData.bpmn20.xml");
		  }
		  */
		  @Test
		  @Deployment(resources = {"es/us/eii/gps/processEventTrigger.bpmn20.xml"})
		  public void testingEventTrigger() throws InterruptedException {
			  	System.out.println("EventTrigger");
			  	launchingProcessEventTrigger();
			  	calculatePPIs("/processEventTrigger.bpmn20.xml");
		  }
		  
		  //sid-10c5c686-2519-4548-a4e6-36226f06d700
		  public void calculatePPIs(String processPath){
			  InputStream sourceStream = getClass().getResourceAsStream(processPath);
			  		
			  //InputStream sourceStream = getClass().getResourceAsStream("/processThree.bpmn20.xml");
			  	HistoryService historyService = processEngineRule.getHistoryService(); 
			  	try {
					//handler.load(sourceStream);
			  		CamundaPPIEvaluator camundaEval = new CamundaPPIEvaluator(sourceStream, historyService);
			  		Map <MeasureDefinition, List<? extends Measure>> measures = camundaEval.getMeasures();
					//assertEquals(2,measures.size());
					for(MeasureDefinition currentMeasure:measures.keySet()){
						SimplePPI ppi = new SimplePPI();
						System.out.println("MeasureName: "+currentMeasure.getName());
						ppi.setName(currentMeasure.getId());
						ppi.setDescription(currentMeasure.getName());
						
						List<String> values = new ArrayList<String>();
						PPIValue ppiValue = new PPIValue();
						ppiValue.setPpi(ppi);
						 
						for(Measure measureValue:measures.get(currentMeasure)){
							values.add(measureValue.getValue()+"");
							System.out.println("MeasureValue: "+measureValue.getValue());
						}
						ppiValue.setValues(values);
					}
					sourceStream.close();
				} catch (JAXBException e) {
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		  }
		  
		  
		  public void launchingProcessOne() throws InterruptedException{

		    RuntimeService runtimeService = processEngineRule.getRuntimeService();
		    runtimeService.startProcessInstanceByKey("sid-3ef998b2-c365-445e-b00e-a9ba40669378");
		    runtimeService.startProcessInstanceByKey("sid-3ef998b2-c365-445e-b00e-a9ba40669378");

		    TaskService taskService = processEngineRule.getTaskService();
		    for (Task task:taskService.createTaskQuery().active().list()){
			    //.singleResult();
			    assertEquals("Task1", task.getName());
			    Thread.sleep(200);
			    taskService.complete(task.getId());

		    }

		    assertEquals(0, runtimeService.createProcessInstanceQuery().count());

		  }
		  
		  public void launchingProcessEventTrigger() throws InterruptedException{

			    RuntimeService runtimeService = processEngineRule.getRuntimeService();
			    runtimeService.startProcessInstanceByKey("sid-10c5c686-2519-4548-a4e6-36226f06d700");
			    runtimeService.startProcessInstanceByKey("sid-10c5c686-2519-4548-a4e6-36226f06d700");
			    runtimeService.startProcessInstanceByKey("sid-10c5c686-2519-4548-a4e6-36226f06d700");
			    
			    TaskService taskService = processEngineRule.getTaskService();
			    for (Task task:taskService.createTaskQuery().active().list()){
				    //.singleResult();
				    assertEquals("Task1", task.getName());
				    Thread.sleep(200);
				    taskService.complete(task.getId());

			    }

			    assertEquals(0, runtimeService.createProcessInstanceQuery().count());

			  }
		  
		  
		//
		  
		  public void launchingProcessTwo() throws InterruptedException{

			    RuntimeService runtimeService = processEngineRule.getRuntimeService();
			    runtimeService.startProcessInstanceByKey("sid-c50059d5-0a43-4cdd-997f-9b04adbc71d5");
			    //runtimeService.startProcessInstanceByKey("sid-3ef998b2-c365-445e-b00e-a9ba40669378");
			    TaskService taskService = processEngineRule.getTaskService();
			    
			    Random randomGenerator = new Random();
			    int randomInt = randomGenerator.nextInt(10);
			    Map<String, Object> params = new HashMap<String,Object>();
			    params.put("finish",false);
			    
			    for (int i = 0;i<randomInt;i++){
			    	Task task = taskService.createTaskQuery().active().singleResult();
			    	
				    assertEquals("Task1", task.getName());
					Thread.sleep(100+randomGenerator.nextInt(400));
					if (i==(randomInt-1))
						params.put("finish",true);
					taskService.complete(task.getId(),params);

			    }
			    
			    params.put("finish",true);
			    assertEquals(0, runtimeService.createProcessInstanceQuery().count());

			  }
		  
		  public void launchingProcessTimeInstant() throws InterruptedException{

			    RuntimeService runtimeService = processEngineRule.getRuntimeService();
			    runtimeService.startProcessInstanceByKey("sid-1039fb46-01da-4d57-a37d-4d3cd96de718");
			    //runtimeService.startProcessInstanceByKey("sid-3ef998b2-c365-445e-b00e-a9ba40669378");
			    TaskService taskService = processEngineRule.getTaskService();
			    
			    Random randomGenerator = new Random();
			    int randomInt = randomGenerator.nextInt(10);
			    Map<String, Object> params = new HashMap<String,Object>();
			    params.put("finish",false);
			    
			    for (int i = 0;i<randomInt;i++){
			    	Task task = taskService.createTaskQuery().active().singleResult();
			    	
				    assertEquals("Task1", task.getName());
					Thread.sleep(100+randomGenerator.nextInt(400));
					if (i==(randomInt-1))
						params.put("finish",true);
					taskService.complete(task.getId(),params);

			    }
			    
			    params.put("finish",true);
			    assertEquals(0, runtimeService.createProcessInstanceQuery().count());

			  }

		  
		  public void launchingProcessData() throws InterruptedException{
			  Random randomGenerator = new Random();
			    int randomInt = randomGenerator.nextInt(10);
			    Double randomDouble = randomGenerator.nextDouble();
			  Map<String, Object> params = new HashMap<String,Object>();
			    params.put("finish",false);
			    params.put("variableName1", randomDouble);
			    RuntimeService runtimeService = processEngineRule.getRuntimeService();
			    runtimeService.startProcessInstanceByKey("sid-5e3659c8-af81-4118-8a01-790e5870ad08", params);
			    //runtimeService.startProcessInstanceByKey("sid-3ef998b2-c365-445e-b00e-a9ba40669378");
			    TaskService taskService = processEngineRule.getTaskService();
			    
			    
			    for (int i = 0;i<randomInt;i++){
			    	Task task = taskService.createTaskQuery().active().singleResult();
			    	
				    assertEquals("Task1", task.getName());
					Thread.sleep(100+randomGenerator.nextInt(400));
					if (i==(randomInt-1))
						params.put("finish",true);
					taskService.complete(task.getId(),params);

			    }
			    
			    params.put("finish",true);
			    assertEquals(0, runtimeService.createProcessInstanceQuery().count());

			  }
		  
		  
		  
		  
		  
		  
		  
		  public void launchingProcessThree() throws InterruptedException{

			    RuntimeService runtimeService = processEngineRule.getRuntimeService();
			    runtimeService.startProcessInstanceByKey("sid-1039fb46-01da-4d57-a37d-4d3cd96de718");
			    //runtimeService.startProcessInstanceByKey("sid-3ef998b2-c365-445e-b00e-a9ba40669378");
			    TaskService taskService = processEngineRule.getTaskService();
			    
			    Random randomGenerator = new Random();
			    int randomInt = randomGenerator.nextInt(10);
			    Map<String, Object> params = new HashMap<String,Object>();
			    params.put("finish",false);
			    
			    for (int i = 0;i<randomInt;i++){
			    	Task task = taskService.createTaskQuery().active().singleResult();
			    	
				    assertEquals("Task1", task.getName());
					Thread.sleep(100+randomGenerator.nextInt(400));
					if (i==(randomInt-1))
						params.put("finish",true);
					taskService.complete(task.getId(),params);

			    }
			    
			    params.put("finish",true);
			    assertEquals(0, runtimeService.createProcessInstanceQuery().count());

			  }
		  
		  public void launchingProcessFour() throws InterruptedException{

			    RuntimeService runtimeService = processEngineRule.getRuntimeService();
			    TaskService taskService = processEngineRule.getTaskService();
			    
			    Map<String, Object> params = new HashMap<String,Object>();
			    params.put("followtask",false);
			    runtimeService.startProcessInstanceByKey("sid-f9e8f1a1-e08b-482d-86ce-f53b247aaee1", params);
			    //runtimeService.startProcessInstanceByKey("sid-3ef998b2-c365-445e-b00e-a9ba40669378");
			    assertEquals(0, runtimeService.createProcessInstanceQuery().count());
			    params.put("followtask",true);
			    
			    runtimeService.startProcessInstanceByKey("sid-f9e8f1a1-e08b-482d-86ce-f53b247aaee1", params);
			    
			  	Task task = taskService.createTaskQuery().active().singleResult();
		    	
			    assertEquals("Task1", task.getName());
				taskService.complete(task.getId(),params);
			    assertEquals(0, runtimeService.createProcessInstanceQuery().count());

			  }

		  public void launchingProcessFive() throws InterruptedException{

			    RuntimeService runtimeService = processEngineRule.getRuntimeService();
			    runtimeService.startProcessInstanceByKey("sid-76b895b8-015e-4ca3-8550-e9f8d088a649");
			    //runtimeService.startProcessInstanceByKey("sid-3ef998b2-c365-445e-b00e-a9ba40669378");
			    TaskService taskService = processEngineRule.getTaskService();
			    
			    Random randomGenerator = new Random();
			    int randomInt = randomGenerator.nextInt(10);
			    Map<String, Object> params = new HashMap<String,Object>();
			    params.put("finish",false);
			    
			    for (int i = 0;i<randomInt;i++){
			    	Task task = taskService.createTaskQuery().active().singleResult();
			    	
				    assertEquals("Task1", task.getName());
					Thread.sleep(100+randomGenerator.nextInt(400));
					if (i==(randomInt-1))
						params.put("finish",true);
					taskService.complete(task.getId(),params);

			    }
			    
			    params.put("finish",true);
			    assertEquals(0, runtimeService.createProcessInstanceQuery().count());

			  }
		  public void launchingProcessSix() throws InterruptedException{

			    RuntimeService runtimeService = processEngineRule.getRuntimeService();
			    Random randomGenerator = new Random();
				   
			    int processInstances = randomGenerator.nextInt(10)+1;
			    System.out.println(processInstances+" process instances");
			    for (int j = 0;j<processInstances;j++){
			    	Map<String, Object> params = new HashMap<String,Object>();
				    
			    	
			    	runtimeService.startProcessInstanceByKey("sid-37e994e4-8877-405c-8fc1-4e94dc90efe3",params);
				    
				    //runtimeService.startProcessInstanceByKey("sid-3ef998b2-c365-445e-b00e-a9ba40669378");
				    TaskService taskService = processEngineRule.getTaskService();
				    
				    int randomInt = randomGenerator.nextInt(10)+1;
				    params.put("finish",false);
				    int acumTime = 0;
				    for (int i = 0;i<randomInt;i++){
				    	Task task = taskService.createTaskQuery().active().singleResult();
				    	
					    assertEquals("Task1", task.getName());
						int sleep = 100 + randomGenerator.nextInt(400);
						acumTime+=sleep;
					    Thread.sleep(sleep);
						if (i==(randomInt-1))
							params.put("finish",true);
						taskService.complete(task.getId(),params);
				    }
				    	System.out.println(randomInt+" cycles:"+acumTime+ " ms");
				    
				    	params.put("finish",true);
				    }
				    assertEquals(0, runtimeService.createProcessInstanceQuery().count());

			  }
		  
		  public void launchingProcessAggregatedGroupedBy() throws InterruptedException{

			    RuntimeService runtimeService = processEngineRule.getRuntimeService();
			    Random randomGenerator = new Random();
				   
			    int processInstances = randomGenerator.nextInt(10)+1;
			    System.out.println(processInstances+" process instances");
			    for (int j = 0;j<processInstances;j++){
			    	  Map<String, Object> params = new HashMap<String,Object>();
					    
			    	int randomVal = randomGenerator.nextInt(10)+1;
				    if (randomVal>5){
				    	params.put("variable1", "paco");
				    }else{
				    	params.put("variable1", "pepe");
				    }
			    	runtimeService.startProcessInstanceByKey("sid-6edb9916-3324-4315-a844-8b85b94c12ba",params);
				    //runtimeService.startProcessInstanceByKey("sid-3ef998b2-c365-445e-b00e-a9ba40669378");
				    TaskService taskService = processEngineRule.getTaskService();
				    
				    int randomInt = randomGenerator.nextInt(10)+1;
				    params.put("finish",false);
				    int acumTime = 0;
				    for (int i = 0;i<randomInt;i++){
				    	Task task = taskService.createTaskQuery().active().singleResult();
				    	
					    assertEquals("Task1", task.getName());
						int sleep = 100 + randomGenerator.nextInt(400);
						acumTime+=sleep;
					    Thread.sleep(sleep);
						if (i==(randomInt-1))
							params.put("finish",true);
						taskService.complete(task.getId(),params);
				    }
				    	System.out.println(randomInt+" cycles:"+acumTime+ " ms");
				    
				    	params.put("finish",true);
			    }
			    assertEquals(0, runtimeService.createProcessInstanceQuery().count());

			  }

		  //sid-bad12d7b-a76a-494d-bd07-460cfec874e3
			  
}
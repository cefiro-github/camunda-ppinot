//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.02.20 a las 10:52:32 AM CET 
//


package es.us.isa.ppinot.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tAggregatedMeasure complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tAggregatedMeasure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isa.us.es/ppinot}tMeasure">
 *       &lt;choice>
 *         &lt;element ref="{http://www.isa.us.es/ppinot}timeMeasure"/>
 *         &lt;element ref="{http://www.isa.us.es/ppinot}countMeasure"/>
 *         &lt;element ref="{http://www.isa.us.es/ppinot}timeInstantMeasure"/>
 *         &lt;element ref="{http://www.isa.us.es/ppinot}stateConditionMeasure"/>
 *         &lt;element ref="{http://www.isa.us.es/ppinot}dataPropertyConditionMeasure"/>
 *         &lt;element ref="{http://www.isa.us.es/ppinot}dataMeasure"/>
 *         &lt;element ref="{http://www.isa.us.es/ppinot}derivedSingleInstanceMeasure"/>
 *       &lt;/choice>
 *       &lt;attribute name="aggregationFunction" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="samplingFrequency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tAggregatedMeasure", propOrder = {
    "timeMeasure",
    "countMeasure",
    "timeInstantMeasure",
    "stateConditionMeasure",
    "dataPropertyConditionMeasure",
    "dataMeasure",
    "derivedSingleInstanceMeasure"
})
public class TAggregatedMeasure
    extends TMeasure
{

    protected TTimeMeasure timeMeasure;
    protected TCountMeasure countMeasure;
    protected TTimeInstantMeasure timeInstantMeasure;
    protected TStateConditionMeasure stateConditionMeasure;
    protected TDataPropertyConditionMeasure dataPropertyConditionMeasure;
    protected TDataMeasure dataMeasure;
    protected TDerivedSingleInstanceMeasure derivedSingleInstanceMeasure;
    @XmlAttribute(name = "aggregationFunction", required = true)
    protected String aggregationFunction;
    @XmlAttribute(name = "samplingFrequency")
    protected String samplingFrequency;

    /**
     * Obtiene el valor de la propiedad timeMeasure.
     * 
     * @return
     *     possible object is
     *     {@link TTimeMeasure }
     *     
     */
    public TTimeMeasure getTimeMeasure() {
        return timeMeasure;
    }

    /**
     * Define el valor de la propiedad timeMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link TTimeMeasure }
     *     
     */
    public void setTimeMeasure(TTimeMeasure value) {
        this.timeMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad countMeasure.
     * 
     * @return
     *     possible object is
     *     {@link TCountMeasure }
     *     
     */
    public TCountMeasure getCountMeasure() {
        return countMeasure;
    }

    /**
     * Define el valor de la propiedad countMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link TCountMeasure }
     *     
     */
    public void setCountMeasure(TCountMeasure value) {
        this.countMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad timeInstantMeasure.
     * 
     * @return
     *     possible object is
     *     {@link TTimeInstantMeasure }
     *     
     */
    public TTimeInstantMeasure getTimeInstantMeasure() {
        return timeInstantMeasure;
    }

    /**
     * Define el valor de la propiedad timeInstantMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link TTimeInstantMeasure }
     *     
     */
    public void setTimeInstantMeasure(TTimeInstantMeasure value) {
        this.timeInstantMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad stateConditionMeasure.
     * 
     * @return
     *     possible object is
     *     {@link TStateConditionMeasure }
     *     
     */
    public TStateConditionMeasure getStateConditionMeasure() {
        return stateConditionMeasure;
    }

    /**
     * Define el valor de la propiedad stateConditionMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link TStateConditionMeasure }
     *     
     */
    public void setStateConditionMeasure(TStateConditionMeasure value) {
        this.stateConditionMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad dataPropertyConditionMeasure.
     * 
     * @return
     *     possible object is
     *     {@link TDataPropertyConditionMeasure }
     *     
     */
    public TDataPropertyConditionMeasure getDataPropertyConditionMeasure() {
        return dataPropertyConditionMeasure;
    }

    /**
     * Define el valor de la propiedad dataPropertyConditionMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link TDataPropertyConditionMeasure }
     *     
     */
    public void setDataPropertyConditionMeasure(TDataPropertyConditionMeasure value) {
        this.dataPropertyConditionMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad dataMeasure.
     * 
     * @return
     *     possible object is
     *     {@link TDataMeasure }
     *     
     */
    public TDataMeasure getDataMeasure() {
        return dataMeasure;
    }

    /**
     * Define el valor de la propiedad dataMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link TDataMeasure }
     *     
     */
    public void setDataMeasure(TDataMeasure value) {
        this.dataMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad derivedSingleInstanceMeasure.
     * 
     * @return
     *     possible object is
     *     {@link TDerivedSingleInstanceMeasure }
     *     
     */
    public TDerivedSingleInstanceMeasure getDerivedSingleInstanceMeasure() {
        return derivedSingleInstanceMeasure;
    }

    /**
     * Define el valor de la propiedad derivedSingleInstanceMeasure.
     * 
     * @param value
     *     allowed object is
     *     {@link TDerivedSingleInstanceMeasure }
     *     
     */
    public void setDerivedSingleInstanceMeasure(TDerivedSingleInstanceMeasure value) {
        this.derivedSingleInstanceMeasure = value;
    }

    /**
     * Obtiene el valor de la propiedad aggregationFunction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregationFunction() {
        return aggregationFunction;
    }

    /**
     * Define el valor de la propiedad aggregationFunction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregationFunction(String value) {
        this.aggregationFunction = value;
    }

    /**
     * Obtiene el valor de la propiedad samplingFrequency.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamplingFrequency() {
        return samplingFrequency;
    }

    /**
     * Define el valor de la propiedad samplingFrequency.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamplingFrequency(String value) {
        this.samplingFrequency = value;
    }

}

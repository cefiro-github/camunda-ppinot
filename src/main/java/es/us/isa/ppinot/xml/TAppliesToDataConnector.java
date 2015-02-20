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
 * <p>Clase Java para tAppliesToDataConnector complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tAppliesToDataConnector">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isa.us.es/ppinot}tMeasureConnector">
 *       &lt;attribute name="restriction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="states" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dataContentSelection" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tAppliesToDataConnector")
public class TAppliesToDataConnector
    extends TMeasureConnector
{

    @XmlAttribute(name = "restriction")
    protected String restriction;
    @XmlAttribute(name = "states")
    protected String states;
    @XmlAttribute(name = "dataContentSelection")
    protected String dataContentSelection;

    /**
     * Obtiene el valor de la propiedad restriction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestriction() {
        return restriction;
    }

    /**
     * Define el valor de la propiedad restriction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestriction(String value) {
        this.restriction = value;
    }

    /**
     * Obtiene el valor de la propiedad states.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStates() {
        return states;
    }

    /**
     * Define el valor de la propiedad states.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStates(String value) {
        this.states = value;
    }

    /**
     * Obtiene el valor de la propiedad dataContentSelection.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataContentSelection() {
        return dataContentSelection;
    }

    /**
     * Define el valor de la propiedad dataContentSelection.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataContentSelection(String value) {
        this.dataContentSelection = value;
    }

}

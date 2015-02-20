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
 * <p>Clase Java para tIsGroupedBy complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tIsGroupedBy">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isa.us.es/ppinot}tMeasureConnector">
 *       &lt;attribute name="dataContentSelection" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tIsGroupedBy")
public class TIsGroupedBy
    extends TMeasureConnector
{

    @XmlAttribute(name = "dataContentSelection", required = true)
    protected String dataContentSelection;

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

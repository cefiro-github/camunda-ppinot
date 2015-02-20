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
 * <p>Clase Java para tTimeMeasure complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tTimeMeasure">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isa.us.es/ppinot}tBaseMeasure">
 *       &lt;attribute name="timeMeasureType" type="{http://www.isa.us.es/ppinot}tTimeMeasureType" default="linear" />
 *       &lt;attribute name="singleInstanceAggFunction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTimeMeasure")
public class TTimeMeasure
    extends TBaseMeasure
{

    @XmlAttribute(name = "timeMeasureType")
    protected TTimeMeasureType timeMeasureType;
    @XmlAttribute(name = "singleInstanceAggFunction")
    protected String singleInstanceAggFunction;

    /**
     * Obtiene el valor de la propiedad timeMeasureType.
     * 
     * @return
     *     possible object is
     *     {@link TTimeMeasureType }
     *     
     */
    public TTimeMeasureType getTimeMeasureType() {
        if (timeMeasureType == null) {
            return TTimeMeasureType.LINEAR;
        } else {
            return timeMeasureType;
        }
    }

    /**
     * Define el valor de la propiedad timeMeasureType.
     * 
     * @param value
     *     allowed object is
     *     {@link TTimeMeasureType }
     *     
     */
    public void setTimeMeasureType(TTimeMeasureType value) {
        this.timeMeasureType = value;
    }

    /**
     * Obtiene el valor de la propiedad singleInstanceAggFunction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleInstanceAggFunction() {
        return singleInstanceAggFunction;
    }

    /**
     * Define el valor de la propiedad singleInstanceAggFunction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleInstanceAggFunction(String value) {
        this.singleInstanceAggFunction = value;
    }

}

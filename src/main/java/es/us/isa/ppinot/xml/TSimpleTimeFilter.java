//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.02.20 a las 10:52:32 AM CET 
//


package es.us.isa.ppinot.xml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tSimpleTimeFilter complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tSimpleTimeFilter">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isa.us.es/ppinot}tScope">
 *       &lt;attribute name="period" use="required" type="{http://www.isa.us.es/ppinot}tPeriod" />
 *       &lt;attribute name="frequency" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="relative" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tSimpleTimeFilter")
public class TSimpleTimeFilter
    extends TScope
{

    @XmlAttribute(name = "period", required = true)
    protected TPeriod period;
    @XmlAttribute(name = "frequency", required = true)
    protected BigInteger frequency;
    @XmlAttribute(name = "relative", required = true)
    protected boolean relative;

    /**
     * Obtiene el valor de la propiedad period.
     * 
     * @return
     *     possible object is
     *     {@link TPeriod }
     *     
     */
    public TPeriod getPeriod() {
        return period;
    }

    /**
     * Define el valor de la propiedad period.
     * 
     * @param value
     *     allowed object is
     *     {@link TPeriod }
     *     
     */
    public void setPeriod(TPeriod value) {
        this.period = value;
    }

    /**
     * Obtiene el valor de la propiedad frequency.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFrequency() {
        return frequency;
    }

    /**
     * Define el valor de la propiedad frequency.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFrequency(BigInteger value) {
        this.frequency = value;
    }

    /**
     * Obtiene el valor de la propiedad relative.
     * 
     */
    public boolean isRelative() {
        return relative;
    }

    /**
     * Define el valor de la propiedad relative.
     * 
     */
    public void setRelative(boolean value) {
        this.relative = value;
    }

}

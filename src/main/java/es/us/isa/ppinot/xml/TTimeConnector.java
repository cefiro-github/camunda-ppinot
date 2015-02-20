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
 * <p>Clase Java para tTimeConnector complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tTimeConnector">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isa.us.es/ppinot}tAppliesToElementConnector">
 *       &lt;attribute name="type" type="{http://www.isa.us.es/ppinot}tTimeConnectorType" default="from" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTimeConnector")
public class TTimeConnector
    extends TAppliesToElementConnector
{

    @XmlAttribute(name = "type")
    protected TTimeConnectorType type;

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link TTimeConnectorType }
     *     
     */
    public TTimeConnectorType getType() {
        if (type == null) {
            return TTimeConnectorType.FROM;
        } else {
            return type;
        }
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link TTimeConnectorType }
     *     
     */
    public void setType(TTimeConnectorType value) {
        this.type = value;
    }

}

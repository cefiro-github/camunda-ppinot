//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.02.20 a las 10:52:32 AM CET 
//


package es.us.isa.ppinot.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tTimeConnectorType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="tTimeConnectorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="from"/>
 *     &lt;enumeration value="to"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tTimeConnectorType")
@XmlEnum
public enum TTimeConnectorType {

    @XmlEnumValue("from")
    FROM("from"),
    @XmlEnumValue("to")
    TO("to");
    private final String value;

    TTimeConnectorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TTimeConnectorType fromValue(String v) {
        for (TTimeConnectorType c: TTimeConnectorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

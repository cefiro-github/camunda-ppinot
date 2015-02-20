//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.02.20 a las 10:52:32 AM CET 
//


package es.us.isa.ppinot.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para tPpiset complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tPpiset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.isa.us.es/ppinot}measure" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.isa.us.es/ppinot}measureConnector" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.isa.us.es/ppinot}ppi" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tPpiset", propOrder = {
    "measure",
    "measureConnector",
    "ppi"
})
public class TPpiset {

    @XmlElementRef(name = "measure", namespace = "http://www.isa.us.es/ppinot", type = JAXBElement.class)
    protected List<JAXBElement<? extends TMeasure>> measure;
    @XmlElementRef(name = "measureConnector", namespace = "http://www.isa.us.es/ppinot", type = JAXBElement.class)
    protected List<JAXBElement<? extends TMeasureConnector>> measureConnector;
    protected List<TPpi> ppi;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the measure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TDataPropertyConditionMeasure }{@code >}
     * {@link JAXBElement }{@code <}{@link TDerivedSingleInstanceMeasure }{@code >}
     * {@link JAXBElement }{@code <}{@link TDerivedMultiInstanceMeasure }{@code >}
     * {@link JAXBElement }{@code <}{@link TDataMeasure }{@code >}
     * {@link JAXBElement }{@code <}{@link TTimeMeasure }{@code >}
     * {@link JAXBElement }{@code <}{@link TMeasure }{@code >}
     * {@link JAXBElement }{@code <}{@link TAggregatedMeasure }{@code >}
     * {@link JAXBElement }{@code <}{@link TTimeInstantMeasure }{@code >}
     * {@link JAXBElement }{@code <}{@link TCountMeasure }{@code >}
     * {@link JAXBElement }{@code <}{@link TStateConditionMeasure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends TMeasure>> getMeasure() {
        if (measure == null) {
            measure = new ArrayList<JAXBElement<? extends TMeasure>>();
        }
        return this.measure;
    }

    /**
     * Gets the value of the measureConnector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measureConnector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasureConnector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TUses }{@code >}
     * {@link JAXBElement }{@code <}{@link TIsGroupedBy }{@code >}
     * {@link JAXBElement }{@code <}{@link TMeasureConnector }{@code >}
     * {@link JAXBElement }{@code <}{@link TAppliesToElementConnector }{@code >}
     * {@link JAXBElement }{@code <}{@link TAggregates }{@code >}
     * {@link JAXBElement }{@code <}{@link TAppliesToDataConnector }{@code >}
     * {@link JAXBElement }{@code <}{@link TTimeConnector }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends TMeasureConnector>> getMeasureConnector() {
        if (measureConnector == null) {
            measureConnector = new ArrayList<JAXBElement<? extends TMeasureConnector>>();
        }
        return this.measureConnector;
    }

    /**
     * Gets the value of the ppi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ppi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPpi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPpi }
     * 
     * 
     */
    public List<TPpi> getPpi() {
        if (ppi == null) {
            ppi = new ArrayList<TPpi>();
        }
        return this.ppi;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}

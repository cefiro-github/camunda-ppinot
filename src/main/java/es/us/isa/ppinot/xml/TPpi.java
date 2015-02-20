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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para tPpi complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tPpi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="target">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.isa.us.es/ppinot}baseTarget"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="scope" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.isa.us.es/ppinot}processInstanceFilter"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="goals" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="goal" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="responsible" type="{http://www.isa.us.es/ppinot}tHumanResource" minOccurs="0"/>
 *         &lt;element name="informed" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="inform" type="{http://www.isa.us.es/ppinot}tHumanResource" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="measuredBy" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tPpi", propOrder = {

})
public class TPpi {

    @XmlElement(required = true)
    protected TPpi.Target target;
    protected TPpi.Scope scope;
    protected TPpi.Goals goals;
    protected String responsible;
    protected TPpi.Informed informed;
    protected String comments;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "measuredBy", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object measuredBy;

    /**
     * Obtiene el valor de la propiedad target.
     * 
     * @return
     *     possible object is
     *     {@link TPpi.Target }
     *     
     */
    public TPpi.Target getTarget() {
        return target;
    }

    /**
     * Define el valor de la propiedad target.
     * 
     * @param value
     *     allowed object is
     *     {@link TPpi.Target }
     *     
     */
    public void setTarget(TPpi.Target value) {
        this.target = value;
    }

    /**
     * Obtiene el valor de la propiedad scope.
     * 
     * @return
     *     possible object is
     *     {@link TPpi.Scope }
     *     
     */
    public TPpi.Scope getScope() {
        return scope;
    }

    /**
     * Define el valor de la propiedad scope.
     * 
     * @param value
     *     allowed object is
     *     {@link TPpi.Scope }
     *     
     */
    public void setScope(TPpi.Scope value) {
        this.scope = value;
    }

    /**
     * Obtiene el valor de la propiedad goals.
     * 
     * @return
     *     possible object is
     *     {@link TPpi.Goals }
     *     
     */
    public TPpi.Goals getGoals() {
        return goals;
    }

    /**
     * Define el valor de la propiedad goals.
     * 
     * @param value
     *     allowed object is
     *     {@link TPpi.Goals }
     *     
     */
    public void setGoals(TPpi.Goals value) {
        this.goals = value;
    }

    /**
     * Obtiene el valor de la propiedad responsible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsible() {
        return responsible;
    }

    /**
     * Define el valor de la propiedad responsible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsible(String value) {
        this.responsible = value;
    }

    /**
     * Obtiene el valor de la propiedad informed.
     * 
     * @return
     *     possible object is
     *     {@link TPpi.Informed }
     *     
     */
    public TPpi.Informed getInformed() {
        return informed;
    }

    /**
     * Define el valor de la propiedad informed.
     * 
     * @param value
     *     allowed object is
     *     {@link TPpi.Informed }
     *     
     */
    public void setInformed(TPpi.Informed value) {
        this.informed = value;
    }

    /**
     * Obtiene el valor de la propiedad comments.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Define el valor de la propiedad comments.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
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

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad measuredBy.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMeasuredBy() {
        return measuredBy;
    }

    /**
     * Define el valor de la propiedad measuredBy.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMeasuredBy(Object value) {
        this.measuredBy = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="goal" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "goal"
    })
    public static class Goals {

        @XmlElement(required = true)
        protected List<String> goal;

        /**
         * Gets the value of the goal property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the goal property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGoal().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getGoal() {
            if (goal == null) {
                goal = new ArrayList<String>();
            }
            return this.goal;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="inform" type="{http://www.isa.us.es/ppinot}tHumanResource" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "inform"
    })
    public static class Informed {

        @XmlElement(required = true)
        protected List<String> inform;

        /**
         * Gets the value of the inform property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the inform property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInform().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getInform() {
            if (inform == null) {
                inform = new ArrayList<String>();
            }
            return this.inform;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.isa.us.es/ppinot}processInstanceFilter"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "processInstanceFilter"
    })
    public static class Scope {

        @XmlElementRef(name = "processInstanceFilter", namespace = "http://www.isa.us.es/ppinot", type = JAXBElement.class)
        protected JAXBElement<? extends TScope> processInstanceFilter;

        /**
         * Obtiene el valor de la propiedad processInstanceFilter.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link TScope }{@code >}
         *     {@link JAXBElement }{@code <}{@link TLastInstancesFilter }{@code >}
         *     {@link JAXBElement }{@code <}{@link TSimpleTimeFilter }{@code >}
         *     
         */
        public JAXBElement<? extends TScope> getProcessInstanceFilter() {
            return processInstanceFilter;
        }

        /**
         * Define el valor de la propiedad processInstanceFilter.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link TScope }{@code >}
         *     {@link JAXBElement }{@code <}{@link TLastInstancesFilter }{@code >}
         *     {@link JAXBElement }{@code <}{@link TSimpleTimeFilter }{@code >}
         *     
         */
        public void setProcessInstanceFilter(JAXBElement<? extends TScope> value) {
            this.processInstanceFilter = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.isa.us.es/ppinot}baseTarget"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "baseTarget"
    })
    public static class Target {

        @XmlElementRef(name = "baseTarget", namespace = "http://www.isa.us.es/ppinot", type = JAXBElement.class)
        protected JAXBElement<? extends TTarget> baseTarget;

        /**
         * Obtiene el valor de la propiedad baseTarget.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link TTarget }{@code >}
         *     {@link JAXBElement }{@code <}{@link TSimpleTarget }{@code >}
         *     {@link JAXBElement }{@code <}{@link TComposedTarget }{@code >}
         *     
         */
        public JAXBElement<? extends TTarget> getBaseTarget() {
            return baseTarget;
        }

        /**
         * Define el valor de la propiedad baseTarget.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link TTarget }{@code >}
         *     {@link JAXBElement }{@code <}{@link TSimpleTarget }{@code >}
         *     {@link JAXBElement }{@code <}{@link TComposedTarget }{@code >}
         *     
         */
        public void setBaseTarget(JAXBElement<? extends TTarget> value) {
            this.baseTarget = value;
        }

    }

}

//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.02.20 a las 10:52:32 AM CET 
//


package es.us.isa.ppinot.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.us.isa.ppinot.xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SimpleTarget_QNAME = new QName("http://www.isa.us.es/ppinot", "simpleTarget");
    private final static QName _StateConditionMeasure_QNAME = new QName("http://www.isa.us.es/ppinot", "stateConditionMeasure");
    private final static QName _Ppi_QNAME = new QName("http://www.isa.us.es/ppinot", "ppi");
    private final static QName _Ppiset_QNAME = new QName("http://www.isa.us.es/ppinot", "ppiset");
    private final static QName _BaseTarget_QNAME = new QName("http://www.isa.us.es/ppinot", "baseTarget");
    private final static QName _Uses_QNAME = new QName("http://www.isa.us.es/ppinot", "uses");
    private final static QName _DerivedMultiInstanceMeasure_QNAME = new QName("http://www.isa.us.es/ppinot", "derivedMultiInstanceMeasure");
    private final static QName _MeasureConnector_QNAME = new QName("http://www.isa.us.es/ppinot", "measureConnector");
    private final static QName _ComposedTarget_QNAME = new QName("http://www.isa.us.es/ppinot", "composedTarget");
    private final static QName _SimpleTimeFilter_QNAME = new QName("http://www.isa.us.es/ppinot", "simpleTimeFilter");
    private final static QName _TimeInstantMeasure_QNAME = new QName("http://www.isa.us.es/ppinot", "timeInstantMeasure");
    private final static QName _DataMeasure_QNAME = new QName("http://www.isa.us.es/ppinot", "dataMeasure");
    private final static QName _DerivedSingleInstanceMeasure_QNAME = new QName("http://www.isa.us.es/ppinot", "derivedSingleInstanceMeasure");
    private final static QName _LastInstancesFilter_QNAME = new QName("http://www.isa.us.es/ppinot", "lastInstancesFilter");
    private final static QName _AppliesToDataConnector_QNAME = new QName("http://www.isa.us.es/ppinot", "appliesToDataConnector");
    private final static QName _TimeMeasure_QNAME = new QName("http://www.isa.us.es/ppinot", "timeMeasure");
    private final static QName _Measure_QNAME = new QName("http://www.isa.us.es/ppinot", "measure");
    private final static QName _CountMeasure_QNAME = new QName("http://www.isa.us.es/ppinot", "countMeasure");
    private final static QName _AppliesToElementConnector_QNAME = new QName("http://www.isa.us.es/ppinot", "appliesToElementConnector");
    private final static QName _DataPropertyConditionMeasure_QNAME = new QName("http://www.isa.us.es/ppinot", "dataPropertyConditionMeasure");
    private final static QName _TimeConnector_QNAME = new QName("http://www.isa.us.es/ppinot", "timeConnector");
    private final static QName _IsGroupedBy_QNAME = new QName("http://www.isa.us.es/ppinot", "isGroupedBy");
    private final static QName _AggregatedMeasure_QNAME = new QName("http://www.isa.us.es/ppinot", "aggregatedMeasure");
    private final static QName _Aggregates_QNAME = new QName("http://www.isa.us.es/ppinot", "aggregates");
    private final static QName _ProcessInstanceFilter_QNAME = new QName("http://www.isa.us.es/ppinot", "processInstanceFilter");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.us.isa.ppinot.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TPpi }
     * 
     */
    public TPpi createTPpi() {
        return new TPpi();
    }

    /**
     * Create an instance of {@link TComposedTarget }
     * 
     */
    public TComposedTarget createTComposedTarget() {
        return new TComposedTarget();
    }

    /**
     * Create an instance of {@link TAppliesToElementConnector }
     * 
     */
    public TAppliesToElementConnector createTAppliesToElementConnector() {
        return new TAppliesToElementConnector();
    }

    /**
     * Create an instance of {@link TDataPropertyConditionMeasure }
     * 
     */
    public TDataPropertyConditionMeasure createTDataPropertyConditionMeasure() {
        return new TDataPropertyConditionMeasure();
    }

    /**
     * Create an instance of {@link TCountMeasure }
     * 
     */
    public TCountMeasure createTCountMeasure() {
        return new TCountMeasure();
    }

    /**
     * Create an instance of {@link TAggregates }
     * 
     */
    public TAggregates createTAggregates() {
        return new TAggregates();
    }

    /**
     * Create an instance of {@link TTimeConnector }
     * 
     */
    public TTimeConnector createTTimeConnector() {
        return new TTimeConnector();
    }

    /**
     * Create an instance of {@link TIsGroupedBy }
     * 
     */
    public TIsGroupedBy createTIsGroupedBy() {
        return new TIsGroupedBy();
    }

    /**
     * Create an instance of {@link TAggregatedMeasure }
     * 
     */
    public TAggregatedMeasure createTAggregatedMeasure() {
        return new TAggregatedMeasure();
    }

    /**
     * Create an instance of {@link TDerivedSingleInstanceMeasure }
     * 
     */
    public TDerivedSingleInstanceMeasure createTDerivedSingleInstanceMeasure() {
        return new TDerivedSingleInstanceMeasure();
    }

    /**
     * Create an instance of {@link TLastInstancesFilter }
     * 
     */
    public TLastInstancesFilter createTLastInstancesFilter() {
        return new TLastInstancesFilter();
    }

    /**
     * Create an instance of {@link TTimeMeasure }
     * 
     */
    public TTimeMeasure createTTimeMeasure() {
        return new TTimeMeasure();
    }

    /**
     * Create an instance of {@link TAppliesToDataConnector }
     * 
     */
    public TAppliesToDataConnector createTAppliesToDataConnector() {
        return new TAppliesToDataConnector();
    }

    /**
     * Create an instance of {@link TSimpleTimeFilter }
     * 
     */
    public TSimpleTimeFilter createTSimpleTimeFilter() {
        return new TSimpleTimeFilter();
    }

    /**
     * Create an instance of {@link TDerivedMultiInstanceMeasure }
     * 
     */
    public TDerivedMultiInstanceMeasure createTDerivedMultiInstanceMeasure() {
        return new TDerivedMultiInstanceMeasure();
    }

    /**
     * Create an instance of {@link TTimeInstantMeasure }
     * 
     */
    public TTimeInstantMeasure createTTimeInstantMeasure() {
        return new TTimeInstantMeasure();
    }

    /**
     * Create an instance of {@link TDataMeasure }
     * 
     */
    public TDataMeasure createTDataMeasure() {
        return new TDataMeasure();
    }

    /**
     * Create an instance of {@link TPpiset }
     * 
     */
    public TPpiset createTPpiset() {
        return new TPpiset();
    }

    /**
     * Create an instance of {@link TSimpleTarget }
     * 
     */
    public TSimpleTarget createTSimpleTarget() {
        return new TSimpleTarget();
    }

    /**
     * Create an instance of {@link TStateConditionMeasure }
     * 
     */
    public TStateConditionMeasure createTStateConditionMeasure() {
        return new TStateConditionMeasure();
    }

    /**
     * Create an instance of {@link TUses }
     * 
     */
    public TUses createTUses() {
        return new TUses();
    }

    /**
     * Create an instance of {@link TPpi.Target }
     * 
     */
    public TPpi.Target createTPpiTarget() {
        return new TPpi.Target();
    }

    /**
     * Create an instance of {@link TPpi.Scope }
     * 
     */
    public TPpi.Scope createTPpiScope() {
        return new TPpi.Scope();
    }

    /**
     * Create an instance of {@link TPpi.Goals }
     * 
     */
    public TPpi.Goals createTPpiGoals() {
        return new TPpi.Goals();
    }

    /**
     * Create an instance of {@link TPpi.Informed }
     * 
     */
    public TPpi.Informed createTPpiInformed() {
        return new TPpi.Informed();
    }

    /**
     * Create an instance of {@link TComposedTarget.Target }
     * 
     */
    public TComposedTarget.Target createTComposedTargetTarget() {
        return new TComposedTarget.Target();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSimpleTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "simpleTarget", substitutionHeadNamespace = "http://www.isa.us.es/ppinot", substitutionHeadName = "baseTarget")
    public JAXBElement<TSimpleTarget> createSimpleTarget(TSimpleTarget value) {
        return new JAXBElement<TSimpleTarget>(_SimpleTarget_QNAME, TSimpleTarget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TStateConditionMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "stateConditionMeasure", substitutionHeadNamespace = "http://www.isa.us.es/ppinot", substitutionHeadName = "measure")
    public JAXBElement<TStateConditionMeasure> createStateConditionMeasure(TStateConditionMeasure value) {
        return new JAXBElement<TStateConditionMeasure>(_StateConditionMeasure_QNAME, TStateConditionMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TPpi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "ppi")
    public JAXBElement<TPpi> createPpi(TPpi value) {
        return new JAXBElement<TPpi>(_Ppi_QNAME, TPpi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TPpiset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "ppiset")
    public JAXBElement<TPpiset> createPpiset(TPpiset value) {
        return new JAXBElement<TPpiset>(_Ppiset_QNAME, TPpiset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "baseTarget")
    public JAXBElement<TTarget> createBaseTarget(TTarget value) {
        return new JAXBElement<TTarget>(_BaseTarget_QNAME, TTarget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TUses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "uses", substitutionHeadNamespace = "http://www.isa.us.es/ppinot", substitutionHeadName = "measureConnector")
    public JAXBElement<TUses> createUses(TUses value) {
        return new JAXBElement<TUses>(_Uses_QNAME, TUses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDerivedMultiInstanceMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "derivedMultiInstanceMeasure", substitutionHeadNamespace = "http://www.isa.us.es/ppinot", substitutionHeadName = "measure")
    public JAXBElement<TDerivedMultiInstanceMeasure> createDerivedMultiInstanceMeasure(TDerivedMultiInstanceMeasure value) {
        return new JAXBElement<TDerivedMultiInstanceMeasure>(_DerivedMultiInstanceMeasure_QNAME, TDerivedMultiInstanceMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMeasureConnector }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "measureConnector")
    public JAXBElement<TMeasureConnector> createMeasureConnector(TMeasureConnector value) {
        return new JAXBElement<TMeasureConnector>(_MeasureConnector_QNAME, TMeasureConnector.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TComposedTarget }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "composedTarget", substitutionHeadNamespace = "http://www.isa.us.es/ppinot", substitutionHeadName = "baseTarget")
    public JAXBElement<TComposedTarget> createComposedTarget(TComposedTarget value) {
        return new JAXBElement<TComposedTarget>(_ComposedTarget_QNAME, TComposedTarget.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSimpleTimeFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "simpleTimeFilter", substitutionHeadNamespace = "http://www.isa.us.es/ppinot", substitutionHeadName = "processInstanceFilter")
    public JAXBElement<TSimpleTimeFilter> createSimpleTimeFilter(TSimpleTimeFilter value) {
        return new JAXBElement<TSimpleTimeFilter>(_SimpleTimeFilter_QNAME, TSimpleTimeFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TTimeInstantMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "timeInstantMeasure", substitutionHeadNamespace = "http://www.isa.us.es/ppinot", substitutionHeadName = "measure")
    public JAXBElement<TTimeInstantMeasure> createTimeInstantMeasure(TTimeInstantMeasure value) {
        return new JAXBElement<TTimeInstantMeasure>(_TimeInstantMeasure_QNAME, TTimeInstantMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDataMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "dataMeasure", substitutionHeadNamespace = "http://www.isa.us.es/ppinot", substitutionHeadName = "measure")
    public JAXBElement<TDataMeasure> createDataMeasure(TDataMeasure value) {
        return new JAXBElement<TDataMeasure>(_DataMeasure_QNAME, TDataMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDerivedSingleInstanceMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "derivedSingleInstanceMeasure", substitutionHeadNamespace = "http://www.isa.us.es/ppinot", substitutionHeadName = "measure")
    public JAXBElement<TDerivedSingleInstanceMeasure> createDerivedSingleInstanceMeasure(TDerivedSingleInstanceMeasure value) {
        return new JAXBElement<TDerivedSingleInstanceMeasure>(_DerivedSingleInstanceMeasure_QNAME, TDerivedSingleInstanceMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TLastInstancesFilter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "lastInstancesFilter", substitutionHeadNamespace = "http://www.isa.us.es/ppinot", substitutionHeadName = "processInstanceFilter")
    public JAXBElement<TLastInstancesFilter> createLastInstancesFilter(TLastInstancesFilter value) {
        return new JAXBElement<TLastInstancesFilter>(_LastInstancesFilter_QNAME, TLastInstancesFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAppliesToDataConnector }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "appliesToDataConnector", substitutionHeadNamespace = "http://www.isa.us.es/ppinot", substitutionHeadName = "measureConnector")
    public JAXBElement<TAppliesToDataConnector> createAppliesToDataConnector(TAppliesToDataConnector value) {
        return new JAXBElement<TAppliesToDataConnector>(_AppliesToDataConnector_QNAME, TAppliesToDataConnector.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TTimeMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "timeMeasure", substitutionHeadNamespace = "http://www.isa.us.es/ppinot", substitutionHeadName = "measure")
    public JAXBElement<TTimeMeasure> createTimeMeasure(TTimeMeasure value) {
        return new JAXBElement<TTimeMeasure>(_TimeMeasure_QNAME, TTimeMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "measure")
    public JAXBElement<TMeasure> createMeasure(TMeasure value) {
        return new JAXBElement<TMeasure>(_Measure_QNAME, TMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCountMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "countMeasure", substitutionHeadNamespace = "http://www.isa.us.es/ppinot", substitutionHeadName = "measure")
    public JAXBElement<TCountMeasure> createCountMeasure(TCountMeasure value) {
        return new JAXBElement<TCountMeasure>(_CountMeasure_QNAME, TCountMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAppliesToElementConnector }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "appliesToElementConnector", substitutionHeadNamespace = "http://www.isa.us.es/ppinot", substitutionHeadName = "measureConnector")
    public JAXBElement<TAppliesToElementConnector> createAppliesToElementConnector(TAppliesToElementConnector value) {
        return new JAXBElement<TAppliesToElementConnector>(_AppliesToElementConnector_QNAME, TAppliesToElementConnector.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDataPropertyConditionMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "dataPropertyConditionMeasure", substitutionHeadNamespace = "http://www.isa.us.es/ppinot", substitutionHeadName = "measure")
    public JAXBElement<TDataPropertyConditionMeasure> createDataPropertyConditionMeasure(TDataPropertyConditionMeasure value) {
        return new JAXBElement<TDataPropertyConditionMeasure>(_DataPropertyConditionMeasure_QNAME, TDataPropertyConditionMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TTimeConnector }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "timeConnector", substitutionHeadNamespace = "http://www.isa.us.es/ppinot", substitutionHeadName = "measureConnector")
    public JAXBElement<TTimeConnector> createTimeConnector(TTimeConnector value) {
        return new JAXBElement<TTimeConnector>(_TimeConnector_QNAME, TTimeConnector.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIsGroupedBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "isGroupedBy", substitutionHeadNamespace = "http://www.isa.us.es/ppinot", substitutionHeadName = "measureConnector")
    public JAXBElement<TIsGroupedBy> createIsGroupedBy(TIsGroupedBy value) {
        return new JAXBElement<TIsGroupedBy>(_IsGroupedBy_QNAME, TIsGroupedBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAggregatedMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "aggregatedMeasure", substitutionHeadNamespace = "http://www.isa.us.es/ppinot", substitutionHeadName = "measure")
    public JAXBElement<TAggregatedMeasure> createAggregatedMeasure(TAggregatedMeasure value) {
        return new JAXBElement<TAggregatedMeasure>(_AggregatedMeasure_QNAME, TAggregatedMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAggregates }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "aggregates", substitutionHeadNamespace = "http://www.isa.us.es/ppinot", substitutionHeadName = "measureConnector")
    public JAXBElement<TAggregates> createAggregates(TAggregates value) {
        return new JAXBElement<TAggregates>(_Aggregates_QNAME, TAggregates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TScope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.isa.us.es/ppinot", name = "processInstanceFilter")
    public JAXBElement<TScope> createProcessInstanceFilter(TScope value) {
        return new JAXBElement<TScope>(_ProcessInstanceFilter_QNAME, TScope.class, null, value);
    }

}

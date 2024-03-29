//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.19 at 12:48:54 PM EDT 
//


package ietf.params.xml.ns.vcard_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:vcard-4.0}baseProperty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProperties", propOrder = {
    "baseProperty"
})
public class ArrayOfProperties {

    @XmlElementRef(name = "baseProperty", namespace = "urn:ietf:params:xml:ns:vcard-4.0", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends BasePropertyType>> baseProperty;

    /**
     * Gets the value of the baseProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TimestampPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link LangPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link BdayPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextListPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextUriPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link BdayPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextUriPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextUriPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link BasePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link ClientPidmapPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link NamePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link AdrPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextListPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextUriPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextListPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextPropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link TextPropertyType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends BasePropertyType>> getBaseProperty() {
        if (baseProperty == null) {
            baseProperty = new ArrayList<JAXBElement<? extends BasePropertyType>>();
        }
        return this.baseProperty;
    }

}

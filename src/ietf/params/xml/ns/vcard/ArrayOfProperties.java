//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.04.12 at 11:58:52 AM EDT
//
package ietf.params.xml.ns.vcard;

import ietf.params.xml.ns.vcard.property.BasePropertyType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for ArrayOfProperties complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="ArrayOfProperties"> &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence> &lt;element
 * ref="{urn:ietf:params:xml:ns:vcard-4.0}baseProperty" maxOccurs="unbounded"
 * minOccurs="0"/> &lt;/sequence> &lt;/restriction> &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
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
   * <p/>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a
   * <CODE>set</CODE> method for the baseProperty property.
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getBaseProperty().set(newItem);
   * </pre>
   * <p/>
   */
  public List<JAXBElement<? extends BasePropertyType>> getBaseProperty() {
    if (baseProperty == null) {
      baseProperty = new ArrayList<JAXBElement<? extends BasePropertyType>>();
    }
    return this.baseProperty;
  }

  /**
   * @return TRUE if the baseProperty field is not null.
   */
  public boolean isSetBaseProperty() {
    return ((this.baseProperty != null) && (!this.baseProperty.isEmpty()));
  }

  /**
   * Set the baseProperty List to null.
   */
  public void unsetBaseProperty() {
    this.baseProperty = null;
  }

  /**
   * Method to safely add a jaXBElement to the baseProperty list.
   * <p/>
   * The iCalendar specification only allows singular entries of named fields.
   * This method inspects the input jaXBElement name and replaces any existing
   * entries with the same name.
   * <p/>
   * Developer note: Always use the ObjectFactory to build a proper jaXBElement
   * implementation.
   * <p/>
   * @param jaXBElement a BasePropertyType implementation. Objects of the
   *                    following type(s) are allowed {@link JAXBElement }{@code <}{@link BdayPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link TextPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link BasePropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link TextListPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link TextPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link TextPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link TextPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link TextUriPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link NamePropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link TextListPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link ClientPidmapPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link TextListPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link TextPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link BdayPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link TextUriPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link TextUriPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link TextPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link TimestampPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link UriPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link TextPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link TextPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link AdrPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link LangPropertyType }{@code >}
   * {@link JAXBElement }{@code <}{@link TextUriPropertyType }{@code >}
   */
  public void setProperty(JAXBElement<? extends BasePropertyType> jaXBElement) {
    unSetProperty(jaXBElement);
    getBaseProperty().add(jaXBElement);
  }

  /**
   * Remove the current BasePropertyType entry having the same name as the input
   * jaXBElement. This method REMOVES the base property type.
   * <p/>
   * Developer note: Always use the ObjectFactory to build a proper jaXBElement
   * implementation.
   * <p/>
   * @param jaXBElement the BasePropertyType to be unset.
   */
  public void unSetProperty(JAXBElement<? extends BasePropertyType> jaXBElement) {
    /**
     * Scan the set of entries for an entry with the same QName as the input
     * element. If a match is found then remove the existing entry.
     */
    for (JAXBElement<? extends BasePropertyType> basePropertyEntry : getBaseProperty()) {
      if (basePropertyEntry.getName().equals(jaXBElement.getName())) {
        baseProperty.remove(basePropertyEntry);
        break; // important - averts ConcurrentModificationException
      }
    }
  }

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 97 * hash + Objects.hashCode(this.baseProperty);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final ArrayOfProperties other = (ArrayOfProperties) obj;
    if (!Objects.equals(this.baseProperty, other.baseProperty)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ArrayOfProperties ");
    if (baseProperty != null) {
      for (JAXBElement<? extends BasePropertyType> jaxbElement : baseProperty) {
        sb.append("\n")
          .append("[").append(jaxbElement.getName()).append("]")
          .append(" ")
          .append(jaxbElement.getValue());
      }
    }
    return sb.toString();
  }
}

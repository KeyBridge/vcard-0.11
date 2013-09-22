//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.04.12 at 11:58:52 AM EDT
//
package ietf.params.xml.ns.vcard.property;

import ietf.params.xml.ns.vcard.ArrayOfParameters;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for BasePropertyType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="BasePropertyType"> &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;sequence> &lt;element name="parameters"
 * type="{urn:ietf:params:xml:ns:vcard-4.0}ArrayOfParameters"/> &lt;/sequence>
 * &lt;/restriction> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasePropertyType", propOrder = {
  "parameters"
})
@XmlSeeAlso({
  AdrPropertyType.class,
  BdayPropertyType.class,
  ClientPidmapPropertyType.class,
  LangPropertyType.class,
  NamePropertyType.class,
  TextListPropertyType.class,
  TextPropertyType.class,
  TextUriPropertyType.class,
  TimestampPropertyType.class,
  UriPropertyType.class
})
public abstract class BasePropertyType {

  @XmlElement(required = true)
  protected ArrayOfParameters parameters;

  public BasePropertyType() {
    parameters = new ArrayOfParameters();
  }

  public BasePropertyType(ArrayOfParameters parameters) {
    this.parameters = parameters;
  }

  /**
   * Gets the value of the parameters property.
   * <p/>
   * @return possible object is {@link ArrayOfParameters }
   *
   */
  public ArrayOfParameters getParameters() {
    if (parameters == null) {
      parameters = new ArrayOfParameters();
    }
    return parameters;
  }

  /**
   * Sets the value of the parameters property.
   * <p/>
   * @param value allowed object is {@link ArrayOfParameters }
   *
   */
  public void setParameters(ArrayOfParameters value) {
    this.parameters = value;
  }

  public boolean isSetParameters() {
    return (this.parameters != null);
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 29 * hash + Objects.hashCode(this.parameters);
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
    final BasePropertyType other = (BasePropertyType) obj;
    if (!Objects.equals(this.parameters, other.parameters)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "BasePropertyType{" + "parameters=" + parameters + '}';
  }
}

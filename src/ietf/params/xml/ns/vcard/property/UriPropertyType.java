//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.04.12 at 11:58:52 AM EDT
//
package ietf.params.xml.ns.vcard.property;

import ietf.params.xml.ns.vcard.property.BasePropertyType;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for UriPropertyType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="UriPropertyType"> &lt;complexContent>
 * &lt;extension base="{urn:ietf:params:xml:ns:vcard-4.0}BasePropertyType">
 * &lt;sequence> &lt;element ref="{urn:ietf:params:xml:ns:vcard-4.0}uri"/>
 * &lt;/sequence> &lt;/extension> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UriPropertyType", propOrder = {
  "uri"
})
public class UriPropertyType extends BasePropertyType {

  @XmlElement(required = true)
  protected String uri;

  /**
   * Gets the value of the uri property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getUri() {
    return uri;
  }

  /**
   * Sets the value of the uri property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setUri(String value) {
    this.uri = value;
  }

  public boolean isSetUri() {
    return (this.uri != null);
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 79 * hash + Objects.hashCode(this.uri);
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
    final UriPropertyType other = (UriPropertyType) obj;
    if (!Objects.equals(this.uri, other.uri)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "UriPropertyType{" + "uri=" + uri + '}';
  }
}
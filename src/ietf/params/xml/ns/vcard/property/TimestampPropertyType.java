//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.04.12 at 11:58:52 AM EDT
//
package ietf.params.xml.ns.vcard.property;

import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for TimestampPropertyType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre>
 * &lt;complexType name="TimestampPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:vcard-4.0}BasePropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:vcard-4.0}timestamp"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimestampPropertyType", propOrder = {
  "timestamp"
})
public class TimestampPropertyType extends BasePropertyType {

  @XmlElement(required = true)
  protected String timestamp;

  /**
   * Gets the value of the timestamp property.
   * <p/>
   * @return possible object is {@link String }
   *
   */
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the timestamp property.
   * <p/>
   * @param value allowed object is {@link String }
   *
   */
  public void setTimestamp(String value) {
    this.timestamp = value;
  }

  public boolean isSetTimestamp() {
    return (this.timestamp != null);
  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 13 * hash + Objects.hashCode(this.timestamp);
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
    final TimestampPropertyType other = (TimestampPropertyType) obj;
    if (!Objects.equals(this.timestamp, other.timestamp)) {
      return false;
    }
    return true;
  }
}

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
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for NamePropertyType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="NamePropertyType"> &lt;complexContent>
 * &lt;extension base="{urn:ietf:params:xml:ns:vcard-4.0}BasePropertyType">
 * &lt;sequence> &lt;element name="surname"
 * type="{urn:ietf:params:xml:ns:vcard-4.0}TextListPropertyType" minOccurs="0"/>
 * &lt;element name="given"
 * type="{urn:ietf:params:xml:ns:vcard-4.0}TextListPropertyType" minOccurs="0"/>
 * &lt;element name="additional"
 * type="{urn:ietf:params:xml:ns:vcard-4.0}TextListPropertyType" minOccurs="0"/>
 * &lt;element name="prefix"
 * type="{urn:ietf:params:xml:ns:vcard-4.0}TextListPropertyType" minOccurs="0"/>
 * &lt;element name="suffix"
 * type="{urn:ietf:params:xml:ns:vcard-4.0}TextListPropertyType" minOccurs="0"/>
 * &lt;/sequence> &lt;/extension> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamePropertyType", propOrder = {
  "surname",
  "given",
  "additional",
  "prefix",
  "suffix"
})
public class NamePropertyType extends BasePropertyType {

  protected TextListPropertyType surname;
  protected TextListPropertyType given;
  protected TextListPropertyType additional;
  protected TextListPropertyType prefix;
  protected TextListPropertyType suffix;

  /**
   * Gets the value of the surname property.
   * <p/>
   * @return possible object is {@link TextListPropertyType }
   *
   */
  public TextListPropertyType getSurname() {
    return surname;
  }

  /**
   * Sets the value of the surname property.
   * <p/>
   * @param value allowed object is {@link TextListPropertyType }
   *
   */
  public void setSurname(TextListPropertyType value) {
    this.surname = value;
  }

  public boolean isSetSurname() {
    return (this.surname != null);
  }

  /**
   * Gets the value of the given property.
   * <p/>
   * @return possible object is {@link TextListPropertyType }
   *
   */
  public TextListPropertyType getGiven() {
    return given;
  }

  /**
   * Sets the value of the given property.
   * <p/>
   * @param value allowed object is {@link TextListPropertyType }
   *
   */
  public void setGiven(TextListPropertyType value) {
    this.given = value;
  }

  public boolean isSetGiven() {
    return (this.given != null);
  }

  /**
   * Gets the value of the additional property.
   * <p/>
   * @return possible object is {@link TextListPropertyType }
   *
   */
  public TextListPropertyType getAdditional() {
    return additional;
  }

  /**
   * Sets the value of the additional property.
   * <p/>
   * @param value allowed object is {@link TextListPropertyType }
   *
   */
  public void setAdditional(TextListPropertyType value) {
    this.additional = value;
  }

  public boolean isSetAdditional() {
    return (this.additional != null);
  }

  /**
   * Gets the value of the prefix property.
   * <p/>
   * @return possible object is {@link TextListPropertyType }
   *
   */
  public TextListPropertyType getPrefix() {
    return prefix;
  }

  /**
   * Sets the value of the prefix property.
   * <p/>
   * @param value allowed object is {@link TextListPropertyType }
   *
   */
  public void setPrefix(TextListPropertyType value) {
    this.prefix = value;
  }

  public boolean isSetPrefix() {
    return (this.prefix != null);
  }

  /**
   * Gets the value of the suffix property.
   * <p/>
   * @return possible object is {@link TextListPropertyType }
   *
   */
  public TextListPropertyType getSuffix() {
    return suffix;
  }

  /**
   * Sets the value of the suffix property.
   * <p/>
   * @param value allowed object is {@link TextListPropertyType }
   *
   */
  public void setSuffix(TextListPropertyType value) {
    this.suffix = value;
  }

  public boolean isSetSuffix() {
    return (this.suffix != null);
  }

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 23 * hash + Objects.hashCode(this.surname);
    hash = 23 * hash + Objects.hashCode(this.given);
    hash = 23 * hash + Objects.hashCode(this.additional);
    hash = 23 * hash + Objects.hashCode(this.prefix);
    hash = 23 * hash + Objects.hashCode(this.suffix);
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
    final NamePropertyType other = (NamePropertyType) obj;
    if (this.hashCode() != obj.hashCode()) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "NamePropertyType{" + "surname=" + surname + ", given=" + given + ", additional=" + additional + ", prefix=" + prefix + ", suffix=" + suffix + '}';
  }
}

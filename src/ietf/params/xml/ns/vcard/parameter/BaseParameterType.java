//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2013.04.12 at 11:58:52 AM EDT
//
package ietf.params.xml.ns.vcard.parameter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for BaseParameterType complex type.
 * <p/>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p/>
 * <
 * pre> &lt;complexType name="BaseParameterType"> &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;/restriction> &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p/>
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseParameterType")
@XmlSeeAlso({
  LanguageParamType.class,
  PidParamType.class,
  PrefParamType.class,
  TextListParamType.class,
  TextParamType.class,
  TzParamType.class,
  UriParamType.class
})
public abstract class BaseParameterType {
}

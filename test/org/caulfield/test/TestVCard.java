/*
 *   Copyright (C) 2013 Caulfield IP Holdings (Caulfield) and/or its affiliates.
 *   All rights reserved. Use is subject to license terms.
 *
 *   Software Code is protected by Caulfield Copyrights. Caulfield hereby
 *   reserves all rights in and to Caulfield Copyrights and no license is
 *   granted under Caulfield Copyrights in this Software License Agreement.
 *   Caulfield generally licenses Caulfield Copyrights for commercialization
 *   pursuant to the terms of either Caulfield's Standard Software Source Code
 *   License Agreement or Caulfield's Standard Product License Agreement.
 *
 *   A copy of either License Agreement can be obtained on request by email
 *   from: info@caufield.org.
 */
package org.caulfield.test;

import ietf.params.xml.ns.vcard.VCard;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author jesse
 */
public class TestVCard {

  public static void main(String[] args) throws JAXBException {
    System.out.println("TestVCard");

    VCard vc = new VCard();
    vc.setFN("Key Bridge Global Llc");

    System.out.println(vc);
    System.out.println("");
    System.out.println(marshal(vc));



  }

  /**
   * Marshal a RegistrationRecordEnsemble entity class into a
   * RegistrationRecordEnsemble XML String representation.
   * <p/>
   * The output of this method is typically either written to a file or sent via
   * a SOAP communication link.
   * <p/>
   * @param registrationRecordEnsemble the RegistrationRecordEnsemble entity
   *                                   class containing registrations, etc. to be
   *                                   written
   * @return the RegistrationRecordEnsemble serialized into XML form
   * @throws JAXBException if the RegistrationRecordEnsemble cannot be marshaled
   *                       (serialized)
   */
  private static <T> String marshal(T clazz) throws JAXBException {
    JAXBContext jaxbContext = JAXBContext.newInstance(clazz.getClass());
    Marshaller marshaller = jaxbContext.createMarshaller();
    /**
     * Add newlines to the output. This will help visually inspect the output.
     */
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    StringWriter stringWriter = new StringWriter();
    marshaller.marshal(clazz, stringWriter);
    return stringWriter.toString();
  }
}

//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at 2009-07-28 by the VDM++ to JAVA Code Generator
// (v8.2 - Fri 29-May-2009 09:54:50)
//
// Supported compilers: jdk 1.4/1.5/1.6
//

// ***** VDMTOOLS START Name=HeaderComment KEEP=NO
// ***** VDMTOOLS END Name=HeaderComment

// ***** VDMTOOLS START Name=package KEEP=NO
package org.overturetool.api.xml;

// ***** VDMTOOLS END Name=package

// ***** VDMTOOLS START Name=imports KEEP=NO

import jp.co.csk.vdm.toolbox.VDM.*;
import java.util.*;
// ***** VDMTOOLS END Name=imports



public class XmlParser {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=fName KEEP=NO
  private String fName = null;
// ***** VDMTOOLS END Name=fName

// ***** VDMTOOLS START Name=xmlEvent KEEP=NO
  private XmlEvent xmlEvent = null;
// ***** VDMTOOLS END Name=xmlEvent


// ***** VDMTOOLS START Name=vdm_init_XmlParser KEEP=NO
  private void vdm_init_XmlParser () throws CGException {
    try {

      fName = new String("");
      xmlEvent = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_XmlParser


// ***** VDMTOOLS START Name=XmlParser KEEP=NO
  public XmlParser () throws CGException {
    vdm_init_XmlParser();
  }
// ***** VDMTOOLS END Name=XmlParser


// ***** VDMTOOLS START Name=XmlParser#2|String|XmlEvent KEEP=NO
  public XmlParser (final String fn, final XmlEvent xe) throws CGException {

    vdm_init_XmlParser();
    {

      fName = UTIL.ConvertToString(UTIL.clone(fn));
      xmlEvent = (XmlEvent) UTIL.clone(xe);
    }
  }
// ***** VDMTOOLS END Name=XmlParser#2|String|XmlEvent


// ***** VDMTOOLS START Name=parse KEEP=NO
  public void parse () throws CGException {}
// ***** VDMTOOLS END Name=parse

}
;

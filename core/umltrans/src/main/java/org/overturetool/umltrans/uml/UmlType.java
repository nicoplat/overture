//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at 2009-07-27 by the VDM++ to JAVA Code Generator
// (v8.2 - Fri 29-May-2009 09:54:50)
//
// Supported compilers: jdk 1.4/1.5/1.6
//

// ***** VDMTOOLS START Name=HeaderComment KEEP=NO
// ***** VDMTOOLS END Name=HeaderComment

// ***** VDMTOOLS START Name=package KEEP=NO
package org.overturetool.umltrans.uml;

// ***** VDMTOOLS END Name=package

// ***** VDMTOOLS START Name=imports KEEP=NO

import jp.co.csk.vdm.toolbox.VDM.*;
import java.util.*;
// ***** VDMTOOLS END Name=imports



public class UmlType extends IUmlType {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp


// ***** VDMTOOLS START Name=vdm_init_UmlType KEEP=NO
  private void vdm_init_UmlType () throws CGException {}
// ***** VDMTOOLS END Name=vdm_init_UmlType


// ***** VDMTOOLS START Name=UmlType KEEP=NO
  public UmlType () throws CGException {
    vdm_init_UmlType();
  }
// ***** VDMTOOLS END Name=UmlType


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("Type");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept#1|IUmlVisitor KEEP=NO
  public void accept (final IUmlVisitor pVisitor) throws CGException {
    pVisitor.visitType((IUmlType) this);
  }
// ***** VDMTOOLS END Name=accept#1|IUmlVisitor

}
;

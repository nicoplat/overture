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



public class UmlVoidType extends IUmlVoidType {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp


// ***** VDMTOOLS START Name=vdm_init_UmlVoidType KEEP=NO
  private void vdm_init_UmlVoidType () throws CGException {}
// ***** VDMTOOLS END Name=vdm_init_UmlVoidType


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("VoidType");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept#1|IUmlVisitor KEEP=NO
  public void accept (final IUmlVisitor pVisitor) throws CGException {
    pVisitor.visitVoidType((IUmlVoidType) this);
  }
// ***** VDMTOOLS END Name=accept#1|IUmlVisitor


// ***** VDMTOOLS START Name=UmlVoidType KEEP=NO
  public UmlVoidType () throws CGException {
    vdm_init_UmlVoidType();
  }
// ***** VDMTOOLS END Name=UmlVoidType


// ***** VDMTOOLS START Name=UmlVoidType#2|Long|Long KEEP=NO
  public UmlVoidType (final Long line, final Long column) throws CGException {

    vdm_init_UmlVoidType();
    setPosition(line, column);
  }
// ***** VDMTOOLS END Name=UmlVoidType#2|Long|Long


// ***** VDMTOOLS START Name=init#1|HashMap KEEP=NO
  public void init (final HashMap var_1_1) throws CGException {}
// ***** VDMTOOLS END Name=init#1|HashMap

}
;

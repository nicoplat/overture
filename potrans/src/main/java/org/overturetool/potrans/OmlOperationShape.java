//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at 2008-11-08 by the VDM++ to JAVA Code Generator
// (v8.1.1b - Fri 24-Oct-2008 08:59:25)
//
// Supported compilers: jdk 1.4/1.5/1.6
//

// ***** VDMTOOLS START Name=HeaderComment KEEP=NO
// ***** VDMTOOLS END Name=HeaderComment

// ***** VDMTOOLS START Name=package KEEP=NO
package org.overturetool.potrans;

// ***** VDMTOOLS END Name=package

// ***** VDMTOOLS START Name=imports KEEP=YES

import jp.co.csk.vdm.toolbox.VDM.*;
import java.util.*;
// ***** VDMTOOLS END Name=imports



public class OmlOperationShape extends IOmlOperationShape {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp


// ***** VDMTOOLS START Name=vdm_init_OmlOperationShape KEEP=NO
  private void vdm_init_OmlOperationShape () throws CGException {}
// ***** VDMTOOLS END Name=vdm_init_OmlOperationShape


// ***** VDMTOOLS START Name=OmlOperationShape KEEP=NO
  public OmlOperationShape () throws CGException {
    vdm_init_OmlOperationShape();
  }
// ***** VDMTOOLS END Name=OmlOperationShape


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("OperationShape");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept#1|IOmlVisitor KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitOperationShape((IOmlOperationShape) this);
  }
// ***** VDMTOOLS END Name=accept#1|IOmlVisitor

}
;

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



public abstract class IOmlInvariant extends IOmlNode {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp


// ***** VDMTOOLS START Name=vdm_init_IOmlInvariant KEEP=NO
  private void vdm_init_IOmlInvariant () throws CGException {}
// ***** VDMTOOLS END Name=vdm_init_IOmlInvariant


// ***** VDMTOOLS START Name=IOmlInvariant KEEP=NO
  public IOmlInvariant () throws CGException {
    vdm_init_IOmlInvariant();
  }
// ***** VDMTOOLS END Name=IOmlInvariant


// ***** VDMTOOLS START Name=getPattern KEEP=NO
  abstract public IOmlPattern getPattern () throws CGException ;
// ***** VDMTOOLS END Name=getPattern


// ***** VDMTOOLS START Name=getExpression KEEP=NO
  abstract public IOmlExpression getExpression () throws CGException ;
// ***** VDMTOOLS END Name=getExpression

}
;

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



public abstract class IOmlSetForLoop extends IOmlStatement {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp


// ***** VDMTOOLS START Name=vdm_init_IOmlSetForLoop KEEP=NO
  private void vdm_init_IOmlSetForLoop () throws CGException {}
// ***** VDMTOOLS END Name=vdm_init_IOmlSetForLoop


// ***** VDMTOOLS START Name=IOmlSetForLoop KEEP=NO
  public IOmlSetForLoop () throws CGException {
    vdm_init_IOmlSetForLoop();
  }
// ***** VDMTOOLS END Name=IOmlSetForLoop


// ***** VDMTOOLS START Name=getPattern KEEP=NO
  abstract public IOmlPattern getPattern () throws CGException ;
// ***** VDMTOOLS END Name=getPattern


// ***** VDMTOOLS START Name=getExpression KEEP=NO
  abstract public IOmlExpression getExpression () throws CGException ;
// ***** VDMTOOLS END Name=getExpression


// ***** VDMTOOLS START Name=getStatement KEEP=NO
  abstract public IOmlStatement getStatement () throws CGException ;
// ***** VDMTOOLS END Name=getStatement

}
;

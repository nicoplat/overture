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



public abstract class IOmlFunctionTrailer extends IOmlNode {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp


// ***** VDMTOOLS START Name=vdm_init_IOmlFunctionTrailer KEEP=NO
  private void vdm_init_IOmlFunctionTrailer () throws CGException {}
// ***** VDMTOOLS END Name=vdm_init_IOmlFunctionTrailer


// ***** VDMTOOLS START Name=IOmlFunctionTrailer KEEP=NO
  public IOmlFunctionTrailer () throws CGException {
    vdm_init_IOmlFunctionTrailer();
  }
// ***** VDMTOOLS END Name=IOmlFunctionTrailer


// ***** VDMTOOLS START Name=getPreExpression KEEP=NO
  abstract public IOmlExpression getPreExpression () throws CGException ;
// ***** VDMTOOLS END Name=getPreExpression


// ***** VDMTOOLS START Name=hasPreExpression KEEP=NO
  abstract public Boolean hasPreExpression () throws CGException ;
// ***** VDMTOOLS END Name=hasPreExpression


// ***** VDMTOOLS START Name=getPostExpression KEEP=NO
  abstract public IOmlExpression getPostExpression () throws CGException ;
// ***** VDMTOOLS END Name=getPostExpression


// ***** VDMTOOLS START Name=hasPostExpression KEEP=NO
  abstract public Boolean hasPostExpression () throws CGException ;
// ***** VDMTOOLS END Name=hasPostExpression

}
;

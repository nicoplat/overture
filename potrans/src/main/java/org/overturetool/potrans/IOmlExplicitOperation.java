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



public abstract class IOmlExplicitOperation extends IOmlOperationShape {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp


// ***** VDMTOOLS START Name=vdm_init_IOmlExplicitOperation KEEP=NO
  private void vdm_init_IOmlExplicitOperation () throws CGException {}
// ***** VDMTOOLS END Name=vdm_init_IOmlExplicitOperation


// ***** VDMTOOLS START Name=IOmlExplicitOperation KEEP=NO
  public IOmlExplicitOperation () throws CGException {
    vdm_init_IOmlExplicitOperation();
  }
// ***** VDMTOOLS END Name=IOmlExplicitOperation


// ***** VDMTOOLS START Name=getIdentifier KEEP=NO
  abstract public String getIdentifier () throws CGException ;
// ***** VDMTOOLS END Name=getIdentifier


// ***** VDMTOOLS START Name=getType KEEP=NO
  abstract public IOmlType getType () throws CGException ;
// ***** VDMTOOLS END Name=getType


// ***** VDMTOOLS START Name=getParameterList KEEP=NO
  abstract public Vector getParameterList () throws CGException ;
// ***** VDMTOOLS END Name=getParameterList


// ***** VDMTOOLS START Name=getBody KEEP=NO
  abstract public IOmlOperationBody getBody () throws CGException ;
// ***** VDMTOOLS END Name=getBody


// ***** VDMTOOLS START Name=getTrailer KEEP=NO
  abstract public IOmlOperationTrailer getTrailer () throws CGException ;
// ***** VDMTOOLS END Name=getTrailer

}
;

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



public class OmlInstanceVariable extends IOmlInstanceVariable {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivAccess KEEP=NO
  private IOmlAccessDefinition ivAccess = null;
// ***** VDMTOOLS END Name=ivAccess

// ***** VDMTOOLS START Name=ivAssignmentDefinition KEEP=NO
  private IOmlAssignmentDefinition ivAssignmentDefinition = null;
// ***** VDMTOOLS END Name=ivAssignmentDefinition


// ***** VDMTOOLS START Name=vdm_init_OmlInstanceVariable KEEP=NO
  private void vdm_init_OmlInstanceVariable () throws CGException {
    try {

      ivAccess = null;
      ivAssignmentDefinition = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_OmlInstanceVariable


// ***** VDMTOOLS START Name=OmlInstanceVariable KEEP=NO
  public OmlInstanceVariable () throws CGException {
    vdm_init_OmlInstanceVariable();
  }
// ***** VDMTOOLS END Name=OmlInstanceVariable


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("InstanceVariable");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept#1|IOmlVisitor KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitInstanceVariable((IOmlInstanceVariable) this);
  }
// ***** VDMTOOLS END Name=accept#1|IOmlVisitor


// ***** VDMTOOLS START Name=OmlInstanceVariable#2|IOmlAccessDefinition|IOmlAssignmentDefinition KEEP=NO
  public OmlInstanceVariable (final IOmlAccessDefinition p1, final IOmlAssignmentDefinition p2) throws CGException {

    vdm_init_OmlInstanceVariable();
    {

      setAccess((IOmlAccessDefinition) p1);
      setAssignmentDefinition((IOmlAssignmentDefinition) p2);
    }
  }
// ***** VDMTOOLS END Name=OmlInstanceVariable#2|IOmlAccessDefinition|IOmlAssignmentDefinition


// ***** VDMTOOLS START Name=init#1|HashMap KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("access");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setAccess((IOmlAccessDefinition) data.get(fname));
    }
    {

      String fname = new String("assignment_definition");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setAssignmentDefinition((IOmlAssignmentDefinition) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init#1|HashMap


// ***** VDMTOOLS START Name=getAccess KEEP=NO
  public IOmlAccessDefinition getAccess () throws CGException {
    return (IOmlAccessDefinition) ivAccess;
  }
// ***** VDMTOOLS END Name=getAccess


// ***** VDMTOOLS START Name=setAccess#1|IOmlAccessDefinition KEEP=NO
  public void setAccess (final IOmlAccessDefinition parg) throws CGException {
    ivAccess = (IOmlAccessDefinition) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setAccess#1|IOmlAccessDefinition


// ***** VDMTOOLS START Name=getAssignmentDefinition KEEP=NO
  public IOmlAssignmentDefinition getAssignmentDefinition () throws CGException {
    return (IOmlAssignmentDefinition) ivAssignmentDefinition;
  }
// ***** VDMTOOLS END Name=getAssignmentDefinition


// ***** VDMTOOLS START Name=setAssignmentDefinition#1|IOmlAssignmentDefinition KEEP=NO
  public void setAssignmentDefinition (final IOmlAssignmentDefinition parg) throws CGException {
    ivAssignmentDefinition = (IOmlAssignmentDefinition) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setAssignmentDefinition#1|IOmlAssignmentDefinition

}
;

//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at Wed 11-Jun-2008 by the VDM++ to JAVA Code Generator
// (v8.0.1b - Mon 28-Jan-2008 10:17:36)
//
// Supported compilers:
// jdk1.4
//

// ***** VDMTOOLS START Name=HeaderComment KEEP=NO
// ***** VDMTOOLS END Name=HeaderComment

// ***** VDMTOOLS START Name=package KEEP=NO
package org.overturetool.ast.imp;

// ***** VDMTOOLS END Name=package

// ***** VDMTOOLS START Name=imports KEEP=YES

import jp.co.csk.vdm.toolbox.VDM.*;
import java.util.*;
import org.overturetool.ast.itf.*;
// ***** VDMTOOLS END Name=imports



public class OmlTraceBracketedDefinition extends OmlTraceCoreDefinition implements IOmlTraceBracketedDefinition {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivDefinition KEEP=NO
  private IOmlTraceDefinition ivDefinition = null;
// ***** VDMTOOLS END Name=ivDefinition


// ***** VDMTOOLS START Name=OmlTraceBracketedDefinition KEEP=NO
  public OmlTraceBracketedDefinition () throws CGException {
    try {
      ivDefinition = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlTraceBracketedDefinition


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("TraceBracketedDefinition");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitTraceBracketedDefinition((IOmlTraceBracketedDefinition) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlTraceBracketedDefinition KEEP=NO
  public OmlTraceBracketedDefinition (final IOmlTraceDefinition p1) throws CGException {

    try {
      ivDefinition = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    setDefinition((IOmlTraceDefinition) p1);
  }
// ***** VDMTOOLS END Name=OmlTraceBracketedDefinition


// ***** VDMTOOLS START Name=OmlTraceBracketedDefinition KEEP=NO
  public OmlTraceBracketedDefinition (final IOmlTraceDefinition p1, final Long line, final Long column) throws CGException {

    try {
      ivDefinition = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setDefinition((IOmlTraceDefinition) p1);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlTraceBracketedDefinition


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    String fname = new String("definition");
    Boolean cond_4 = null;
    cond_4 = new Boolean(data.containsKey(fname));
    if (cond_4.booleanValue()) 
      setDefinition((IOmlTraceDefinition) data.get(fname));
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getDefinition KEEP=NO
  public IOmlTraceDefinition getDefinition () throws CGException {
    return (IOmlTraceDefinition) ivDefinition;
  }
// ***** VDMTOOLS END Name=getDefinition


// ***** VDMTOOLS START Name=setDefinition KEEP=NO
  public void setDefinition (final IOmlTraceDefinition parg) throws CGException {
    ivDefinition = (IOmlTraceDefinition) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setDefinition

  public String toString() {
	  return "(" + this.ivDefinition.toString() + ")";
  }
}
;

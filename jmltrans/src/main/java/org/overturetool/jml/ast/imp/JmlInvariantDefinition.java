//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at Mon 07-Jul-2008 by the VDM++ to JAVA Code Generator
// (v8.1.1b - Fri 06-Jun-2008 09:02:11)
//
// Supported compilers:
// jdk1.4
//

// ***** VDMTOOLS START Name=HeaderComment KEEP=NO
// ***** VDMTOOLS END Name=HeaderComment

// ***** VDMTOOLS START Name=package KEEP=NO
package org.overturetool.jml.ast.imp;

// ***** VDMTOOLS END Name=package

// ***** VDMTOOLS START Name=imports KEEP=YES

import jp.co.csk.vdm.toolbox.VDM.*;
import java.util.*;
import org.overturetool.jml.ast.itf.*;
// ***** VDMTOOLS END Name=imports



public class JmlInvariantDefinition extends JmlNode implements IJmlInvariantDefinition {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivAccess KEEP=NO
  private IJmlAccessDefinition ivAccess = null;
// ***** VDMTOOLS END Name=ivAccess

// ***** VDMTOOLS START Name=ivRedundant KEEP=NO
  private Boolean ivRedundant = null;
// ***** VDMTOOLS END Name=ivRedundant

// ***** VDMTOOLS START Name=ivPredicate KEEP=NO
  private IJmlExpression ivPredicate = null;
// ***** VDMTOOLS END Name=ivPredicate


// ***** VDMTOOLS START Name=JmlInvariantDefinition KEEP=NO
  public JmlInvariantDefinition () throws CGException {
    try {

      ivAccess = null;
      ivRedundant = null;
      ivPredicate = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=JmlInvariantDefinition


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("InvariantDefinition");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IJmlVisitor pVisitor) throws CGException {
    pVisitor.visitInvariantDefinition((IJmlInvariantDefinition) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=JmlInvariantDefinition KEEP=NO
  public JmlInvariantDefinition (final IJmlAccessDefinition p1, final Boolean p2, final IJmlExpression p3) throws CGException {

    try {

      ivAccess = null;
      ivRedundant = null;
      ivPredicate = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setAccess((IJmlAccessDefinition) p1);
      setRedundant(p2);
      setPredicate((IJmlExpression) p3);
    }
  }
// ***** VDMTOOLS END Name=JmlInvariantDefinition


// ***** VDMTOOLS START Name=JmlInvariantDefinition KEEP=NO
  public JmlInvariantDefinition (final IJmlAccessDefinition p1, final Boolean p2, final IJmlExpression p3, final Long line, final Long column) throws CGException {

    try {

      ivAccess = null;
      ivRedundant = null;
      ivPredicate = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setAccess((IJmlAccessDefinition) p1);
      setRedundant(p2);
      setPredicate((IJmlExpression) p3);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=JmlInvariantDefinition


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("access");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setAccess((IJmlAccessDefinition) data.get(fname));
    }
    {

      String fname = new String("redundant");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setRedundant((Boolean) data.get(fname));
    }
    {

      String fname = new String("predicate");
      Boolean cond_22 = null;
      cond_22 = new Boolean(data.containsKey(fname));
      if (cond_22.booleanValue()) 
        setPredicate((IJmlExpression) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getAccess KEEP=NO
  public IJmlAccessDefinition getAccess () throws CGException {
    return (IJmlAccessDefinition) ivAccess;
  }
// ***** VDMTOOLS END Name=getAccess


// ***** VDMTOOLS START Name=setAccess KEEP=NO
  public void setAccess (final IJmlAccessDefinition parg) throws CGException {
    ivAccess = (IJmlAccessDefinition) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setAccess


// ***** VDMTOOLS START Name=getRedundant KEEP=NO
  public Boolean getRedundant () throws CGException {
    return ivRedundant;
  }
// ***** VDMTOOLS END Name=getRedundant


// ***** VDMTOOLS START Name=setRedundant KEEP=NO
  public void setRedundant (final Boolean parg) throws CGException {
    ivRedundant = (Boolean) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setRedundant


// ***** VDMTOOLS START Name=getPredicate KEEP=NO
  public IJmlExpression getPredicate () throws CGException {
    return (IJmlExpression) ivPredicate;
  }
// ***** VDMTOOLS END Name=getPredicate


// ***** VDMTOOLS START Name=setPredicate KEEP=NO
  public void setPredicate (final IJmlExpression parg) throws CGException {
    ivPredicate = (IJmlExpression) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setPredicate
  
  public String toString() {
	  
	  String str = new String();
	  String key = new String();
	  
	  if(this.ivRedundant == true)
		  key = "invariant redundantly";
	  else
		  key = "invariant";
	  
	  str = "//@ " + this.ivAccess.toString() + " " + key + " " + this.ivPredicate.toString();
	  
	  
	  return str;
  }

}
;

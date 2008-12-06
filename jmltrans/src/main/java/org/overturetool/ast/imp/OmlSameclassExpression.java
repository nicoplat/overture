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



public class OmlSameclassExpression extends OmlExpression implements IOmlSameclassExpression {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivLhsExpression KEEP=NO
  private IOmlExpression ivLhsExpression = null;
// ***** VDMTOOLS END Name=ivLhsExpression

// ***** VDMTOOLS START Name=ivRhsExpression KEEP=NO
  private IOmlExpression ivRhsExpression = null;
// ***** VDMTOOLS END Name=ivRhsExpression


// ***** VDMTOOLS START Name=OmlSameclassExpression KEEP=NO
  public OmlSameclassExpression () throws CGException {
    try {

      ivLhsExpression = null;
      ivRhsExpression = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlSameclassExpression


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("SameclassExpression");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitSameclassExpression((IOmlSameclassExpression) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlSameclassExpression KEEP=NO
  public OmlSameclassExpression (final IOmlExpression p1, final IOmlExpression p2) throws CGException {

    try {

      ivLhsExpression = null;
      ivRhsExpression = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setLhsExpression((IOmlExpression) p1);
      setRhsExpression((IOmlExpression) p2);
    }
  }
// ***** VDMTOOLS END Name=OmlSameclassExpression


// ***** VDMTOOLS START Name=OmlSameclassExpression KEEP=NO
  public OmlSameclassExpression (final IOmlExpression p1, final IOmlExpression p2, final Long line, final Long column) throws CGException {

    try {

      ivLhsExpression = null;
      ivRhsExpression = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setLhsExpression((IOmlExpression) p1);
      setRhsExpression((IOmlExpression) p2);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlSameclassExpression


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("lhs_expression");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setLhsExpression((IOmlExpression) data.get(fname));
    }
    {

      String fname = new String("rhs_expression");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setRhsExpression((IOmlExpression) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getLhsExpression KEEP=NO
  public IOmlExpression getLhsExpression () throws CGException {
    return (IOmlExpression) ivLhsExpression;
  }
// ***** VDMTOOLS END Name=getLhsExpression


// ***** VDMTOOLS START Name=setLhsExpression KEEP=NO
  public void setLhsExpression (final IOmlExpression parg) throws CGException {
    ivLhsExpression = (IOmlExpression) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setLhsExpression


// ***** VDMTOOLS START Name=getRhsExpression KEEP=NO
  public IOmlExpression getRhsExpression () throws CGException {
    return (IOmlExpression) ivRhsExpression;
  }
// ***** VDMTOOLS END Name=getRhsExpression


// ***** VDMTOOLS START Name=setRhsExpression KEEP=NO
  public void setRhsExpression (final IOmlExpression parg) throws CGException {
    ivRhsExpression = (IOmlExpression) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setRhsExpression

  //TODO: Sameclass
  public String toString() {
	  return "TODO: Sameclass";
  }
}
;

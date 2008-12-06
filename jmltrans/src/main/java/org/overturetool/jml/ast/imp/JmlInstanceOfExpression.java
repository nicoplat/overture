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



public class JmlInstanceOfExpression extends JmlExpression implements IJmlInstanceOfExpression {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivType KEEP=NO
  private IJmlType ivType = null;
// ***** VDMTOOLS END Name=ivType

// ***** VDMTOOLS START Name=ivExpression KEEP=NO
  private IJmlExpression ivExpression = null;
// ***** VDMTOOLS END Name=ivExpression


// ***** VDMTOOLS START Name=JmlInstanceOfExpression KEEP=NO
  public JmlInstanceOfExpression () throws CGException {
    try {

      ivType = null;
      ivExpression = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=JmlInstanceOfExpression


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("InstanceOfExpression");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IJmlVisitor pVisitor) throws CGException {
    pVisitor.visitInstanceOfExpression((IJmlInstanceOfExpression) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=JmlInstanceOfExpression KEEP=NO
  public JmlInstanceOfExpression (final IJmlType p1, final IJmlExpression p2) throws CGException {

    try {

      ivType = null;
      ivExpression = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setType((IJmlType) p1);
      setExpression((IJmlExpression) p2);
    }
  }
// ***** VDMTOOLS END Name=JmlInstanceOfExpression


// ***** VDMTOOLS START Name=JmlInstanceOfExpression KEEP=NO
  public JmlInstanceOfExpression (final IJmlType p1, final IJmlExpression p2, final Long line, final Long column) throws CGException {

    try {

      ivType = null;
      ivExpression = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setType((IJmlType) p1);
      setExpression((IJmlExpression) p2);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=JmlInstanceOfExpression


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("type");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setType((IJmlType) data.get(fname));
    }
    {

      String fname = new String("expression");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setExpression((IJmlExpression) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getType KEEP=NO
  public IJmlType getType () throws CGException {
    return (IJmlType) ivType;
  }
// ***** VDMTOOLS END Name=getType


// ***** VDMTOOLS START Name=setType KEEP=NO
  public void setType (final IJmlType parg) throws CGException {
    ivType = (IJmlType) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setType


// ***** VDMTOOLS START Name=getExpression KEEP=NO
  public IJmlExpression getExpression () throws CGException {
    return (IJmlExpression) ivExpression;
  }
// ***** VDMTOOLS END Name=getExpression


// ***** VDMTOOLS START Name=setExpression KEEP=NO
  public void setExpression (final IJmlExpression parg) throws CGException {
    ivExpression = (IJmlExpression) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setExpression

  public String toString() {
	  
	  String str = new String();
	  
	  str += this.ivExpression.toString() + " instanceof " + this.ivType.toString();
	  
	  return str;
  }
  
}
;

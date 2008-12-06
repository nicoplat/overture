//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at Sat 16-Aug-2008 by the VDM++ to JAVA Code Generator
// (v8.1.1b - Fri 06-Jun-2008 09:09:07)
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



public class OmlElseIfExpression extends OmlNode implements IOmlElseIfExpression {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivElseifExpression KEEP=NO
  private IOmlExpression ivElseifExpression = null;
// ***** VDMTOOLS END Name=ivElseifExpression

// ***** VDMTOOLS START Name=ivThenExpression KEEP=NO
  private IOmlExpression ivThenExpression = null;
// ***** VDMTOOLS END Name=ivThenExpression


// ***** VDMTOOLS START Name=OmlElseIfExpression KEEP=NO
  public OmlElseIfExpression () throws CGException {
    try {

      ivElseifExpression = null;
      ivThenExpression = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlElseIfExpression


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("ElseIfExpression");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitElseIfExpression((IOmlElseIfExpression) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlElseIfExpression KEEP=NO
  public OmlElseIfExpression (final IOmlExpression p1, final IOmlExpression p2) throws CGException {

    try {

      ivElseifExpression = null;
      ivThenExpression = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setElseifExpression((IOmlExpression) p1);
      setThenExpression((IOmlExpression) p2);
    }
  }
// ***** VDMTOOLS END Name=OmlElseIfExpression


// ***** VDMTOOLS START Name=OmlElseIfExpression KEEP=NO
  public OmlElseIfExpression (final IOmlExpression p1, final IOmlExpression p2, final Long line, final Long column) throws CGException {

    try {

      ivElseifExpression = null;
      ivThenExpression = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setElseifExpression((IOmlExpression) p1);
      setThenExpression((IOmlExpression) p2);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlElseIfExpression


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("elseif_expression");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setElseifExpression((IOmlExpression) data.get(fname));
    }
    {

      String fname = new String("then_expression");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setThenExpression((IOmlExpression) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getElseifExpression KEEP=NO
  public IOmlExpression getElseifExpression () throws CGException {
    return (IOmlExpression) ivElseifExpression;
  }
// ***** VDMTOOLS END Name=getElseifExpression


// ***** VDMTOOLS START Name=setElseifExpression KEEP=NO
  public void setElseifExpression (final IOmlExpression parg) throws CGException {
    ivElseifExpression = (IOmlExpression) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setElseifExpression


// ***** VDMTOOLS START Name=getThenExpression KEEP=NO
  public IOmlExpression getThenExpression () throws CGException {
    return (IOmlExpression) ivThenExpression;
  }
// ***** VDMTOOLS END Name=getThenExpression


// ***** VDMTOOLS START Name=setThenExpression KEEP=NO
  public void setThenExpression (final IOmlExpression parg) throws CGException {
    ivThenExpression = (IOmlExpression) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setThenExpression

}
;

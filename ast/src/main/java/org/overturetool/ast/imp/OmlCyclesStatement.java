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



public class OmlCyclesStatement extends OmlStatement implements IOmlCyclesStatement {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivCyclesExpression KEEP=NO
  private Vector ivCyclesExpression = null;
// ***** VDMTOOLS END Name=ivCyclesExpression

// ***** VDMTOOLS START Name=ivStatement KEEP=NO
  private IOmlStatement ivStatement = null;
// ***** VDMTOOLS END Name=ivStatement


// ***** VDMTOOLS START Name=OmlCyclesStatement KEEP=NO
  public OmlCyclesStatement () throws CGException {
    try {

      ivCyclesExpression = new Vector();
      ivStatement = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlCyclesStatement


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("CyclesStatement");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitCyclesStatement((IOmlCyclesStatement) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlCyclesStatement KEEP=NO
  public OmlCyclesStatement (final Vector p1, final IOmlStatement p2) throws CGException {

    try {

      ivCyclesExpression = new Vector();
      ivStatement = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setCyclesExpression(p1);
      setStatement((IOmlStatement) p2);
    }
  }
// ***** VDMTOOLS END Name=OmlCyclesStatement


// ***** VDMTOOLS START Name=OmlCyclesStatement KEEP=NO
  public OmlCyclesStatement (final Vector p1, final IOmlStatement p2, final Long line, final Long column) throws CGException {

    try {

      ivCyclesExpression = new Vector();
      ivStatement = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setCyclesExpression(p1);
      setStatement((IOmlStatement) p2);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlCyclesStatement


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("cycles_expression");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setCyclesExpression((Vector) data.get(fname));
    }
    {

      String fname = new String("statement");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setStatement((IOmlStatement) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getCyclesExpression KEEP=NO
  public Vector getCyclesExpression () throws CGException {
    return ivCyclesExpression;
  }
// ***** VDMTOOLS END Name=getCyclesExpression


// ***** VDMTOOLS START Name=setCyclesExpression KEEP=NO
  public void setCyclesExpression (final Vector parg) throws CGException {
    ivCyclesExpression = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setCyclesExpression


// ***** VDMTOOLS START Name=addCyclesExpression KEEP=NO
  public void addCyclesExpression (final IOmlNode parg) throws CGException {
    ivCyclesExpression.add(parg);
  }
// ***** VDMTOOLS END Name=addCyclesExpression


// ***** VDMTOOLS START Name=getStatement KEEP=NO
  public IOmlStatement getStatement () throws CGException {
    return (IOmlStatement) ivStatement;
  }
// ***** VDMTOOLS END Name=getStatement


// ***** VDMTOOLS START Name=setStatement KEEP=NO
  public void setStatement (final IOmlStatement parg) throws CGException {
    ivStatement = (IOmlStatement) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setStatement

}
;

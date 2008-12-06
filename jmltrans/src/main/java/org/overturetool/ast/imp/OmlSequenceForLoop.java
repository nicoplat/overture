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



public class OmlSequenceForLoop extends OmlStatement implements IOmlSequenceForLoop {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivPatternBind KEEP=NO
  private IOmlPatternBind ivPatternBind = null;
// ***** VDMTOOLS END Name=ivPatternBind

// ***** VDMTOOLS START Name=ivInReverse KEEP=NO
  private Boolean ivInReverse = null;
// ***** VDMTOOLS END Name=ivInReverse

// ***** VDMTOOLS START Name=ivExpression KEEP=NO
  private IOmlExpression ivExpression = null;
// ***** VDMTOOLS END Name=ivExpression

// ***** VDMTOOLS START Name=ivStatement KEEP=NO
  private IOmlStatement ivStatement = null;
// ***** VDMTOOLS END Name=ivStatement


// ***** VDMTOOLS START Name=OmlSequenceForLoop KEEP=NO
  public OmlSequenceForLoop () throws CGException {
    try {

      ivPatternBind = null;
      ivInReverse = null;
      ivExpression = null;
      ivStatement = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlSequenceForLoop


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("SequenceForLoop");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitSequenceForLoop((IOmlSequenceForLoop) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlSequenceForLoop KEEP=NO
  public OmlSequenceForLoop (final IOmlPatternBind p1, final Boolean p2, final IOmlExpression p3, final IOmlStatement p4) throws CGException {

    try {

      ivPatternBind = null;
      ivInReverse = null;
      ivExpression = null;
      ivStatement = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setPatternBind((IOmlPatternBind) p1);
      setInReverse(p2);
      setExpression((IOmlExpression) p3);
      setStatement((IOmlStatement) p4);
    }
  }
// ***** VDMTOOLS END Name=OmlSequenceForLoop


// ***** VDMTOOLS START Name=OmlSequenceForLoop KEEP=NO
  public OmlSequenceForLoop (final IOmlPatternBind p1, final Boolean p2, final IOmlExpression p3, final IOmlStatement p4, final Long line, final Long column) throws CGException {

    try {

      ivPatternBind = null;
      ivInReverse = null;
      ivExpression = null;
      ivStatement = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setPatternBind((IOmlPatternBind) p1);
      setInReverse(p2);
      setExpression((IOmlExpression) p3);
      setStatement((IOmlStatement) p4);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlSequenceForLoop


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("pattern_bind");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setPatternBind((IOmlPatternBind) data.get(fname));
    }
    {

      String fname = new String("in_reverse");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setInReverse((Boolean) data.get(fname));
    }
    {

      String fname = new String("expression");
      Boolean cond_22 = null;
      cond_22 = new Boolean(data.containsKey(fname));
      if (cond_22.booleanValue()) 
        setExpression((IOmlExpression) data.get(fname));
    }
    {

      String fname = new String("statement");
      Boolean cond_31 = null;
      cond_31 = new Boolean(data.containsKey(fname));
      if (cond_31.booleanValue()) 
        setStatement((IOmlStatement) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getPatternBind KEEP=NO
  public IOmlPatternBind getPatternBind () throws CGException {
    return (IOmlPatternBind) ivPatternBind;
  }
// ***** VDMTOOLS END Name=getPatternBind


// ***** VDMTOOLS START Name=setPatternBind KEEP=NO
  public void setPatternBind (final IOmlPatternBind parg) throws CGException {
    ivPatternBind = (IOmlPatternBind) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setPatternBind


// ***** VDMTOOLS START Name=getInReverse KEEP=NO
  public Boolean getInReverse () throws CGException {
    return ivInReverse;
  }
// ***** VDMTOOLS END Name=getInReverse


// ***** VDMTOOLS START Name=setInReverse KEEP=NO
  public void setInReverse (final Boolean parg) throws CGException {
    ivInReverse = (Boolean) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setInReverse


// ***** VDMTOOLS START Name=getExpression KEEP=NO
  public IOmlExpression getExpression () throws CGException {
    return (IOmlExpression) ivExpression;
  }
// ***** VDMTOOLS END Name=getExpression


// ***** VDMTOOLS START Name=setExpression KEEP=NO
  public void setExpression (final IOmlExpression parg) throws CGException {
    ivExpression = (IOmlExpression) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setExpression


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

  public String toString() {
	  String res = new String();
	  if (this.ivInReverse)
		  res = "for " + this.ivPatternBind.toString() + " in reverse " +
		  this.ivInReverse.toString() + " do " + this.ivStatement.toString();
	  else
		  res = "for " + this.ivPatternBind.toString() + " in " +
		  this.ivInReverse.toString() + " do " + this.ivStatement.toString();
	  return res;
  }
}
;

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



public class OmlSetBind extends IOmlSetBind {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivPattern KEEP=NO
  private Vector ivPattern = null;
// ***** VDMTOOLS END Name=ivPattern

// ***** VDMTOOLS START Name=ivExpression KEEP=NO
  private IOmlExpression ivExpression = null;
// ***** VDMTOOLS END Name=ivExpression


// ***** VDMTOOLS START Name=vdm_init_OmlSetBind KEEP=NO
  private void vdm_init_OmlSetBind () throws CGException {
    try {

      ivPattern = new Vector();
      ivExpression = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_OmlSetBind


// ***** VDMTOOLS START Name=OmlSetBind KEEP=NO
  public OmlSetBind () throws CGException {
    vdm_init_OmlSetBind();
  }
// ***** VDMTOOLS END Name=OmlSetBind


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("SetBind");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept#1|IOmlVisitor KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitSetBind((IOmlSetBind) this);
  }
// ***** VDMTOOLS END Name=accept#1|IOmlVisitor


// ***** VDMTOOLS START Name=OmlSetBind#2|Vector|IOmlExpression KEEP=NO
  public OmlSetBind (final Vector p1, final IOmlExpression p2) throws CGException {

    vdm_init_OmlSetBind();
    {

      setPattern(p1);
      setExpression((IOmlExpression) p2);
    }
  }
// ***** VDMTOOLS END Name=OmlSetBind#2|Vector|IOmlExpression


// ***** VDMTOOLS START Name=init#1|HashMap KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("pattern");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setPattern((Vector) data.get(fname));
    }
    {

      String fname = new String("expression");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setExpression((IOmlExpression) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init#1|HashMap


// ***** VDMTOOLS START Name=getPattern KEEP=NO
  public Vector getPattern () throws CGException {
    return ivPattern;
  }
// ***** VDMTOOLS END Name=getPattern


// ***** VDMTOOLS START Name=setPattern#1|Vector KEEP=NO
  public void setPattern (final Vector parg) throws CGException {
    ivPattern = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setPattern#1|Vector


// ***** VDMTOOLS START Name=addPattern#1|IOmlNode KEEP=NO
  public void addPattern (final IOmlNode parg) throws CGException {
    ivPattern.add(parg);
  }
// ***** VDMTOOLS END Name=addPattern#1|IOmlNode


// ***** VDMTOOLS START Name=getExpression KEEP=NO
  public IOmlExpression getExpression () throws CGException {
    return (IOmlExpression) ivExpression;
  }
// ***** VDMTOOLS END Name=getExpression


// ***** VDMTOOLS START Name=setExpression#1|IOmlExpression KEEP=NO
  public void setExpression (final IOmlExpression parg) throws CGException {
    ivExpression = (IOmlExpression) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setExpression#1|IOmlExpression

}
;

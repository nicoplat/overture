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



public class OmlExistsUniqueExpression extends IOmlExistsUniqueExpression {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivBind KEEP=NO
  private IOmlBind ivBind = null;
// ***** VDMTOOLS END Name=ivBind

// ***** VDMTOOLS START Name=ivExpression KEEP=NO
  private IOmlExpression ivExpression = null;
// ***** VDMTOOLS END Name=ivExpression


// ***** VDMTOOLS START Name=vdm_init_OmlExistsUniqueExpression KEEP=NO
  private void vdm_init_OmlExistsUniqueExpression () throws CGException {
    try {

      ivBind = null;
      ivExpression = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_OmlExistsUniqueExpression


// ***** VDMTOOLS START Name=OmlExistsUniqueExpression KEEP=NO
  public OmlExistsUniqueExpression () throws CGException {
    vdm_init_OmlExistsUniqueExpression();
  }
// ***** VDMTOOLS END Name=OmlExistsUniqueExpression


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("ExistsUniqueExpression");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept#1|IOmlVisitor KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitExistsUniqueExpression((IOmlExistsUniqueExpression) this);
  }
// ***** VDMTOOLS END Name=accept#1|IOmlVisitor


// ***** VDMTOOLS START Name=OmlExistsUniqueExpression#2|IOmlBind|IOmlExpression KEEP=NO
  public OmlExistsUniqueExpression (final IOmlBind p1, final IOmlExpression p2) throws CGException {

    vdm_init_OmlExistsUniqueExpression();
    {

      setBind((IOmlBind) p1);
      setExpression((IOmlExpression) p2);
    }
  }
// ***** VDMTOOLS END Name=OmlExistsUniqueExpression#2|IOmlBind|IOmlExpression


// ***** VDMTOOLS START Name=init#1|HashMap KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("bind");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setBind((IOmlBind) data.get(fname));
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


// ***** VDMTOOLS START Name=getBind KEEP=NO
  public IOmlBind getBind () throws CGException {
    return (IOmlBind) ivBind;
  }
// ***** VDMTOOLS END Name=getBind


// ***** VDMTOOLS START Name=setBind#1|IOmlBind KEEP=NO
  public void setBind (final IOmlBind parg) throws CGException {
    ivBind = (IOmlBind) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setBind#1|IOmlBind


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

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



public class OmlSubsequenceExpression extends IOmlSubsequenceExpression {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivExpression KEEP=NO
  private IOmlExpression ivExpression = null;
// ***** VDMTOOLS END Name=ivExpression

// ***** VDMTOOLS START Name=ivLower KEEP=NO
  private IOmlExpression ivLower = null;
// ***** VDMTOOLS END Name=ivLower

// ***** VDMTOOLS START Name=ivUpper KEEP=NO
  private IOmlExpression ivUpper = null;
// ***** VDMTOOLS END Name=ivUpper


// ***** VDMTOOLS START Name=vdm_init_OmlSubsequenceExpression KEEP=NO
  private void vdm_init_OmlSubsequenceExpression () throws CGException {
    try {

      ivExpression = null;
      ivLower = null;
      ivUpper = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_OmlSubsequenceExpression


// ***** VDMTOOLS START Name=OmlSubsequenceExpression KEEP=NO
  public OmlSubsequenceExpression () throws CGException {
    vdm_init_OmlSubsequenceExpression();
  }
// ***** VDMTOOLS END Name=OmlSubsequenceExpression


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("SubsequenceExpression");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept#1|IOmlVisitor KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitSubsequenceExpression((IOmlSubsequenceExpression) this);
  }
// ***** VDMTOOLS END Name=accept#1|IOmlVisitor


// ***** VDMTOOLS START Name=OmlSubsequenceExpression#3|IOmlExpression|IOmlExpression|IOmlExpression KEEP=NO
  public OmlSubsequenceExpression (final IOmlExpression p1, final IOmlExpression p2, final IOmlExpression p3) throws CGException {

    vdm_init_OmlSubsequenceExpression();
    {

      setExpression((IOmlExpression) p1);
      setLower((IOmlExpression) p2);
      setUpper((IOmlExpression) p3);
    }
  }
// ***** VDMTOOLS END Name=OmlSubsequenceExpression#3|IOmlExpression|IOmlExpression|IOmlExpression


// ***** VDMTOOLS START Name=init#1|HashMap KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("expression");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setExpression((IOmlExpression) data.get(fname));
    }
    {

      String fname = new String("lower");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setLower((IOmlExpression) data.get(fname));
    }
    {

      String fname = new String("upper");
      Boolean cond_22 = null;
      cond_22 = new Boolean(data.containsKey(fname));
      if (cond_22.booleanValue()) 
        setUpper((IOmlExpression) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init#1|HashMap


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


// ***** VDMTOOLS START Name=getLower KEEP=NO
  public IOmlExpression getLower () throws CGException {
    return (IOmlExpression) ivLower;
  }
// ***** VDMTOOLS END Name=getLower


// ***** VDMTOOLS START Name=setLower#1|IOmlExpression KEEP=NO
  public void setLower (final IOmlExpression parg) throws CGException {
    ivLower = (IOmlExpression) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setLower#1|IOmlExpression


// ***** VDMTOOLS START Name=getUpper KEEP=NO
  public IOmlExpression getUpper () throws CGException {
    return (IOmlExpression) ivUpper;
  }
// ***** VDMTOOLS END Name=getUpper


// ***** VDMTOOLS START Name=setUpper#1|IOmlExpression KEEP=NO
  public void setUpper (final IOmlExpression parg) throws CGException {
    ivUpper = (IOmlExpression) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setUpper#1|IOmlExpression

}
;

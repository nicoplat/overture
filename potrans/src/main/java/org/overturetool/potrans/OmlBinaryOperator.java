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



public class OmlBinaryOperator extends IOmlBinaryOperator {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=val KEEP=NO
  private Integer val = null;
// ***** VDMTOOLS END Name=val


// ***** VDMTOOLS START Name=vdm_init_OmlBinaryOperator KEEP=NO
  private void vdm_init_OmlBinaryOperator () throws CGException {
    try {
      val = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_OmlBinaryOperator


// ***** VDMTOOLS START Name=OmlBinaryOperator KEEP=NO
  public OmlBinaryOperator () throws CGException {
    vdm_init_OmlBinaryOperator();
  }
// ***** VDMTOOLS END Name=OmlBinaryOperator


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("BinaryOperator");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept#1|IOmlVisitor KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitBinaryOperator((IOmlBinaryOperator) this);
  }
// ***** VDMTOOLS END Name=accept#1|IOmlVisitor


// ***** VDMTOOLS START Name=OmlBinaryOperator#1|Integer KEEP=NO
  public OmlBinaryOperator (final Integer pv) throws CGException {

    vdm_init_OmlBinaryOperator();
    setValue(pv);
  }
// ***** VDMTOOLS END Name=OmlBinaryOperator#1|Integer


// ***** VDMTOOLS START Name=setValue#1|Integer KEEP=NO
  public void setValue (final Integer pval) throws CGException {
    val = UTIL.NumberToInt(UTIL.clone(pval));
  }
// ***** VDMTOOLS END Name=setValue#1|Integer


// ***** VDMTOOLS START Name=getValue KEEP=NO
  public Integer getValue () throws CGException {
    return val;
  }
// ***** VDMTOOLS END Name=getValue


// ***** VDMTOOLS START Name=getStringValue KEEP=NO
  public String getStringValue () throws CGException {

    String rexpr_1 = null;
    rexpr_1 = OmlBinaryOperatorQuotes.getQuoteName(val);
    return rexpr_1;
  }
// ***** VDMTOOLS END Name=getStringValue

}
;

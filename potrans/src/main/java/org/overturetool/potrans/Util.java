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



public class Util {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp


// ***** VDMTOOLS START Name=vdm_init_Util KEEP=NO
  private void vdm_init_Util () throws CGException {}
// ***** VDMTOOLS END Name=vdm_init_Util


// ***** VDMTOOLS START Name=Util KEEP=NO
  public Util () throws CGException {
    vdm_init_Util();
  }
// ***** VDMTOOLS END Name=Util


// ***** VDMTOOLS START Name=itoa#1|Integer KEEP=NO
  public String itoa (final Integer n) throws CGException {

    String varRes_2 = null;
    if (new Boolean(n.intValue() == new Integer(0).intValue()).booleanValue()) 
      varRes_2 = new String("0");
    else 
      varRes_2 = itoaR(n);
    return varRes_2;
  }
// ***** VDMTOOLS END Name=itoa#1|Integer


// ***** VDMTOOLS START Name=itoaR#1|Integer KEEP=NO
  private String itoaR (final Integer n) throws CGException {

    String varRes_2 = null;
    if (new Boolean(n.intValue() == new Integer(0).intValue()).booleanValue()) 
      varRes_2 = new String("");
    else {

      Integer first = new Integer((int) (n.intValue() / new Integer(10).intValue()));
      Integer last = new Integer((int) (n.doubleValue() - new Integer(10).doubleValue() * Math.floor(n.doubleValue() / new Integer(10).doubleValue())));
      String var2_16 = null;
      boolean succ_17 = true;
      {

        succ_17 = true;
        if (!UTIL.equals(last, new Integer(0))) 
          succ_17 = false;
        if (succ_17) 
          var2_16 = new String("0");
      }
      if (!succ_17) {

        succ_17 = true;
        if (!UTIL.equals(last, new Integer(1))) 
          succ_17 = false;
        if (succ_17) 
          var2_16 = new String("1");
      }
      if (!succ_17) {

        succ_17 = true;
        if (!UTIL.equals(last, new Integer(2))) 
          succ_17 = false;
        if (succ_17) 
          var2_16 = new String("2");
      }
      if (!succ_17) {

        succ_17 = true;
        if (!UTIL.equals(last, new Integer(3))) 
          succ_17 = false;
        if (succ_17) 
          var2_16 = new String("3");
      }
      if (!succ_17) {

        succ_17 = true;
        if (!UTIL.equals(last, new Integer(4))) 
          succ_17 = false;
        if (succ_17) 
          var2_16 = new String("4");
      }
      if (!succ_17) {

        succ_17 = true;
        if (!UTIL.equals(last, new Integer(5))) 
          succ_17 = false;
        if (succ_17) 
          var2_16 = new String("5");
      }
      if (!succ_17) {

        succ_17 = true;
        if (!UTIL.equals(last, new Integer(6))) 
          succ_17 = false;
        if (succ_17) 
          var2_16 = new String("6");
      }
      if (!succ_17) {

        succ_17 = true;
        if (!UTIL.equals(last, new Integer(7))) 
          succ_17 = false;
        if (succ_17) 
          var2_16 = new String("7");
      }
      if (!succ_17) {

        succ_17 = true;
        if (!UTIL.equals(last, new Integer(8))) 
          succ_17 = false;
        if (succ_17) 
          var2_16 = new String("8");
      }
      if (!succ_17) {

        succ_17 = true;
        if (!UTIL.equals(last, new Integer(9))) 
          succ_17 = false;
        if (succ_17) 
          var2_16 = new String("9");
      }
      if (!succ_17) 
        UTIL.RunTime("Run-Time Error:No \'others\' branch in CasesExpr");
      varRes_2 = itoaR(first).concat(var2_16);
    }
    return varRes_2;
  }
// ***** VDMTOOLS END Name=itoaR#1|Integer

}
;

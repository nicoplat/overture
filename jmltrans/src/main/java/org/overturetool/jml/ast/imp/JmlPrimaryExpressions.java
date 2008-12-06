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



public class JmlPrimaryExpressions extends JmlNode implements IJmlPrimaryExpressions {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivPrimary KEEP=NO
  private IJmlPrimaryExpression ivPrimary = null;
// ***** VDMTOOLS END Name=ivPrimary

// ***** VDMTOOLS START Name=ivSuffix KEEP=NO
  private IJmlPrimarySuffix ivSuffix = null;
// ***** VDMTOOLS END Name=ivSuffix


// ***** VDMTOOLS START Name=JmlPrimaryExpressions KEEP=NO
  public JmlPrimaryExpressions () throws CGException {
    try {

      ivPrimary = null;
      ivSuffix = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=JmlPrimaryExpressions


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("PrimaryExpressions");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IJmlVisitor pVisitor) throws CGException {
    pVisitor.visitPrimaryExpressions((IJmlPrimaryExpressions) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=JmlPrimaryExpressions KEEP=NO
  public JmlPrimaryExpressions (final IJmlPrimaryExpression p1, final IJmlPrimarySuffix p2) throws CGException {

    try {

      ivPrimary = null;
      ivSuffix = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setPrimary((IJmlPrimaryExpression) p1);
      setSuffix((IJmlPrimarySuffix) p2);
    }
  }
// ***** VDMTOOLS END Name=JmlPrimaryExpressions


// ***** VDMTOOLS START Name=JmlPrimaryExpressions KEEP=NO
  public JmlPrimaryExpressions (final IJmlPrimaryExpression p1, final IJmlPrimarySuffix p2, final Long line, final Long column) throws CGException {

    try {

      ivPrimary = null;
      ivSuffix = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setPrimary((IJmlPrimaryExpression) p1);
      setSuffix((IJmlPrimarySuffix) p2);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=JmlPrimaryExpressions


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("primary");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setPrimary((IJmlPrimaryExpression) data.get(fname));
    }
    {

      String fname = new String("suffix");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setSuffix((IJmlPrimarySuffix) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getPrimary KEEP=NO
  public IJmlPrimaryExpression getPrimary () throws CGException {
    return (IJmlPrimaryExpression) ivPrimary;
  }
// ***** VDMTOOLS END Name=getPrimary


// ***** VDMTOOLS START Name=setPrimary KEEP=NO
  public void setPrimary (final IJmlPrimaryExpression parg) throws CGException {
    ivPrimary = (IJmlPrimaryExpression) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setPrimary


// ***** VDMTOOLS START Name=getSuffix KEEP=NO
  public IJmlPrimarySuffix getSuffix () throws CGException {
    return (IJmlPrimarySuffix) ivSuffix;
  }
// ***** VDMTOOLS END Name=getSuffix


// ***** VDMTOOLS START Name=hasSuffix KEEP=NO
  public Boolean hasSuffix () throws CGException {
    return new Boolean(!UTIL.equals(ivSuffix, null));
  }
// ***** VDMTOOLS END Name=hasSuffix


// ***** VDMTOOLS START Name=setSuffix KEEP=NO
  public void setSuffix (final IJmlPrimarySuffix parg) throws CGException {
    ivSuffix = (IJmlPrimarySuffix) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setSuffix

}
;

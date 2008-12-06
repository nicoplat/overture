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



public class JmlMapValueToValueType extends JmlType implements IJmlMapValueToValueType {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivDomType KEEP=NO
  private IJmlType ivDomType = null;
// ***** VDMTOOLS END Name=ivDomType

// ***** VDMTOOLS START Name=ivRngType KEEP=NO
  private IJmlType ivRngType = null;
// ***** VDMTOOLS END Name=ivRngType


// ***** VDMTOOLS START Name=JmlMapValueToValueType KEEP=NO
  public JmlMapValueToValueType () throws CGException {
    try {

      ivDomType = null;
      ivRngType = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=JmlMapValueToValueType


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("MapValueToValueType");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IJmlVisitor pVisitor) throws CGException {
    pVisitor.visitMapValueToValueType((IJmlMapValueToValueType) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=JmlMapValueToValueType KEEP=NO
  public JmlMapValueToValueType (final IJmlType p1, final IJmlType p2) throws CGException {

    try {

      ivDomType = null;
      ivRngType = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setDomType((IJmlType) p1);
      setRngType((IJmlType) p2);
    }
  }
// ***** VDMTOOLS END Name=JmlMapValueToValueType


// ***** VDMTOOLS START Name=JmlMapValueToValueType KEEP=NO
  public JmlMapValueToValueType (final IJmlType p1, final IJmlType p2, final Long line, final Long column) throws CGException {

    try {

      ivDomType = null;
      ivRngType = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setDomType((IJmlType) p1);
      setRngType((IJmlType) p2);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=JmlMapValueToValueType


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("dom_type");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setDomType((IJmlType) data.get(fname));
    }
    {

      String fname = new String("rng_type");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setRngType((IJmlType) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getDomType KEEP=NO
  public IJmlType getDomType () throws CGException {
    return (IJmlType) ivDomType;
  }
// ***** VDMTOOLS END Name=getDomType


// ***** VDMTOOLS START Name=setDomType KEEP=NO
  public void setDomType (final IJmlType parg) throws CGException {
    ivDomType = (IJmlType) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setDomType


// ***** VDMTOOLS START Name=getRngType KEEP=NO
  public IJmlType getRngType () throws CGException {
    return (IJmlType) ivRngType;
  }
// ***** VDMTOOLS END Name=getRngType


// ***** VDMTOOLS START Name=setRngType KEEP=NO
  public void setRngType (final IJmlType parg) throws CGException {
    ivRngType = (IJmlType) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setRngType
  
  

}
;

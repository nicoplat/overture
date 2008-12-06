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



public class OmlTraceRange extends OmlTraceRepeatPattern implements IOmlTraceRange {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivLower KEEP=NO
  private IOmlNumericLiteral ivLower = null;
// ***** VDMTOOLS END Name=ivLower

// ***** VDMTOOLS START Name=ivUpper KEEP=NO
  private IOmlNumericLiteral ivUpper = null;
// ***** VDMTOOLS END Name=ivUpper


// ***** VDMTOOLS START Name=OmlTraceRange KEEP=NO
  public OmlTraceRange () throws CGException {
    try {

      ivLower = null;
      ivUpper = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlTraceRange


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("TraceRange");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitTraceRange((IOmlTraceRange) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlTraceRange KEEP=NO
  public OmlTraceRange (final IOmlNumericLiteral p1, final IOmlNumericLiteral p2) throws CGException {

    try {

      ivLower = null;
      ivUpper = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setLower((IOmlNumericLiteral) p1);
      setUpper((IOmlNumericLiteral) p2);
    }
  }
// ***** VDMTOOLS END Name=OmlTraceRange


// ***** VDMTOOLS START Name=OmlTraceRange KEEP=NO
  public OmlTraceRange (final IOmlNumericLiteral p1, final IOmlNumericLiteral p2, final Long line, final Long column) throws CGException {

    try {

      ivLower = null;
      ivUpper = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setLower((IOmlNumericLiteral) p1);
      setUpper((IOmlNumericLiteral) p2);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlTraceRange


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("lower");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setLower((IOmlNumericLiteral) data.get(fname));
    }
    {

      String fname = new String("upper");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setUpper((IOmlNumericLiteral) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getLower KEEP=NO
  public IOmlNumericLiteral getLower () throws CGException {
    return (IOmlNumericLiteral) ivLower;
  }
// ***** VDMTOOLS END Name=getLower


// ***** VDMTOOLS START Name=setLower KEEP=NO
  public void setLower (final IOmlNumericLiteral parg) throws CGException {
    ivLower = (IOmlNumericLiteral) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setLower


// ***** VDMTOOLS START Name=getUpper KEEP=NO
  public IOmlNumericLiteral getUpper () throws CGException {
    return (IOmlNumericLiteral) ivUpper;
  }
// ***** VDMTOOLS END Name=getUpper


// ***** VDMTOOLS START Name=hasUpper KEEP=NO
  public Boolean hasUpper () throws CGException {
    return new Boolean(!UTIL.equals(ivUpper, null));
  }
// ***** VDMTOOLS END Name=hasUpper


// ***** VDMTOOLS START Name=setUpper KEEP=NO
  public void setUpper (final IOmlNumericLiteral parg) throws CGException {
    ivUpper = (IOmlNumericLiteral) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setUpper

  public String toString() {
	  
	  try {
		if(hasUpper()) {
			  return "{" + this.ivLower.toString() + "," + this.ivUpper.toString() + "}";
		  }
		  else {
			  return "{" + this.ivLower.toString() + "}";
		  }
	} catch (CGException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return "";
  }
}
;

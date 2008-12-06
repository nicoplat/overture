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



public class OmlComplexType extends OmlTypeShape implements IOmlComplexType {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivIdentifier KEEP=NO
  private String ivIdentifier = null;
// ***** VDMTOOLS END Name=ivIdentifier

// ***** VDMTOOLS START Name=ivFieldList KEEP=NO
  private Vector ivFieldList = null;
// ***** VDMTOOLS END Name=ivFieldList

// ***** VDMTOOLS START Name=ivInvariant KEEP=NO
  private IOmlInvariant ivInvariant = null;
// ***** VDMTOOLS END Name=ivInvariant


// ***** VDMTOOLS START Name=OmlComplexType KEEP=NO
  public OmlComplexType () throws CGException {
    try {

      ivIdentifier = UTIL.ConvertToString(new String());
      ivFieldList = new Vector();
      ivInvariant = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlComplexType


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("ComplexType");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitComplexType((IOmlComplexType) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlComplexType KEEP=NO
  public OmlComplexType (final String p1, final Vector p2, final IOmlInvariant p3) throws CGException {

    try {

      ivIdentifier = UTIL.ConvertToString(new String());
      ivFieldList = new Vector();
      ivInvariant = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setIdentifier(p1);
      setFieldList(p2);
      setInvariant((IOmlInvariant) p3);
    }
  }
// ***** VDMTOOLS END Name=OmlComplexType


// ***** VDMTOOLS START Name=OmlComplexType KEEP=NO
  public OmlComplexType (final String p1, final Vector p2, final IOmlInvariant p3, final Long line, final Long column) throws CGException {

    try {

      ivIdentifier = UTIL.ConvertToString(new String());
      ivFieldList = new Vector();
      ivInvariant = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setIdentifier(p1);
      setFieldList(p2);
      setInvariant((IOmlInvariant) p3);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlComplexType


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("identifier");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setIdentifier(UTIL.ConvertToString(data.get(fname)));
    }
    {

      String fname = new String("field_list");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setFieldList((Vector) data.get(fname));
    }
    {

      String fname = new String("invariant");
      Boolean cond_22 = null;
      cond_22 = new Boolean(data.containsKey(fname));
      if (cond_22.booleanValue()) 
        setInvariant((IOmlInvariant) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getIdentifier KEEP=NO
  public String getIdentifier () throws CGException {
    return ivIdentifier;
  }
// ***** VDMTOOLS END Name=getIdentifier


// ***** VDMTOOLS START Name=setIdentifier KEEP=NO
  public void setIdentifier (final String parg) throws CGException {
    ivIdentifier = UTIL.ConvertToString(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setIdentifier


// ***** VDMTOOLS START Name=getFieldList KEEP=NO
  public Vector getFieldList () throws CGException {
    return ivFieldList;
  }
// ***** VDMTOOLS END Name=getFieldList


// ***** VDMTOOLS START Name=setFieldList KEEP=NO
  public void setFieldList (final Vector parg) throws CGException {
    ivFieldList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setFieldList


// ***** VDMTOOLS START Name=addFieldList KEEP=NO
  public void addFieldList (final IOmlNode parg) throws CGException {
    ivFieldList.add(parg);
  }
// ***** VDMTOOLS END Name=addFieldList


// ***** VDMTOOLS START Name=getInvariant KEEP=NO
  public IOmlInvariant getInvariant () throws CGException {

    if (!this.pre_getInvariant().booleanValue()) 
      UTIL.RunTime("Run-Time Error:Precondition failure in getInvariant");
    return (IOmlInvariant) ivInvariant;
  }
// ***** VDMTOOLS END Name=getInvariant


// ***** VDMTOOLS START Name=pre_getInvariant KEEP=NO
  public Boolean pre_getInvariant () throws CGException {
    return hasInvariant();
  }
// ***** VDMTOOLS END Name=pre_getInvariant


// ***** VDMTOOLS START Name=hasInvariant KEEP=NO
  public Boolean hasInvariant () throws CGException {
    return new Boolean(!UTIL.equals(ivInvariant, null));
  }
// ***** VDMTOOLS END Name=hasInvariant


// ***** VDMTOOLS START Name=setInvariant KEEP=NO
  public void setInvariant (final IOmlInvariant parg) throws CGException {
    ivInvariant = (IOmlInvariant) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setInvariant

}
;

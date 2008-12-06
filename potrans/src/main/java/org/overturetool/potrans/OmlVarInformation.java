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



public class OmlVarInformation extends IOmlVarInformation {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivMode KEEP=NO
  private IOmlMode ivMode = null;
// ***** VDMTOOLS END Name=ivMode

// ***** VDMTOOLS START Name=ivNameList KEEP=NO
  private Vector ivNameList = null;
// ***** VDMTOOLS END Name=ivNameList

// ***** VDMTOOLS START Name=ivType KEEP=NO
  private IOmlType ivType = null;
// ***** VDMTOOLS END Name=ivType


// ***** VDMTOOLS START Name=vdm_init_OmlVarInformation KEEP=NO
  private void vdm_init_OmlVarInformation () throws CGException {
    try {

      ivMode = null;
      ivNameList = new Vector();
      ivType = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_OmlVarInformation


// ***** VDMTOOLS START Name=OmlVarInformation KEEP=NO
  public OmlVarInformation () throws CGException {
    vdm_init_OmlVarInformation();
  }
// ***** VDMTOOLS END Name=OmlVarInformation


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("VarInformation");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept#1|IOmlVisitor KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitVarInformation((IOmlVarInformation) this);
  }
// ***** VDMTOOLS END Name=accept#1|IOmlVisitor


// ***** VDMTOOLS START Name=OmlVarInformation#3|IOmlMode|Vector|IOmlType KEEP=NO
  public OmlVarInformation (final IOmlMode p1, final Vector p2, final IOmlType p3) throws CGException {

    vdm_init_OmlVarInformation();
    {

      setMode((IOmlMode) p1);
      setNameList(p2);
      setType((IOmlType) p3);
    }
  }
// ***** VDMTOOLS END Name=OmlVarInformation#3|IOmlMode|Vector|IOmlType


// ***** VDMTOOLS START Name=init#1|HashMap KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("mode");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setMode((IOmlMode) data.get(fname));
    }
    {

      String fname = new String("name_list");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setNameList((Vector) data.get(fname));
    }
    {

      String fname = new String("type");
      Boolean cond_22 = null;
      cond_22 = new Boolean(data.containsKey(fname));
      if (cond_22.booleanValue()) 
        setType((IOmlType) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init#1|HashMap


// ***** VDMTOOLS START Name=getMode KEEP=NO
  public IOmlMode getMode () throws CGException {
    return (IOmlMode) ivMode;
  }
// ***** VDMTOOLS END Name=getMode


// ***** VDMTOOLS START Name=setMode#1|IOmlMode KEEP=NO
  public void setMode (final IOmlMode parg) throws CGException {
    ivMode = (IOmlMode) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setMode#1|IOmlMode


// ***** VDMTOOLS START Name=getNameList KEEP=NO
  public Vector getNameList () throws CGException {
    return ivNameList;
  }
// ***** VDMTOOLS END Name=getNameList


// ***** VDMTOOLS START Name=setNameList#1|Vector KEEP=NO
  public void setNameList (final Vector parg) throws CGException {
    ivNameList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setNameList#1|Vector


// ***** VDMTOOLS START Name=addNameList#1|IOmlNode KEEP=NO
  public void addNameList (final IOmlNode parg) throws CGException {
    ivNameList.add(parg);
  }
// ***** VDMTOOLS END Name=addNameList#1|IOmlNode


// ***** VDMTOOLS START Name=getType KEEP=NO
  public IOmlType getType () throws CGException {
    return (IOmlType) ivType;
  }
// ***** VDMTOOLS END Name=getType


// ***** VDMTOOLS START Name=hasType KEEP=NO
  public Boolean hasType () throws CGException {
    return new Boolean(!UTIL.equals(ivType, null));
  }
// ***** VDMTOOLS END Name=hasType


// ***** VDMTOOLS START Name=setType#1|IOmlType KEEP=NO
  public void setType (final IOmlType parg) throws CGException {
    ivType = (IOmlType) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setType#1|IOmlType

}
;

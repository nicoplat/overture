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



public class OmlClassTypeInstantiation extends IOmlClassTypeInstantiation {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivName KEEP=NO
  private IOmlName ivName = null;
// ***** VDMTOOLS END Name=ivName

// ***** VDMTOOLS START Name=ivGenericTypes KEEP=NO
  private Vector ivGenericTypes = null;
// ***** VDMTOOLS END Name=ivGenericTypes


// ***** VDMTOOLS START Name=vdm_init_OmlClassTypeInstantiation KEEP=NO
  private void vdm_init_OmlClassTypeInstantiation () throws CGException {
    try {

      ivName = null;
      ivGenericTypes = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_OmlClassTypeInstantiation


// ***** VDMTOOLS START Name=OmlClassTypeInstantiation KEEP=NO
  public OmlClassTypeInstantiation () throws CGException {
    vdm_init_OmlClassTypeInstantiation();
  }
// ***** VDMTOOLS END Name=OmlClassTypeInstantiation


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("ClassTypeInstantiation");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept#1|IOmlVisitor KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitClassTypeInstantiation((IOmlClassTypeInstantiation) this);
  }
// ***** VDMTOOLS END Name=accept#1|IOmlVisitor


// ***** VDMTOOLS START Name=OmlClassTypeInstantiation#2|IOmlName|Vector KEEP=NO
  public OmlClassTypeInstantiation (final IOmlName p1, final Vector p2) throws CGException {

    vdm_init_OmlClassTypeInstantiation();
    {

      setName((IOmlName) p1);
      setGenericTypes(p2);
    }
  }
// ***** VDMTOOLS END Name=OmlClassTypeInstantiation#2|IOmlName|Vector


// ***** VDMTOOLS START Name=init#1|HashMap KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("name");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setName((IOmlName) data.get(fname));
    }
    {

      String fname = new String("generic_types");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setGenericTypes((Vector) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init#1|HashMap


// ***** VDMTOOLS START Name=getName KEEP=NO
  public IOmlName getName () throws CGException {
    return (IOmlName) ivName;
  }
// ***** VDMTOOLS END Name=getName


// ***** VDMTOOLS START Name=setName#1|IOmlName KEEP=NO
  public void setName (final IOmlName parg) throws CGException {
    ivName = (IOmlName) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setName#1|IOmlName


// ***** VDMTOOLS START Name=getGenericTypes KEEP=NO
  public Vector getGenericTypes () throws CGException {
    return ivGenericTypes;
  }
// ***** VDMTOOLS END Name=getGenericTypes


// ***** VDMTOOLS START Name=setGenericTypes#1|Vector KEEP=NO
  public void setGenericTypes (final Vector parg) throws CGException {
    ivGenericTypes = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setGenericTypes#1|Vector


// ***** VDMTOOLS START Name=addGenericTypes#1|IOmlNode KEEP=NO
  public void addGenericTypes (final IOmlNode parg) throws CGException {
    ivGenericTypes.add(parg);
  }
// ***** VDMTOOLS END Name=addGenericTypes#1|IOmlNode

}
;

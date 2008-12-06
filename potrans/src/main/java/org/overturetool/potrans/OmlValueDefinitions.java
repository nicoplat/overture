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



public class OmlValueDefinitions extends IOmlValueDefinitions {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivValueList KEEP=NO
  private Vector ivValueList = null;
// ***** VDMTOOLS END Name=ivValueList


// ***** VDMTOOLS START Name=vdm_init_OmlValueDefinitions KEEP=NO
  private void vdm_init_OmlValueDefinitions () throws CGException {
    try {
      ivValueList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_OmlValueDefinitions


// ***** VDMTOOLS START Name=OmlValueDefinitions KEEP=NO
  public OmlValueDefinitions () throws CGException {
    vdm_init_OmlValueDefinitions();
  }
// ***** VDMTOOLS END Name=OmlValueDefinitions


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("ValueDefinitions");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept#1|IOmlVisitor KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitValueDefinitions((IOmlValueDefinitions) this);
  }
// ***** VDMTOOLS END Name=accept#1|IOmlVisitor


// ***** VDMTOOLS START Name=OmlValueDefinitions#1|Vector KEEP=NO
  public OmlValueDefinitions (final Vector p1) throws CGException {

    vdm_init_OmlValueDefinitions();
    setValueList(p1);
  }
// ***** VDMTOOLS END Name=OmlValueDefinitions#1|Vector


// ***** VDMTOOLS START Name=init#1|HashMap KEEP=NO
  public void init (final HashMap data) throws CGException {

    String fname = new String("value_list");
    Boolean cond_4 = null;
    cond_4 = new Boolean(data.containsKey(fname));
    if (cond_4.booleanValue()) 
      setValueList((Vector) data.get(fname));
  }
// ***** VDMTOOLS END Name=init#1|HashMap


// ***** VDMTOOLS START Name=getValueList KEEP=NO
  public Vector getValueList () throws CGException {
    return ivValueList;
  }
// ***** VDMTOOLS END Name=getValueList


// ***** VDMTOOLS START Name=setValueList#1|Vector KEEP=NO
  public void setValueList (final Vector parg) throws CGException {
    ivValueList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setValueList#1|Vector


// ***** VDMTOOLS START Name=addValueList#1|IOmlNode KEEP=NO
  public void addValueList (final IOmlNode parg) throws CGException {
    ivValueList.add(parg);
  }
// ***** VDMTOOLS END Name=addValueList#1|IOmlNode

}
;

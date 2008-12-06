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



public class OmlFinExpression extends IOmlFinExpression {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivNameList KEEP=NO
  private Vector ivNameList = null;
// ***** VDMTOOLS END Name=ivNameList


// ***** VDMTOOLS START Name=vdm_init_OmlFinExpression KEEP=NO
  private void vdm_init_OmlFinExpression () throws CGException {
    try {
      ivNameList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_OmlFinExpression


// ***** VDMTOOLS START Name=OmlFinExpression KEEP=NO
  public OmlFinExpression () throws CGException {
    vdm_init_OmlFinExpression();
  }
// ***** VDMTOOLS END Name=OmlFinExpression


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("FinExpression");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept#1|IOmlVisitor KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitFinExpression((IOmlFinExpression) this);
  }
// ***** VDMTOOLS END Name=accept#1|IOmlVisitor


// ***** VDMTOOLS START Name=OmlFinExpression#1|Vector KEEP=NO
  public OmlFinExpression (final Vector p1) throws CGException {

    vdm_init_OmlFinExpression();
    setNameList(p1);
  }
// ***** VDMTOOLS END Name=OmlFinExpression#1|Vector


// ***** VDMTOOLS START Name=init#1|HashMap KEEP=NO
  public void init (final HashMap data) throws CGException {

    String fname = new String("name_list");
    Boolean cond_4 = null;
    cond_4 = new Boolean(data.containsKey(fname));
    if (cond_4.booleanValue()) 
      setNameList((Vector) data.get(fname));
  }
// ***** VDMTOOLS END Name=init#1|HashMap


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

}
;

//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at 2009-07-27 by the VDM++ to JAVA Code Generator
// (v8.2 - Fri 29-May-2009 09:54:50)
//
// Supported compilers: jdk 1.4/1.5/1.6
//

// ***** VDMTOOLS START Name=HeaderComment KEEP=NO
// ***** VDMTOOLS END Name=HeaderComment

// ***** VDMTOOLS START Name=package KEEP=NO
package org.overturetool.umltrans.uml;

// ***** VDMTOOLS END Name=package

// ***** VDMTOOLS START Name=imports KEEP=NO

import jp.co.csk.vdm.toolbox.VDM.*;
import java.util.*;
// ***** VDMTOOLS END Name=imports



public class UmlParameters extends IUmlParameters {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivParameterList KEEP=NO
  private Vector ivParameterList = null;
// ***** VDMTOOLS END Name=ivParameterList


// ***** VDMTOOLS START Name=vdm_init_UmlParameters KEEP=NO
  private void vdm_init_UmlParameters () throws CGException {
    try {
      ivParameterList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_UmlParameters


// ***** VDMTOOLS START Name=UmlParameters KEEP=NO
  public UmlParameters () throws CGException {
    vdm_init_UmlParameters();
  }
// ***** VDMTOOLS END Name=UmlParameters


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("Parameters");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept#1|IUmlVisitor KEEP=NO
  public void accept (final IUmlVisitor pVisitor) throws CGException {
    pVisitor.visitParameters((IUmlParameters) this);
  }
// ***** VDMTOOLS END Name=accept#1|IUmlVisitor


// ***** VDMTOOLS START Name=UmlParameters#1|Vector KEEP=NO
  public UmlParameters (final Vector p1) throws CGException {

    vdm_init_UmlParameters();
    setParameterList(p1);
  }
// ***** VDMTOOLS END Name=UmlParameters#1|Vector


// ***** VDMTOOLS START Name=UmlParameters#3|Vector|Long|Long KEEP=NO
  public UmlParameters (final Vector p1, final Long line, final Long column) throws CGException {

    vdm_init_UmlParameters();
    {

      setParameterList(p1);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=UmlParameters#3|Vector|Long|Long


// ***** VDMTOOLS START Name=init#1|HashMap KEEP=NO
  public void init (final HashMap data) throws CGException {

    String fname = new String("parameterList");
    Boolean cond_4 = null;
    cond_4 = new Boolean(data.containsKey(fname));
    if (cond_4.booleanValue()) 
      setParameterList((Vector) data.get(fname));
  }
// ***** VDMTOOLS END Name=init#1|HashMap


// ***** VDMTOOLS START Name=getParameterList KEEP=NO
  public Vector getParameterList () throws CGException {
    return ivParameterList;
  }
// ***** VDMTOOLS END Name=getParameterList


// ***** VDMTOOLS START Name=setParameterList#1|Vector KEEP=NO
  public void setParameterList (final Vector parg) throws CGException {
    ivParameterList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setParameterList#1|Vector


// ***** VDMTOOLS START Name=addParameterList#1|IUmlNode KEEP=NO
  public void addParameterList (final IUmlNode parg) throws CGException {
    ivParameterList.add(parg);
  }
// ***** VDMTOOLS END Name=addParameterList#1|IUmlNode

}
;

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



public class OmlActiveExpression extends OmlExpression implements IOmlActiveExpression {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivNameList KEEP=NO
  private Vector ivNameList = null;
// ***** VDMTOOLS END Name=ivNameList


// ***** VDMTOOLS START Name=OmlActiveExpression KEEP=NO
  public OmlActiveExpression () throws CGException {
    try {
      ivNameList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlActiveExpression


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("ActiveExpression");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitActiveExpression((IOmlActiveExpression) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlActiveExpression KEEP=NO
  public OmlActiveExpression (final Vector p1) throws CGException {

    try {
      ivNameList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    setNameList(p1);
  }
// ***** VDMTOOLS END Name=OmlActiveExpression


// ***** VDMTOOLS START Name=OmlActiveExpression KEEP=NO
  public OmlActiveExpression (final Vector p1, final Long line, final Long column) throws CGException {

    try {
      ivNameList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setNameList(p1);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlActiveExpression


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    String fname = new String("name_list");
    Boolean cond_4 = null;
    cond_4 = new Boolean(data.containsKey(fname));
    if (cond_4.booleanValue()) 
      setNameList((Vector) data.get(fname));
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getNameList KEEP=NO
  public Vector getNameList () throws CGException {
    return ivNameList;
  }
// ***** VDMTOOLS END Name=getNameList


// ***** VDMTOOLS START Name=setNameList KEEP=NO
  public void setNameList (final Vector parg) throws CGException {
    ivNameList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setNameList


// ***** VDMTOOLS START Name=addNameList KEEP=NO
  public void addNameList (final IOmlNode parg) throws CGException {
    ivNameList.add(parg);
  }
// ***** VDMTOOLS END Name=addNameList
  
public String toString() {
	  
	  //TODO
	  return "TODO: Active";
  }

}
;

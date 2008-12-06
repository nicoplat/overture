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



public class OmlPreconditionExpression extends IOmlPreconditionExpression {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivExpressionList KEEP=NO
  private Vector ivExpressionList = null;
// ***** VDMTOOLS END Name=ivExpressionList


// ***** VDMTOOLS START Name=vdm_init_OmlPreconditionExpression KEEP=NO
  private void vdm_init_OmlPreconditionExpression () throws CGException {
    try {
      ivExpressionList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_OmlPreconditionExpression


// ***** VDMTOOLS START Name=OmlPreconditionExpression KEEP=NO
  public OmlPreconditionExpression () throws CGException {
    vdm_init_OmlPreconditionExpression();
  }
// ***** VDMTOOLS END Name=OmlPreconditionExpression


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("PreconditionExpression");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept#1|IOmlVisitor KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitPreconditionExpression((IOmlPreconditionExpression) this);
  }
// ***** VDMTOOLS END Name=accept#1|IOmlVisitor


// ***** VDMTOOLS START Name=OmlPreconditionExpression#1|Vector KEEP=NO
  public OmlPreconditionExpression (final Vector p1) throws CGException {

    vdm_init_OmlPreconditionExpression();
    setExpressionList(p1);
  }
// ***** VDMTOOLS END Name=OmlPreconditionExpression#1|Vector


// ***** VDMTOOLS START Name=init#1|HashMap KEEP=NO
  public void init (final HashMap data) throws CGException {

    String fname = new String("expression_list");
    Boolean cond_4 = null;
    cond_4 = new Boolean(data.containsKey(fname));
    if (cond_4.booleanValue()) 
      setExpressionList((Vector) data.get(fname));
  }
// ***** VDMTOOLS END Name=init#1|HashMap


// ***** VDMTOOLS START Name=getExpressionList KEEP=NO
  public Vector getExpressionList () throws CGException {
    return ivExpressionList;
  }
// ***** VDMTOOLS END Name=getExpressionList


// ***** VDMTOOLS START Name=setExpressionList#1|Vector KEEP=NO
  public void setExpressionList (final Vector parg) throws CGException {
    ivExpressionList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setExpressionList#1|Vector


// ***** VDMTOOLS START Name=addExpressionList#1|IOmlNode KEEP=NO
  public void addExpressionList (final IOmlNode parg) throws CGException {
    ivExpressionList.add(parg);
  }
// ***** VDMTOOLS END Name=addExpressionList#1|IOmlNode

}
;

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
import org.overturetool.jml.visitor.*;
import jp.co.csk.vdm.toolbox.VDM.*;
import java.util.*;
import org.overturetool.jml.ast.itf.*;
// ***** VDMTOOLS END Name=imports



public class JmlDocument implements IJmlDocument {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivFilename KEEP=NO
  private String ivFilename = null;
// ***** VDMTOOLS END Name=ivFilename

// ***** VDMTOOLS START Name=ivTopNode KEEP=NO
  private IJmlNode ivTopNode = null;
// ***** VDMTOOLS END Name=ivTopNode

// ***** VDMTOOLS START Name=ivLexems KEEP=NO
  private Vector ivLexems = null;
// ***** VDMTOOLS END Name=ivLexems


// ***** VDMTOOLS START Name=JmlDocument KEEP=NO
  public JmlDocument () throws CGException {
    try {

      ivFilename = UTIL.ConvertToString(new String());
      ivTopNode = null;
      ivLexems = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=JmlDocument


// ***** VDMTOOLS START Name=getFilename KEEP=NO
  public String getFilename () throws CGException {
    return ivFilename;
  }
// ***** VDMTOOLS END Name=getFilename


// ***** VDMTOOLS START Name=setFilename KEEP=NO
  public void setFilename (final String pfilename) throws CGException {
    ivFilename = UTIL.ConvertToString(UTIL.clone(pfilename));
  }
// ***** VDMTOOLS END Name=setFilename


// ***** VDMTOOLS START Name=hasSpecifications KEEP=NO
  public Boolean hasSpecifications () throws CGException {
    return new Boolean(ivTopNode instanceof IJmlSpecifications);
  }
// ***** VDMTOOLS END Name=hasSpecifications


// ***** VDMTOOLS START Name=getSpecifications KEEP=NO
  public IJmlSpecifications getSpecifications () throws CGException {
    return (IJmlSpecifications) ivTopNode;
  }
// ***** VDMTOOLS END Name=getSpecifications


// ***** VDMTOOLS START Name=setSpecifications KEEP=NO
  public void setSpecifications (final IJmlSpecifications pNode) throws CGException {
    ivTopNode = (IJmlNode) UTIL.clone(pNode);
  }
// ***** VDMTOOLS END Name=setSpecifications


// ***** VDMTOOLS START Name=getLexems KEEP=NO
  public Vector getLexems () throws CGException {
    return ivLexems;
  }
// ***** VDMTOOLS END Name=getLexems


// ***** VDMTOOLS START Name=setLexems KEEP=NO
  public void setLexems (final Vector plexems) throws CGException {
    ivLexems = (Vector) UTIL.ConvertToList(UTIL.clone(plexems));
  }
// ***** VDMTOOLS END Name=setLexems


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IJmlVisitor pVisitor) throws CGException {
    pVisitor.visitDocument((IJmlDocument) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=toVdmSlValue KEEP=NO
  public String toVdmSlValue () throws CGException {

    JmlSlVisitor visitor = new JmlSlVisitor();
    accept((IJmlVisitor) visitor);
    String rexpr_3 = null;
    rexpr_3 = visitor.result;
    return rexpr_3;
  }
// ***** VDMTOOLS END Name=toVdmSlValue


// ***** VDMTOOLS START Name=toVdmPpValue KEEP=NO
  public String toVdmPpValue () throws CGException {

    JmlPpVisitor visitor = new JmlPpVisitor();
    accept((IJmlVisitor) visitor);
    String rexpr_3 = null;
    rexpr_3 = visitor.result;
    return rexpr_3;
  }
// ***** VDMTOOLS END Name=toVdmPpValue


// ***** VDMTOOLS START Name=JmlDocument KEEP=NO
  public JmlDocument (final String pfilename, final IJmlNode pnode, final Vector plexems) throws CGException {

    try {

      ivFilename = UTIL.ConvertToString(new String());
      ivTopNode = null;
      ivLexems = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setFilename(pfilename);
      ivTopNode = (IJmlNode) UTIL.clone(pnode);
      setLexems(plexems);
    }
  }
// ***** VDMTOOLS END Name=JmlDocument

}
;

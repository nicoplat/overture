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



public class OmlImplicitFunction extends OmlFunctionShape implements IOmlImplicitFunction {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivIdentifier KEEP=NO
  private String ivIdentifier = null;
// ***** VDMTOOLS END Name=ivIdentifier

// ***** VDMTOOLS START Name=ivTypeVariableList KEEP=NO
  private Vector ivTypeVariableList = null;
// ***** VDMTOOLS END Name=ivTypeVariableList

// ***** VDMTOOLS START Name=ivPatternTypePairList KEEP=NO
  private Vector ivPatternTypePairList = null;
// ***** VDMTOOLS END Name=ivPatternTypePairList

// ***** VDMTOOLS START Name=ivIdentifierTypePairList KEEP=NO
  private Vector ivIdentifierTypePairList = null;
// ***** VDMTOOLS END Name=ivIdentifierTypePairList

// ***** VDMTOOLS START Name=ivTrailer KEEP=NO
  private IOmlFunctionTrailer ivTrailer = null;
// ***** VDMTOOLS END Name=ivTrailer


// ***** VDMTOOLS START Name=OmlImplicitFunction KEEP=NO
  public OmlImplicitFunction () throws CGException {
    try {

      ivIdentifier = UTIL.ConvertToString(new String());
      ivTypeVariableList = new Vector();
      ivPatternTypePairList = new Vector();
      ivIdentifierTypePairList = new Vector();
      ivTrailer = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlImplicitFunction


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("ImplicitFunction");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitImplicitFunction((IOmlImplicitFunction) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlImplicitFunction KEEP=NO
  public OmlImplicitFunction (final String p1, final Vector p2, final Vector p3, final Vector p4, final IOmlFunctionTrailer p5) throws CGException {

    try {

      ivIdentifier = UTIL.ConvertToString(new String());
      ivTypeVariableList = new Vector();
      ivPatternTypePairList = new Vector();
      ivIdentifierTypePairList = new Vector();
      ivTrailer = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setIdentifier(p1);
      setTypeVariableList(p2);
      setPatternTypePairList(p3);
      setIdentifierTypePairList(p4);
      setTrailer((IOmlFunctionTrailer) p5);
    }
  }
// ***** VDMTOOLS END Name=OmlImplicitFunction


// ***** VDMTOOLS START Name=OmlImplicitFunction KEEP=NO
  public OmlImplicitFunction (final String p1, final Vector p2, final Vector p3, final Vector p4, final IOmlFunctionTrailer p5, final Long line, final Long column) throws CGException {

    try {

      ivIdentifier = UTIL.ConvertToString(new String());
      ivTypeVariableList = new Vector();
      ivPatternTypePairList = new Vector();
      ivIdentifierTypePairList = new Vector();
      ivTrailer = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setIdentifier(p1);
      setTypeVariableList(p2);
      setPatternTypePairList(p3);
      setIdentifierTypePairList(p4);
      setTrailer((IOmlFunctionTrailer) p5);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlImplicitFunction


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

      String fname = new String("type_variable_list");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setTypeVariableList((Vector) data.get(fname));
    }
    {

      String fname = new String("pattern_type_pair_list");
      Boolean cond_22 = null;
      cond_22 = new Boolean(data.containsKey(fname));
      if (cond_22.booleanValue()) 
        setPatternTypePairList((Vector) data.get(fname));
    }
    {

      String fname = new String("identifier_type_pair_list");
      Boolean cond_31 = null;
      cond_31 = new Boolean(data.containsKey(fname));
      if (cond_31.booleanValue()) 
        setIdentifierTypePairList((Vector) data.get(fname));
    }
    {

      String fname = new String("trailer");
      Boolean cond_40 = null;
      cond_40 = new Boolean(data.containsKey(fname));
      if (cond_40.booleanValue()) 
        setTrailer((IOmlFunctionTrailer) data.get(fname));
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


// ***** VDMTOOLS START Name=getTypeVariableList KEEP=NO
  public Vector getTypeVariableList () throws CGException {
    return ivTypeVariableList;
  }
// ***** VDMTOOLS END Name=getTypeVariableList


// ***** VDMTOOLS START Name=setTypeVariableList KEEP=NO
  public void setTypeVariableList (final Vector parg) throws CGException {
    ivTypeVariableList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setTypeVariableList


// ***** VDMTOOLS START Name=addTypeVariableList KEEP=NO
  public void addTypeVariableList (final IOmlNode parg) throws CGException {
    ivTypeVariableList.add(parg);
  }
// ***** VDMTOOLS END Name=addTypeVariableList


// ***** VDMTOOLS START Name=getPatternTypePairList KEEP=NO
  public Vector getPatternTypePairList () throws CGException {
    return ivPatternTypePairList;
  }
// ***** VDMTOOLS END Name=getPatternTypePairList


// ***** VDMTOOLS START Name=setPatternTypePairList KEEP=NO
  public void setPatternTypePairList (final Vector parg) throws CGException {
    ivPatternTypePairList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setPatternTypePairList


// ***** VDMTOOLS START Name=addPatternTypePairList KEEP=NO
  public void addPatternTypePairList (final IOmlNode parg) throws CGException {
    ivPatternTypePairList.add(parg);
  }
// ***** VDMTOOLS END Name=addPatternTypePairList


// ***** VDMTOOLS START Name=getIdentifierTypePairList KEEP=NO
  public Vector getIdentifierTypePairList () throws CGException {
    return ivIdentifierTypePairList;
  }
// ***** VDMTOOLS END Name=getIdentifierTypePairList


// ***** VDMTOOLS START Name=setIdentifierTypePairList KEEP=NO
  public void setIdentifierTypePairList (final Vector parg) throws CGException {
    ivIdentifierTypePairList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setIdentifierTypePairList


// ***** VDMTOOLS START Name=addIdentifierTypePairList KEEP=NO
  public void addIdentifierTypePairList (final IOmlNode parg) throws CGException {
    ivIdentifierTypePairList.add(parg);
  }
// ***** VDMTOOLS END Name=addIdentifierTypePairList


// ***** VDMTOOLS START Name=getTrailer KEEP=NO
  public IOmlFunctionTrailer getTrailer () throws CGException {
    return (IOmlFunctionTrailer) ivTrailer;
  }
// ***** VDMTOOLS END Name=getTrailer


// ***** VDMTOOLS START Name=setTrailer KEEP=NO
  public void setTrailer (final IOmlFunctionTrailer parg) throws CGException {
    ivTrailer = (IOmlFunctionTrailer) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setTrailer
  
  public String toString() {
	  
	  //TODO
	  return "TODO: Implicit function";

  }
}
;

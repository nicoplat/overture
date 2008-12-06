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



public class OmlSetEnumPattern extends OmlPattern implements IOmlSetEnumPattern {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivPatternList KEEP=NO
  private Vector ivPatternList = null;
// ***** VDMTOOLS END Name=ivPatternList


// ***** VDMTOOLS START Name=OmlSetEnumPattern KEEP=NO
  public OmlSetEnumPattern () throws CGException {
    try {
      ivPatternList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlSetEnumPattern


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("SetEnumPattern");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitSetEnumPattern((IOmlSetEnumPattern) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlSetEnumPattern KEEP=NO
  public OmlSetEnumPattern (final Vector p1) throws CGException {

    try {
      ivPatternList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    setPatternList(p1);
  }
// ***** VDMTOOLS END Name=OmlSetEnumPattern


// ***** VDMTOOLS START Name=OmlSetEnumPattern KEEP=NO
  public OmlSetEnumPattern (final Vector p1, final Long line, final Long column) throws CGException {

    try {
      ivPatternList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setPatternList(p1);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlSetEnumPattern


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    String fname = new String("pattern_list");
    Boolean cond_4 = null;
    cond_4 = new Boolean(data.containsKey(fname));
    if (cond_4.booleanValue()) 
      setPatternList((Vector) data.get(fname));
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getPatternList KEEP=NO
  public Vector getPatternList () throws CGException {
    return ivPatternList;
  }
// ***** VDMTOOLS END Name=getPatternList


// ***** VDMTOOLS START Name=setPatternList KEEP=NO
  public void setPatternList (final Vector parg) throws CGException {
    ivPatternList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setPatternList


// ***** VDMTOOLS START Name=addPatternList KEEP=NO
  public void addPatternList (final IOmlNode parg) throws CGException {
    ivPatternList.add(parg);
  }
// ***** VDMTOOLS END Name=addPatternList

  public String toString() {
	  String lst = new String();
	  int i, size = this.ivPatternList.size();
	  
	  if (size > 0) {
	  for(i=0; i<size-1; i++) {
		  lst += this.ivPatternList.get(i).toString() + ", ";
	  }
	  lst += this.ivPatternList.get(size-1).toString();
	  }
	  return "{" + lst + "}";
  }
}
;

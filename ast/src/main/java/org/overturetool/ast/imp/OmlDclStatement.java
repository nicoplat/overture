//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at Sat 16-Aug-2008 by the VDM++ to JAVA Code Generator
// (v8.1.1b - Fri 06-Jun-2008 09:09:07)
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



public class OmlDclStatement extends OmlStatement implements IOmlDclStatement {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivDefinitionList KEEP=NO
  private Vector ivDefinitionList = null;
// ***** VDMTOOLS END Name=ivDefinitionList


// ***** VDMTOOLS START Name=OmlDclStatement KEEP=NO
  public OmlDclStatement () throws CGException {
    try {
      ivDefinitionList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlDclStatement


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("DclStatement");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitDclStatement((IOmlDclStatement) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlDclStatement KEEP=NO
  public OmlDclStatement (final Vector p1) throws CGException {

    try {
      ivDefinitionList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    setDefinitionList(p1);
  }
// ***** VDMTOOLS END Name=OmlDclStatement


// ***** VDMTOOLS START Name=OmlDclStatement KEEP=NO
  public OmlDclStatement (final Vector p1, final Long line, final Long column) throws CGException {

    try {
      ivDefinitionList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setDefinitionList(p1);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlDclStatement


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    String fname = new String("definition_list");
    Boolean cond_4 = null;
    cond_4 = new Boolean(data.containsKey(fname));
    if (cond_4.booleanValue()) 
      setDefinitionList((Vector) data.get(fname));
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getDefinitionList KEEP=NO
  public Vector getDefinitionList () throws CGException {
    return ivDefinitionList;
  }
// ***** VDMTOOLS END Name=getDefinitionList


// ***** VDMTOOLS START Name=setDefinitionList KEEP=NO
  public void setDefinitionList (final Vector parg) throws CGException {
    ivDefinitionList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setDefinitionList


// ***** VDMTOOLS START Name=addDefinitionList KEEP=NO
  public void addDefinitionList (final IOmlNode parg) throws CGException {
    ivDefinitionList.add(parg);
  }
// ***** VDMTOOLS END Name=addDefinitionList

}
;

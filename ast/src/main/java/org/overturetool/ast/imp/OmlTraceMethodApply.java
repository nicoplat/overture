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



public class OmlTraceMethodApply extends OmlTraceCoreDefinition implements IOmlTraceMethodApply {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivVariableName KEEP=NO
  private String ivVariableName = null;
// ***** VDMTOOLS END Name=ivVariableName

// ***** VDMTOOLS START Name=ivMethodName KEEP=NO
  private String ivMethodName = null;
// ***** VDMTOOLS END Name=ivMethodName

// ***** VDMTOOLS START Name=ivArgs KEEP=NO
  private Vector ivArgs = null;
// ***** VDMTOOLS END Name=ivArgs


// ***** VDMTOOLS START Name=OmlTraceMethodApply KEEP=NO
  public OmlTraceMethodApply () throws CGException {
    try {

      ivVariableName = UTIL.ConvertToString(new String());
      ivMethodName = UTIL.ConvertToString(new String());
      ivArgs = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlTraceMethodApply


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("TraceMethodApply");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitTraceMethodApply((IOmlTraceMethodApply) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlTraceMethodApply KEEP=NO
  public OmlTraceMethodApply (final String p1, final String p2, final Vector p3) throws CGException {

    try {

      ivVariableName = UTIL.ConvertToString(new String());
      ivMethodName = UTIL.ConvertToString(new String());
      ivArgs = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setVariableName(p1);
      setMethodName(p2);
      setArgs(p3);
    }
  }
// ***** VDMTOOLS END Name=OmlTraceMethodApply


// ***** VDMTOOLS START Name=OmlTraceMethodApply KEEP=NO
  public OmlTraceMethodApply (final String p1, final String p2, final Vector p3, final Long line, final Long column) throws CGException {

    try {

      ivVariableName = UTIL.ConvertToString(new String());
      ivMethodName = UTIL.ConvertToString(new String());
      ivArgs = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setVariableName(p1);
      setMethodName(p2);
      setArgs(p3);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlTraceMethodApply


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("variable_name");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setVariableName(UTIL.ConvertToString(data.get(fname)));
    }
    {

      String fname = new String("method_name");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setMethodName(UTIL.ConvertToString(data.get(fname)));
    }
    {

      String fname = new String("args");
      Boolean cond_22 = null;
      cond_22 = new Boolean(data.containsKey(fname));
      if (cond_22.booleanValue()) 
        setArgs((Vector) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getVariableName KEEP=NO
  public String getVariableName () throws CGException {
    return ivVariableName;
  }
// ***** VDMTOOLS END Name=getVariableName


// ***** VDMTOOLS START Name=setVariableName KEEP=NO
  public void setVariableName (final String parg) throws CGException {
    ivVariableName = UTIL.ConvertToString(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setVariableName


// ***** VDMTOOLS START Name=getMethodName KEEP=NO
  public String getMethodName () throws CGException {
    return ivMethodName;
  }
// ***** VDMTOOLS END Name=getMethodName


// ***** VDMTOOLS START Name=setMethodName KEEP=NO
  public void setMethodName (final String parg) throws CGException {
    ivMethodName = UTIL.ConvertToString(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setMethodName


// ***** VDMTOOLS START Name=getArgs KEEP=NO
  public Vector getArgs () throws CGException {
    return ivArgs;
  }
// ***** VDMTOOLS END Name=getArgs


// ***** VDMTOOLS START Name=setArgs KEEP=NO
  public void setArgs (final Vector parg) throws CGException {
    ivArgs = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setArgs


// ***** VDMTOOLS START Name=addArgs KEEP=NO
  public void addArgs (final IOmlNode parg) throws CGException {
    ivArgs.add(parg);
  }
// ***** VDMTOOLS END Name=addArgs

}
;

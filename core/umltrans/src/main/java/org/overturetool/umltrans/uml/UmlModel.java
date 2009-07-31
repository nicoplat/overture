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



public class UmlModel extends IUmlModel {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivName KEEP=NO
  private String ivName = null;
// ***** VDMTOOLS END Name=ivName

// ***** VDMTOOLS START Name=ivDefinitions KEEP=NO
  private HashSet ivDefinitions = new HashSet();
// ***** VDMTOOLS END Name=ivDefinitions


// ***** VDMTOOLS START Name=vdm_init_UmlModel KEEP=NO
  private void vdm_init_UmlModel () throws CGException {
    try {

      ivName = UTIL.ConvertToString(new String());
      ivDefinitions = new HashSet();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_UmlModel


// ***** VDMTOOLS START Name=UmlModel KEEP=NO
  public UmlModel () throws CGException {
    vdm_init_UmlModel();
  }
// ***** VDMTOOLS END Name=UmlModel


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("Model");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept#1|IUmlVisitor KEEP=NO
  public void accept (final IUmlVisitor pVisitor) throws CGException {
    pVisitor.visitModel((IUmlModel) this);
  }
// ***** VDMTOOLS END Name=accept#1|IUmlVisitor


// ***** VDMTOOLS START Name=UmlModel#2|String|HashSet KEEP=NO
  public UmlModel (final String p1, final HashSet p2) throws CGException {

    vdm_init_UmlModel();
    {

      setName(p1);
      setDefinitions(p2);
    }
  }
// ***** VDMTOOLS END Name=UmlModel#2|String|HashSet


// ***** VDMTOOLS START Name=UmlModel#4|String|HashSet|Long|Long KEEP=NO
  public UmlModel (final String p1, final HashSet p2, final Long line, final Long column) throws CGException {

    vdm_init_UmlModel();
    {

      setName(p1);
      setDefinitions(p2);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=UmlModel#4|String|HashSet|Long|Long


// ***** VDMTOOLS START Name=init#1|HashMap KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("name");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setName(UTIL.ConvertToString(data.get(fname)));
    }
    {

      String fname = new String("definitions");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setDefinitions((HashSet) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init#1|HashMap


// ***** VDMTOOLS START Name=getName KEEP=NO
  public String getName () throws CGException {
    return ivName;
  }
// ***** VDMTOOLS END Name=getName


// ***** VDMTOOLS START Name=setName#1|String KEEP=NO
  public void setName (final String parg) throws CGException {
    ivName = UTIL.ConvertToString(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setName#1|String


// ***** VDMTOOLS START Name=getDefinitions KEEP=NO
  public HashSet getDefinitions () throws CGException {
    return ivDefinitions;
  }
// ***** VDMTOOLS END Name=getDefinitions


// ***** VDMTOOLS START Name=setDefinitions#1|HashSet KEEP=NO
  public void setDefinitions (final HashSet parg) throws CGException {
    ivDefinitions = (HashSet) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setDefinitions#1|HashSet


// ***** VDMTOOLS START Name=addDefinitions#1|IUmlNode KEEP=NO
  public void addDefinitions (final IUmlNode parg) throws CGException {
    ivDefinitions.add(parg);
  }
// ***** VDMTOOLS END Name=addDefinitions#1|IUmlNode

}
;

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



public class OmlTypeDefinition extends IOmlTypeDefinition {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivAccess KEEP=NO
  private IOmlAccessDefinition ivAccess = null;
// ***** VDMTOOLS END Name=ivAccess

// ***** VDMTOOLS START Name=ivShape KEEP=NO
  private IOmlTypeShape ivShape = null;
// ***** VDMTOOLS END Name=ivShape


// ***** VDMTOOLS START Name=vdm_init_OmlTypeDefinition KEEP=NO
  private void vdm_init_OmlTypeDefinition () throws CGException {
    try {

      ivAccess = null;
      ivShape = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_OmlTypeDefinition


// ***** VDMTOOLS START Name=OmlTypeDefinition KEEP=NO
  public OmlTypeDefinition () throws CGException {
    vdm_init_OmlTypeDefinition();
  }
// ***** VDMTOOLS END Name=OmlTypeDefinition


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("TypeDefinition");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept#1|IOmlVisitor KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitTypeDefinition((IOmlTypeDefinition) this);
  }
// ***** VDMTOOLS END Name=accept#1|IOmlVisitor


// ***** VDMTOOLS START Name=OmlTypeDefinition#2|IOmlAccessDefinition|IOmlTypeShape KEEP=NO
  public OmlTypeDefinition (final IOmlAccessDefinition p1, final IOmlTypeShape p2) throws CGException {

    vdm_init_OmlTypeDefinition();
    {

      setAccess((IOmlAccessDefinition) p1);
      setShape((IOmlTypeShape) p2);
    }
  }
// ***** VDMTOOLS END Name=OmlTypeDefinition#2|IOmlAccessDefinition|IOmlTypeShape


// ***** VDMTOOLS START Name=init#1|HashMap KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("access");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setAccess((IOmlAccessDefinition) data.get(fname));
    }
    {

      String fname = new String("shape");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setShape((IOmlTypeShape) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init#1|HashMap


// ***** VDMTOOLS START Name=getAccess KEEP=NO
  public IOmlAccessDefinition getAccess () throws CGException {
    return (IOmlAccessDefinition) ivAccess;
  }
// ***** VDMTOOLS END Name=getAccess


// ***** VDMTOOLS START Name=setAccess#1|IOmlAccessDefinition KEEP=NO
  public void setAccess (final IOmlAccessDefinition parg) throws CGException {
    ivAccess = (IOmlAccessDefinition) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setAccess#1|IOmlAccessDefinition


// ***** VDMTOOLS START Name=getShape KEEP=NO
  public IOmlTypeShape getShape () throws CGException {
    return (IOmlTypeShape) ivShape;
  }
// ***** VDMTOOLS END Name=getShape


// ***** VDMTOOLS START Name=setShape#1|IOmlTypeShape KEEP=NO
  public void setShape (final IOmlTypeShape parg) throws CGException {
    ivShape = (IOmlTypeShape) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setShape#1|IOmlTypeShape

}
;

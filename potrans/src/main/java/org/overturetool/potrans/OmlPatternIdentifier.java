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



public class OmlPatternIdentifier extends IOmlPatternIdentifier {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivIdentifier KEEP=NO
  private String ivIdentifier = null;
// ***** VDMTOOLS END Name=ivIdentifier


// ***** VDMTOOLS START Name=vdm_init_OmlPatternIdentifier KEEP=NO
  private void vdm_init_OmlPatternIdentifier () throws CGException {
    try {
      ivIdentifier = UTIL.ConvertToString(new String());
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_OmlPatternIdentifier


// ***** VDMTOOLS START Name=OmlPatternIdentifier KEEP=NO
  public OmlPatternIdentifier () throws CGException {
    vdm_init_OmlPatternIdentifier();
  }
// ***** VDMTOOLS END Name=OmlPatternIdentifier


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("PatternIdentifier");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept#1|IOmlVisitor KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitPatternIdentifier((IOmlPatternIdentifier) this);
  }
// ***** VDMTOOLS END Name=accept#1|IOmlVisitor


// ***** VDMTOOLS START Name=OmlPatternIdentifier#1|String KEEP=NO
  public OmlPatternIdentifier (final String p1) throws CGException {

    vdm_init_OmlPatternIdentifier();
    setIdentifier(p1);
  }
// ***** VDMTOOLS END Name=OmlPatternIdentifier#1|String


// ***** VDMTOOLS START Name=init#1|HashMap KEEP=NO
  public void init (final HashMap data) throws CGException {

    String fname = new String("identifier");
    Boolean cond_4 = null;
    cond_4 = new Boolean(data.containsKey(fname));
    if (cond_4.booleanValue()) 
      setIdentifier(UTIL.ConvertToString(data.get(fname)));
  }
// ***** VDMTOOLS END Name=init#1|HashMap


// ***** VDMTOOLS START Name=getIdentifier KEEP=NO
  public String getIdentifier () throws CGException {
    return ivIdentifier;
  }
// ***** VDMTOOLS END Name=getIdentifier


// ***** VDMTOOLS START Name=setIdentifier#1|String KEEP=NO
  public void setIdentifier (final String parg) throws CGException {
    ivIdentifier = UTIL.ConvertToString(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setIdentifier#1|String

}
;

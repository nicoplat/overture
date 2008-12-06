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



public class OmlSeqConcPattern extends IOmlSeqConcPattern {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivLhsPattern KEEP=NO
  private IOmlPattern ivLhsPattern = null;
// ***** VDMTOOLS END Name=ivLhsPattern

// ***** VDMTOOLS START Name=ivRhsPattern KEEP=NO
  private IOmlPattern ivRhsPattern = null;
// ***** VDMTOOLS END Name=ivRhsPattern


// ***** VDMTOOLS START Name=vdm_init_OmlSeqConcPattern KEEP=NO
  private void vdm_init_OmlSeqConcPattern () throws CGException {
    try {

      ivLhsPattern = null;
      ivRhsPattern = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_OmlSeqConcPattern


// ***** VDMTOOLS START Name=OmlSeqConcPattern KEEP=NO
  public OmlSeqConcPattern () throws CGException {
    vdm_init_OmlSeqConcPattern();
  }
// ***** VDMTOOLS END Name=OmlSeqConcPattern


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("SeqConcPattern");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept#1|IOmlVisitor KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitSeqConcPattern((IOmlSeqConcPattern) this);
  }
// ***** VDMTOOLS END Name=accept#1|IOmlVisitor


// ***** VDMTOOLS START Name=OmlSeqConcPattern#2|IOmlPattern|IOmlPattern KEEP=NO
  public OmlSeqConcPattern (final IOmlPattern p1, final IOmlPattern p2) throws CGException {

    vdm_init_OmlSeqConcPattern();
    {

      setLhsPattern((IOmlPattern) p1);
      setRhsPattern((IOmlPattern) p2);
    }
  }
// ***** VDMTOOLS END Name=OmlSeqConcPattern#2|IOmlPattern|IOmlPattern


// ***** VDMTOOLS START Name=init#1|HashMap KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("lhs_pattern");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setLhsPattern((IOmlPattern) data.get(fname));
    }
    {

      String fname = new String("rhs_pattern");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setRhsPattern((IOmlPattern) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init#1|HashMap


// ***** VDMTOOLS START Name=getLhsPattern KEEP=NO
  public IOmlPattern getLhsPattern () throws CGException {
    return (IOmlPattern) ivLhsPattern;
  }
// ***** VDMTOOLS END Name=getLhsPattern


// ***** VDMTOOLS START Name=setLhsPattern#1|IOmlPattern KEEP=NO
  public void setLhsPattern (final IOmlPattern parg) throws CGException {
    ivLhsPattern = (IOmlPattern) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setLhsPattern#1|IOmlPattern


// ***** VDMTOOLS START Name=getRhsPattern KEEP=NO
  public IOmlPattern getRhsPattern () throws CGException {
    return (IOmlPattern) ivRhsPattern;
  }
// ***** VDMTOOLS END Name=getRhsPattern


// ***** VDMTOOLS START Name=setRhsPattern#1|IOmlPattern KEEP=NO
  public void setRhsPattern (final IOmlPattern parg) throws CGException {
    ivRhsPattern = (IOmlPattern) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setRhsPattern#1|IOmlPattern

}
;

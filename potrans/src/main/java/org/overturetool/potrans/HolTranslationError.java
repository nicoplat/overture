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



public class HolTranslationError {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp


// ***** VDMTOOLS START Name=vdm_init_HolTranslationError KEEP=NO
  private void vdm_init_HolTranslationError () throws CGException {}
// ***** VDMTOOLS END Name=vdm_init_HolTranslationError


// ***** VDMTOOLS START Name=HolTranslationError KEEP=NO
  public HolTranslationError () throws CGException {
    vdm_init_HolTranslationError();
  }
// ***** VDMTOOLS END Name=HolTranslationError


// ***** VDMTOOLS START Name=construct#1|String KEEP=NO
  static public void construct (final String newMessage) throws CGException {

    Boolean tmpVal_3 = null;
    IO obj_4 = null;
    obj_4 = (IO) new IO();
    String par_5 = null;
    Vector unArg_6 = null;
    unArg_6 = new Vector();
    unArg_6.add(new String("< Error: \'"));
    unArg_6.add(newMessage);
    unArg_6.add(new String("\' \\> \n"));
    String rdcseq_10 = new String();
    for (Iterator enm_13 = unArg_6.iterator(); enm_13.hasNext(); ) {

      String e_11 = UTIL.ConvertToString(enm_13.next());
      rdcseq_10 = rdcseq_10.concat(e_11);
    }
    par_5 = rdcseq_10;
    tmpVal_3 = obj_4.echo(par_5);
  }
// ***** VDMTOOLS END Name=construct#1|String


// ***** VDMTOOLS START Name=print#1|String KEEP=NO
  static public String print (final String message) throws CGException {

    String rexpr_2 = null;
    Vector unArg_3 = null;
    unArg_3 = new Vector();
    unArg_3.add(new String("\n < Error: \'"));
    unArg_3.add(message);
    unArg_3.add(new String("\' > \n"));
    String rdcseq_7 = new String();
    for (Iterator enm_10 = unArg_3.iterator(); enm_10.hasNext(); ) {

      String e_8 = UTIL.ConvertToString(enm_10.next());
      rdcseq_7 = rdcseq_7.concat(e_8);
    }
    rexpr_2 = rdcseq_7;
    return rexpr_2;
  }
// ***** VDMTOOLS END Name=print#1|String


// ***** VDMTOOLS START Name=print#2|String|Object KEEP=NO
  static public String print (final String var_1_1, final Object var_2_2) throws CGException {

    String message = null;
    boolean succ_3 = true;
    message = var_1_1;
    if (!succ_3) 
      UTIL.RunTime("Run-Time Error:Pattern match failed in operation call in operation print");
    String rexpr_4 = null;
    rexpr_4 = UTIL.ConvertToString(print(message));
    return rexpr_4;
  }
// ***** VDMTOOLS END Name=print#2|String|Object

}
;

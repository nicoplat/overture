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

import jp.co.csk.vdm.toolbox.VDM.*;
import java.util.*;
import org.overturetool.jml.ast.itf.*;
// ***** VDMTOOLS END Name=imports



public class JmlInvariantDefinitions extends JmlDefinitionBlock implements IJmlInvariantDefinitions {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivInvariantList KEEP=NO
  private Vector ivInvariantList = null;
// ***** VDMTOOLS END Name=ivInvariantList


// ***** VDMTOOLS START Name=JmlInvariantDefinitions KEEP=NO
  public JmlInvariantDefinitions () throws CGException {
    try {
      ivInvariantList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=JmlInvariantDefinitions


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("InvariantDefinitions");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IJmlVisitor pVisitor) throws CGException {
    pVisitor.visitInvariantDefinitions((IJmlInvariantDefinitions) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=JmlInvariantDefinitions KEEP=NO
  public JmlInvariantDefinitions (final Vector p1) throws CGException {

    try {
      ivInvariantList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    setInvariantList(p1);
  }
// ***** VDMTOOLS END Name=JmlInvariantDefinitions


// ***** VDMTOOLS START Name=JmlInvariantDefinitions KEEP=NO
  public JmlInvariantDefinitions (final Vector p1, final Long line, final Long column) throws CGException {

    try {
      ivInvariantList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setInvariantList(p1);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=JmlInvariantDefinitions


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    String fname = new String("invariant_list");
    Boolean cond_4 = null;
    cond_4 = new Boolean(data.containsKey(fname));
    if (cond_4.booleanValue()) 
      setInvariantList((Vector) data.get(fname));
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getInvariantList KEEP=NO
  public Vector getInvariantList () throws CGException {
    return ivInvariantList;
  }
// ***** VDMTOOLS END Name=getInvariantList


// ***** VDMTOOLS START Name=setInvariantList KEEP=NO
  public void setInvariantList (final Vector parg) throws CGException {
    ivInvariantList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setInvariantList


// ***** VDMTOOLS START Name=addInvariantList KEEP=NO
  public void addInvariantList (final IJmlNode parg) throws CGException {
    ivInvariantList.add(parg);
  }
// ***** VDMTOOLS END Name=addInvariantList
  
  public String toString() {
	  
	  String str = new String();
	  int i;
	  
	  str += "// ***** INVARIANTS *****\n";
	  
	  for(i = 0; i < this.ivInvariantList.size(); i++) {
		  
		  str += ((JmlInvariantDefinition) this.ivInvariantList.get(i)).toString() + "\n";
	  }
	  
	  str += "// ***** END INVARIANTS *****\n";
	  
	  return str;
  }

}
;

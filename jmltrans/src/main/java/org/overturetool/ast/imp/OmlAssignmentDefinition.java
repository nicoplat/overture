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



public class OmlAssignmentDefinition extends OmlNode implements IOmlAssignmentDefinition {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivIdentifier KEEP=NO
  private String ivIdentifier = null;
// ***** VDMTOOLS END Name=ivIdentifier

// ***** VDMTOOLS START Name=ivType KEEP=NO
  private IOmlType ivType = null;
// ***** VDMTOOLS END Name=ivType

// ***** VDMTOOLS START Name=ivExpression KEEP=NO
  private IOmlExpression ivExpression = null;
// ***** VDMTOOLS END Name=ivExpression


// ***** VDMTOOLS START Name=OmlAssignmentDefinition KEEP=NO
  public OmlAssignmentDefinition () throws CGException {
    try {

      ivIdentifier = UTIL.ConvertToString(new String());
      ivType = null;
      ivExpression = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlAssignmentDefinition


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("AssignmentDefinition");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitAssignmentDefinition((IOmlAssignmentDefinition) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlAssignmentDefinition KEEP=NO
  public OmlAssignmentDefinition (final String p1, final IOmlType p2, final IOmlExpression p3) throws CGException {

    try {

      ivIdentifier = UTIL.ConvertToString(new String());
      ivType = null;
      ivExpression = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setIdentifier(p1);
      setType((IOmlType) p2);
      setExpression((IOmlExpression) p3);
    }
  }
// ***** VDMTOOLS END Name=OmlAssignmentDefinition


// ***** VDMTOOLS START Name=OmlAssignmentDefinition KEEP=NO
  public OmlAssignmentDefinition (final String p1, final IOmlType p2, final IOmlExpression p3, final Long line, final Long column) throws CGException {

    try {

      ivIdentifier = UTIL.ConvertToString(new String());
      ivType = null;
      ivExpression = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setIdentifier(p1);
      setType((IOmlType) p2);
      setExpression((IOmlExpression) p3);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlAssignmentDefinition


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

      String fname = new String("type");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setType((IOmlType) data.get(fname));
    }
    {

      String fname = new String("expression");
      Boolean cond_22 = null;
      cond_22 = new Boolean(data.containsKey(fname));
      if (cond_22.booleanValue()) 
        setExpression((IOmlExpression) data.get(fname));
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


// ***** VDMTOOLS START Name=getType KEEP=NO
  public IOmlType getType () throws CGException {
    return (IOmlType) ivType;
  }
// ***** VDMTOOLS END Name=getType


// ***** VDMTOOLS START Name=setType KEEP=NO
  public void setType (final IOmlType parg) throws CGException {
    ivType = (IOmlType) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setType


// ***** VDMTOOLS START Name=getExpression KEEP=NO
  public IOmlExpression getExpression () throws CGException {
    return (IOmlExpression) ivExpression;
  }
// ***** VDMTOOLS END Name=getExpression


// ***** VDMTOOLS START Name=hasExpression KEEP=NO
  public Boolean hasExpression () throws CGException {
    return new Boolean(!UTIL.equals(ivExpression, null));
  }
// ***** VDMTOOLS END Name=hasExpression


// ***** VDMTOOLS START Name=setExpression KEEP=NO
  public void setExpression (final IOmlExpression parg) throws CGException {
    ivExpression = (IOmlExpression) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setExpression
  
  public String toString() {
	  
	String type = new String();
	String expr = new String();
	
	type = this.ivType.toString();
	
	try {
		if(hasExpression()) {
			
			expr = this.ivExpression.toString();
			if(!expr.equals(new String("undefined")))
				return this.ivIdentifier + " : " + type + " := " + expr;
			else
				return this.ivIdentifier + " : " + type;
		}
		else
			return this.ivIdentifier + " : " + type;
		
	} catch (CGException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return "";
  }

}
;

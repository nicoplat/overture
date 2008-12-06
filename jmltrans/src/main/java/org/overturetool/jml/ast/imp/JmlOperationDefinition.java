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



public class JmlOperationDefinition extends JmlNode implements IJmlOperationDefinition {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivTrailer KEEP=NO
  private IJmlMethodSpecifications ivTrailer = null;
// ***** VDMTOOLS END Name=ivTrailer

// ***** VDMTOOLS START Name=ivAccess KEEP=NO
  private IJmlAccessDefinition ivAccess = null;
// ***** VDMTOOLS END Name=ivAccess

// ***** VDMTOOLS START Name=ivPure KEEP=NO
  private Boolean ivPure = null;
// ***** VDMTOOLS END Name=ivPure

// ***** VDMTOOLS START Name=ivStatickeyword KEEP=NO
  private Boolean ivStatickeyword = null;
// ***** VDMTOOLS END Name=ivStatickeyword

// ***** VDMTOOLS START Name=ivFinal KEEP=NO
  private Boolean ivFinal = null;
// ***** VDMTOOLS END Name=ivFinal

// ***** VDMTOOLS START Name=ivReturningType KEEP=NO
  private IJmlType ivReturningType = null;
// ***** VDMTOOLS END Name=ivReturningType

// ***** VDMTOOLS START Name=ivIdentifier KEEP=NO
  private String ivIdentifier = null;
// ***** VDMTOOLS END Name=ivIdentifier

// ***** VDMTOOLS START Name=ivParameterList KEEP=NO
  private Vector ivParameterList = null;
// ***** VDMTOOLS END Name=ivParameterList

// ***** VDMTOOLS START Name=ivBody KEEP=NO
  private IJmlBody ivBody = null;
// ***** VDMTOOLS END Name=ivBody


// ***** VDMTOOLS START Name=JmlOperationDefinition KEEP=NO
  public JmlOperationDefinition () throws CGException {
    try {

      ivTrailer = null;
      ivAccess = null;
      ivPure = null;
      ivStatickeyword = null;
      ivFinal = null;
      ivReturningType = null;
      ivIdentifier = UTIL.ConvertToString(new String());
      ivParameterList = new Vector();
      ivBody = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=JmlOperationDefinition


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("OperationDefinition");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IJmlVisitor pVisitor) throws CGException {
    pVisitor.visitOperationDefinition((IJmlOperationDefinition) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=JmlOperationDefinition KEEP=NO
  public JmlOperationDefinition (final IJmlMethodSpecifications p1, final IJmlAccessDefinition p2, final Boolean p3, final Boolean p4, final Boolean p5, final IJmlType p6, final String p7, final Vector p8, final IJmlBody p9) throws CGException {

    try {

      ivTrailer = null;
      ivAccess = null;
      ivPure = null;
      ivStatickeyword = null;
      ivFinal = null;
      ivReturningType = null;
      ivIdentifier = UTIL.ConvertToString(new String());
      ivParameterList = new Vector();
      ivBody = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setTrailer((IJmlMethodSpecifications) p1);
      setAccess((IJmlAccessDefinition) p2);
      setPure(p3);
      setStatickeyword(p4);
      setFinal(p5);
      setReturningType((IJmlType) p6);
      setIdentifier(p7);
      setParameterList(p8);
      setBody((IJmlBody) p9);
    }
  }
// ***** VDMTOOLS END Name=JmlOperationDefinition


// ***** VDMTOOLS START Name=JmlOperationDefinition KEEP=NO
  public JmlOperationDefinition (final IJmlMethodSpecifications p1, final IJmlAccessDefinition p2, final Boolean p3, final Boolean p4, final Boolean p5, final IJmlType p6, final String p7, final Vector p8, final IJmlBody p9, final Long line, final Long column) throws CGException {

    try {

      ivTrailer = null;
      ivAccess = null;
      ivPure = null;
      ivStatickeyword = null;
      ivFinal = null;
      ivReturningType = null;
      ivIdentifier = UTIL.ConvertToString(new String());
      ivParameterList = new Vector();
      ivBody = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setTrailer((IJmlMethodSpecifications) p1);
      setAccess((IJmlAccessDefinition) p2);
      setPure(p3);
      setStatickeyword(p4);
      setFinal(p5);
      setReturningType((IJmlType) p6);
      setIdentifier(p7);
      setParameterList(p8);
      setBody((IJmlBody) p9);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=JmlOperationDefinition


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("trailer");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setTrailer((IJmlMethodSpecifications) data.get(fname));
    }
    {

      String fname = new String("access");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setAccess((IJmlAccessDefinition) data.get(fname));
    }
    {

      String fname = new String("pure");
      Boolean cond_22 = null;
      cond_22 = new Boolean(data.containsKey(fname));
      if (cond_22.booleanValue()) 
        setPure((Boolean) data.get(fname));
    }
    {

      String fname = new String("statickeyword");
      Boolean cond_31 = null;
      cond_31 = new Boolean(data.containsKey(fname));
      if (cond_31.booleanValue()) 
        setStatickeyword((Boolean) data.get(fname));
    }
    {

      String fname = new String("final");
      Boolean cond_40 = null;
      cond_40 = new Boolean(data.containsKey(fname));
      if (cond_40.booleanValue()) 
        setFinal((Boolean) data.get(fname));
    }
    {

      String fname = new String("returning_type");
      Boolean cond_49 = null;
      cond_49 = new Boolean(data.containsKey(fname));
      if (cond_49.booleanValue()) 
        setReturningType((IJmlType) data.get(fname));
    }
    {

      String fname = new String("identifier");
      Boolean cond_58 = null;
      cond_58 = new Boolean(data.containsKey(fname));
      if (cond_58.booleanValue()) 
        setIdentifier(UTIL.ConvertToString(data.get(fname)));
    }
    {

      String fname = new String("parameter_list");
      Boolean cond_67 = null;
      cond_67 = new Boolean(data.containsKey(fname));
      if (cond_67.booleanValue()) 
        setParameterList((Vector) data.get(fname));
    }
    {

      String fname = new String("body");
      Boolean cond_76 = null;
      cond_76 = new Boolean(data.containsKey(fname));
      if (cond_76.booleanValue()) 
        setBody((IJmlBody) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getTrailer KEEP=NO
  public IJmlMethodSpecifications getTrailer () throws CGException {
    return (IJmlMethodSpecifications) ivTrailer;
  }
// ***** VDMTOOLS END Name=getTrailer


// ***** VDMTOOLS START Name=hasTrailer KEEP=NO
  public Boolean hasTrailer () throws CGException {
    return new Boolean(!UTIL.equals(ivTrailer, null));
  }
// ***** VDMTOOLS END Name=hasTrailer


// ***** VDMTOOLS START Name=setTrailer KEEP=NO
  public void setTrailer (final IJmlMethodSpecifications parg) throws CGException {
    ivTrailer = (IJmlMethodSpecifications) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setTrailer


// ***** VDMTOOLS START Name=getAccess KEEP=NO
  public IJmlAccessDefinition getAccess () throws CGException {
    return (IJmlAccessDefinition) ivAccess;
  }
// ***** VDMTOOLS END Name=getAccess


// ***** VDMTOOLS START Name=setAccess KEEP=NO
  public void setAccess (final IJmlAccessDefinition parg) throws CGException {
    ivAccess = (IJmlAccessDefinition) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setAccess


// ***** VDMTOOLS START Name=getPure KEEP=NO
  public Boolean getPure () throws CGException {
    return ivPure;
  }
// ***** VDMTOOLS END Name=getPure


// ***** VDMTOOLS START Name=setPure KEEP=NO
  public void setPure (final Boolean parg) throws CGException {
    ivPure = (Boolean) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setPure


// ***** VDMTOOLS START Name=getStatickeyword KEEP=NO
  public Boolean getStatickeyword () throws CGException {
    return ivStatickeyword;
  }
// ***** VDMTOOLS END Name=getStatickeyword


// ***** VDMTOOLS START Name=setStatickeyword KEEP=NO
  public void setStatickeyword (final Boolean parg) throws CGException {
    ivStatickeyword = (Boolean) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setStatickeyword


// ***** VDMTOOLS START Name=getFinal KEEP=NO
  public Boolean getFinal () throws CGException {
    return ivFinal;
  }
// ***** VDMTOOLS END Name=getFinal


// ***** VDMTOOLS START Name=setFinal KEEP=NO
  public void setFinal (final Boolean parg) throws CGException {
    ivFinal = (Boolean) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setFinal


// ***** VDMTOOLS START Name=getReturningType KEEP=NO
  public IJmlType getReturningType () throws CGException {
    return (IJmlType) ivReturningType;
  }
// ***** VDMTOOLS END Name=getReturningType


// ***** VDMTOOLS START Name=setReturningType KEEP=NO
  public void setReturningType (final IJmlType parg) throws CGException {
    ivReturningType = (IJmlType) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setReturningType


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


// ***** VDMTOOLS START Name=getParameterList KEEP=NO
  public Vector getParameterList () throws CGException {
    return ivParameterList;
  }
// ***** VDMTOOLS END Name=getParameterList


// ***** VDMTOOLS START Name=setParameterList KEEP=NO
  public void setParameterList (final Vector parg) throws CGException {
    ivParameterList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setParameterList


// ***** VDMTOOLS START Name=addParameterList KEEP=NO
  public void addParameterList (final IJmlNode parg) throws CGException {
    ivParameterList.add(parg);
  }
// ***** VDMTOOLS END Name=addParameterList


// ***** VDMTOOLS START Name=getBody KEEP=NO
  public IJmlBody getBody () throws CGException {
    return (IJmlBody) ivBody;
  }
// ***** VDMTOOLS END Name=getBody


// ***** VDMTOOLS START Name=hasBody KEEP=NO
  public Boolean hasBody () throws CGException {
    return new Boolean(!UTIL.equals(ivBody, null));
  }
// ***** VDMTOOLS END Name=hasBody


// ***** VDMTOOLS START Name=setBody KEEP=NO
  public void setBody (final IJmlBody parg) throws CGException {
    ivBody = (IJmlBody) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setBody
  
  public String toString() {
	  
	  String trailer = new String();
	  String access = new String();
	  String type = new String();
	  String params = new String();
	  String body = new String();
	  String pure = new String();
	  String statick = new String();
	  String finalk = new String();
	  
	  if(this.ivStatickeyword)
		  statick = " static ";
	  if(this.ivFinal)
		  finalk = " final ";
	  if(this.ivPure)
		  pure = " /*@  pure */ ";
	  
	  trailer = this.ivTrailer.toString();
	  
	  
	  access = this.ivAccess.toString();
	  type = this.ivReturningType.toString();
	  body = "";//this.ivBody.toString();
	  
	  int i;

	  if(this.ivParameterList.size() > 0) {
		  
		  for(i = 0; i < this.ivParameterList.size()-1; i++) {

			  	params += ((JmlParameter) this.ivParameterList.get(i)).toString() + ", ";
		  }
		  params += this.ivParameterList.get(this.ivParameterList.size()-1);
	  }
	  else {
		  params = "";
	  }
	  
	  return trailer + "\n" + 
	    access + pure + statick + finalk +
	    type + " " + this.ivIdentifier + "(" + params + ") ;";
	  
  }

}
;

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



public class OmlExtendedExplicitOperation extends OmlOperationShape implements IOmlExtendedExplicitOperation {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivIdentifier KEEP=NO
  private String ivIdentifier = null;
// ***** VDMTOOLS END Name=ivIdentifier

// ***** VDMTOOLS START Name=ivPatternTypePairList KEEP=NO
  private Vector ivPatternTypePairList = null;
// ***** VDMTOOLS END Name=ivPatternTypePairList

// ***** VDMTOOLS START Name=ivIdentifierTypePairList KEEP=NO
  private Vector ivIdentifierTypePairList = null;
// ***** VDMTOOLS END Name=ivIdentifierTypePairList

// ***** VDMTOOLS START Name=ivBody KEEP=NO
  private IOmlOperationBody ivBody = null;
// ***** VDMTOOLS END Name=ivBody

// ***** VDMTOOLS START Name=ivTrailer KEEP=NO
  private IOmlOperationTrailer ivTrailer = null;
// ***** VDMTOOLS END Name=ivTrailer


// ***** VDMTOOLS START Name=OmlExtendedExplicitOperation KEEP=NO
  public OmlExtendedExplicitOperation () throws CGException {
    try {

      ivIdentifier = UTIL.ConvertToString(new String());
      ivPatternTypePairList = new Vector();
      ivIdentifierTypePairList = new Vector();
      ivBody = null;
      ivTrailer = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlExtendedExplicitOperation


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("ExtendedExplicitOperation");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitExtendedExplicitOperation((IOmlExtendedExplicitOperation) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlExtendedExplicitOperation KEEP=NO
  public OmlExtendedExplicitOperation (final String p1, final Vector p2, final Vector p3, final IOmlOperationBody p4, final IOmlOperationTrailer p5) throws CGException {

    try {

      ivIdentifier = UTIL.ConvertToString(new String());
      ivPatternTypePairList = new Vector();
      ivIdentifierTypePairList = new Vector();
      ivBody = null;
      ivTrailer = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setIdentifier(p1);
      setPatternTypePairList(p2);
      setIdentifierTypePairList(p3);
      setBody((IOmlOperationBody) p4);
      setTrailer((IOmlOperationTrailer) p5);
    }
  }
// ***** VDMTOOLS END Name=OmlExtendedExplicitOperation


// ***** VDMTOOLS START Name=OmlExtendedExplicitOperation KEEP=NO
  public OmlExtendedExplicitOperation (final String p1, final Vector p2, final Vector p3, final IOmlOperationBody p4, final IOmlOperationTrailer p5, final Long line, final Long column) throws CGException {

    try {

      ivIdentifier = UTIL.ConvertToString(new String());
      ivPatternTypePairList = new Vector();
      ivIdentifierTypePairList = new Vector();
      ivBody = null;
      ivTrailer = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setIdentifier(p1);
      setPatternTypePairList(p2);
      setIdentifierTypePairList(p3);
      setBody((IOmlOperationBody) p4);
      setTrailer((IOmlOperationTrailer) p5);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlExtendedExplicitOperation


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

      String fname = new String("pattern_type_pair_list");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setPatternTypePairList((Vector) data.get(fname));
    }
    {

      String fname = new String("identifier_type_pair_list");
      Boolean cond_22 = null;
      cond_22 = new Boolean(data.containsKey(fname));
      if (cond_22.booleanValue()) 
        setIdentifierTypePairList((Vector) data.get(fname));
    }
    {

      String fname = new String("body");
      Boolean cond_31 = null;
      cond_31 = new Boolean(data.containsKey(fname));
      if (cond_31.booleanValue()) 
        setBody((IOmlOperationBody) data.get(fname));
    }
    {

      String fname = new String("trailer");
      Boolean cond_40 = null;
      cond_40 = new Boolean(data.containsKey(fname));
      if (cond_40.booleanValue()) 
        setTrailer((IOmlOperationTrailer) data.get(fname));
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


// ***** VDMTOOLS START Name=getPatternTypePairList KEEP=NO
  public Vector getPatternTypePairList () throws CGException {
    return ivPatternTypePairList;
  }
// ***** VDMTOOLS END Name=getPatternTypePairList


// ***** VDMTOOLS START Name=setPatternTypePairList KEEP=NO
  public void setPatternTypePairList (final Vector parg) throws CGException {
    ivPatternTypePairList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setPatternTypePairList


// ***** VDMTOOLS START Name=addPatternTypePairList KEEP=NO
  public void addPatternTypePairList (final IOmlNode parg) throws CGException {
    ivPatternTypePairList.add(parg);
  }
// ***** VDMTOOLS END Name=addPatternTypePairList


// ***** VDMTOOLS START Name=getIdentifierTypePairList KEEP=NO
  public Vector getIdentifierTypePairList () throws CGException {
    return ivIdentifierTypePairList;
  }
// ***** VDMTOOLS END Name=getIdentifierTypePairList


// ***** VDMTOOLS START Name=setIdentifierTypePairList KEEP=NO
  public void setIdentifierTypePairList (final Vector parg) throws CGException {
    ivIdentifierTypePairList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setIdentifierTypePairList


// ***** VDMTOOLS START Name=addIdentifierTypePairList KEEP=NO
  public void addIdentifierTypePairList (final IOmlNode parg) throws CGException {
    ivIdentifierTypePairList.add(parg);
  }
// ***** VDMTOOLS END Name=addIdentifierTypePairList


// ***** VDMTOOLS START Name=getBody KEEP=NO
  public IOmlOperationBody getBody () throws CGException {
    return (IOmlOperationBody) ivBody;
  }
// ***** VDMTOOLS END Name=getBody


// ***** VDMTOOLS START Name=setBody KEEP=NO
  public void setBody (final IOmlOperationBody parg) throws CGException {
    ivBody = (IOmlOperationBody) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setBody


// ***** VDMTOOLS START Name=getTrailer KEEP=NO
  public IOmlOperationTrailer getTrailer () throws CGException {
    return (IOmlOperationTrailer) ivTrailer;
  }
// ***** VDMTOOLS END Name=getTrailer


// ***** VDMTOOLS START Name=setTrailer KEEP=NO
  public void setTrailer (final IOmlOperationTrailer parg) throws CGException {
    ivTrailer = (IOmlOperationTrailer) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setTrailer

  public String toString() {
	  
	  String body = new String();
	  String trailer = new String();
	  String tplist = new String();
	  String params = new String();
	  String res = new String();
	  
	  body = this.ivBody.toString();
	  trailer = this.ivTrailer.toString();
	  
	  
	  //parameters
	  int j, sizej = this.ivPatternTypePairList.size();
	  
	  if(sizej>0) {
		  
		  for(j = 0; j < sizej-1; j++) { 
			  params += ((OmlPatternTypePair) this.ivPatternTypePairList.get(j)).toString() + ",";
		  }
		  params += ((OmlPatternTypePair) this.ivPatternTypePairList.get(sizej-1)).toString();
	  }
	  
	  //return type
	  int k, sizek = this.ivIdentifierTypePairList.size();
	  
	  if(sizek>0) {
		  
		  for(k = 0; k < sizek-1; k++) { 
			  res += ((OmlIdentifierTypePair) this.ivIdentifierTypePairList.get(k)).toString() + ",";
		  }
		  res += ((OmlIdentifierTypePair) this.ivIdentifierTypePairList.get(sizek-1)).toString();
	  }
	  
	  return this.ivIdentifier + " " + tplist + " " + "(" + params + ") " + 
	         res + "\n" + "\t== " + body + "\n\t" + trailer + ";\n\n";

  }
}
;

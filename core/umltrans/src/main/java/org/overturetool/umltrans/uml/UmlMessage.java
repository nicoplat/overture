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



public class UmlMessage extends IUmlMessage {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivName KEEP=NO
  private String ivName = null;
// ***** VDMTOOLS END Name=ivName

// ***** VDMTOOLS START Name=ivMessageKind KEEP=NO
  private IUmlMessageKind ivMessageKind = null;
// ***** VDMTOOLS END Name=ivMessageKind

// ***** VDMTOOLS START Name=ivMessageSort KEEP=NO
  private IUmlMessageSort ivMessageSort = null;
// ***** VDMTOOLS END Name=ivMessageSort

// ***** VDMTOOLS START Name=ivSendEvent KEEP=NO
  private IUmlMos ivSendEvent = null;
// ***** VDMTOOLS END Name=ivSendEvent

// ***** VDMTOOLS START Name=ivSendReceive KEEP=NO
  private IUmlMos ivSendReceive = null;
// ***** VDMTOOLS END Name=ivSendReceive

// ***** VDMTOOLS START Name=ivArgument KEEP=NO
  private Vector ivArgument = null;
// ***** VDMTOOLS END Name=ivArgument


// ***** VDMTOOLS START Name=vdm_init_UmlMessage KEEP=NO
  private void vdm_init_UmlMessage () throws CGException {
    try {

      ivName = UTIL.ConvertToString(new String());
      ivMessageKind = null;
      ivMessageSort = null;
      ivSendEvent = null;
      ivSendReceive = null;
      ivArgument = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=vdm_init_UmlMessage


// ***** VDMTOOLS START Name=UmlMessage KEEP=NO
  public UmlMessage () throws CGException {
    vdm_init_UmlMessage();
  }
// ***** VDMTOOLS END Name=UmlMessage


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("Message");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept#1|IUmlVisitor KEEP=NO
  public void accept (final IUmlVisitor pVisitor) throws CGException {
    pVisitor.visitMessage((IUmlMessage) this);
  }
// ***** VDMTOOLS END Name=accept#1|IUmlVisitor


// ***** VDMTOOLS START Name=UmlMessage#6|String|IUmlMessageKind|IUmlMessageSort|IUmlMos|IUmlMos|Vector KEEP=NO
  public UmlMessage (final String p1, final IUmlMessageKind p2, final IUmlMessageSort p3, final IUmlMos p4, final IUmlMos p5, final Vector p6) throws CGException {

    vdm_init_UmlMessage();
    {

      setName(p1);
      setMessageKind((IUmlMessageKind) p2);
      setMessageSort((IUmlMessageSort) p3);
      setSendEvent((IUmlMos) p4);
      setSendReceive((IUmlMos) p5);
      setArgument(p6);
    }
  }
// ***** VDMTOOLS END Name=UmlMessage#6|String|IUmlMessageKind|IUmlMessageSort|IUmlMos|IUmlMos|Vector


// ***** VDMTOOLS START Name=UmlMessage#8|String|IUmlMessageKind|IUmlMessageSort|IUmlMos|IUmlMos|Vector|Long|Long KEEP=NO
  public UmlMessage (final String p1, final IUmlMessageKind p2, final IUmlMessageSort p3, final IUmlMos p4, final IUmlMos p5, final Vector p6, final Long line, final Long column) throws CGException {

    vdm_init_UmlMessage();
    {

      setName(p1);
      setMessageKind((IUmlMessageKind) p2);
      setMessageSort((IUmlMessageSort) p3);
      setSendEvent((IUmlMos) p4);
      setSendReceive((IUmlMos) p5);
      setArgument(p6);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=UmlMessage#8|String|IUmlMessageKind|IUmlMessageSort|IUmlMos|IUmlMos|Vector|Long|Long


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

      String fname = new String("messageKind");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setMessageKind((IUmlMessageKind) data.get(fname));
    }
    {

      String fname = new String("messageSort");
      Boolean cond_22 = null;
      cond_22 = new Boolean(data.containsKey(fname));
      if (cond_22.booleanValue()) 
        setMessageSort((IUmlMessageSort) data.get(fname));
    }
    {

      String fname = new String("sendEvent");
      Boolean cond_31 = null;
      cond_31 = new Boolean(data.containsKey(fname));
      if (cond_31.booleanValue()) 
        setSendEvent((IUmlMos) data.get(fname));
    }
    {

      String fname = new String("sendReceive");
      Boolean cond_40 = null;
      cond_40 = new Boolean(data.containsKey(fname));
      if (cond_40.booleanValue()) 
        setSendReceive((IUmlMos) data.get(fname));
    }
    {

      String fname = new String("argument");
      Boolean cond_49 = null;
      cond_49 = new Boolean(data.containsKey(fname));
      if (cond_49.booleanValue()) 
        setArgument((Vector) data.get(fname));
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


// ***** VDMTOOLS START Name=getMessageKind KEEP=NO
  public IUmlMessageKind getMessageKind () throws CGException {
    return (IUmlMessageKind) ivMessageKind;
  }
// ***** VDMTOOLS END Name=getMessageKind


// ***** VDMTOOLS START Name=setMessageKind#1|IUmlMessageKind KEEP=NO
  public void setMessageKind (final IUmlMessageKind parg) throws CGException {
    ivMessageKind = (IUmlMessageKind) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setMessageKind#1|IUmlMessageKind


// ***** VDMTOOLS START Name=getMessageSort KEEP=NO
  public IUmlMessageSort getMessageSort () throws CGException {
    return (IUmlMessageSort) ivMessageSort;
  }
// ***** VDMTOOLS END Name=getMessageSort


// ***** VDMTOOLS START Name=setMessageSort#1|IUmlMessageSort KEEP=NO
  public void setMessageSort (final IUmlMessageSort parg) throws CGException {
    ivMessageSort = (IUmlMessageSort) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setMessageSort#1|IUmlMessageSort


// ***** VDMTOOLS START Name=getSendEvent KEEP=NO
  public IUmlMos getSendEvent () throws CGException {
    return (IUmlMos) ivSendEvent;
  }
// ***** VDMTOOLS END Name=getSendEvent


// ***** VDMTOOLS START Name=setSendEvent#1|IUmlMos KEEP=NO
  public void setSendEvent (final IUmlMos parg) throws CGException {
    ivSendEvent = (IUmlMos) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setSendEvent#1|IUmlMos


// ***** VDMTOOLS START Name=getSendReceive KEEP=NO
  public IUmlMos getSendReceive () throws CGException {
    return (IUmlMos) ivSendReceive;
  }
// ***** VDMTOOLS END Name=getSendReceive


// ***** VDMTOOLS START Name=setSendReceive#1|IUmlMos KEEP=NO
  public void setSendReceive (final IUmlMos parg) throws CGException {
    ivSendReceive = (IUmlMos) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setSendReceive#1|IUmlMos


// ***** VDMTOOLS START Name=getArgument KEEP=NO
  public Vector getArgument () throws CGException {
    return ivArgument;
  }
// ***** VDMTOOLS END Name=getArgument


// ***** VDMTOOLS START Name=setArgument#1|Vector KEEP=NO
  public void setArgument (final Vector parg) throws CGException {
    ivArgument = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setArgument#1|Vector


// ***** VDMTOOLS START Name=addArgument#1|IUmlNode KEEP=NO
  public void addArgument (final IUmlNode parg) throws CGException {
    ivArgument.add(parg);
  }
// ***** VDMTOOLS END Name=addArgument#1|IUmlNode

}
;

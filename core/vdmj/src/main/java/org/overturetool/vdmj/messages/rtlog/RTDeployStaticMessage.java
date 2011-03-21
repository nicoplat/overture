package org.overturetool.vdmj.messages.rtlog;

import org.overturetool.vdmj.scheduler.CPUResource;
import org.overturetool.vdmj.values.CPUValue;

public class RTDeployStaticMessage extends RTArchitectureMessage
{
	private String clnm;
	private int objRef;
	private CPUResource cpu;
	
	static int staticReferenceId=Integer.MAX_VALUE;
	
	
	public RTDeployStaticMessage(String name, CPUResource cpuId)
	{
		this.clnm = name;
		this.cpu = cpuId;
		//need unique id
		objRef = --staticReferenceId;
	}

	@Override
	String getInnerMessage()
	{
		return "DeployObj -> objref: " + objRef +
		" clnm: \"" + clnm + "\"" +
		" cpunm: " + this.cpu.getNumber();
	}
	
	public Long getObjectReference()
	{
		return Long.valueOf(objRef);
	}

}

package org.overturetool.jml.ast.itf;

import jp.co.csk.vdm.toolbox.VDM.*;

public abstract interface IJmlStringLiteral extends IJmlLiteral
{
	abstract String getVal() throws CGException;
}


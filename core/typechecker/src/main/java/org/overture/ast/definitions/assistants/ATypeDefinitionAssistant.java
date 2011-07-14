package org.overture.ast.definitions.assistants;

import java.util.List;
import java.util.Vector;

import org.overture.ast.definitions.ATypeDefinition;
import org.overture.ast.definitions.PDefinition;
import org.overture.ast.types.ANamedInvariantType;
import org.overture.ast.types.ARecordInvariantType;
import org.overture.ast.types.PType;
import org.overturetool.vdmj.lex.LexNameList;
import org.overturetool.vdmj.lex.LexNameToken;
import org.overturetool.vdmj.typechecker.NameScope;

public class ATypeDefinitionAssistant {

	public static PDefinition findType(ATypeDefinition d, LexNameToken sought,
			String fromModule) {
		
		PType type = d.getType();
		
		if (type instanceof ANamedInvariantType)
		{
			ANamedInvariantType nt = (ANamedInvariantType)type;

			if (nt.getType() instanceof ARecordInvariantType)
			{
				ARecordInvariantType rt = (ARecordInvariantType)nt.getType();

				if (rt.getName().equals(sought))
				{
					return d;	// T1 = compose T2 x:int end;
				}
			}
		}

		return PDefinitionAssistant.findName(d,sought, NameScope.TYPENAME);
	}

	public static PDefinition findName(ATypeDefinition d, LexNameToken sought,
			NameScope scope) {

		PDefinition invdef = d.getInvdef();
		
		if (invdef != null &&  PDefinitionAssistant.findName(invdef, sought, scope)  != null)
		{
			return invdef;
		}

		return null;
	}

	public static List<PDefinition> getDefinitions(ATypeDefinition d) {
		List<PDefinition> defs = new Vector<PDefinition>();
		defs.add(d);

		if (d.getInvdef() != null)
		{
			defs.add(d.getInvdef());
		}

		return defs;
	}

	public static LexNameList getVariableNames(ATypeDefinition d) {
		// This is only used in VDM++ type inheritance
		return new LexNameList(d.getName());
	}

}

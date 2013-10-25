package org.overture.codegen.utils;

import org.overture.codegen.cgast.analysis.AnalysisException;
import org.overture.codegen.cgast.declarations.AClassDeclCG;

public class DependencyAnalysis
{
	
	public static boolean usesSequences(AClassDeclCG classDecl)
	{
		SequenceAnalysis seqAnalysis = new SequenceAnalysis();
		
		try
		{
			classDecl.apply(seqAnalysis);
		}catch(AnalysisException e)
		{
			//If found an exception will be thrown to terminate
			//the visitor analysis
		}
		
		return seqAnalysis.isFound();
	}
}

package org.gjt.sp.jedit.bsh;

public class LHSVariable extends LHS {

	LHSVariable( NameSpace nameSpace, String varName, boolean localVar )
	{
		type = VARIABLE;
		this.localVar = localVar;
		this.varName = varName;
		this.nameSpace = nameSpace;
	}
	
	public Object assign( Object val, boolean strictJava )
		throws UtilEvalError{
		if ( localVar )
			nameSpace.setLocalVariable( varName, val, strictJava );
		else
			nameSpace.setVariable( varName, val, strictJava );
		
		return val;
	}
}

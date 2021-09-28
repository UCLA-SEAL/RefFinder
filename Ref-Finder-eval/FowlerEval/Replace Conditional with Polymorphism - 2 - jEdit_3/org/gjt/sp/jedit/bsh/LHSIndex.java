package org.gjt.sp.jedit.bsh;

public class LHSIndex extends LHS {
	
	LHSIndex( Object array, int index )
	{
		if(array == null)
			throw new NullPointerException("constructed empty LHS");

		type = INDEX;
		this.object = array;
		this.index = index;
	}
	
	public Object assign( Object val, boolean strictJava )
	throws UtilEvalError{
		try {
			Reflect.setIndex(object, index, val);
		} catch ( UtilTargetError e1 ) { // pass along target error
			throw e1;
		} catch ( Exception e ) {
			throw new UtilEvalError("Assignment: " + e.getMessage());
		}
		return val;
	}
	
}

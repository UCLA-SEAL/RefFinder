package org.gjt.sp.jedit.bsh;

public class LHSProperties extends LHS {
	
	LHSProperties( Object object, String propName )
	{
		if(object == null)
			throw new NullPointerException("constructed empty LHS");

		type = PROPERTY;
		this.object = object;
		this.propName = propName;
	}
	
	public Object assign( Object val, boolean strictJava )
	throws UtilEvalError{
		CollectionManager cm = CollectionManager.getCollectionManager();
		if ( cm.isMap( object ) )
			cm.putInMap( object/*map*/, propName, val );
		else
			try {
				Reflect.setObjectProperty(object, propName, val);
			}
			catch(ReflectError e) {
				Interpreter.debug("Assignment: " + e.getMessage());
				throw new UtilEvalError("No such property: " + propName);
			}
		return val;
	}
	

}

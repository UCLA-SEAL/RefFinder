package org.gjt.sp.jedit.bsh;

import java.lang.reflect.Field;

public class LHSField extends LHS{
	

	LHSField( Object object, Field field )
	{
		if ( object == null)
			throw new NullPointerException("constructed empty LHS");

		type = FIELD;
		this.object = object;
		this.field = field;
	}
	
	LHSField( Field field )
	{
		type = FIELD;
		this.object = null;
		this.field = field;
	}
	
	public Object assign( Object val, boolean strictJava )
	throws UtilEvalError{
		
		try {
			Object fieldVal = val instanceof Primitive ?  
				((Primitive)val).getValue() : val;

			// This should probably be in Reflect.java
			ReflectManager.RMSetAccessible( field );
			field.set( object, fieldVal );
			return val;
		}
		catch( NullPointerException e) {   
			throw new UtilEvalError(
				"LHS ("+field.getName()+") not a static field.");
		}     
			catch( IllegalAccessException e2) {   
			throw new UtilEvalError(
				"LHS ("+field.getName()+") can't access field: "+e2);
		}     
		catch( IllegalArgumentException e3) 
		{
			String type = val instanceof Primitive ?
				((Primitive)val).getType().getName()
				: val.getClass().getName();
			throw new UtilEvalError(
				"Argument type mismatch. " + (val == null ? "null" : type )
				+ " not assignable to field "+field.getName());
		}
		
	}
	
}

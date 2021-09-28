package people;

class Person {
		
		private final boolean _isMale;
		private final char _code;
		
		
		static Person createMale(){
			return new Person(true, 'M');
		}
		
		static Person createFemale(){
			return new Person(false, 'F');
		}
		
		private Person (boolean isMale, char code){
			_isMale = isMale;
			_code = code;
		}
		
		boolean isMale(){
			return _isMale;
		}
		
		char getCode(){
			return _code;
		}
		
}

class DobleOperation {
	def execute(param) {
		param * 2;
	}
}

class RedondearOperation {
	def execute(param) {
		Math.round(param);
	}
}

class SumarOperation {
	
	def Number other;
	
	public SumarOperation(Number other) {
		this.other = other;
	}
	
	def execute(param) {
		other + param;
	}
}
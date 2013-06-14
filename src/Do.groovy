class Do{
	def static magic(){
		BigDecimal.metaClass{
			
			ejecutar = { unBloque -> delegate.with(unBloque)  }
			
			doble = {->	new DobleOperation().execute(delegate)}
			
			redondear ={-> new RedondearOperation().execute(delegate)}
			
			sumar = {unNumero ->new SumarOperation(unNumero).execute(delegate)}
			
		}
	}
}

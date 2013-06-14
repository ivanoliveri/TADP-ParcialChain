class Do{
	def static magic(){
		Number.metaClass{
			ejecutar = { unosBloques ->  }
			doble = {->	new DobleOperation().execute(delegate)}
			redondear ={-> new RedondearOperation().execute(delegate)}
			sumar = {unNumero ->new SumarOperation(other: unNumero).execute(delegate)}
		}
	}
}

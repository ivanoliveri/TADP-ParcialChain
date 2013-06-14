class Do{
	def static magic(){
		BigDecimal.metaClass{
			
			ejecutar = { unBloque -> new Chain(object:delegate).with unBloque  }
			
		}
	}
}

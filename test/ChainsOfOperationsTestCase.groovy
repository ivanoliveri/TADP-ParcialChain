import static org.junit.Assert.*   
import static Do

import org.junit.Test


class ChainsOfOperationsTestCase {

	@Test
	void test_chaining_de_operaciones() {
		Do.magic()
		def resultado = 5.2.ejecutar {
			doble()
			redondear()
			sumar(7)
		}
		assertEquals (17, resultado, 0.1);
	}
	
}












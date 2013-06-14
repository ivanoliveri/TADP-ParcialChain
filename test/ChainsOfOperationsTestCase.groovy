import static org.junit.Assert.*   
import static Do

import org.junit.Test


class ChainsOfOperationsTestCase {

	@Test
	void test_calcula_el_doble_de_dos_punto_uno(){
		Do.magic()
		assertEquals(4.2, 2.1.doble())
	}
	
	@Test
	void test_redondear_cuatro_punto_dos(){
		Do.magic()
		assertEquals(4.0,4.2.redondear())
	}
	
	@Test	
	void test_suma_uno_y_dos(){
		Do.magic() 
		assertEquals(3.0, 1.0.sumar(2.0))
	}
	
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












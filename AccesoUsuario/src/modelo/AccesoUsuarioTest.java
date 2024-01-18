package modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccesoUsuarioTest {

	@Test
	public void testHashCode() {
		AccesoUsuario usuario1 = new AccesoUsuario();
		assertEquals("HashCode erroneo", 0, usuario1.hashCode());
		Long l = 1234L;
		usuario1.setId(l);
		assertEquals("HashCode erroneo", l.hashCode(), usuario1.hashCode());
	}

	@Test
	public void testAccesoUsuario() {
		AccesoUsuario usuario1 = new AccesoUsuario();
		assertNotNull("No se ha podido crear el usuario", usuario1);
	}

	@Test
	public void testId() {
		AccesoUsuario usuario1 = new AccesoUsuario();
		Long l = 999999999999999L;
		usuario1.setId(l);
		assertEquals("ID no esperado", l, usuario1.getId());
	}

	@Test
	public void testNombre() {
		AccesoUsuario usuario1 = new AccesoUsuario();
		String n = "Karina";
		usuario1.setNombre(n);
		assertEquals("Nombre no esperado", n, usuario1.getNombre());
	}

	@Test
	public void usuarioExiste() {
		AccesoUsuario usuario1 = new AccesoUsuario();
		usuario1.setNombre("Osvaldo");
		usuario1.setId(56633L);

		AccesoUsuario usuario2 = new AccesoUsuario();
		usuario2.setNombre("Osvaldo");
		usuario2.setId(56633L);

		assertEquals("Los objetos no son iguales", usuario1, usuario2);
	}

	@Test
	public void usuarioNoExiste() {
		AccesoUsuario usuario1 = new AccesoUsuario();
		usuario1.setNombre("Osvaldo");
		usuario1.setId(56633L);
		
		AccesoUsuario usuario2 = new AccesoUsuario();
		usuario2.setNombre("Jorge");
		usuario2.setId(56633L);

		assertNotEquals("Los objetos son iguales", usuario1, usuario2);
	}

	@Test
	public void testEqualsObject() {

	}

}

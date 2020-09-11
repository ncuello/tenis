package utn.dds.model;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Assert;
import org.junit.Test;
import org.uqbarproject.jpa.java8.extras.WithGlobalEntityManager;
import org.uqbarproject.jpa.java8.extras.test.AbstractPersistenceTest;


public class ContextTest extends AbstractPersistenceTest implements WithGlobalEntityManager {

  // ===========================================
  // Ojo, ¡esto no es un test propiamente dicho!
  // ===========================================
  
  
  @Test
  public void test() {
    Jugador dani = new Jugador();
    dani.setNombre("Dani");
    dani.setApellido("Lolo");
    
    // esto lo hace persistIBLE
    entityManager().persist(dani);
    
    
    assertNotNull(dani.getId());
   
    Jugador jugaderMisteriose =  entityManager().find(Jugador.class, dani.getId());
    
    assertNotNull(jugaderMisteriose);
    
    //entityManager().clear(); // esto no lo hagan en casa
    Jugador jugaderMisteriose2 = entityManager().find(Jugador.class, dani.getId());
    
    assertNotNull(jugaderMisteriose2); 
    
    Assert.assertEquals(jugaderMisteriose, jugaderMisteriose2);
  }
  
  @Test
  public void participante() {
    Jugador dani = new Jugador();
    dani.setNombre("Dani");
    dani.setApellido("Lolo");
    
    Cancha cancha = new Cancha();
    cancha.setNombre("cancha2");
    
    Partido partido = new Partido();
    partido.setCancha(cancha);
    
    Paleta paleta = new Paleta();
    paleta.setNombre("paleta1");
    
    // esto lo hace persistIBLE
    entityManager().persist(dani);
    
    
    assertNotNull(dani.getId());
   
    Jugador jugaderMisteriose =  entityManager().find(Jugador.class, dani.getId());
    
    assertNotNull(jugaderMisteriose);
    
    //entityManager().clear(); // esto no lo hagan en casa
    Jugador jugaderMisteriose2 = entityManager().find(Jugador.class, dani.getId());
    
    assertNotNull(jugaderMisteriose2); 
    
    Assert.assertEquals(jugaderMisteriose, jugaderMisteriose2);
  }
}

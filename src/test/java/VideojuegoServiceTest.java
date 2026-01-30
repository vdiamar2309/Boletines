
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class VideojuegoServiceTest {
    private VideojuegoRepository videojuegoRepositoryMock;
    private VideojuegoService videojuegoService;

    //Inicializar el mock
    @BeforeEach
    void setUp() {
        videojuegoRepositoryMock = mock(VideojuegoRepository.class);
        videojuegoService = new VideojuegoService(videojuegoRepositoryMock);
    }


    //Comprobación de puntos claves como -1 0 1 49 50 51 89 90...

    @Test
    void puntuacionCero() {
        assertEquals("Malo",
                videojuegoService.clasificarJuego(0));
    }

    @Test
    void puntuacionUno() {
        assertEquals("Malo",
                videojuegoService.clasificarJuego(1));
    }

    @Test
    void puntuacion49() {
        assertEquals("Malo",
                videojuegoService.clasificarJuego(49));
    }

    @Test
    void puntuacion50() {
        assertEquals("Bueno",
                videojuegoService.clasificarJuego(50));
    }

    @Test
    void puntuacion51() {
        assertEquals("Bueno",
                videojuegoService.clasificarJuego(51));
    }

    @Test
    void puntuacion89() {
        assertNotEquals("Obra Maestra",
                videojuegoService.clasificarJuego(89));
    }

    @Test
    void puntuacion90() {
        assertEquals("Obra Maestra",
                videojuegoService.clasificarJuego(90));
    }



    @Test
    void puntuacion100() {
        assertEquals("Obra Maestra",
                videojuegoService.clasificarJuego(100));
    }

    @Test
    public void rangosNegativos() {
        int i = -1;

        assertThrows(IllegalArgumentException.class, () -> videojuegoService.clasificarJuego(i));

    }


    @Test
    public void rangoMayoresCien() {
        int i = 101;
        assertThrows(IllegalArgumentException.class, () -> videojuegoService.clasificarJuego(i));
    }


}

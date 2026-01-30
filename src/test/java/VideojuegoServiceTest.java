
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class VideojuegoServiceTest {
    private VideojuegoRepository videojuegoRepositoryMock;
    private VideojuegoService videojuegoService;

    @BeforeEach
    void setUp() {
        videojuegoRepositoryMock = mock(VideojuegoRepository.class);
        videojuegoService = new VideojuegoService(videojuegoRepositoryMock);
    }


    @Test
    void juegoPunt50Bueno(){
        int puntuacion = 50;
        String resultado = videojuegoService.clasificarJuego(puntuacion);
        assertEquals("Bueno", resultado);

    }

    @Test
    public void rangosNegativos() {
        int i = -1;

        assertThrows(IllegalArgumentException.class, () -> videojuegoService.clasificarJuego(i));

    }


    @Test
    public void rangosPositivos() {
        int i = 101;
        System.out.println(i + " " + videojuegoService.clasificarJuego(i));
    }




}

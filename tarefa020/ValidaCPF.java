import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class ValidaCPFTeste {

    @Test
    public void testaCPFValido() {
        ValidaCPF validaCPF = new ValidaCPF();
        boolean resultado = validaCPF.isCPF("92015344187");
        assertTrue(resultado);
    }

    @Test
    public void testaCPFFormatoInvalido() {
        ValidaCPF validaCPF = new ValidaCPF();
        boolean resultado = validaCPF.isCPF("367.280.641-25");
        assertFalse(resultado);
    }

    @Test
    public void testaCPFQuantidadeDigitosInvalida() {
        ValidaCPF validaCPF = new ValidaCPF();
        boolean resultado = validaCPF.isCPF("0135691812");
        assertFalse(resultado);
    }

    @Test
    public void testaCPFComCaracteresInvalidos() {
        ValidaCPF validaCPF = new ValidaCPF();
        boolean resultado = validaCPF.isCPF("8c97b207100");
        assertFalse(resultado);
    }

    @Test
    public void testaCPFComDigitosRepetidos() {
        ValidaCPF validaCPF = new ValidaCPF();
        boolean resultado = validaCPF.isCPF("11111111111");
        assertFalse(resultado);
    }

    @Test
    public void testaCPFInvalido() {
        ValidaCPF validaCPF = new ValidaCPF();
        boolean resultado = validaCPF.isCPF("12345678901");
        assertFalse(resultado);
    }
}
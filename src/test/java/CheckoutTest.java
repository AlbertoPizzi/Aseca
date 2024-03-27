import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckoutTest {
    @Test
    public void test001_CheckoutDeCarritoVacioDebeDar0(){
        Carrito unCarrito = new Carrito();
        double montoTotal = new Cashier().checkout(unCarrito);
        assertEquals(0, montoTotal , 0);
    }
}

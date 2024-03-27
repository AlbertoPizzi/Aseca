import org.testng.Assert.assertEquals
import org.testng.Assert.assertTrue
import org.testng.annotations.Test

//carrito de compras
/* cuando uno va a comprar al supermercado "jumbo"
los productos tienen varios precios.
el kilo tiene un precio
frutas y verduras algunas se cobran por unidad
tengo promos (3 x 2) cuales ?
ofertas 70% de descuento en la segunda unidad
Dias de la semana que hago un descuento sobre el ticket si me pagan con el banco frances
el desafio:
hacerlo con TDD
nivel 1: Factura, checkout
nivel 2: Stock, cuanto vale mi stock? hay que decidir como evaluar stock

 */
//class ShoppingTest {
//    @Test
//    fun createAShoppingListAndAddAnItem() {
//        val shopping = Shopping()
//        shopping.addItem("Bread", 0.0)
//        assertEquals(1, shopping.items.size)
//    }
//    @Test
//    fun connectAPriceToAnItem() {
//        val shopping = Shopping()
//        shopping.addItem("Bread" , 0.0)
//        shopping.addPrice("Bread", 2.0)
//        assertEquals(2.0, shopping.getPrice("Bread"))
//    }
//    @Test
//    fun productBuilder(){
//        val product = Product("sausage" , 15.0 )
//        assertEquals(product.name , "sausage")
//    }

//}
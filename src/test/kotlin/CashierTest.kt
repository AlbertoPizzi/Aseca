import org.testng.Assert.assertFalse
import org.testng.Assert.assertTrue
import org.testng.annotations.Test
import kotlin.system.exitProcess

class CashierTest {

@Test
fun test001_CreateAnEmptyShoppingCart(){
    val items = mutableMapOf<Product, Price>()
    val shoppingCart = Shopping(items)
    assertTrue(shoppingCart.isEmpty())
}
    @Test
    fun test002_WhenWantingToAddAnItemToShoppingCartItAddsIt(){
        val item = Product(123)
        val price = Price(20.0)
        val items = mutableMapOf<Product, Price>()
        val shopping = Shopping(items)
        shopping.addItem(item , price)
        assertTrue(shopping.items.containsKey(item))
    }
    @Test
    fun test003_WhenWantingToDeleteAnItemFromTheShoppingListYouCanAndReturnsEmpty() {
        val item = Product(123)
        val price = Price(20.0)
        val items = mutableMapOf<Product, Price>()
        val shopping = Shopping(items)
        shopping.addItem(item, price)
        assertTrue(shopping.items.containsKey(item))
        shopping.removeItem(item)
        assertTrue(shopping.isEmpty())
        assertFalse(shopping.items.containsKey(item))
    }
    @Test
    fun test004_WhenWantingToAddMoreThan1ItemItLetsYouDoIt() {
        val item = Product(123)
        val item2 = Product(1234)
        val item3 = Product(12345)
        val item4 = Product(123456)
        val price = Price(20.0)
        val items = mutableMapOf<Product, Price>()
        val shopping = Shopping(items)
        shopping.addItem(item, price)
        shopping.addItem(item2, price)
        shopping.addItem(item3, price)
        shopping.addItem(item4, price)
        assertTrue(shopping.items.containsKey(item))
        assertTrue(shopping.items.containsKey(item2))
        assertTrue(shopping.items.containsKey(item3))
        assertTrue(shopping.items.containsKey(item4))
    }


}
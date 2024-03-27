
class Shopping( val items: MutableMap<Product , Price> ) {

    fun addItem(item: Product , price: Price) {
        items.put(item, price)
    }

    fun addPrice(product: Product, price: Price) {
        items.replace(product , price)
    }

    fun getPrice(product: Product): Price? {
        return items.get(product)
    }

    fun isEmpty(): Boolean {
        return items.isEmpty()
    }

    fun removeItem(item : Product) {
        items.remove(item)
    }
}

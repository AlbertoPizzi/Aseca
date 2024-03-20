class Shopping {
    val items = mutableMapOf<String, Double>()

    fun addItem(item: String , price: Double) {
        items.put(item, price)
    }

    fun addPrice(s: String, d: Double) {
        items.replace(s , d)
    }

    fun getPrice(s: String): Double? {
        return items.get(s)
    }
}

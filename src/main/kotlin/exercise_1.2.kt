open class Product(val productName: String, val quantity: Int, val amountPerQuantity: Double)
{

    //primary constructor
    init {
        println("Primary constructor in Product: $productName, Quantity: $quantity, Amount per Quantity: $amountPerQuantity")
    }

    //secondary constructor
    constructor(productName: String, quantity: Int): this(productName, quantity, 0.0)
    {
        println("Secondary constructor in Product: $productName, Quantity: $quantity")
    }
}

//compulsory to write Product() not only Product if either primary constructor in parent class is exists or not
class Laptop(productName: String, quantity: Int, val cpuName: String, val ramSize: Int, val hddSize: Int, amountPerQuantity: Double): Product(productName, quantity, amountPerQuantity)
{

    //primary constructor
    init {
        println("Primary constructor in Laptop: $productName, Quantity: $quantity, Amount per Quantity: $amountPerQuantity")
    }

    //secondary constructor
    constructor(productName: String, quantity: Int, cpuName: String, ramSize: Int, hddSize: Int) : this(productName, quantity, cpuName, ramSize, hddSize, 0.0) {
        println("Secondary constructor in Laptop: $productName, CPU: $cpuName, RAM: $ramSize GB, HDD: $hddSize GB")
    }
}

fun main() {
    // Creating a list of 5 laptops
    val laptops = ArrayList<Laptop>()
    laptops.add(Laptop("Laptop A", 3, "Intel Core i7", 16, 512, 1500.0))
    laptops.add(Laptop("Laptop B", 2, "AMD Ryzen 5", 8, 256, 1200.0))
    laptops.add(Laptop("Laptop C", 1, "Intel Core i5", 8, 256))
    laptops.add(Laptop("Laptop D", 4, "Intel Core i9", 32, 1024, 2000.0))
    laptops.add(Laptop("Laptop E", 5, "AMD Ryzen 7", 16, 512, 1800.0))

    // Displaying information of all laptops
    println("Laptops Information:")
    for (laptop in laptops) {
        println("Product Name: ${laptop.productName}")
        println("Quantity: ${laptop.quantity}")
        println("Amount per Quantity: ${laptop.amountPerQuantity}")
        println("CPU Name: ${laptop.cpuName}")
        println("RAM Size: ${laptop.ramSize} GB")
        println("HDD Size: ${laptop.hddSize} GB")
        println("-----------------------------------")
    }
}
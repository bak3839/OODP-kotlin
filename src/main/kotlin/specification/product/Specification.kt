package specification.product

interface Specification {
    fun isSatisfiedBy(item: Product): Boolean
}

class CategorySpec(
    private val category: String,
): Specification {

    override fun isSatisfiedBy(item: Product): Boolean
    = item.category == category
}

class PriceSpec(
    private val maxPrice: Int
): Specification {
    override fun isSatisfiedBy(item: Product): Boolean
    = item.price <= maxPrice
}

class InStockSpec(): Specification {
    override fun isSatisfiedBy(item: Product): Boolean
    = item.stock > 0
}

class AndSpec(
    private val spec1: Specification,
    private val spec2: Specification,
): Specification {
    override fun isSatisfiedBy(item: Product): Boolean
    = spec1.isSatisfiedBy(item).and(spec2.isSatisfiedBy(item))
}

class NotSpec(
    private val spec: Specification
): Specification {
    override fun isSatisfiedBy(item: Product): Boolean
    = spec.isSatisfiedBy(item).not()
}

class OrSpec(
    private val spec1: Specification,
    private val spec2: Specification,
): Specification {
    override fun isSatisfiedBy(item: Product): Boolean
    = spec1.isSatisfiedBy(item).or(spec2.isSatisfiedBy(item))
}
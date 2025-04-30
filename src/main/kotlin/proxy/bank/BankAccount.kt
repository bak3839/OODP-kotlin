package proxy.bank

interface BankAccount {
    fun withdraw(amount: Double)
    fun deposit(amount: Double)
}

class RealBankAccount(
    private var balance: Double,
) : BankAccount {
    override fun withdraw(amount: Double) {
        if(balance >= amount) {
            balance -= amount
            println("$amount withdrawn. Current balance: $balance")
        } else {
            println("Insufficient balance")
        }
    }

    override fun deposit(amount: Double) {
        balance += amount
        println("$amount deposited. Current balance: $balance")
    }
}

class BankAccountProxy(
    private val userRole: String,
    private val initialBalance: Double,
) : BankAccount {
    private val realBankAccount = RealBankAccount(initialBalance)

    private fun hasAccess(): Boolean {
        return "Admin".lowercase() == userRole.lowercase()
    }

    // 입금, 출금 기능 모두 실제 클래스를 통해 실행
    override fun withdraw(amount: Double) {
        // 보안 절차를 추가
        if(hasAccess()) {
            realBankAccount.withdraw(amount)
        } else {
            println("Access denied. Only Admin can withdraw.")
        }
    }

    override fun deposit(amount: Double) {
        realBankAccount.deposit(amount)
    }
}
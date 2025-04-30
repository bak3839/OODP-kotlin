package proxy.bank

fun main() {
    // User with Admin access
    val adminAccount = BankAccountProxy("Admin", 1000.0)
    adminAccount.deposit(500.0)
    adminAccount.withdraw(300.0)

    val userAccount = BankAccountProxy("User", 1000.0)
    userAccount.deposit(500.0)
    userAccount.withdraw(300.0)
}
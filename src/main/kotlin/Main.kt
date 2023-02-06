
fun main(args: Array<String>) {
    println("Для начала работы введите команду /start")

    while (true) {
        val readLine = readLine()
        when (readLine) {
            "/start" -> {
                println("Здравствуйте")
                println("Введите команду /help для получения списка возможных команд")
            }
            
            "/help" -> println("/start - команда для приветстви, /end - команда для прекращения программы")

            "/end" -> break

            else -> {
                println("Программа не может отработать запрос, введите команду /help для получения списка возможных команд")
            }
        }
    }

}
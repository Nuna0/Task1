
    fun main(){
        println("Для начала работы введите команду /start")
        while (true) {
            val readLine = readLine()
            when (readLine) {
                "/start" -> {
                    println("Здравствуйте")
                    println("Введите команду /help для получения списка возможных команд")
                }
                "/help" -> println("/start - команда для приветстви, /end - команда для прекращения программы," +
                        " /return -- возвращает автомобиль, /park_info_by_car -- возвращает место, где припаркована" +
                        " машина, по ее номеру, /park_info_by_place -- возвращает информацию о машине по месту на парковке, " +
                        "/park -- паркует автомобиль на любое свободное место")

                "/end" -> break

                else -> {
                    println("Программа не может отработать запрос, введите команду /help для получения списка возможных команд")
                }
            }
        }
    }



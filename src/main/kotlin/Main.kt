
    fun main(){

        println("Для начала работы введите команду /start")
        while (true) {
            val readLine = readLine()
            val manager = Manager()
            when (readLine) {
                "/start" -> {
                    println("Здравствуйте")
                    println("Введите команду /help для получения списка возможных команд")
                }
                "/help" -> println("/start -- команда для приветстви,\n" +
                        "/end - команда для прекращения программы,\n" +
                        "/return -- возвращает автомобиль,\n" +
                        "/park_info_by_car -- возвращает место, где припаркована машина, по ее номеру,\n" +
                        "/park_info_by_place -- возвращает информацию о машине по месту на парковке,\n" +
                        "/park -- паркует автомобиль на любое свободное место")

                "/park"->{
                    while (true){
                        println("Введите марку машины")
                        val brand = readLine()
                        if (brand.isNullOrEmpty()){
                            println("Все поля должны быть заполнены, попробуйте снова")
                            break}
                        println("Введите цвет машины")
                        val color = readLine()
                        if (color.isNullOrEmpty()){
                            println("Все поля должны быть заполнены, попробуйте снова")
                            break}
                        println("Введите номер машины")
                        val numberCar = readLine()
                        if (numberCar.isNullOrEmpty()){
                            println("Все поля должны быть заполнены, попробуйте припарковаться снова")
                            break}
                        println("Введите владельца машины")
                        val owner = readLine()
                        if (owner!!.isEmpty()){
                            println("Все поля должны быть заполнены, попробуйте снова")
                            break}
                        val car = Car(brand = brand, color = color, numb = numberCar, owner=Owner(owner) )
                        manager.park(car)
                        break
                    }
                }
                "/park_info_by_car"->{
                    while (true){
                        println("Введите номер припаркованной машины")
                        val numbCar = readLine()
                        manager.parkInfoByCar(numbCar!!)
                        break
                    }
                }
                "/park_info_by_place"->{
                    while (true){
                        println("Введите номер парковочного места")
                        val place = readLine()
                        manager.parkInfoByPlace(place!!)
                        break
                    }
                }
                "/return"->{
                    println("Введите номер припаркованной машины")
                    val numb = readLine()
                    println("Введите имя владельца машины")
                    val owner = readLine()
                    manager.returnCar(numb, Owner(owner))
                }
                "/end" -> {
                    println("До свидания!")
                    break}

                else -> {
                    println("Программа не может отработать запрос, введите команду /help для получения списка возможных команд")
                }
            }
        }
    }



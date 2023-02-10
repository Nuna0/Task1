class Manager:Command {
    val park = Parking
    override fun park(car: Car){
        val key =  park.parking.filterValues {
            it ==null
        }.keys.first()
        park.parking[key] = car
        println("Машина ${car.brand} ${car.color} ${car.numb} припаркована  на месте $key")
        park.list.add(car)
    }
     override fun parkInfoByCar(numberCar: String) {
         val key:String? = park.parking.filterValues {
             it?.numb==numberCar
         }.keys.firstOrNull()
         val place = park.parking[key]?.numb
         if (place==numberCar){
             println("Машина припаркована на месте $key")

         }else{
             println("Машины с таким номмером нет на стоянке")
         }
    }
    override fun parkInfoByPlace(place: String) {
        val key = park.parking.filterKeys {
            it==place
        }.keys.firstOrNull()
        val car = park.parking[key]

        if (car!=null){
            println("На этом месте припаркована ${car.brand} ${car.color} ${car.numb} ")
        }else{
            if(key!=place){
                println("Такого парковочного места не существует, выберите одно из Р1-Р10")
            }else{
                println("Это парковочное место свободно")
            }
        }
    }
    override fun returnCar(numberCar: String?, owner: Owner?) {
        val key = park.parking.filterValues{
            it?.numb==numberCar && it?.owner==owner
        }.keys.firstOrNull()
        val car = park.parking[key]
        val kiy = park.parking.filterValues { it==car }.keys.first()
        park.parking[kiy] = null
        if (car!=null){
            println("Вы освободили парковочное место $key")
        }else{
            println("Вы неправильно ввели номер машины или имя владельца")
        }
    }
    override fun parkStats() {
        for ((key,value )in park.parking){
            if(value==null){
            println("$key = свободно")
            }else{
                println("$key = ${value.color} ${value.brand} ${value.numb}")
            }
        }
    }
    fun parkAllStats(){
        println("${park.list.size}")
    }
}
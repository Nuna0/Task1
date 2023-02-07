class Manager:Command {

    //val parking = mutableMapOf("P1" to 0 )
    override fun park(car: Car, owner: Owner) {

        super.park(car, owner)
    }
    override fun parkInfoByCar(numberCar: String) {
        super.parkInfoByCar(numberCar)
    }
    override fun parkInfoByPlace(place: String) {
        super.parkInfoByPlace(place)
    }
    override fun returnCar(owner: Owner) {
        super.returnCar(owner)
    }

}
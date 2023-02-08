interface Command {
    fun returnCar(numberCar:String?, owner: Owner?){

    }
    fun parkInfoByCar(numberCar: String){
    }
    fun parkInfoByPlace(place: String){}

    fun park(car:Car) {

    }

}
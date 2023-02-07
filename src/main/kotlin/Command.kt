interface Command {
    fun returnCar(owner: Owner){}
    fun parkInfoByCar(numberCar: String){
    }
    fun parkInfoByPlace(place: String){}

    fun park(car:Car, owner:Owner){

    }

}
sealed trait Vehicule2 {
  val registration : String
}
case class Car(registration:String,model:String,power:Int)extends Vehicule
case class Boat(registration: String,model:String,power:Int)extends Vehicule
case class Moto(registration: String,model:String,power:Int)extends Vehicule
package cuyo.yimmy.xcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}

fun main(){

    //tipo variable entera
    var edad:Int
    var edad1:Int = 11
    var factorial:Long


    //tipo variable de punto flotante
    var peso: Float = 12.2f
    var interes: Double

    //tipo de variable caracter
    var simbolo:Char
    var simbolo1:Char ='@'

    println("hola")
    for(i in 1..edad1)
        print(i)
}
class Persona{
    var tipo: String = ""
    var numeroDocumento: String = ""
    var nombre: String = ""

}
class estudiante{
    var codigo:String = ""
}



//Valores nullable
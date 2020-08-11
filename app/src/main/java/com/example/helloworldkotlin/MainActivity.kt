package com.example.helloworldkotlin

import android.os.Bundle
import android.util.Log
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))


       // Log.d ("EJEMPLO","NOMBRE")

      //  Toast.makeText(this,"esto es un toast",Toast.LENGTH_LONG).show()




        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }

    }

    // trabajo en clases "desafio kotlin"

    val tagLog = "Desafio Kotlin"
    fun printLogAndroid(tag:String, resultado: String){

        Log.d(tagLog+" "+tag,resultado)

    }


    fun getName(name:String) : String {
        return "minombre es: $name"
    }

    fun getNameSomething(name: String, apellido: String, edad: Int): String {
        return "mi nombre es $name $apellido  y tengo $edad"

    }

    // 4 declarar numeros

        var num1 = 10
        var num2 = 20
        var num3 = 30
    }

// 5. imprimir suma de los numeros

    fun getNumbers (num1: Int, num2: Int, num3: Int): Int {
        return num1 + num2 + num3
    }

   

    fun sumadeVariables(){

// 6 Declarar una variable string y otra char
        var nameOne : String
        var LetterOne : Char

    }

 // 7 Asignar valor “Arataka Reigen”  variable String y “A” a la variable Char

    fun asignarVariable () {
        var A = "Arakata Reigen"
        var a = 'A'
    }

//8. Imprimir cantidad de caracteres que tiene la variable String y modificar. y char a otro valor distinto.


//9. Declarar una variable de tipo Float de forma explícita.
 fun numberFloat() {

    var floatNum: Float
}

//10. Asignar un valor a la variable Float.

   floatNum = 8.8f
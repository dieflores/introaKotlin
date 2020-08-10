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

    // trabajo en clases "desafio"

    fun getName(name:String) : String {
        return "minombre es: $name"
    }

    fun getNameSomething(name: String, apellido: String, edad: Int): String {
        return "mi nombre es $name $apellido  y tengo $edad"
    }

    fun declararNumero () {
        var num1 = 10
        var num2 = 20
        var num3 = 30
    }

    fun getNumbers (num1: Int, num2: Int, num3: Int): Int {
        return num1 + num2 + num3
    }

    Log.d

    fun sumadeVariables(){

    }
    fun asignarVariable () {
        var A = "Arakata Reigen"
        var a = A
    }
}

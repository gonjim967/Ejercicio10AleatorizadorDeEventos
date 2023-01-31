package com.example.ejercicio10aleatorizadordeeventos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlin.random.Random
import com.example.ejercicio10aleatorizadordeeventos.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    final lateinit var binding: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)
        var numDado=0
        var encontrar=""
        binding.button5.setOnClickListener{

            numDado=tirarDado()

            if (numDado.equals(1)){
                encontrar = "Has encontrado un Objeto"
            }
            else if (numDado.equals(2)){
                encontrar = "Has encontrado una Ciudad"
            }
            else if (numDado.equals(3)){
                encontrar = "Has encontrado un Mercader"
            }
            else{
                encontrar = "Te has encontrado a un enemigo"
            }
            Toast.makeText(this, encontrar, Toast.LENGTH_SHORT).show()
        }

    }

    fun tirarDado(): Int {

        var numMin=1
        var numMax=5

        var numDado=0

        numDado=Random.nextInt(numMin, numMax)


        return numDado
    }
}
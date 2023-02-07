package com.example.ejercicio10aleatorizadordeeventos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejercicio10aleatorizadordeeventos.databinding.ActivityObjetoBinding

class ObjetoActivity : AppCompatActivity() {
    final lateinit var binding: ActivityObjetoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_objeto)

        binding = ActivityObjetoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button6.setOnClickListener{
            var objeto = "cuchillo"
            val vistaMain5 = Intent(this, MainActivity5::class.java)
            startActivity(vistaMain5)
        }

        binding.button8.setOnClickListener{
            val vueltaAlDado = Intent(this, MainActivity4::class.java)
            startActivity(vueltaAlDado)
        }
    }
}
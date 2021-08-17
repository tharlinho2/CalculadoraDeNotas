package com.tharles.calculadoradenotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.tharles.calculadoradenotas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    binding.btCalcular.setOnClickListener {

        val num1 = binding.nota1
        val num2 = binding.nota2
        val num3 = binding.nota3
        val num4 = binding.nota4
        val faltas = binding.faltas
        val resultado = binding.txtResultado

        val nota1 = Integer.parseInt(num1.text.toString())
        val nota2 = Integer.parseInt(num2.text.toString())
        val nota3 = Integer.parseInt(num3.text.toString())
        val nota4 = Integer.parseInt(num4.text.toString())
        val numeroFaltas = Integer.parseInt(faltas.text.toString())

        val media = (nota1 + nota2 + nota3 + nota4) /4

        if (media >=5 && numeroFaltas <=20){
            resultado.setText("Aluno foi Aprovado \n Média final $media")
            resultado.setTextColor(getColor(R.color.green))
        }else if (numeroFaltas >20){
            resultado.setText("Aluno foi Reprovado por faltas \n Média final $media")
            resultado.setTextColor(getColor(R.color.red))
        }else if (media <5){
            resultado.setText("Aluno foi Reprovado por nota \n Média final $media")
            resultado.setTextColor(getColor(R.color.red))
        }


    }


    }
}
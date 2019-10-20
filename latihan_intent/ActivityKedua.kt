package com.example.latihanintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kedua.*
import java.lang.NumberFormatException

class ActivityKedua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        val bundle: Bundle? = intent.extras
        val nim = bundle?.get("nim")
        val nama = bundle?.get("nama")
        val nilai = bundle?.get("nilai")

        this.nim.setText(nim.toString())
        this.nama.setText(nama.toString())

        try {
            val b = nilai.toString()
            this.nilai_angka.setText(b)
            val a = nilai.toString().toInt()
            if (a>=80 && a<=100){
                this.keterangan.setText("A")
            } else if (a>=60 && a<80){
               this.keterangan.setText("B")
            } else if (a>=40 && a<60){
                this.keterangan.setText("C")
            } else if (a>=20 && a<40){
               this.keterangan.setText("D")
            } else if (a>=0 && a<20){
                this.keterangan.setText("E")
           } else {
                this.keterangan.setText("Nilai Salah!")
            }
        } catch (e:NumberFormatException){
            this.nilai_angka.setText("Nilai Salah!")
            this.keterangan.setText("Nilai Salah!")
        }

        back_button.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}

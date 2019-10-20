package com.example.latihanintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tombol.setOnClickListener(){
            var nama2 = nama.text.toString()
            var nim2 = nim.text.toString()
            var nilai2 = nilai.text.toString()
            intent = Intent(this, ActivityKedua::class.java)
            intent.putExtra("nama",nama2)
            intent.putExtra("nim",nim2)
            intent.putExtra("nilai",nilai2)
            startActivity(intent)
        }
    }
}
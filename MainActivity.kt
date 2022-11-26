package com.example.taksimetreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    var tutar : Double = 0.0
    var min_tutar : Int = 20
    var acilis_ucret : Int =10
    val km : Double = 2.20
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mesafe:EditText=findViewById(R.id.km_bilgisi)
        val kmHesaplama:Button=findViewById(R.id.btn_hesapla)
        val tutarHsp : TextView=findViewById(R.id.sonuc)

        kmHesaplama.setOnClickListener {
            val mesafe: Int = Integer.parseInt(mesafe.text.toString())
            val isonuc = tutar
    if(mesafe <=0){
        tutarHsp.setText("Yolculuk İptal Edildi.")
    }else if (mesafe<=10){
        tutarHsp.setText("Ödenecek Tutar:"+"\n"+min_tutar+" TL")
    }else if (mesafe > 10){
        tutar = (mesafe*km) + acilis_ucret
        tutarHsp.setText("Ödenecek Tutar: "+"\n"+tutar+" TL")
    }
        }
    }
}
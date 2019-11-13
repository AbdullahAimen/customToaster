package com.pl.cusomtoaster

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.pl.customtoaster.CustomToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toaster = CustomToast.Builder()
            .setBackGroundRes(R.drawable.bg_rounded_toast)
            .setTextColorRes(R.color.colorToastTxt)
            .build(this)

        findViewById<TextView>(R.id.displayToast).setOnClickListener {
            toaster.show("Welcome!", CustomToast.LENGTH_LONG)
        }
    }
}

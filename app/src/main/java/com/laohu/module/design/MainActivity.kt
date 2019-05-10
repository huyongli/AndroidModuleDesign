package com.laohu.module.design

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.laohu.module.module1.Module1MainActivity
import com.laohu.module.module2.Module2MainActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {
            startActivity(Intent(this@MainActivity, Module1MainActivity::class.java))
        }

        btn2.setOnClickListener {
            startActivity(Intent(this@MainActivity, Module2MainActivity::class.java))
        }
    }
}

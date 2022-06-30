package dev.christine.upesi_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    lateinit var tvbookNow:TextView
    lateinit var tvQuick:TextView
    lateinit var imgwait:ImageView
    lateinit var btnempty:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        btnempty = findViewById(R.id.btnempty)
        btnempty.setOnClickListener {
            val intent = Intent(this,PageActivity1::class.java)
            startActivity(intent)
        }
    }
}

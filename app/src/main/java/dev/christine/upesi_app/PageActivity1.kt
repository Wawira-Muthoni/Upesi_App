package dev.christine.upesi_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class PageActivity1 : AppCompatActivity() {
    lateinit var btnprv:Button
    lateinit var btnnxt:Button
    lateinit var imgCiti:ImageView
    lateinit var tvFrom:TextView
    lateinit var tvTo:TextView
    lateinit var tvDepart:TextView
    lateinit var etAddL:EditText
    lateinit var etAddC:EditText
    lateinit var etDepart:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)
        btnprv = findViewById(R.id.btnprv)
        btnnxt = findViewById(R.id.btnnxt)
        btnprv.setOnClickListener {
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        btnnxt.setOnClickListener {
            val intent = Intent(this,PageActivity2::class.java)
            startActivity(intent)
        }

    }
}

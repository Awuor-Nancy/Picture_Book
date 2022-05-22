package Pic_book.com.picture_book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btn_Explore:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_Explore = findViewById(R.id.btn_Explore)
        btn_Explore.setOnClickListener {
            val intent=Intent(this,About_Activity2::class.java)
            startActivity(intent)
        }

    }
}
package Pic_book.com.picture_book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Deliver_Activity4 : AppCompatActivity() {
    lateinit var btn_Home:Button
    lateinit var btn_call:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deliver2)
        btn_Home = findViewById(R.id.btn_Home)
        btn_Home.setOnClickListener {
            val intent = Intent(this,Services_Activity3::class.java)
            startActivity(intent)
        }
        btn_call = findViewById(R.id.btn_call)
        btn_call.setOnClickListener {
            val intent = Intent(this,contact_Activity5::class.java)
            startActivity(intent)
        }

    }
}
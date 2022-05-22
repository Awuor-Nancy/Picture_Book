package Pic_book.com.picture_book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Call_Activity5 : AppCompatActivity() {
    lateinit var btn_Prev:Button
    lateinit var btn_home:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call2)

        btn_home = findViewById(R.id.btn_Home)
        btn_home.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btn_Prev = findViewById(R.id.btn_Prev)
        btn_Prev.setOnClickListener {
            val intent = Intent(this,Deliver_Activity4::class.java)
            startActivity(intent)
        }
    }
}
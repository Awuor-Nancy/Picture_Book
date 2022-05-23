package Pic_book.com.picture_book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class contact_Activity5 : AppCompatActivity() {
    lateinit var btn_Start :Button
    lateinit var btn_Order :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact5)
        btn_Start = findViewById(R.id.btn_Start)
        btn_Start.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btn_Order = findViewById(R.id.btn_Order)
        btn_Order.setOnClickListener {
            val intent =Intent(this,Deliver_Activity4::class.java)
        }
    }
}
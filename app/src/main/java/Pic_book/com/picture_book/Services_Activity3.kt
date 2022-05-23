package Pic_book.com.picture_book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Services_Activity3 : AppCompatActivity() {
    lateinit var btn_Behind : Button
    lateinit var btn_Ahead: Button
      override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_services2)

          btn_Behind = findViewById(R.id.btn_Behind)
          btn_Behind.setOnClickListener {
              val intent = Intent(this,About_Activity2::class.java)
              startActivity(intent)
          }

          btn_Ahead = findViewById(R.id.btn_Ahead)
          btn_Ahead.setOnClickListener {
              val intent = Intent(this,Deliver_Activity4::class.java)
              startActivity(intent)
          }

      }
 }

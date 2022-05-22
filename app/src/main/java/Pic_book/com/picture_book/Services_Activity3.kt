package Pic_book.com.picture_book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Services_Activity3 : AppCompatActivity() {
    lateinit var btn_Back : Button
    lateinit var btn_Next: Button
      override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_services2)

          btn_Next = findViewById(R.id.btn_Next)
          btn_Next.setOnClickListener {
              val intent = Intent(this,Deliver_Activity4::class.java)
              startActivity(intent)
          }

          btn_Back = findViewById(R.id.btn_Back)
          btn_Back.setOnClickListener {
              val intent = Intent(this,About_Activity2::class.java)
              startActivity(intent)
          }

      }
 }

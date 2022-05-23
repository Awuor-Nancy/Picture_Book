package Pic_book.com.picture_book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class About_Activity2 : AppCompatActivity() {
    lateinit var btn_Next: Button
    lateinit var btn_Previous: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about2)

        setContentView(R.layout.activity_about2)
        btn_Next = findViewById(R.id.btn_Next)
        btn_Next.setOnClickListener {
            val intent = Intent(this, Services_Activity3::class.java)
            startActivity(intent)

        }
        btn_Previous = findViewById(R.id.btn_Previous)
        btn_Previous.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
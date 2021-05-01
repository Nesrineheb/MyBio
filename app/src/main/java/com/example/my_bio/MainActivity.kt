package com.example.my_bio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name = findViewById<TextView>(R.id.textView2)
        var bio = findViewById<TextView>(R.id.textView)
        var image = findViewById<ImageView>(R.id.imageView)
        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener{
            println("button 2 clicked !")

            val rnds = (1..5).random()
            if (rnds==1){
                name.text = resources.getString(R.string.person_name_1)
                bio.text = resources.getString(R.string.person_bio_1)
                image.setImageDrawable(getResources().getDrawable(R.drawable.karl_marx))
            }else if (rnds==2) {
                name.text = resources.getString(R.string.person_name_2)
                bio.text = resources.getString(R.string.person_bio_2)
                image.setImageDrawable(getResources().getDrawable(R.drawable.ho_chi_minh))
            }
            else if (rnds==3) {
                name.text = resources.getString(R.string.person_name_3)
                bio.text = resources.getString(R.string.person_bio_3)
                image.setImageDrawable(getResources().getDrawable(R.drawable.che))
            }
            else if (rnds==4) {
                name.text = resources.getString(R.string.person_name_4)
                bio.text = resources.getString(R.string.person_bio_4)
                image.setImageDrawable(getResources().getDrawable(R.drawable.malcom_x))
            }
            else if (rnds==5) {
                name.text = resources.getString(R.string.person_name_5)
                bio.text = resources.getString(R.string.person_bio_5)
                image.setImageDrawable(getResources().getDrawable(R.drawable.valentina))
            }
        }
    }
}
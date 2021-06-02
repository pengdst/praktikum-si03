package io.github.pengdst.praktikumbp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {

    lateinit var buttonClose: Button
    lateinit var buttonImplicit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        buttonClose = findViewById(R.id.btn_close)
        buttonImplicit = findViewById(R.id.btn_implicit)

        buttonImplicit.setOnClickListener {
            val intentOpenBrowser = Intent(Intent.ACTION_VIEW, Uri.parse("http://youtube.com"))
            startActivity(intentOpenBrowser)
        }
        buttonClose.setOnClickListener {
            finish()
        }
    }
}
package com.wdfc.chattingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var email_login:TextView
    private lateinit var password_login: TextView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        overridePendingTransition(R.anim.fadein , R.anim.righttoleft)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //goes to billboard *********************
       startActivity(Intent(this, billboard :: class.java))
        finish()
        //goes to billboard *********************


        
    }

}

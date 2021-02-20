package com.isen.m2.handfullproject.handfullprojectandroidapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    val connected = "Connecté"
    val disconnected = "Déconnecté"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        home_btn_profiles.setOnClickListener {
            /**
             * TODO : Créer l'activité Manage Profil et la Linker
             */
            val intent= Intent(this, HomeActivity::class.java)
            startActivity(intent)
//            finish()
        }
        home_btn_prosthesis.setOnClickListener{
            val intent= Intent(this, ProsthesisActivity::class.java)
            startActivity(intent)
        }
        btn_exit.setOnClickListener {
            /**
             * TODO : Déconnecter l'utilisateur
             */
            val intent= Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}
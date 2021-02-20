package com.isen.m2.handfullproject.handfullprojectandroidapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_login.*
import okhttp3.*


class LoginActivity : AppCompatActivity() {

    companion object{
        const val url = "https://192.168.0.40:8080/user/login"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        /**
         * Bouton "Accès hors ligne"
         */
        login_btn_offline_access.setOnClickListener {
            val sharedPreferences = getSharedPreferences("accessMode", Context.MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putBoolean("offline", true)
            editor.apply()
            val intent= Intent(this, HomeActivity::class.java)
            startActivity(intent)
//            finish()
        }

        login_btn_register.setOnClickListener {
            val intent= Intent(this, RegisterActivity::class.java)
            startActivity(intent)
//            finish()
        }

        login_btn_validate.setOnClickListener {
            tryRequest()
//            avecOkHttp()
        }
    }
    /*// Non fonctionnel
    private fun avecOkHttp()
    {
        val client = OkHttpClient()
            .newBuilder().certificatePinner(
                certificatePinner = CertificatePinner.Builder()
                    .add("192.168.0.40", "sha256/gJMHlpKAo5lCh0lgWwrxk5ed/naLtQ32IKP5yA4cXNQ=")
                    .build()
            ).build()
        val request = Request.Builder()
            .url("https://192.168.0.40:8080/user/login")
            .build()
        val call: Call = client.newCall(request)
        val response: Response = call.execute()
        print(response.body.toString())
    }*/
    private fun tryRequest()
    {
        val queue = Volley.newRequestQueue(this)

        // Request a string response from the provided URL.
        val request = StringRequest(
            Request.Method.GET,
            url,
            Response.Listener<String> { print(it.toString()) },
            Response.ErrorListener { Log.d("error", it.toString()) }
        )
        // Add the request to the RequestQueue.
        queue.add(request)
    }

}
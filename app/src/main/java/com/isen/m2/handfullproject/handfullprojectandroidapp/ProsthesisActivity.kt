package com.isen.m2.handfullproject.handfullprojectandroidapp

import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_manage_prosthesis.*

class ProsthesisActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manage_prosthesis)

        initializeProgressBar()
    }

    fun initializeProgressBar(){
        pros_edit_motor_1.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                pros_text_degre_motor_1.text = "$progress"
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                Toast.makeText(applicationContext,"Start tracking",Toast.LENGTH_SHORT)
            }
            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                Toast.makeText(applicationContext,"Stop tracking",Toast.LENGTH_SHORT)
            }
        })
        pros_edit_motor_2.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                pros_text_degre_motor_2.text = "$progress"
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                Toast.makeText(applicationContext,"Start tracking",Toast.LENGTH_SHORT)
            }
            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                Toast.makeText(applicationContext,"Stop tracking",Toast.LENGTH_SHORT)
            }
        })
        pros_edit_motor_3.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                pros_text_degre_motor_3.text = "$progress"
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                Toast.makeText(applicationContext,"Start tracking",Toast.LENGTH_SHORT)
            }
            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                Toast.makeText(applicationContext,"Stop tracking",Toast.LENGTH_SHORT)
            }
        })
    }
}
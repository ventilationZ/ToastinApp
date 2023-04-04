package com.example.toastingapp_mutai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var display_text:TextView
    private lateinit var edt_input_data:EditText
    private lateinit var submitbutton:Button
    private lateinit var buttontwo:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display_text= findViewById(R.id.txtdisplay)
        edt_input_data= findViewById(R.id.edtdata)
        submitbutton= findViewById(R.id.btnsubmit)
        buttontwo=findViewById(R.id.btn2)


        buttontwo.setOnClickListener {
            Toast.makeText(this, "Command", Toast.LENGTH_SHORT).show()
        }

        submitbutton.setOnClickListener {
         Toast.makeText(this,"Elijah",Toast.LENGTH_SHORT).show()}

    }
}
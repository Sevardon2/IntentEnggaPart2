package com.engga.intentengga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

class MoveForResultActivity : AppCompatActivity() {
    var rgLanguage: RadioGroup? = null
    lateinit var radioButton: RadioButton
    private lateinit var btnChoose: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_for_result)

        rgLanguage = findViewById(R.id.rg_language)
        btnChoose = findViewById(R.id.btn_choose)
        btnChoose.setOnClickListener {
            val selectOption: Int = rgLanguage!!.checkedRadioButtonId
            radioButton = findViewById(selectOption)

            val intent = Intent(this, MainActivity::class.java)
            val bundle = Bundle()
            bundle.putString("Bahasa", radioButton.text as String?)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}
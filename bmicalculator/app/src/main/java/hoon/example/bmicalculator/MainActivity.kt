package hoon.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etHeight: EditText = findViewById(R.id.et_height)
        val etWeight: EditText = findViewById(R.id.et_weight)
        val btnConfirm: Button = findViewById(R.id.btn_result)

        btnConfirm.setOnClickListener {
            Log.d("MainActivity", "btn click ! ")

            if (etHeight.text.isEmpty() || etWeight.text.isEmpty()) {
                Toast.makeText(this, "value is null", Toast.LENGTH_SHORT).show()
                return@setOnClickListener // setOnclickListener 에서 return 의미
            }

            val height:Int = etHeight.text.toString().toInt()
            val weight:Int = etWeight.text.toString().toInt()
            Log.d("MainActivity", "height : $height , weight: $weight ")


        }

    }
}
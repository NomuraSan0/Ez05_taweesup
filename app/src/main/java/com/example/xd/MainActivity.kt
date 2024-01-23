package com.example.xd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text:TextView = findViewById(R.id.Text)

        val plus: Button = findViewById(R.id.Bp)
        val minus: Button = findViewById(R.id.Bs)
        val multiply: Button = findViewById(R.id.Bm)
        val divder: Button = findViewById(R.id.Bd)
        val modulo: Button = findViewById(R.id.Bmod)
        val clear: Button = findViewById(R.id.BC)
        val equal: Button = findViewById(R.id.B)
        val Del: Button = findViewById(R.id.BDel)

        val n1: Button = findViewById(R.id.B1)
        val n2: Button = findViewById(R.id.B2)
        val n3: Button = findViewById(R.id.B3)
        val n4: Button = findViewById(R.id.B4)
        val n5: Button = findViewById(R.id.B5)
        val n6: Button = findViewById(R.id.B6)
        val n7: Button = findViewById(R.id.B7)
        val n8: Button = findViewById(R.id.B8)
        val n9: Button = findViewById(R.id.B9)
        val n0: Button = findViewById(R.id.B0)
        val ndot: Button = findViewById(R.id.Bdot)

        var nc = "0"
        var om1 = ""
        var om2 = ""
        var o = ""
        var dot:Boolean = false

        clear.setOnClickListener {
            nc = "0"
            text.setText("0")
            dot = false

        }

        n1.setOnClickListener {
            if(nc == "0"){
                nc ="1"
                text.setText("1")
            }else{
                nc += "1"
                text.text = nc
            }

        }

        n2.setOnClickListener {
            if(nc == "0"){
                nc ="2"
                text.setText("2")
            }else{
                nc += "2"
                text.text = nc
            }
        }

        n3.setOnClickListener {
            if(nc == "0"){
                nc ="3"
                text.setText("3")
            }else{
                nc += "3"
                text.text = nc
            }
        }

        n4.setOnClickListener {
            if(nc == "0"){
                nc ="4"
                text.setText("4")
            }else{
                nc += "4"
                text.text = nc
            }
        }

        n5.setOnClickListener {
            if(nc == "0"){
                nc ="5"
                text.setText("5")
            }else{
                nc += "5"
                text.text = nc
            }
        }

        n6.setOnClickListener {
            if(nc == "0"){
                nc ="6"
                text.setText("6")
            }else{
                nc += "6"
                text.text = nc
            }
        }

        n7.setOnClickListener {
            if(nc == "0"){
                nc ="7"
                text.setText("7")
            }else{
                nc += "7"
                text.text = nc
            }
        }

        n8.setOnClickListener {
            if(nc == "0"){
                nc ="8"
                text.setText("8")
            }else{
                nc += "8"
                text.text = nc
            }
        }

        n9.setOnClickListener {
            if(nc == "0"){
                nc ="9"
                text.setText("9")
            }else{
                nc += "9"
                text.text = nc
            }
        }

        n0.setOnClickListener {
            if(nc == "0"){
                nc ="0"
                text.setText("0")
            }else{
                nc += "0"
                text.text = nc
            }
        }

        ndot.setOnClickListener {
            if (dot == false) {
                nc += "."
                text.setText(nc)
                dot = true
            }
        }

        Del.setOnClickListener {
            if (nc.length >1) {
                nc = nc.substring(0, nc.length - 1)
                text.setText(nc)
            }else{
            text.setText("0")
                nc =""
            }
        }
        plus.setOnClickListener {
            o = "+"
            om1 = nc
            nc = ""
            text.text = "0"
            dot = false
        }

        minus.setOnClickListener {
            o = "-"
            om1 = nc
            nc = ""
            text.text = "0"
            dot = false
        }

        multiply.setOnClickListener {
            o = "*"
            om1 = nc
            nc = ""
            text.text = "0"
            dot = false
        }

        divder.setOnClickListener {
            o = "/"
            om1 = nc
            nc = ""
            text.text = "0"
            dot = false
        }

        modulo.setOnClickListener {
            o = "%"
            om1 = nc
            nc = ""
            text.text = "0"
            dot = false
        }


        equal.setOnClickListener {
            om2 = nc
            var result = 0.0
            try {
                when (o) {

                    "+" -> result = om1.toDouble() + om2.toDouble()
                    "-" -> result = om1.toDouble() - om2.toDouble()
                    "*" -> result = om1.toDouble() * om2.toDouble()
                    "/" -> {
                        if (om2.toDouble() == 0.0) {
                            text.text = "Error: Division by zero"
                        } else {
                            result = om1.toDouble() / om2.toDouble()
                        }
                    }
                    "%" -> result = om1.toDouble() % om2.toDouble()
                }

                text.text = result.toString() // Display the result
            } catch (e: NumberFormatException) {
                text.text = "Error: Invalid input"
            }

            om1 = result.toString()
            nc = result.toString()
        }

    }
}

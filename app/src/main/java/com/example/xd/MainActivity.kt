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

        var nc = " "
        var om1 = ""
        var om2 = ""
        var o = ""

        clear.setOnClickListener {
            nc = ""
            text.setText("0")

        }

        n1.setOnClickListener {
            nc += "1"
            text.text = nc

        }

        n2.setOnClickListener {
            nc += "2"
            text.text = nc
        }

        n3.setOnClickListener {
            nc += "3"
            text.text = nc
        }

        n4.setOnClickListener {
            nc += "4"
            text.text = nc
        }

        n5.setOnClickListener {
            nc += "5"
            text.text = nc
        }

        n6.setOnClickListener {
            nc += "6"
            text.text = nc
        }

        n7.setOnClickListener {
            nc += "7"
            text.text = nc
        }

        n8.setOnClickListener {
            nc += "8"
            text.text = nc
        }

        n9.setOnClickListener {
            nc += "9"
            text.text = nc
        }

        n0.setOnClickListener {
            if(nc == ""){
                nc =""
            }else{
                nc += 0
                text.text = nc
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
        }

        minus.setOnClickListener {
            o = "-"
            om1 = nc
            nc = ""
            text.text = "0"
        }

        multiply.setOnClickListener {
            o = "*"
            om1 = nc
            nc = ""
            text.text = "0"
        }

        divder.setOnClickListener {
            o = "/"
            om1 = nc
            nc = ""
            text.text = "0"
        }

        modulo.setOnClickListener {
            o = "%"
            om1 = nc
            nc = ""
            text.text = "0"
        }


        fun calculateResult() {
            var result = 0.0
            try {
                if (om2.isNotEmpty()) {
                    when (o) {
                        "+" -> result = om1.toDouble() + om2.toDouble()
                        "-" -> result = om1.toDouble() - om2.toDouble()
                        "*" -> result = om1.toDouble() * om2.toDouble()
                        "/" -> {
                            if (om2.toDouble() == 0.0) {
                                text.text = "Error: Division by zero"
                                return
                            } else {
                                result = om1.toDouble() / om2.toDouble()
                            }
                        }
                        "%" -> result = om1.toDouble() % om2.toDouble()
                    }
                } else {

                    result = om1.toDouble()
                }

                text.text = result.toString()
            } catch (e: NumberFormatException) {
                text.text = "Error: Invalid input"
            }
        }
        equal.setOnClickListener {
            om2 = nc
            calculateResult()
        }

    }
}

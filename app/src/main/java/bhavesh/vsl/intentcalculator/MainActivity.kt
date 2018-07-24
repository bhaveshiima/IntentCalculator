package bhavesh.vsl.intentcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sum [ START ]
        btnSum.setOnClickListener {
            var txt1Val = txt1.text.toString().toInt()
            var txt2Val = txt2.text.toString().toInt()
            txtAnswer.text = "${txt1Val + txt2Val}"
        }
        // Sum [ END ]

        // Sub [ START ]
        btnSub.setOnClickListener {
            var txt1val1 = txt1.text.toString().toInt()
            var txt2val1 = txt2.text.toString().toInt()
            txtAnswer.text = "${txt1val1 - txt2val1}"
        }
        // Sub [ END ]


        // Multiplucation [ START ]
        btnMul.setOnClickListener {
            var txt1val2 = txt1.text.toString().toInt()
            var txt2val2 = txt2.text.toString().toInt()
            txtAnswer.text = "${txt1val2 * txt2val2}"
        }
        // Multiplucation [ END ]



    }



}

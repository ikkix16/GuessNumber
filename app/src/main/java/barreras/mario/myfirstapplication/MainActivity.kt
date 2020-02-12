package barreras.mario.myfirstapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    var counter: Int = 0
    var num: Int=0



    override fun onCreate(savedInstanceState: Bundle?) {

        var Minimo: Int=0
        var Maximo: Int=100

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val label:TextView = findViewById(R.id.etiqueta) as TextView
        val label2:TextView = findViewById(R.id.numMax) as TextView
        val label3:TextView = findViewById(R.id.numMinimo) as TextView

        val low: Button  = findViewById(R.id.low) as  Button
        val high: Button  = findViewById(R.id.high) as  Button
        val generate: Button  = findViewById(R.id.generate) as  Button


        generate.setOnClickListener {
            var num:Int = Random.nextInt(Minimo,Maximo)
            label.setText(""+num+"")

        }

        low.setOnClickListener {
            Minimo=num
            label3.setText(""+num+"")
        }
        high.setOnClickListener {
            Maximo=num
            label2.setText(""+num+"")
        }






        }


    }




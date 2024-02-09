package mx.edu.itson.preexamencalculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val result: TextView =findViewById(R.id.tvNum)
        val num: TextView =findViewById(R.id.tvResultado)


        val b0: Button =findViewById(R.id.btn0)
        val b1: Button =findViewById(R.id.btn1)
        val b2: Button =findViewById(R.id.btn2)
        val b3: Button =findViewById(R.id.btn3)
        val b4: Button =findViewById(R.id.btn4)
        val b5: Button =findViewById(R.id.btn5)
        val b6: Button =findViewById(R.id.btn6)
        val b7: Button =findViewById(R.id.btn7)
        val b8: Button =findViewById(R.id.btn8)
        val b9: Button =findViewById(R.id.btn9)

        val bSuma: Button =findViewById(R.id.btnSuma)
        val bDivision: Button =findViewById(R.id.btnDivision)
        val bResta: Button =findViewById(R.id.btnResta)
        val bMultiplicacion: Button =findViewById(R.id.btnMultiplicacion)

        val bIgual: Button =findViewById(R.id.btnIgual)

        b0.setOnClickListener{
            if (num.text.isEmpty())
                num.setText("0")
            else
            num.setText(result.text.toString() + "0")
        }
        b1.setOnClickListener{
            if (num.text.isEmpty())
                num.setText("1")
            else
                num.setText(result.text.toString() + "1")
        }
        b2.setOnClickListener{
            if (num.text.isEmpty())
                num.setText("2")
            else
                num.setText(result.text.toString() + "2")
        }
        b3.setOnClickListener{
            if (num.text.isEmpty())
                num.setText("3")
            else
                num.setText(result.text.toString() + "3")
        }
        b4.setOnClickListener{
            if (num.text.isEmpty())
                num.setText("4")
            else
                num.setText(result.text.toString() + "4")
        }
        b5.setOnClickListener{
            if (num.text.isEmpty())
                num.setText("5")
            else
                num.setText(result.text.toString() + "5")
        }
        b6.setOnClickListener{
            if (num.text.isEmpty())
                num.setText("6")
            else
                num.setText(result.text.toString() + "6")
        }
        b7.setOnClickListener{
            if (num.text.isEmpty())
                num.setText("7")
            else
                num.setText(result.text.toString() + "7")
        }
        b8.setOnClickListener{
            if (num.text.isEmpty())
                num.setText("8")
            else
                num.setText(result.text.toString() + "8")
        }
        b9.setOnClickListener{
            if (num.text.isEmpty())
                num.setText("9")
            else
                num.setText(result.text.toString() + "9")
        }

        bSuma.setOnClickListener{
            if (num.text.isEmpty())
                num.setText("No puedes sumar teclea un numero")
            else{
             result.setText(num.text.toString()+"+")
            }
        }
        bDivision.setOnClickListener{
            if (num.text.isEmpty())
                num.setText("No puedes dividir teclea un numero")
            else{
                result.setText(num.text.toString()+"/")
            }
        }
        bResta.setOnClickListener{
            if (num.text.isEmpty())
                num.setText("No puedes restar teclea un numero")
            else{
                result.setText(num.text.toString()+"-")
            }
        }
        bMultiplicacion.setOnClickListener{
            if (num.text.isEmpty())
                num.setText("No puedes multiplicar teclea un numero")
            else{
                result.setText(num.text.toString()+"*")
            }
        }
        bIgual.setOnClickListener {
            val resultSuma: Double
            val numSuma: Double
            val lastChar = result.text[result.text.length - 1]
            if (num.text.isEmpty()||result.text.isEmpty())
                num.setText("No haz tecleado nada")
            else{
              if (lastChar == '+'){

              }
                if (lastChar == '-'){

                }
                if (lastChar == '/'){

                }
                if (lastChar == '*'){

                }
            }
        }


    }

}
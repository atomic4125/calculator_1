package com.example.myapplication

import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView

    var ADD = 0
    var SUB = 0
    var MUL = 0
    var DIV = 0
    var REMAIN = 1
    var save1 = 0.0
    var save2 = 0.0
    var stringNumber1 = ""
    var stringNumber2 = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
            val onClickListener =
                View.OnClickListener { view ->
                    when(view.id) {
                        R.id.button1 -> {
                            result()
                            ADD = 1
                            REMAIN = 1
                        }
                          R.id.button5 -> {
                              result()

                              SUB = 1
                              REMAIN = 1
            }

                        R.id.button9 -> {
                            result()

                            MUL = 1
                            REMAIN = 1
                        }

                        R.id.button13 -> {
                            result()

                            DIV = 1
                            REMAIN = 1
                        }

                        R.id.button18 -> {
                            result()
                            REMAIN = 1

                        }

                        R.id.button4 -> {
                            if (REMAIN == 1 && save1 != 0.0) {
                                save1 = -save1

                                if (save1 - save1.toInt() == 0.0) {
                                    textView.text = "" + save1.toInt()
                                }
                                else {
                                    textView.text = save1.toString()
                                }
                        }
                        else {
                            stringNumber2 = "" + textView.text
                            save2 = stringNumber2.toDouble()

                            if(save2 != 0.0){
                                save2 = -save2

                                if(save2-save2.toInt() == 0.0){
                                    textView.text = "" + save2.toInt()

                                }
                                else {
                                    textView.text  = save2.toString()
                                }
                            }
                            stringNumber2 = ""
                            save2 = 0.0
                            }
                        }

                    R.id.button3 -> {
                        if(REMAIN == 1) {
                            save1 /= 100.0
                            if(save1-save1.toInt() == 0.0){
                                textView.text = "" + save1.toInt()
                            }
                            else {
                                textView.text = save1.toString()
                            }
                        }
                    else {
                        stringNumber2 = "" + textView.text
                            save2 = stringNumber2.toDouble()
                            save2 /= 100.0

                            if(save2-save2.toInt() == 0.0) {
                                textView.text = "" + save2.toInt()
                            }
                            else {
                                textView.text = "" + save2.toString()
                            }

                            stringNumber2 = ""
                            save2 = 0.0
                        }
                }
                    R.id.button2 -> {
                        if(REMAIN == 1){
                            stringNumber1 = ""
                            save1 = 0.0
                            textView.text = "0"
                        }
                    else {
                        textView.text = "0"
                        }
                }

                    R.id.button20 -> {
                        if(textView.text == "0" || REMAIN == 1) textView.text = ""
                    textView.text = textView.text.toString() + 0
                    REMAIN = 0
                }

                    R.id.button16 -> {
                        if(textView.text == "0"||REMAIN == 1) textView.text = ""
                    textView.text = textView.text.toString() + 1
                    REMAIN = 0
                }

                  R.id.button15 -> {
                      if(textView.text == "0" || REMAIN == 1) textView.text = ""
                    textView.text = textView.text.toString() + 2
                    REMAIN = 0
                }

                    R.id.button14 -> {
                        if(textView.text == "0" || REMAIN == 1) textView.text = ""

                    textView.text = textView.text.toString() + 3
                    REMAIN = 0
                }

                    R.id.button12 -> {
                        if(textView.text == "0"||REMAIN == 1) textView.text = ""

                    textView.text = textView.text.toString() + 4
                    REMAIN = 0
                }

                    R.id.button11 -> {
                        if(textView.text == "0"||REMAIN == 1) textView.text = ""

                    textView.text = textView.text.toString() + 5
                    REMAIN = 0
                }

                    R.id.button10 -> {
                        if(textView.text == "0"||REMAIN == 1) textView.text = ""

                    textView.text = textView.text.toString() + 6
                    REMAIN = 0
                }

                    R.id.button8 -> {
                        if(textView.text == "0"||REMAIN == 1) textView.text = ""

                    textView.text = textView.text.toString() +7
                    REMAIN = 0
                }

                    R.id.button7 -> {
                    if(textView.text == "0"||REMAIN == 1) textView.text = ""

                    textView.text = textView.text.toString() +8
                    REMAIN = 0
                }

                    R.id.button6 -> {
                    if(textView.text == "0"||REMAIN == 1) textView.text = ""

                    textView.text = textView.text.toString() +9
                    REMAIN = 0
                }
                    R.id.button19 -> {
                    if(textView.text == "0"||REMAIN == 1) textView.text = "0"

                    if(!textView.text.contains(".")) textView.text = textView.text.toString() + "."
                    REMAIN = 0
                }
            }
        }

    button20.setOnClickListener(onClickListener)
    button16.setOnClickListener(onClickListener)
    button15.setOnClickListener(onClickListener)
    button14.setOnClickListener(onClickListener)
    button12.setOnClickListener(onClickListener)
    button11.setOnClickListener(onClickListener)
    button10.setOnClickListener(onClickListener)
    button8.setOnClickListener(onClickListener)
    button7.setOnClickListener(onClickListener)
    button6.setOnClickListener(onClickListener)
    button19.setOnClickListener(onClickListener)
    button13.setOnClickListener(onClickListener)
    button1.setOnClickListener(onClickListener)
    button5.setOnClickListener(onClickListener)
    button9.setOnClickListener(onClickListener)
    button18.setOnClickListener(onClickListener)
    button4.setOnClickListener(onClickListener)
    button3.setOnClickListener(onClickListener)
    button2.setOnClickListener(onClickListener)
}

private fun result() {
    if(ADD == 0 && SUB == 0 && MUL == 0 && DIV == 0){
        stringNumber1 = ""+textView.text
        save1 = stringNumber1.toDouble()
    }

    if(stringNumber1 == ""){
        stringNumber1 = ""+ textView.text
        save1 = stringNumber1.toDouble()
    }
    else{
        if(REMAIN == 0) {
            stringNumber2 = "" +textView.text
            save2 = stringNumber2.toDouble()

            if(ADD == 1){
                save1 += save2
                ADD = 0
            }

            if(SUB == 1) {
                save1 -= save2
                SUB = 0
            }

            if(MUL == 1) {
                save1 *= save2
                MUL = 0
            }

            if(DIV == 1) {
                save1 /= save2
                DIV = 0
            }

            stringNumber2 = ""
            save2 = 0.0
        }

        else {
            ADD = 0
            SUB = 0
            MUL = 0
            DIV = 0
        }
    }
    if(save1-save1.toInt() == 0.0) {
        textView.text = "" + save1.toInt()
    }

    else {
        textView.text = save1.toString()
        }
    }
}
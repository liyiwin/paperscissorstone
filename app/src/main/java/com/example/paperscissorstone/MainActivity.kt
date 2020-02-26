package com.example.paperscissorstone

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_mora.setOnClickListener {
            if (btn_paper.isChecked == false &&
                btn_stone.isChecked == false &&
                btn_scissor.isChecked ==false

                    )

                Toast.makeText(this@MainActivity,"請選擇你的出拳",Toast.LENGTH_SHORT).show()

            else {


                val computer = (Math.random() * 3).toInt()


                // 0 是剪刀  1 是石頭  2是布

                set_you()

                set_computer(computer)



                when {

                    btn_scissor.isChecked && computer == 2 ||
                            btn_stone.isChecked && computer == 0 ||
                            btn_paper.isChecked && computer == 1 -> {


                        result_textview.text = "恭喜你獲勝了！！"


                    }

                    btn_scissor.isChecked && computer == 1 ||

                            btn_stone.isChecked && computer == 2 ||

                            btn_paper.isChecked && computer == 0 -> {


                        result_textview.text = "可惜，電腦獲勝了"

                    }

                    btn_scissor.isChecked && computer == 0 ||

                            btn_stone.isChecked && computer == 1 ||

                            btn_paper.isChecked && computer == 2 -> {

                        result_textview.text = "平局,再試一次"

                    }


                }


            }
        }


    }

    fun set_you(){

        when{

            btn_scissor.isChecked -> you_textview.text = "剪刀"

            btn_stone.isChecked   ->  you_textview.text =  "石頭"

            btn_paper.isChecked  ->  you_textview.text =  "布"



        }


    }

    fun set_computer(computer:Int){

        when{

            computer == 1 -> computer_textView.text = "石頭"

            computer == 0 -> computer_textView.text = "剪刀"

            computer == 2 -> computer_textView.text = "布"


        }



    }
}

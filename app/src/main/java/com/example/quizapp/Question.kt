package com.example.quizapp

import android.telephony.mbms.StreamingServiceInfo

data class Question(    val id:Int,
                        val question:String,
                        val image : Int,
                        val optionOne : String,
                        val optionTwo : String,
                        val optionThree: String,
                        val optionFour : String,
                        val correctAnswer:Int

                        )


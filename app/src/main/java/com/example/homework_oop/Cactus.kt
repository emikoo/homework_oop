package com.example.homework_oop

import android.util.Log
import android.widget.Toast

class Cactus : Plants() {
    override fun grow(){
        Toast.makeText(this, "растет кактус", Toast.LENGTH_LONG).show()
    }
}
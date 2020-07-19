package com.example.homework_oop

import android.util.Log
import android.widget.Toast

class Oak: Plants() {
    override fun grow(){
        Toast.makeText(this, "растет дуб", Toast.LENGTH_LONG).show()
    }
}
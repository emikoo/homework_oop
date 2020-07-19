package com.example.homework_oop

import android.util.Log
import android.widget.Toast

class Rose: Plants() {
    override fun grow(){
        Toast.makeText(this, "растет роза", Toast.LENGTH_LONG).show()
    }
}
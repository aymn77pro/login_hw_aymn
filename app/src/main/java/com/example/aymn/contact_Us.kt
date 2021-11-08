package com.example.aymn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class contact_Us : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_us)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        item.title="Main activity"
        when(item.itemId){
            R.id.setting -> {
                val intent= Intent(this,setting::class.java)
                startActivity(intent)
            }
            R.id.login -> {
                item.title = "Log out"
            }
            R.id.counact_Us ->{
                val intent=Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
            else -> super.onOptionsItemSelected(item)

        }
        return true
    }
}
package com.example.aymn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class setting : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.setting -> {
                item.title = ""
                val intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
                item.title = "setting"
            }
            R.id.login -> {
                if (item.title=="aymn")item.title="logout" else item.title="aymn"
            }
            R.id.counact_Us -> {
                val intent= Intent(this,contact_Us::class.java)
                startActivity(intent)
                item.title = "main activety"
            }
            else -> super.onOptionsItemSelected(item)

        }
        return true
    }
}
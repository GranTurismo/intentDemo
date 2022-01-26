package com.example.intentdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submit.setOnClickListener {
            var fn = binding.firstNameField.text.toString()
            var ln = binding.lastNameField.text.toString()
            var age = Integer.valueOf(binding.ageField.text.toString())

            var intent = Intent(this,ResultActivity::class.java)
            intent.putExtra(Companion.FIRST_NAME_EXTRA,fn)
            intent.putExtra(Companion.LAST_NAME_EXTRA,ln)
            intent.putExtra(Companion.AGE_EXTRA,age)
            startActivity(intent)
        }
    }

    companion object
    {
        const val FIRST_NAME_EXTRA="FIRST_NAME_EXTRA"
        const val AGE_EXTRA="AGE_NAME_EXTRA"
        const val LAST_NAME_EXTRA="LAST_NAME_EXTRA"
    }
}
package com.example.intentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentdemo.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity()
{
    lateinit var binding:ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var fn = intent.getStringExtra(MainActivity.FIRST_NAME_EXTRA)
        var ln = intent.getStringExtra(MainActivity.LAST_NAME_EXTRA)
        var age = intent.getIntExtra(MainActivity.AGE_EXTRA,20)
        binding.fnResult.text = getString(R.string.name_result,fn)
        binding.lnResult.text = getString(R.string.lastname_result,ln)
        binding.ageResult.text = getString(R.string.age_result,age.toString())
    }
}
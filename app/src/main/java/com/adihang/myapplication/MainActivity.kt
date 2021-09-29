package com.adihang.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adihang.myapplication.databinding.ActivityMainBinding
import android.content.Intent

class MainActivity : AppCompatActivity() {
    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val devlist = listOf("pyoung", "last")

        binding.codeButton.setOnClickListener {
            var devCode = binding.editTextCode.text.toString()
            binding.mainTitle.setText(devCode)
            if (devCode == devlist[0]) {
                val intentpy = Intent(this, PYActivity::class.java)
                startActivity(intentpy)
            }
        }
        binding.startButton.setOnClickListener {
            val intentse1 = Intent(this, SEventActivity::class.java)
            startActivity(intentse1)
        }
        binding.quitButton.setOnClickListener {
            finishAffinity()
            System.exit(0)
        }
    }
    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}
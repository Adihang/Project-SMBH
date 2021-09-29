package com.adihang.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.content.Intent
import android.media.MediaPlayer
import com.adihang.myapplication.databinding.ActivityPyBinding

class PYActivity : AppCompatActivity() {

    private var mBinding: ActivityPyBinding? = null
    private val binding get() = mBinding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityPyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val pyPlayer = MediaPlayer.create(this, R.raw.popyoung)

        binding.pyimgbu.setOnClickListener {
            pyPlayer.start()
        }

        val handler = Handler()
        handler.postDelayed({
            val intentmain = Intent(baseContext, MainActivity::class.java)
            startActivity(intentmain)
            finish()
        }, 10000) //1000 = 1초
    }

}
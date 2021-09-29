package com.adihang.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adihang.myapplication.databinding.ActivitySevent1Binding
import android.content.Intent
import androidx.core.view.isVisible

class SEventActivity : AppCompatActivity() {

    private var mBinding: ActivitySevent1Binding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivitySevent1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var g_mode = 2

        binding.se1bu1.setOnClickListener {
            binding.se1mai1.setText("""
                |공산주의는 국가가 모든것을 관리하며 각각의 인민들에게 알맞은 노동의 역할을 부여하고 필요한것을 동일하게 배급하여 가장 효율적이며 공평하게 시스템을 운영합니다.
                |인민들을 이끄는 수령인 당신의 역할이 가장 중요합니다.
                |인민들은당신을 무조건 믿고 따를것입니다.""".trimMargin())
            g_mode = 0
        }

        binding.se1bu2.setOnClickListener {
            binding.se1mai1.setText("""
                |국민과 기업들은 국가에 소속되어 자신의 수입의 일부를 세금으로 납부하고 각자의 꿈을 이루기 위해 노력합니다.
                |만약 이들이 당신의 선택에 동의한다면, 세금과 별개로 투자금을 받을 수도 있고, 생각지도 못한곳에서 기업이 성과를 이루어내거나 사고를 칠 수도 있습니다.
                |국민들을 이끄는 지도자인 당신의 역할이 가장 중요합니다.
                |당신이 긍정적인 성과를 낸다면, 국민들은 당신을 지지할것입니다.""".trimMargin())
            g_mode = 1
        }

        binding.se1enbu.setOnClickListener {
            if (g_mode == 2) {
                binding.se1mai1.setText(" 여정을 시작하려면 사회체제를 선택해야 합니다.")
            } else if (g_mode == 0 || g_mode == 1) {
                with(binding) {
                    se1mai1.setText("""
                        |지구에 700년간 희미하게 잡히고 있었던 외계신호를 확인하는 것이 여정의 첫번째 목표입니다.
                        |이 신호가 무엇인지 궁금증을 해소하지 못하면 탐험가로서 정말 억울할것 같습니다.
                        |항해사에게 신호의 방향을 정확하게 계산하라고 지시하고, 조종사에게는 엔진을 가동하라고 명령합니다.
                        |이제 가슴이 두근거리는 탐험의 시작입니다.""".trimMargin())
                    se1cobu.isVisible = true
                }
            }
        }
        binding.se1cobu.setOnClickListener {
            val intentse2 = Intent(this, SEventActivity2::class.java)
            intent.putExtra("g_mode", g_mode)
            startActivity(intentse2)
        }
    }
}
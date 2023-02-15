package com.gaha.exodemokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.gaha.exodemokotlin.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding  = DataBindingUtil.setContentView(this,R.layout.activity_home)
        binding.button.setOnClickListener(View.OnClickListener {
            var value = binding.edtUrl.editableText.toString()
            startActivity(Intent(this,MainActivity::class.java)
                .putExtra("url",value))

        })

    }

}
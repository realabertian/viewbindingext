package org.aber.viewbindingktx

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.aber.viewbinding.viewBinding
import org.aber.viewbindingktx.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by viewBinding(ActivityMainBinding::inflate)

    //private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        // More staff
    }
}
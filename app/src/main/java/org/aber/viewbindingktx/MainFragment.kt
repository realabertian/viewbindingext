package org.aber.viewbindingktx

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import org.aber.viewbinding.viewBinding
import org.aber.viewbindingktx.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private val binding: FragmentMainBinding by viewBinding(FragmentMainBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.root
    }
}
package com.maho_ya.githubactionstest

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class MainFragment : Fragment(R.layout.activity_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val viewModel = MainViewModel(context = context!!)
    }
}

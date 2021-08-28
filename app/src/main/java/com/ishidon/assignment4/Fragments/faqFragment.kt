package com.ishidon.assignment4.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ishidon.assignment4.R
import com.ishidon.assignment4.util.DrawerLocker

class faqFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_faq, container, false)
        (activity as DrawerLocker).setDrawerEnabled(true)
        return view
    }
}
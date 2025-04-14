package com.example.taqmogotchi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * A simple [androidx.fragment.app.Fragment] subclass.
 * Use the [SleepFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SleepFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val layout = inflater.inflate(R.layout.fragment_sleep, container, false)

//            val txtInput :EditText = layout.findViewById(R.id.txtInput)
//            val btnPressMe :Button = layout.findViewById(R.id.btnFrag2)
//            val tvOutput : TextView = layout.findViewById(R.id.lblInput)
//
//            btnPressMe.setOnClickListener {
//                tvOutput.text=txtInput.text}

            return layout
        }

    }
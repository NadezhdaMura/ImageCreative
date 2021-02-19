package com.example.imagecreative

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.os.postDelayed
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_three.*

class ThirdFragment: Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_three,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var toast = arguments?.getInt("key1")
        Toast.makeText(requireContext(),"key1",Toast.LENGTH_LONG)
        requireActivity().findViewById<ImageView>(R.id.image6)
        var fragmentOne = FirstFragment()
        image6.setOnClickListener{
            image6.visibility = View.VISIBLE
            fragmentOne.arguments = Bundle().also{
                it.putInt("key2",0)
            }
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer,fragmentOne)
                ?.commit()
        }
        var toast1 = arguments?.getInt("key3")
        Toast.makeText(requireContext(),"key3",Toast.LENGTH_LONG)
        var fragmentTwo = SecondFragment()
        requireActivity().findViewById<ImageView>(R.id.image8)
        image8.setOnClickListener{
            image8.visibility = View.VISIBLE
            fragmentTwo.arguments = Bundle().also{
                it.putInt("key4",0)
            }
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer,fragmentTwo)
                ?.commit()
        }

        val textCounter = requireActivity().findViewById<TextView>(R.id.counter)
        var counter = 18
        var counter2 = 0
        Handler().postDelayed({
            textCounter.text =
                "В японской префектуре Хиросима есть остров с необычной и загадочной историей." +
                        " Когда-то он был секретным, и Япония удалила его с карт,а в наши дни он" +
                        " едва справляется с потоком туристов и сотнями населяющих его кроликов."
            counter2++
        }, 0)
        Handler().postDelayed({
            textCounter.text =
                "По данным за 2007 год, их насчитывалось около 300б а на сегодняшний день число" +
                        " перевалило за 1000. При этом никто не знает, как кролики оказались на " +
                        "острове. Некоторые считают, что пару первых кроликов завезли туристы, либо" +
                        " же их выпустили школьники,оказавшиеся здесь с экскурсией."

        }, 15000)
        }

    }


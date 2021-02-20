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
import kotlinx.android.synthetic.main.fragment_one.*

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var fragmentTwo = SecondFragment()
        requireActivity().findViewById<ImageView>(R.id.image1)
        image1.setOnClickListener {
            image1.visibility = View.VISIBLE
            fragmentTwo.arguments = Bundle().also {
                it.putInt("key", 0)
            }
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer, fragmentTwo)
                ?.commit()
            var toast = arguments?.getInt("key2")
            Toast.makeText(requireContext(), "key2", Toast.LENGTH_LONG)
        }
        var fragmentThree = ThirdFragment()
        requireActivity().findViewById<ImageView>(R.id.image7)
        image7.setOnClickListener{
            image7.visibility = View.VISIBLE
            fragmentThree.arguments = Bundle().also{
                it.putInt("key3",0)
            }
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer,fragmentThree)
                ?.commit()
        }
        var fragmentFour = FourthFragment()
        requireActivity().findViewById<ImageView>(R.id.imagefox)
        imagefox.setOnClickListener {
            imagefox.visibility = View.VISIBLE
            fragmentTwo.arguments = Bundle().also {
                it.putInt("key6", 0)
            }
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer, fragmentFour)
                ?.commit()
        }
        var toast = arguments?.getInt("key7")
        Toast.makeText(activity,"key7",Toast.LENGTH_LONG).show()

            val textCounter = requireActivity().findViewById<TextView>(R.id.counter)
            var counter = 18
            var counter2 = 0
            Handler().postDelayed({
                textCounter.text =
                    "Лиса – не самое редкое животное на территории России." +
                            " Но один из ее многочисленных видов, лиса-огневка, прозванная так за свой " +
                            "ярко-рыжий окрас без светлой ряби по спине и по бокам, пока мало изучен."
                counter2++
            }, 0)
            Handler().postDelayed({
                textCounter.text =
                    "Его выделил в 1875 году известный русский зоолог Александр Миддендорф. Встретить" +
                            " этого рыжего зверя можно на Чукотке, в Анадырском крае, на Курильских " +
                            "островах, на Сахалине.Но больше всего на Камчатке." +
                            "Сегодня на Камчатке рыжих лис насчитывают пять-шесть тысяч особей."

            }, 15000)

        }
    }














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
import kotlinx.android.synthetic.main.fragment_two.*

class SecondFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_two,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var toast = arguments?.getInt("key")
        Toast.makeText(requireContext(),"key",Toast.LENGTH_LONG)
        var fragmentThree = ThirdFragment()
        requireActivity().findViewById<ImageView>(R.id.image2)
        image2.setOnClickListener{
            image2.visibility = View.VISIBLE
            fragmentThree.arguments = Bundle().also{
                it.putInt("key1",0)
            }
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer,fragmentThree)
                ?.commit()
        }
        var toast1 = arguments?.getInt("key4")
        Toast.makeText(requireContext(),"key4",Toast.LENGTH_LONG)
        var fragmentOne = FirstFragment()
        requireActivity().findViewById<ImageView>(R.id.image9)
        image9.setOnClickListener{
            image9.visibility = View.VISIBLE
            fragmentOne.arguments = Bundle().also{
                it.putInt("key5",0)
            }
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer,fragmentOne)
                ?.commit()
        }

        val textCounter = requireActivity().findViewById<TextView>(R.id.counter)
        var counter = 18
        var counter2 = 0
        Handler().postDelayed({
            textCounter.text =
                "(1)Среди владельцев котов на 17% больше людей с ученой степенью.(2)Кошки не" +
                        " чувствуют сладкого вкуса.(3)Кошки трутся об людей, чтобы пометить их как" +
                        " свою территорию.(4)В мультиках врут: котов лучше не кормить сырой рыбой." +
                        "(5)Кошки спят около 70% своей жизни." +
                        "(6)Длина самого крупного кота-1,2319 метра." +
                        "(7)У кошек более 20 мышц отвечают за движение ушей."
            counter2++
        }, 0)
        Handler().postDelayed({
            textCounter.text =
                "(8)Сейчас в мире живет свыше 500 миллионов домашних кошек.(9)В средние века кошки " +
                        "ассоциировались с чёрной магией, и в День Святого Иоанна люди по всей" +
                        " Европе сжигали их на кострах.(10)Поверхность носа у кошек так же уникальна," +
                        " как отпечатки пальцев у людей.(11)Кошки вылизывают себя, чтобы перестать" +
                        " пахнуть человеком.(12)Кошки узнают ваш голос, но предпочитают его" +
                        " игнорировать.(13)Кошки отлично видят в темноте, но не различают цвета."

        }, 20000)


            }

        }




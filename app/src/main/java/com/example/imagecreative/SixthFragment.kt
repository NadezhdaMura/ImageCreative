package com.example.imagecreative

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_five.*
import kotlinx.android.synthetic.main.fragment_six.*

class SixthFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_six,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var toast = arguments?.getInt("key11")
        Toast.makeText(requireContext(), "key11", Toast.LENGTH_LONG)
        var fragmentThree = ThirdFragment()
        requireActivity().findViewById<ImageView>(R.id.imagerabbit1)
        imagerabbit1.setOnClickListener {
            imagerabbit1.visibility = View.VISIBLE
            fragmentThree.arguments = Bundle().also {
                it.putInt("key11", 0)
            }
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer, fragmentThree)
                ?.commit()
        }

        val textCounter = requireActivity().findViewById<TextView>(R.id.counter)
        var counter = 18
        var counter2 = 0
        Handler().postDelayed({
            textCounter.text =
                "Хотя кролики относятся к семейству зайцевых, близкими " +
                    "родственниками они не являются.Все домашние кролики произошли от своих диких " +
                    "собратьев, возраст древнейших останков превышает 2 млн.лет. Приручать " +
                    "ушастых люди начали еще в каменном веке. Римляне завершили этот процесс," +
                    " после чего кролиководство как животноводческая отрасль начало распространяться" +
                    " по всему миру.От условий содержания кроликов напрямую зависит, сколько лет они" +
                    " проживут.В дикой природе средняя продолжительность жизни пушистика" +
                    " составляет 2—3 года. В комфортных условиях" +
                    " ушастые зверьки будут вам верными друзьями на протяжении 7—10 лет,бывает" +
                    " и 12-13-й лет.Рекордсмен умер в возрасте 19 лет."

            counter2++
        }, 0)
        Handler().postDelayed({
            textCounter.text =
                    "Также у пушистика уникальное строение глаз – для обзора округи ему не " +
                    "обязательно поворачивать голову;в большинстве стран символом удачи считается " +
                    "кроличья лапа;за минуту животное способно сделать 120 жевательных движений;" +
                    "кролик различает только зеленый и красный цвета, а также их оттенки;" +
                    "кролики запоминают расположение предметов мебели в доме;кролик действительно может" +
                    " умереть от страха–его сердце и так бьется с частотой 130—325 уд./мин.;" +
                    "пушистые малыши не могут жить в одиночестве, поэтому в домашних условиях находят" +
                    " себе друзей среди людей, собак, кошек и других питомцев;питомец среднего размера" +
                    " способен съесть такой объем травы, которым можно набить подушку;"

        }, 30000)
    }
}
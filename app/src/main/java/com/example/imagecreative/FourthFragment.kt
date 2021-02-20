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
import kotlinx.android.synthetic.main.fragment_four.*

class FourthFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_four,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var toast = arguments?.getInt("key7")
        Toast.makeText(requireContext(), "key7", Toast.LENGTH_LONG)
        var fragmentOne = FirstFragment()
        requireActivity().findViewById<ImageView>(R.id.imagekamchatka)
        imagekamchatka.setOnClickListener {
            imagekamchatka.visibility = View.VISIBLE
            fragmentOne.arguments = Bundle().also {
                it.putInt("key7", 0)
            }
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer, fragmentOne)
                ?.commit()
        }
        val textCounter = requireActivity().findViewById<TextView>(R.id.counter)
        var counter = 18
        var counter2 = 0
        Handler().postDelayed({
            textCounter.text =
                "Камчатка — край суровой северной природы, настолько далеко удалённый от" +
                        " большинства крупных российских городов, что мало кто из россиян может " +
                        "похвастать тем, что побывал здесь. Зима здесь долгая и жестокая, а лето " +
                        "короткое и безумно красивое. Эти земли населяют различные народы, в " +
                        "частности, некогда воинственные чукчи. Гейзеры, вулканические сопки, " +
                        "бескрайняя тайга и тундра — в этом вся Камчатка."
            counter2++
        }, 0)
        Handler().postDelayed({
            textCounter.text = "(1)На полуострове Камчатка находится двадцать девять действующих" +
                    " вулканов, и куда больше спящих — около трёхсот." +
                        "(2)Одна из наиболее выдающихся достопримечательностей Камчатки—Долина гейзеров." +
                    "(3)На Камчатке обитает один-единственный вид лягушек, и тот был случайно сюда " +
                    "завезён некоторое время назад." +
                    "(4)До изобретения самолётов путь до Камчатки из центральной России мог отнять" +
                    " у путников до года." +
                    "(6)Воды расположенного на Камчатке Хлоридного озера чрезвычайно ядовиты — " +
                    "купаться в нём нельзя."

        }, 20000)
    }
}
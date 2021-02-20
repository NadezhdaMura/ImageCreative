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
import kotlinx.android.synthetic.main.fragment_four.*
import kotlinx.android.synthetic.main.fragment_three.*
import kotlinx.android.synthetic.main.fragment_two.*

class FifthFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_five,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var toast = arguments?.getInt("key9")
        Toast.makeText(requireContext(), "key9", Toast.LENGTH_LONG)
        var fragmentTwo = SecondFragment()
        requireActivity().findViewById<ImageView>(R.id.imagesfinks)
        imagesfinks.setOnClickListener {
            imagesfinks.visibility = View.VISIBLE
            fragmentTwo.arguments = Bundle().also {
                it.putInt("key9", 0)
            }
            fragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainer, fragmentTwo)
                ?.commit()
        }

        val textCounter = requireActivity().findViewById<TextView>(R.id.counter)
        var counter = 18
        var counter2 = 0
        Handler().postDelayed({
            textCounter.text = "Кошки — это единственные животные, которые выбрали одомашнивание." +
                    " Они заинтересовались удобством жизни под крышей и гарантированной пищей,  Из-за этого они никогда не чувствуют" +
                    " подчинения.Первые источники, в которых упоминаются домашние кошки, пришли из" +
                    " Древнего Египта, но известно, что кошки уже жили вместе с людьми за годы до этого," +
                    " около 5000 лет до н.э. Во времена египетской цивилизации кошки сблизились" +
                    " с людьми и привыкли к ним. Амбары, полные зерна, предоставляли грызунов...и пищу!"

            counter2++
        }, 0)
        Handler().postDelayed({
            textCounter.text =
                    " Их характер эволюционировал, поскольку лишь наиболее ручные особи смогли выжить" +
                    " в этой среде.За короткий период времени одомашненная кошка расселилась из Египта" +
                    " по всему миру. Кошки достигли Индии и Китая в руках финикийских торговцев " +
                    "приблизительно 500 лет до нашей эры, и их не было до приблизительно 100 года " +
                    "н.э., когда они распространились по Европе, достигнув Севера и России." +
                    " Их распространение в Северную Америку произошло в 18-м веке."

        }, 25000)
    }
}
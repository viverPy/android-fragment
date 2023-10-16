package com.example.fragmentact

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainDashboardFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainDashboardFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


//        var inputsButton = view?.findViewById<Button>(R.id.inputsBtn)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_main_dashboard, container, false)
        val qpiButton = v.findViewById<Button>(R.id.qpiBtn)
        val inputsButton = v.findViewById<Button>(R.id.inputsBtn)

        qpiButton.setOnClickListener {
            val qpiActivity = Intent(activity, QpiCalculator::class.java)
            startActivity(qpiActivity)
        }

        inputsButton.setOnClickListener {
            val qpiActivity = Intent(activity, Inputs::class.java)
            startActivity(qpiActivity)
        }


        return v
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MainDashboardFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MainDashboardFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
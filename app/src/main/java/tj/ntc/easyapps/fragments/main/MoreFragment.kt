package tj.ntc.easyapps.fragments.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import tj.ntc.easyapps.R
import tj.ntc.easyapps.activities.MainActivity
import tj.ntc.easyapps.databinding.FragmentMoreBinding
import tj.ntc.easyapps.databinding.FragmentPaymentsBinding

class MoreFragment : Fragment() {
    private var binding: FragmentMoreBinding? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        if (binding == null) binding = FragmentMoreBinding.inflate(inflater,container,false)
        return binding!!.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("fragment",binding.toString())

        binding!!.button3.setOnClickListener {
            findNavController().navigate(R.id.pin_fragment)
        }
    }
}
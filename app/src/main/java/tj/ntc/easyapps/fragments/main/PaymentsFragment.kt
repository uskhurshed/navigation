package tj.ntc.easyapps.fragments.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import tj.ntc.easyapps.databinding.FragmentPaymentsBinding

class PaymentsFragment : Fragment() {

    private var binding: FragmentPaymentsBinding? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        if (binding == null) binding =FragmentPaymentsBinding.inflate(inflater,container,false)
        return binding!!.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("fragment",binding.toString())

    }

}
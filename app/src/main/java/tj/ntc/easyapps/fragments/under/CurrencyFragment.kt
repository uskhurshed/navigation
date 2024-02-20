package tj.ntc.easyapps.fragments.under

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tj.ntc.easyapps.databinding.FragmentCurrencyBinding

class CurrencyFragment : Fragment() {

    private var binding: FragmentCurrencyBinding? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        if (binding == null) binding = FragmentCurrencyBinding.inflate(inflater,container,false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("fragment",binding.toString())

    }
}
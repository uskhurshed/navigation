package tj.ntc.easyapps.fragments.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tj.ntc.easyapps.activities.MainActivity
import tj.ntc.easyapps.databinding.FragmentPinBinding

class PinFragment : Fragment() {

    private lateinit var bindPin: FragmentPinBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindPin = FragmentPinBinding.inflate(inflater,container,false)
        return bindPin.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindPin.button2.setOnClickListener { (requireActivity() as MainActivity).startBottomNavigation() }

    }

}
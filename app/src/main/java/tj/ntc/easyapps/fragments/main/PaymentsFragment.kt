package tj.ntc.easyapps.fragments.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import tj.ntc.easyapps.databinding.FragmentPaymentsBinding

class PaymentsFragment : Fragment() {
    private lateinit var bindPayments: FragmentPaymentsBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindPayments = FragmentPaymentsBinding.inflate(inflater, container, false)
        return bindPayments.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}
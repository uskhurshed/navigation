package tj.ntc.easyapps.fragments.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import tj.ntc.easyapps.databinding.FragmentQrBinding

class QuickResponseFragment : Fragment() {
    private lateinit var bindQR: FragmentQrBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindQR = FragmentQrBinding.inflate(inflater, container, false)
        return bindQR.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}
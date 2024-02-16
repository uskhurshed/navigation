package tj.ntc.easyapps.fragments.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Keep
import androidx.fragment.app.Fragment
import tj.ntc.easyapps.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var bindHome: FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindHome = FragmentHomeBinding.inflate(inflater, container, false)
        return bindHome.root
    }
    @Keep
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}
package tj.ntc.easyapps.fragments.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import tj.ntc.easyapps.databinding.FragmentHistoryBinding

class HistoryFragment : Fragment() {
    private lateinit var bindHistory: FragmentHistoryBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindHistory = FragmentHistoryBinding.inflate(inflater, container, false)
        return bindHistory.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}



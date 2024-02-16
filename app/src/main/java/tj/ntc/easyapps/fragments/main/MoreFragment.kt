package tj.ntc.easyapps.fragments.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import tj.ntc.easyapps.databinding.FragmentMoreBinding

class MoreFragment : Fragment() {
    private lateinit var bindMore: FragmentMoreBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindMore = FragmentMoreBinding.inflate(inflater, container, false)
        return bindMore.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
package tj.ntc.easyapps.fragments.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import tj.ntc.easyapps.R
import tj.ntc.easyapps.activities.MainActivity
import tj.ntc.easyapps.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var  bindLogin: FragmentLoginBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindLogin = FragmentLoginBinding.inflate(inflater,container,false)
        return bindLogin.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bindLogin.button.setOnClickListener {
            findNavController().navigate(R.id.action_LoginFragment_to_PinFragment)
        }
    }

}
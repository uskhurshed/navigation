package tj.ntc.easyapps.fragments.start

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import tj.ntc.easyapps.R
import tj.ntc.easyapps.activities.MainActivity
import tj.ntc.easyapps.databinding.FragmentPinBinding
import kotlin.math.log

class PinFragment : Fragment() {

    private lateinit var bindPin: FragmentPinBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        bindPin = FragmentPinBinding.inflate(inflater,container,false)
        return bindPin.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindPin.button2.setOnClickListener {
            val navController = findNavController()
            if (navController.graph.startDestinationId == R.id.home_fragment){
                navController.navigateUp()
                Log.e("navigate","UP")
            }else{
                navController.graph.setStartDestination(R.id.home_fragment)
                navController.navigate(R.id.action_PinFragment_to_HomeFragment)
                Log.e("navigate","HOME")
            }

        }
    }

}
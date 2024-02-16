package tj.ntc.easyapps.activities

import android.os.Bundle
import android.util.Log
import android.widget.PopupMenu
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import tj.ntc.easyapps.R
import tj.ntc.easyapps.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var navHostFragment: NavHostFragment? = null

    private val navController: NavController by lazy {
        navHostFragment = supportFragmentManager.findFragmentById(R.id.main_fragment) as NavHostFragment
        navHostFragment!!.navController
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) navController.setGraph(R.navigation.nav_start)
         else startBottomNavigation()

        binding.bottomNavigationView.setupWithNavController(navController)
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id){
                in listOf(R.id.login_fragment,R.id.pin_fragment) -> {
                    Log.e("backStack", navHostFragment?.childFragmentManager?.backStackEntryCount.toString())
                    hideBottom()
                }
                in listOf(R.id.home_fragment,R.id.payments_fragment,R.id.history_fragment,R.id.more_fragment,R.id.qr_fragment) -> {
                    Log.e("backStack",  navHostFragment?.childFragmentManager?.backStackEntryCount.toString())
                    showBottom()
                }
            }

        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    private fun hideBottom() {binding.bottomNavigationView.isGone = true}
    private fun showBottom() {binding.bottomNavigationView.isVisible= true}

    fun startBottomNavigation() {
        navController.setGraph(R.navigation.nav_bottom)
        binding.bottomNavigationView.apply {
            setupWithNavController(navController)
        }
    }
}

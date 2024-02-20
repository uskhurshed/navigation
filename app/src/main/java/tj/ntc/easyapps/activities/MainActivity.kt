package tj.ntc.easyapps.activities

import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import tj.ntc.easyapps.R
import tj.ntc.easyapps.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), Toolbar.OnMenuItemClickListener {
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

        setSupportActionBar(binding.toolbar)
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.login_fragment,
            R.id.pin_fragment,
            R.id.home_fragment)
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        binding.bottomNavigationView. setupWithNavController(navController)

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id){
                in listOf(R.id.login_fragment,R.id.pin_fragment) -> {
                    Log.e("backStack", navHostFragment?.childFragmentManager?.backStackEntryCount.toString())
                    hideBottom()
                    setMenu(R.menu.menu_one)
                }
                in listOf(R.id.home_fragment,R.id.payments_fragment,R.id.history_fragment,R.id.more_fragment,R.id.qr_fragment) -> {
                    Log.e("backStack",  navHostFragment?.childFragmentManager?.backStackEntryCount.toString())
                    showBottom()
                    setMenu()
                }
            }

        }
        binding.toolbar.setOnMenuItemClickListener(this)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    private fun hideBottom() {binding.bottomNavigationView.isGone = true}
    private fun showBottom() {binding.bottomNavigationView.isVisible= true}

    private fun showAppBar(){
        binding.appBar.isVisible  =true
    }

    private fun hideAppBar(){
        binding.appBar.isGone  =true
    }


    override fun onMenuItemClick(item: MenuItem?): Boolean {
        return when (item?.itemId) {
            R.id.action_one -> {
                Log.d("action","actionOne")
                true
            }
            R.id.action_two -> {
                Log.d("action","actionTwo")
                true
            }
            else -> super.onOptionsItemSelected(item!!)
        }
    }

    private fun setMenu(menuId:Int = 0) = with(binding.toolbar) {
        menu.clear()
        if (menuId != 0) inflateMenu(menuId)
    }

}

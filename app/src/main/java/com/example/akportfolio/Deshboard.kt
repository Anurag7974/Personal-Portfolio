package com.example.akportfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.WindowManager
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.view.menu.MenuAdapter
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import com.example.akportfolio.navigatuindrawer.*
import com.google.android.material.navigation.NavigationView
import nl.psdcompany.duonavigationdrawer.views.DuoDrawerLayout
import nl.psdcompany.duonavigationdrawer.views.DuoMenuView
import nl.psdcompany.duonavigationdrawer.views.DuoMenuView.OnMenuClickListener
import nl.psdcompany.duonavigationdrawer.widgets.DuoDrawerToggle
import java.util.*
import kotlin.collections.ArrayList


class Deshboard : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var mDrawerLayout: DuoDrawerLayout
    private lateinit var  mDuoMenuView: DuoMenuView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deshboard)

//        Fragment to Fragment switch
        val fragmentA = AboutFragment()
        supportFragmentManager.beginTransaction().replace(R.id.container, fragmentA).commit()



//        val window = getWindow()
////        hide status bar
//        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
//        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
//        window.setStatusBarColor(ContextCompat.getColor(this, R.color.status_bar_color))


        mDrawerLayout = findViewById(R.id.drawer)

        val mToolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(mToolbar)


        val navigationView = findViewById<NavigationView>(R.id.nav_NavigationView)
        navigationView.setNavigationItemSelectedListener(this)



        val toggle = DuoDrawerToggle(
            this, mDrawerLayout, mToolbar,
            R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        mDrawerLayout.setDrawerListener(toggle)
        toggle.syncState()

        mDuoMenuView = findViewById(R.id.nav_view)

        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, AboutFragment()).commit()
            navigationView.setCheckedItem(R.id.nav_about)
        }


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_about -> supportFragmentManager.beginTransaction()
                .replace(R.id.container, AboutFragment()).commit()
            R.id.nav_skills -> supportFragmentManager.beginTransaction()
                .replace(R.id.container, SkillFragment()).commit()
            R.id.nav_education -> supportFragmentManager.beginTransaction()
                .replace(R.id.container, EducationFragment()).commit()
            R.id.nav_project -> supportFragmentManager.beginTransaction()
                .replace(R.id.container, ProjectFragment()).commit()
            R.id.nav_interests -> supportFragmentManager.beginTransaction()
                .replace(R.id.container, InterestsFragment()).commit()
            R.id.nav_contact -> supportFragmentManager.beginTransaction()
                .replace(R.id.container, ContactFragment()).commit()
            R.id.nav_share -> supportFragmentManager.beginTransaction()
                .replace(R.id.container, ShareFragment()).commit()

            R.id.nav_exit -> Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show()
        }
        mDrawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {
        if(mDrawerLayout.isDrawerOpen(GravityCompat.START)){
            mDrawerLayout.closeDrawer(GravityCompat.START)
        }else{
            onBackPressedDispatcher
        }
    }
}
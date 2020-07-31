package com.astar.osterrigapp.ui.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.astar.osterrigapp.R
import com.astar.osterrigapp.ui.dashboard.DashboardFragment
import com.astar.osterrigapp.ui.home.HomeFragment
import com.astar.osterrigapp.ui.notifications.NotificationsFragment
import kotlinx.android.synthetic.main.fragment_home_view_pager.*

class HomeViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home_view_pager, container, false)
        val fragmentList = listOf(
            DashboardFragment(),
            HomeFragment(),
            NotificationsFragment()
        )

        val pagerViewAdapter = HomeViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )
        homeViewPager.adapter = pagerViewAdapter

        return view
    }


}
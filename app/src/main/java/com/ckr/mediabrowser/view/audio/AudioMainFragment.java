package com.ckr.mediabrowser.view.audio;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.ckr.mediabrowser.R;
import com.ckr.mediabrowser.view.BaseFragment;
import com.ckr.mediabrowser.widget.MyFragmentPagerAdapter;
import com.ckr.mediabrowser.widget.MyViewPager;

import butterknife.BindArray;
import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class AudioMainFragment extends BaseFragment implements ViewPager.OnPageChangeListener {

	@BindView(R.id.tabLayout)
	TabLayout tabLayout;
	@BindView(R.id.myViewPager)
	MyViewPager viewPager;
	@BindArray(R.array.tab_audio)
	String[] tabTitles;
	BaseFragment[] fragments;

	public static AudioMainFragment newInstance() {

		Bundle args = new Bundle();

		AudioMainFragment fragment = new AudioMainFragment();
		fragment.setArguments(args);
		return fragment;
	}

	@Override
	protected int getLayoutId() {
		return R.layout.fragment_base;
	}

	@Override
	protected void init() {
		initTabLayout();
	}

	private void initTabLayout() {
		tabLayout.addTab(tabLayout.newTab().setText(tabTitles[0]), true);
		viewPager.setAdapter(new MyFragmentPagerAdapter(getChildFragmentManager(), fragments = new BaseFragment[tabTitles.length], tabTitles, AudioCreator.values()));
		tabLayout.setupWithViewPager(viewPager);
		viewPager.addOnPageChangeListener(this);
	}

	@Override
	public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

	}

	@Override
	public void onPageSelected(int position) {

	}

	@Override
	public void onPageScrollStateChanged(int state) {

	}
}
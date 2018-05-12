package com.ckr.mediabrowser.view.audio;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;

import com.ckr.mediabrowser.R;
import com.ckr.mediabrowser.view.BaseFragment;

import static com.ckr.mediabrowser.util.MediaLog.Logd;

/**
 * A simple {@link Fragment} subclass.
 */
public class AudioFragment extends BaseFragment {
	private static final String TAG = "AudioFragment";
	private boolean isVisible = false;

	public static AudioFragment newInstance() {

		Bundle args = new Bundle();

		AudioFragment fragment = new AudioFragment();
		fragment.setArguments(args);
		return fragment;
	}

	@Override
	protected int getLayoutId() {
		return R.layout.recycler_view;
	}

	@Override
	protected void init() {
		Logd(TAG, "init: ");
	}

	@Override
	public void onResume() {
		super.onResume();
		Logd(TAG, "onResume: ");
	}

	@Override
	protected void onVisible() {
		Logd(TAG, "onVisible: " + isVisible);
		isVisible = true;
	}

	@Override
	protected void onInvisible() {
		Log.d(TAG, "onInvisible: " + isVisible);
		isVisible = false;
	}

}

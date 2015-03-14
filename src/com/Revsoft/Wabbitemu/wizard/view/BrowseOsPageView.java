package com.Revsoft.Wabbitemu.wizard.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.Revsoft.Wabbitemu.R;

public class BrowseOsPageView extends RelativeLayout {

	private final Button mBackButton;

	public BrowseOsPageView(Context context, AttributeSet attributeSet) {
		super(context, attributeSet);

		LayoutInflater.from(context).inflate(R.layout.browse_os_page, this, true);

		mBackButton = (Button) findViewById(R.id.backButton);
	}

	public Button getBackButton() {
		return mBackButton;
	}
}
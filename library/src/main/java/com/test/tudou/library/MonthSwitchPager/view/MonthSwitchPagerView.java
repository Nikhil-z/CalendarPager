package com.test.tudou.library.MonthSwitchPager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.test.tudou.library.R;

/**
 * Created by tudou on 15-5-18.
 */
public class MonthSwitchPagerView extends LinearLayout{

  public MonthSwitchPagerView(Context context) {
    this(context, null);
  }

  public MonthSwitchPagerView(Context context, AttributeSet attrs) {
    this(context, attrs, 0);
  }

  public MonthSwitchPagerView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);

    initialize(context, attrs, defStyleAttr);
  }

  private void initialize(Context context, AttributeSet attrs, int defStyleAttr) {
    LayoutInflater.from(context).inflate(R.layout.view_month_switch_container, this);
    ButterKnife.inject(this);
  }
}

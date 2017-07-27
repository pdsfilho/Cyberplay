// Generated code from Butter Knife. Do not modify!
package com.example.paulo.cyberplay;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends com.example.paulo.cyberplay.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492972, "field 'mViewPager'");
    target.mViewPager = finder.castView(view, 2131492972, "field 'mViewPager'");
    view = finder.findRequiredView(source, 2131492971, "field 'mTabLayout'");
    target.mTabLayout = finder.castView(view, 2131492971, "field 'mTabLayout'");
    view = finder.findRequiredView(source, 2131492970, "field 'mToolbar'");
    target.mToolbar = finder.castView(view, 2131492970, "field 'mToolbar'");
  }

  @Override public void unbind(T target) {
    target.mViewPager = null;
    target.mTabLayout = null;
    target.mToolbar = null;
  }
}

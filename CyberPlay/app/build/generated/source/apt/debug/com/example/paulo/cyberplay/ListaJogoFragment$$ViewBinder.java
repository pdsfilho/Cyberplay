// Generated code from Butter Knife. Do not modify!
package com.example.paulo.cyberplay;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ListaJogoFragment$$ViewBinder<T extends com.example.paulo.cyberplay.ListaJogoFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492988, "field 'mListView' and method 'onItemSelected'");
    target.mListView = finder.castView(view, 2131492988, "field 'mListView'");
    ((android.widget.AdapterView<?>) view).setOnItemClickListener(
      new android.widget.AdapterView.OnItemClickListener() {
        @Override public void onItemClick(
          android.widget.AdapterView<?> p0,
          android.view.View p1,
          int p2,
          long p3
        ) {
          target.onItemSelected(p2);
        }
      });
    view = finder.findRequiredView(source, 2131492989, "field 'mSwipe'");
    target.mSwipe = finder.castView(view, 2131492989, "field 'mSwipe'");
    view = finder.findRequiredView(source, 2131492980, "field 'mEmpty'");
    target.mEmpty = view;
  }

  @Override public void unbind(T target) {
    target.mListView = null;
    target.mSwipe = null;
    target.mEmpty = null;
  }
}

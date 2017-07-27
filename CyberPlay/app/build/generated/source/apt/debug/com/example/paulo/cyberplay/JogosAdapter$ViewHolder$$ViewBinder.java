// Generated code from Butter Knife. Do not modify!
package com.example.paulo.cyberplay;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class JogosAdapter$ViewHolder$$ViewBinder<T extends com.example.paulo.cyberplay.JogosAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492982, "field 'imageView'");
    target.imageView = finder.castView(view, 2131492982, "field 'imageView'");
    view = finder.findRequiredView(source, 2131492983, "field 'txtTitulo'");
    target.txtTitulo = finder.castView(view, 2131492983, "field 'txtTitulo'");
    view = finder.findRequiredView(source, 2131492984, "field 'txtDesenvolvedora'");
    target.txtDesenvolvedora = finder.castView(view, 2131492984, "field 'txtDesenvolvedora'");
  }

  @Override public void unbind(T target) {
    target.imageView = null;
    target.txtTitulo = null;
    target.txtDesenvolvedora = null;
  }
}

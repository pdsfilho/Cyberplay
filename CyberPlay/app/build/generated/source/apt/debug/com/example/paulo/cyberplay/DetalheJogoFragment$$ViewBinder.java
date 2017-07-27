// Generated code from Butter Knife. Do not modify!
package com.example.paulo.cyberplay;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class DetalheJogoFragment$$ViewBinder<T extends com.example.paulo.cyberplay.DetalheJogoFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492983, "field 'mTextTitulo'");
    target.mTextTitulo = finder.castView(view, 2131492983, "field 'mTextTitulo'");
    view = finder.findRequiredView(source, 2131492984, "field 'mTextDesenvolvedora'");
    target.mTextDesenvolvedora = finder.castView(view, 2131492984, "field 'mTextDesenvolvedora'");
    view = finder.findRequiredView(source, 2131492985, "field 'mTextPublisher'");
    target.mTextPublisher = finder.castView(view, 2131492985, "field 'mTextPublisher'");
    view = finder.findRequiredView(source, 2131492986, "field 'mTextAno'");
    target.mTextAno = finder.castView(view, 2131492986, "field 'mTextAno'");
    view = finder.findRequiredView(source, 2131492982, "field 'mImageCapa'");
    target.mImageCapa = finder.castView(view, 2131492982, "field 'mImageCapa'");
    view = finder.findRequiredView(source, 2131492987, "field 'mFabFavorito' and method 'favoritoClick'");
    target.mFabFavorito = finder.castView(view, 2131492987, "field 'mFabFavorito'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.favoritoClick();
        }
      });
  }

  @Override public void unbind(T target) {
    target.mTextTitulo = null;
    target.mTextDesenvolvedora = null;
    target.mTextPublisher = null;
    target.mTextAno = null;
    target.mImageCapa = null;
    target.mFabFavorito = null;
  }
}

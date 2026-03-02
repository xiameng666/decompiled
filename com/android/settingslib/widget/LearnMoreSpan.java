package com.android.settingslib.widget;

import android.text.style.URLSpan;
import android.view.View.OnClickListener;
import android.view.View;
import ibuq;

public final class LearnMoreSpan extends URLSpan {
    private final View.OnClickListener a;

    public LearnMoreSpan(View.OnClickListener view$OnClickListener0) {
        ibuq.f(view$OnClickListener0, "clickListener");
        super("");
        this.a = view$OnClickListener0;
    }

    @Override  // android.text.style.URLSpan
    public void onClick(View view0) {
        ibuq.f(view0, "widget");
        this.a.onClick(view0);
    }
}


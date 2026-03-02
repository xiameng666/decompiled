package com.android.settingslib.widget;

import android.text.style.URLSpan;
import android.view.View.OnClickListener;
import android.view.View;

class FooterPreference.FooterLearnMoreSpan extends URLSpan {
    private final View.OnClickListener a;

    public FooterPreference.FooterLearnMoreSpan(View.OnClickListener view$OnClickListener0) {
        super("");
        this.a = view$OnClickListener0;
    }

    @Override  // android.text.style.URLSpan
    public void onClick(View view0) {
        View.OnClickListener view$OnClickListener0 = this.a;
        if(view$OnClickListener0 != null) {
            view$OnClickListener0.onClick(view0);
        }
    }
}


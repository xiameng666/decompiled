package com.google.android.gms.mdm.settings;

import android.text.style.URLSpan;
import android.view.View.OnClickListener;
import android.view.View;

final class TopIntroPreferenceWithLearnMore.LearnMoreSpan extends URLSpan {
    public View.OnClickListener a;

    public TopIntroPreferenceWithLearnMore.LearnMoreSpan() {
        super("");
        this.a = null;
    }

    @Override  // android.text.style.URLSpan
    public void onClick(View view0) {
        View.OnClickListener view$OnClickListener0 = this.a;
        if(view$OnClickListener0 != null) {
            view$OnClickListener0.onClick(view0);
        }
    }
}

